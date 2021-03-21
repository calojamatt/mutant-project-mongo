/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * PersonDnaDTOConverter.java
 */
package com.meli.mutants.converter.impl;

import com.meli.mutants.converter.IConverter;
import com.meli.mutants.data.dto.MutantDnaDTO;
import org.springframework.stereotype.Component;

/**
 * Class to transform a DNA string into PersonDnaDTO
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 1:03 a. m.
 * @since 1.0.0
 */
@Component
public class MutantDnaDTOConverter implements IConverter<String, MutantDnaDTO> {

    /**
     * {@inheritDoc}
     * */
    @Override
    public MutantDnaDTO convert(String s) {

        return MutantDnaDTO.builder().withDna(s).build();
    }
}
