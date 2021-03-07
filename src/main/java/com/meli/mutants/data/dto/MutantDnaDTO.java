/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDnaDTO.java
 */
package com.meli.mutants.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Class to Manage the Mutant DNA and encapsulate the entity
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 12:52 a. m.
 * @since 1.0.0
 */
@Builder(setterPrefix = "with")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MutantDnaDTO {

    /** the mutant id */
    private Long id;

    /** indicates if a person is mutant*/
    private boolean mutantPerson;

    /** the dna of the person */
    private String dna;
}
