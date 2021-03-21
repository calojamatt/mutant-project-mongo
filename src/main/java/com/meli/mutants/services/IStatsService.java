/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * Stats.java
 */

package com.meli.mutants.services;

import com.meli.mutants.data.entities.Stats;

/**
 * Interface to encapsulate the service class Stats operations
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 6/03/21 11:31 p. m.
 * @since 1.0.0
 */
public interface IStatsService {

    /**
     * Generate statistics about quantity of humans and mutants
     *
     * @return Stats the statistics
     * */
    Stats generateStatistics();
}
