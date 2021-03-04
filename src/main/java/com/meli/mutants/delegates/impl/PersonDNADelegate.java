/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * PersonDNADelegate.java
 */
package com.meli.mutants.delegates.impl;

import com.meli.mutants.convertes.IConverter;
import com.meli.mutants.data.dto.PersonDnaDTO;
import com.meli.mutants.data.entities.PersonDNA;
import com.meli.mutants.delegates.IMutantDnaVerificationDelegate;
import com.meli.mutants.delegates.IPersonDNADelegate;
import com.meli.mutants.services.IPersonDNAService;
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
public class PersonDNADelegate implements IPersonDNADelegate {

    /**
     * the Person Dna service
     * */
    private final IPersonDNAService personDNAService;

    /**
     * the person dna dto to person dna converter
     * */
    private final IConverter<PersonDnaDTO, PersonDNA> personDNAIConverter;

    /**
     * the dna string to person dna converter
     * */
    private final IConverter<String, PersonDnaDTO> personDnaDTOIConverter;

    /**
     * the Mutant DNA verification delegate
     * */
    private final IMutantDnaVerificationDelegate mutantDnaVerificationDelegate;

    /**
     * @param dna the Dna to validate
     * @return if a person is mutant or not
     * */
    @Override
    public boolean handleDNARequestValidation(String dna) {

        final PersonDnaDTO personDnaDTO = personDnaDTOIConverter.convert(dna);

        boolean isMutant = mutantDnaVerificationDelegate.isMutant(personDnaDTO);
        personDnaDTO.setMutantPerson(isMutant);

        personDNAService.save(personDNAIConverter.convert(personDnaDTO));

        return isMutant;
    }
}
