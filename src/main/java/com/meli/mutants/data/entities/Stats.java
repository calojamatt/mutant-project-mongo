/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * StatsDTO.java
 */
package com.meli.mutants.data.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Class to generate statistics from human dna
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 6/03/21 11:13 p. m.
 * @since 1.0.0
 */
@Builder(setterPrefix = "with")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"count_mutant_dna","count_human_dna","ratio"})
@Document(collection = "mutant_dna")
public class Stats {

    /**
     * the quantity of mutant dna
     * */
    @JsonProperty("count_mutant_dna")
    private Integer countMutantDna;

    /**
     * the quantity of human dna
     * */
    @JsonProperty("count_human_dna")
    private Integer countHumanDna;

    /**
     * the ratio
     * */
    private Float ratio;

    @JsonIgnore
    @Id
    private Long id;
}
