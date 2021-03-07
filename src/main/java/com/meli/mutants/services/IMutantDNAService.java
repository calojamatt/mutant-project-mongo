/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNA.java
 */

package com.meli.mutants.services;

import com.meli.mutants.data.entities.MutantDNA;

/**
 * Interface to encapsulate the service class MutantDNA operations
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 2/03/21 12:17 a. m.
 * @since 1.0.0
 */
public interface IMutantDNAService {

    /**
     * Persists the DNA data from personDNA to database
     *
     * @param personDNA the personDNA to store data
     * @return the saved personDNA
     * */
    MutantDNA save(MutantDNA personDNA);

    /**
     * Update the DNA data from personDNA to database
     *
     * @param personDNA the personDNA data to update
     * @return the updated personDNA
     * */
    MutantDNA update(MutantDNA personDNA);

    /**
     * validates the dna of a person to see if is mutant
     *
     * @param personDNA the person dna
     * @return true if is a mutant, otherwise false
     * */
    boolean isMutant(MutantDNA personDNA);

}
