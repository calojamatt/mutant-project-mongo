/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * StatsDTO.java
 */
package com.meli.mutants.data.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Subselect;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class to generate statistics from human dna
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 6/03/21 11:13 p. m.
 * @since 1.0.0
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Immutable
@Subselect("select sum(case when mutant = 1 then 1 else 0 end) count_mutant_dna," +
        "sum(case when mutant = 0 then 1 else 0 end) count_human_dna," +
        "sum(case when mutant = 1 then 1 else 0 end)/sum(case when mutant = 0 then 1 else 0 end) as ratio " +
        "from person_dna")
@JsonPropertyOrder({"count_mutant_dna","count_human_dna","ratio"})
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
    @Id
    private Float ratio;
}
