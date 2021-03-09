package com.meli.mutants.validators.impl;

import com.meli.mutants.MutantsApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;


class MutantDNAValidatorTest extends MutantsApplicationTests {

    @Autowired
    private MutantDNAValidator mutantDNAValidator;

    @Test
    void hasValidDnaSequence() {

        boolean result = mutantDNAValidator.hasValidDnaSequence("");

        assertFalse(result);
    }
}