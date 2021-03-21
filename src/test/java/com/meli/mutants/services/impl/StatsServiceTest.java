/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * StatsRepositoryTest.java
 */
package com.meli.mutants.services.impl;

import com.meli.mutants.MutantsApplicationTests;
import com.meli.mutants.data.entities.Stats;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests class for Stats Service
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 10:05 a. m.
 * @since 1.0.0
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
class StatsServiceTest extends MutantsApplicationTests {

    /** the stats mock service */
    @Autowired
    private StatsService statsService;

    /** the stats with the expected result */
    private Stats statsResult;

    /** Setup tests method*/
    @BeforeEach
    void setUp() {

        statsResult = statsSample();
    }

    /**  Test for the generate statistics service method*/
    @Test
    void generateStatistics_test() {

        final Stats stats = statsService.generateStatistics();

        assertNotNull(stats);
        assertTrue(stats.getCountMutantDna() >= 0);
    }
}