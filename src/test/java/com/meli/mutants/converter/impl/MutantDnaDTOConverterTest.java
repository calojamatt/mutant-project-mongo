/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDnaDTOConverterTest.java
 */
package com.meli.mutants.converter.impl;

import com.meli.mutants.MutantsApplicationTests;
import com.meli.mutants.converter.IConverter;
import com.meli.mutants.data.dto.MutantDnaDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests class for MutantDnaDTOConverter
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 18:02 p. m.
 * @since 1.0.0
 */
class MutantDnaDTOConverterTest extends MutantsApplicationTests {

    /** the converter */
    @Autowired
    private IConverter<String, MutantDnaDTO> converter;

    /**
     * test conversion to mutant dna dto
     * */
    @Test
    void convert_test() {

        final MutantDnaDTO mutantDnaDTO = converter.convert(DNA_MUTANT);

        assertNotNull(mutantDnaDTO);
    }
}