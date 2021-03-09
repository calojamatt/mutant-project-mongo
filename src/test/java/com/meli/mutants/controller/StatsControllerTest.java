/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * StatsControllerTest.java
 */
package com.meli.mutants.controller;

import com.meli.mutants.services.impl.StatsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static com.meli.mutants.MutantsApplicationTests.statsSample;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Class to  tests  statistics requests
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 8/03/21 10:48 p. m.
 * @since 1.0.0
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(StatsController.class)
class StatsControllerTest {

    /** the mvc mock to tests */
    @Autowired
    private MockMvc mockMvc;

    /** the mock stat service*/
    @MockBean
    private StatsService statsService;

    /** Test the behavio of handle stats request */
    @Test
    void handleStatsRequest() throws Exception {

        given(statsService.generateStatistics()).willReturn(statsSample());

        mockMvc.perform(
                get("/api/v1/mutant-dna/stats")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}