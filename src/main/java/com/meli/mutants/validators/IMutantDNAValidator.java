/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * IMutantDNAValidator.java
 */

package com.meli.mutants.validators;

/**
 * Interface to encapsulate the Dna validator logic
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 1:45 a. m.
 * @since 1.0.0
 */
public interface IMutantDNAValidator {

    /**
     * Validates the dna sequence to see if is correct
     *
     * @param dna the dna to validate
     * @return if the Dna sequence is valid or not
     * */
    boolean hasValidDnaSequence(String dna);
}
