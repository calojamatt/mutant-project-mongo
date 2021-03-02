/*
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * PersonDNA.java
 */
package com.meli.mutants.data.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

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
@Entity
public class PersonDNA {

    /** the mutant id */
    @Id
    private Long id;

    /** indicates if a person is mutant*/
    private boolean mutantPerson;

    /** the dna of the person */
    private String dna;
}
