/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * DnaConverter.java
 */
package com.meli.mutants.converter.impl;

import com.google.gson.Gson;
import com.meli.mutants.converter.IConverter;
import com.meli.mutants.data.dto.DnaDTO;
import org.springframework.stereotype.Component;

/**
 * Class to transform the String Dna to DNA DTO
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 6/03/21 9:07 p. m.
 * @since 1.0.0
 */
@Component
public class DnaConverter implements IConverter<String, DnaDTO> {

    /**
     * {@inheritDoc}
     * */
    @Override
    public DnaDTO convert(String dna) {

        return new Gson().fromJson(dna, DnaDTO.class);
    }
}
