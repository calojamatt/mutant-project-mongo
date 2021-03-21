/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDnaVerificationDelegate.java
 */

package com.meli.mutants.delegates.impl;

import com.meli.mutants.converter.IConverter;
import com.meli.mutants.data.dto.DnaDTO;
import com.meli.mutants.data.dto.MutantDnaDTO;
import com.meli.mutants.delegates.*;
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

    private final IObliqueSearch obliqueSearch;

    private final IHorizontalSearch horizontalSearch;

    private final IVerticalSearch verticalSearch;

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

        int result = obliqueSearch.search(dnaDTO.getDna()) + horizontalSearch.search(dnaDTO.getDna());

        if (result > 1) {
            return true;
        }

        return (result + verticalSearch.search(dnaDTO.getDna())) > 1;
    }
}
