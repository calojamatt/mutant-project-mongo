/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDnaDTO.java
 */
package com.meli.mutants.data.dto;


import lombok.*;

/**
 * Class to Manage the Mutant DNA and encapsulate the entity
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 12:52 a. m.
 * @since 1.0.0
 */
@Builder(setterPrefix = "with")
@Getter
@Setter
@AllArgsConstructor
public class MutantDnaDTO {

    /** indicates if a dna is mutant*/
    private boolean mutant;

    /** the dna of the person */
    private String dna;
}
