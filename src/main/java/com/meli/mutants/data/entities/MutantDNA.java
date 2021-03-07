/*
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNA.java
 */
package com.meli.mutants.data.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Class to map the database fields
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 2/03/21 12:09 a. m.
 * @since 1.0.0
 */
@Builder(setterPrefix = "with")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "person_dna")
public class MutantDNA {

    /** the mutant id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** indicates if a person is mutant*/
    @Column(name = "mutant")
    private boolean mutantPerson;

    /** the dna of the person */
    @Column(name = "dna")
    private String dna;
}
