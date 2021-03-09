/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNAService.java
 */
package com.meli.mutants.services.impl;

import com.meli.mutants.data.entities.MutantDNA;
import com.meli.mutants.data.repository.MutantDNARepository;
import com.meli.mutants.services.IMutantDNAService;
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
public class MutantDNAService implements IMutantDNAService {

    /**
     * The personDNA repository
     * */
    private final MutantDNARepository dnaRepository;

    /**
     * {@inheritDoc}
     * */
    @Override
    public MutantDNA save(MutantDNA mutantDNA) {

        return dnaRepository.save(mutantDNA);
    }

    /**
     * {@inheritDoc}
     * */
    @Override
    public MutantDNA update(MutantDNA mutantDNA) {

        return dnaRepository.saveAndFlush(mutantDNA);
    }
}
