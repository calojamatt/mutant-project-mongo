/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * PersonDNAService.java
 */
package com.meli.mutants.services.impl;

import com.meli.mutants.data.entities.PersonDNA;
import com.meli.mutants.data.repository.PersonDNARepository;
import com.meli.mutants.services.IPersonDNAService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Class to implement the logic of the service mutant
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 2/03/21 12:18 a. m.
 * @since 1.0.0
 */
@AllArgsConstructor
@Service
public class PersonDNAService implements IPersonDNAService {

    /**
     * The personDNA repository
     * */
    private final PersonDNARepository dnaRepository;

    /**
     * {@inheritDoc}
     * */
    @Override
    public PersonDNA save(PersonDNA personDNA) {

        return dnaRepository.save(personDNA);
    }

    /**
     * {@inheritDoc}
     * */
    @Override
    public PersonDNA update(PersonDNA personDNA) {

        return dnaRepository.saveAndFlush(personDNA);
    }

    /**
     * Returns if a person is mutant
     *
     * @param personDNA the dna
     * @return if a person is mutant
     * */
    @Override
    public boolean isMutant(PersonDNA personDNA) {

        return dnaRepository.findById(personDNA.getId()).orElse(PersonDNA.builder().build())
                .isMutantPerson();
    }
}
