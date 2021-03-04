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

package com.meli.mutants.delegates;

import com.meli.mutants.data.dto.PersonDnaDTO;

/**
 * Interface to encapsulate the mutant dna validation logic
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 1:13 a. m.
 * @since 1.0.0
 */
public interface IMutantDnaVerificationDelegate {

    /**
     * Validates if a DNA has mutant characters
     *
     * @param personDnaDTO the person dna dto to validate
     * @return whether a dna is mutant or not
     * */
    boolean isMutant(PersonDnaDTO personDnaDTO);
}
