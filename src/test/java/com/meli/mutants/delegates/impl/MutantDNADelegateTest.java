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

import com.meli.mutants.MutantsApplicationTests;
import com.meli.mutants.exception.NotValidDNASequenceException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests class for Stats Service
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 16:33 p. m.
 * @since 1.0.0
 */
class MutantDNADelegateTest extends MutantsApplicationTests {

    /** the mutant dna delegate to mock */
    @Autowired
    private MutantDNADelegate mutantDNADelegate;

    /** test the handle dna request validation */
    @Test
    void handleDNARequestValidation_mutant_tests() throws NotValidDNASequenceException {

        boolean result = mutantDNADelegate.handleDNARequestValidation(DNA_MUTANT);

        assertTrue(result);
    }

    /** test the handle dna request validation */
    @Test
    void handleDNARequestValidation_human_tests() throws NotValidDNASequenceException {

        boolean result = mutantDNADelegate.handleDNARequestValidation(DNA_NO_MUTANT);

        assertTrue(result);
    }

    /** test the handle dna request validation */
    @Test
    void handleDNARequestValidation_empty_tests() throws NotValidDNASequenceException {

        boolean result = mutantDNADelegate.handleDNARequestValidation(DNA_EMPTY);

        assertFalse(result);
    }

    /** test the handle dna request validation */
    @Test
    void handleDNARequestValidation_invalid_tests() {

        Exception exception = assertThrows(NotValidDNASequenceException.class, () -> {
            mutantDNADelegate.handleDNARequestValidation(DNA_NO_VALID);
        });

        assertTrue(exception.getMessage().contains("is not valid"));

    }
}