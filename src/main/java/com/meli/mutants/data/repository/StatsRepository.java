/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * StatsRepository.java
 */
package com.meli.mutants.data.repository;

import com.meli.mutants.data.entities.Stats;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Interface to manage query operations with the database
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 6/03/21 11:11 p. m.
 * @since 1.0.0
 */
public interface StatsRepository extends MongoRepository<Stats, Long> {

    @Aggregation(pipeline = "{$group:{\n" +
            "        _id: 0, total: {$sum:1},\n" +
            "        countMutantDna: { $sum : { $cond: [ {  $eq: [ '$mutant' , true ] }, 1, 0 ] } },\n" +
            "        countHumanDna: { $sum : { $cond: [ {  $eq: [ '$mutant' , false ] }, 1, 0 ] } } } },\n" +
            "    {$project: {countMutantDna:1, countHumanDna:1, ratio: { $divide: ['$countMutantDna','$total']}}}")
    AggregationResults<Stats> generateStatistics();
}
