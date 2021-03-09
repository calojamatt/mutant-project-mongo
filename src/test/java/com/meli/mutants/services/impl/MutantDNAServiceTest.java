/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNAServiceTest.java
 */
package com.meli.mutants.services.impl;

import com.meli.mutants.MutantsApplicationTests;
import com.meli.mutants.data.entities.MutantDNA;
import com.meli.mutants.data.repository.MutantDNARepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests class for MutantDNA Service
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 15:52 p. m.
 * @since 1.0.0
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
class MutantDNAServiceTest extends MutantsApplicationTests {

    /** the MutantDNA service to mock */
    @Autowired
    private MutantDNAService mutantDNAService;

    /** the MutantDNA entity */
    private MutantDNA mutantDNA;

    /** the setup method */
    @BeforeEach
    void setUp() {

        mutantDNA = mutantDNASample(true);
    }

    /** the test for save mutant dna */
    @Test
    void save_test() {

          final MutantDNA mutantDNAResult = mutantDNAService.save(mutantDNA);

          assertNotNull(mutantDNAResult);
          assertEquals(mutantDNAResult.getDna(), mutantDNA.getDna());
    }

    /** the test for update mutant dna */
    @Test
    void update_test() {

        final MutantDNA mutantDNAResult = mutantDNAService.update(mutantDNA);

        assertNotNull(mutantDNAResult);
        assertEquals(mutantDNAResult.getDna(), mutantDNA.getDna());
    }
}