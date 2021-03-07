/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
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
import org.springframework.stereotype.Service;

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

        return statsRepository.generateStatistics();
    }
}
