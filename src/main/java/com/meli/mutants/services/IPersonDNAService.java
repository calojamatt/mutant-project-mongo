/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * PersonDNA.java
 */

package com.meli.mutants.services;

import com.meli.mutants.data.entities.PersonDNA;

/**
 * Interface to encapsulate the service class PersonDNA operations
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 2/03/21 12:17 a. m.
 * @since 1.0.0
 */
public interface IPersonDNAService {

    /**
     * Persists the DNA data from personDNA to database
     *
     * @param personDNA the personDNA to store data
     * @return the saved personDNA
     * */
    PersonDNA save(PersonDNA personDNA);

    /**
     * Update the DNA data from personDNA to database
     *
     * @param personDNA the personDNA data to update
     * @return the updated personDNA
     * */
    PersonDNA update(PersonDNA personDNA);

    /**
     * validates the dna of a person to see if is mutant
     *
     * @param personDNA the person dna
     * @return true if is a mutant, otherwise false
     * */
    boolean isMutant(PersonDNA personDNA);

}
