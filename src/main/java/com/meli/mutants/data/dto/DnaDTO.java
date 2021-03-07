/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * DnaDTO.java
 */
package com.meli.mutants.data.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * DNA class to manage the DNA sequences
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 6/03/21 9:05 p. m.
 * @since 1.0.0
 */
@Builder
@Getter
@Setter
public class DnaDTO {

    /**
     * The DNA string characters
     * */
    private String[] dna;
}
