/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * StatsController.java
 */
package com.meli.mutants.controller;

import com.meli.mutants.data.entities.Stats;
import com.meli.mutants.services.IStatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class to handle statistics requests
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 2/03/21 12:08 a. m.
 * @since 1.0.0
 */
@RequiredArgsConstructor
@RestController
public class StatsController extends BaseController {

    /**
     * The service to get statistics
     * */
    private final IStatsService statsService;

    /**
     *
     * @return a HttpStatus 200 if is mutant, otherwise. respond 403 HttpStatus.FORBIDDEN
     * */
    @GetMapping("/stats")
    @ResponseBody
    public Stats handleStatsRequest() {

        return statsService.generateStatistics();
    }
}
