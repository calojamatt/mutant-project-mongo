/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNAValidator.java
 */
package com.meli.mutants.validators.impl;

import com.meli.mutants.validators.IMutantDNAValidator;
import org.springframework.stereotype.Component;

/**
 * Class to validate if the DNA sequence is correct
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 1:47 a. m.
 * @since 1.0.0
 */
@Component
public class MutantDNAValidator implements IMutantDNAValidator {

    /**
     * {@inheritDoc}
     * */
    @Override
    public boolean hasValidDnaSequence(String dna) {

        return dna.matches("^[CAGT]+$");
    }
}
