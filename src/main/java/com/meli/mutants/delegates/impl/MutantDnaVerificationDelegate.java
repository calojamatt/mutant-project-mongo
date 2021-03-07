/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDnaVerificationDelegate.java
 */

package com.meli.mutants.delegates.impl;

import com.meli.mutants.convertes.IConverter;
import com.meli.mutants.data.dto.DnaDTO;
import com.meli.mutants.data.dto.MutantDnaDTO;
import com.meli.mutants.delegates.IMutantDnaVerificationDelegate;
import com.meli.mutants.exception.NotValidDNASequenceException;
import com.meli.mutants.validators.IMutantDNAValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Delegate class to validate DNA mutant characters
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 1:16 a. m.
 * @since 1.0.0
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class MutantDnaVerificationDelegate implements IMutantDnaVerificationDelegate {

    /**
     * the Dna converter
     * */
    private final IConverter<String, DnaDTO> dnaDTOIConverter;

    /**
     * The DNA sequence validator
     * */
    private final IMutantDNAValidator mutantDNAValidator;

    /**
     * {@inheritDoc}
     * */
    @Override
    public boolean isMutant(MutantDnaDTO mutantDnaDTO) throws NotValidDNASequenceException {

        final DnaDTO dnaDTO =  dnaDTOIConverter.convert(mutantDnaDTO.getDna());

        for (String dnaSequence : dnaDTO.getDna() ) {
            if (!mutantDNAValidator.hasValidDnaSequence(dnaSequence)) {
                throw new NotValidDNASequenceException(
                        String.format("The DNA sequence <%s> is not valid", dnaSequence));
            }
        }

        int result = obliqueSearch(dnaDTO.getDna()) + horizontalSearch(dnaDTO.getDna());

        if (result > 1) {
            return true;
        }

        return (result + verticalSearch(dnaDTO.getDna())) > 1;
    }

    /**
     * oblique search to see if dna has four sequence character repeated
     *
     * @param dna the dna to validate
     * @return 1 find the sequence character repeated, otherwise 0
     * */
    private int obliqueSearch(String... dna) {
        final int dnaLength = dna.length-1;
        for (int a=1; a <= dnaLength; a++) {
            int repeated = 1;
            for (int b=a; b <= dnaLength; b++) {
                if (b <= (dna[b-1].length()-1) ) {
                    final String before = dna[b-1];
                    final String current = dna[b];
                    if (before.charAt(b-1) == current.charAt(b)) {
                        repeated += 1;
                    }
                    if (repeated == 4) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    /**
     * horizontal search to see if dna has four sequence character repeated
     *
     * @param dna the dna to validate
     * @return 1 find the sequence character repeated, otherwise 0
     * */
    private int horizontalSearch(String... dna) {
        for (String s : dna) {
            int repeated = 1;
            for (int b = 1; b <= s.length()-1; b++) {
                if (s.charAt(b-1) == s.charAt(b)) {
                    repeated += 1;
                }
            }
            if (repeated == 4) {
                return 1;
            }
        }
        return 0;
    }

    /**
     * vertical search to see if dna has four sequence character repeated
     *
     * @param dna the dna to validate
     * @return 1 find the sequence character repeated, otherwise 0
     * */
    private int verticalSearch(String... dna) {
        final int dnaLength = dna.length-1;
        for (int a = 0; a < dnaLength && a < dna[a].length(); a++) {
            int repeated = 1;
            for (int b = 1; b <= dnaLength; b++) {
                final String current = dna[b-1];
                final String next = dna[b];
                if (current.charAt(a) == next.charAt(a)) {
                    repeated += 1;
                }
                if (repeated == 4) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
