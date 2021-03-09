/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNAControllerTest.java
 */
package com.meli.mutants.controller;

import com.meli.mutants.delegates.impl.MutantDNADelegate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static com.meli.mutants.MutantsApplicationTests.DNA_MUTANT;
import static com.meli.mutants.MutantsApplicationTests.DNA_NO_MUTANT;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Class to  tests  mutant dna verificarion requests
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 8/03/21 10:48 p. m.
 * @since 1.0.0
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(MutantDNAController.class)
class MutantDNAControllerTest {

    /** the mvc mock to tests */
    @Autowired
    private MockMvc mockMvc;

    /** the delegate mock */
    @MockBean
    private MutantDNADelegate mutantDNADelegate;

    /** Test the behavior of the handleDNA Request */
    @Test
    void handleDNARequest_mutant_test() throws Exception {

        given(mutantDNADelegate.handleDNARequestValidation(DNA_MUTANT)).willReturn(true);

        mockMvc.perform(
                post("/api/v1/mutant-dna/mutant/")
                        .content(DNA_MUTANT)
                        .contentType(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk());
    }

    /** Test the behavior of the handleDNA Request */
    @Test
    void handleDNARequest_human_test() throws Exception {

        given(mutantDNADelegate.handleDNARequestValidation(DNA_MUTANT)).willReturn(true);

        mockMvc.perform(
                post("/api/v1/mutant-dna/mutant/")
                        .content(DNA_NO_MUTANT)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isForbidden());
    }
}