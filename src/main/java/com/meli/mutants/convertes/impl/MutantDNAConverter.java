/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNAConverter.java
 */
package com.meli.mutants.convertes.impl;

import com.meli.mutants.convertes.IConverter;
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
    public MutantDNA convert(MutantDnaDTO personDnaDTO) {

        return MutantDNA.builder()
                .withDna(personDnaDTO.getDna())
                .withMutantPerson(personDnaDTO.isMutantPerson())
                .build();
    }
}
