/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNAConverterTest.java
 */
package com.meli.mutants.converter.impl;

import com.meli.mutants.MutantsApplicationTests;
import com.meli.mutants.converter.IConverter;
import com.meli.mutants.data.dto.MutantDnaDTO;
import com.meli.mutants.data.entities.MutantDNA;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Tests class for MutantDNAConverter
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 18:02 p. m.
 * @since 1.0.0
 */
class MutantDNAConverterTest extends MutantsApplicationTests {

    /** the converter */
    @Autowired
    private IConverter<MutantDnaDTO, MutantDNA> converter;

    /**
     * test the convert method
     * */
    @Test
    void convert_test() {

        final MutantDNA mutantDNA = converter.convert(createMutantDnaDTO(DNA_MUTANT, true));

        assertNotNull(mutantDNA);

    }
}