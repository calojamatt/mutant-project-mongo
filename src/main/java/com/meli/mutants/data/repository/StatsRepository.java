/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * StatsRepository.java
 */
package com.meli.mutants.data.repository;

import com.meli.mutants.data.entities.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface to manage query operations with the database
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 6/03/21 11:11 p. m.
 * @since 1.0.0
 */
@Repository
public interface StatsRepository extends JpaRepository<Stats, Long> {

    @Query("select s from Stats s")
    Stats generateStatistics();
}
