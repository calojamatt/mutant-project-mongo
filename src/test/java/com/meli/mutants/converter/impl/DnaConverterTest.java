/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * DnaConverterTest.java
 */
package com.meli.mutants.converter.impl;

import com.meli.mutants.MutantsApplicationTests;
import com.meli.mutants.converter.IConverter;
import com.meli.mutants.data.dto.DnaDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests class for DnaConverter
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 18:02 p. m.
 * @since 1.0.0
 */
class DnaConverterTest extends MutantsApplicationTests {

    /** the converter */
    @Autowired
    private IConverter<String, DnaDTO> converter;

    /**
     * The converter to test
     * */
    @Test
    void convert_test() {

        final DnaDTO dnaDTO = converter.convert(DNA_MUTANT);

        assertNotNull(dnaDTO);
    }
}