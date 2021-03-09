/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNADelegate.java
 */
package com.meli.mutants.delegates.impl;

import com.meli.mutants.converter.IConverter;
import com.meli.mutants.data.dto.MutantDnaDTO;
import com.meli.mutants.data.entities.MutantDNA;
import com.meli.mutants.delegates.IMutantDnaVerificationDelegate;
import com.meli.mutants.delegates.IMutantDNADelegate;
import com.meli.mutants.exception.NotValidDNASequenceException;
import com.meli.mutants.services.IMutantDNAService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Delegate Class to handle request validation of DNA
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 12:34 a. m.
 * @since 1.0.0
 */
@RequiredArgsConstructor
@Component
public class MutantDNADelegate implements IMutantDNADelegate {

    /**
     * the Person Dna service
     * */
    private final IMutantDNAService mutantDNAService;

    /**
     * the person dna dto to person dna converter
     * */
    private final IConverter<MutantDnaDTO, MutantDNA> personDNAIConverter;

    /**
     * the dna string to person dna converter
     * */
    private final IConverter<String, MutantDnaDTO> mutantDnaDTOIConverter;

    /**
     * the Mutant DNA verification delegate
     * */
    private final IMutantDnaVerificationDelegate mutantDnaVerificationDelegate;

    /**
     * @param dna the Dna to validate
     * @return if a person is mutant or not
     * */
    @Override
    public boolean handleDNARequestValidation(String dna) throws NotValidDNASequenceException {

        final MutantDnaDTO mutantDnaDTO = mutantDnaDTOIConverter.convert(dna);

        // validate is the DNA is for a mutant person
        boolean isMutant = mutantDnaVerificationDelegate.isMutant(mutantDnaDTO);
        mutantDnaDTO.setMutant(isMutant);

        mutantDNAService.save(personDNAIConverter.convert(mutantDnaDTO));

        return isMutant;
    }
}
