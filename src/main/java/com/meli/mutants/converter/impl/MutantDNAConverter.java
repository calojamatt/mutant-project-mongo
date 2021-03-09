/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNAConverter.java
 */
package com.meli.mutants.converter.impl;

import com.meli.mutants.converter.IConverter;
import com.meli.mutants.data.dto.MutantDnaDTO;
import com.meli.mutants.data.entities.MutantDNA;
import org.springframework.stereotype.Component;

/**
 * Class to transform a PersonDnaDTO to MutantDNA type
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 12:51 a. m.
 * @since 1.0.0
 */
@Component
public class MutantDNAConverter implements IConverter<MutantDnaDTO, MutantDNA> {

    /**
     * {@inheritDoc}
     * */
    @Override
    public MutantDNA convert(MutantDnaDTO mutantDnaDTO) {

        return MutantDNA.builder()
                .withDna(mutantDnaDTO.getDna())
                .withMutant(mutantDnaDTO.isMutant())
                .build();
    }
}
