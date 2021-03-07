/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * IMutantDNADelegate.java
 */

package com.meli.mutants.delegates;

import com.meli.mutants.exception.NotValidDNASequenceException;

/**
 * Interface for encapsulating the Mutant Dna delegate behavior
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 12:31 a. m.
 * @since 1.0.0
 */
public interface IMutantDNADelegate {

    /**
     * @param dna the dna sequence complete
     * @return true if the Dna sequence is mutant, otherwise false
     * @throws NotValidDNASequenceException when the DNA sequence is invalid
     * */
    boolean handleDNARequestValidation(String dna) throws NotValidDNASequenceException;
}
