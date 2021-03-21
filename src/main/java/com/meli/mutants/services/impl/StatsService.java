/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * StatsService.java
 */
package com.meli.mutants.services.impl;

import com.meli.mutants.data.entities.Stats;
import com.meli.mutants.data.repository.StatsRepository;
import com.meli.mutants.services.IStatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;
import static org.springframework.data.mongodb.core.aggregation.ConditionalOperators.when;
import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * Class to perform the request to get statistics from database
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 6/03/21 11:33 p. m.
 * @since 1.0.0
 */
@RequiredArgsConstructor
@Service
public class StatsService implements IStatsService {

    /**
     * The repository to get data from database
     */
    private final StatsRepository statsRepository;

    /**
     * {@inheritDoc}
     * */
    @Override
    public Stats generateStatistics() {

       final Stats stats =  statsRepository.generateStatistics().getUniqueMappedResult();
       final Integer total = stats.getCountMutantDna() + stats.getCountHumanDna();
       final Float ratio = stats.getCountMutantDna().floatValue() / total.floatValue();
       stats.setRatio(ratio);

       return stats;
    }
}