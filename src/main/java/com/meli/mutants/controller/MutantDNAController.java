/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * PersonDNAController.java
 */
package com.meli.mutants.controller;

import com.meli.mutants.delegates.IMutantDNADelegate;
import com.meli.mutants.exception.NotValidDNASequenceException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class to handle DNA verification request
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 2/03/21 12:08 a. m.
 * @since 1.0.0
 */
@AllArgsConstructor
@RestController
public class MutantDNAController extends BaseController {

    /**
     * the Person Dna delegate
     * */
    private final IMutantDNADelegate personDNADelegate;

    /**
     *
     * @return a HttpStatus 200 if is mutant, otherwise. respond 403 HttpStatus.FORBIDDEN
     * @throws NotValidDNASequenceException if the DNA sequence is invalid
     * */
    @PostMapping("/mutant/")
    public ResponseEntity<String> handleDNARequest(@RequestBody String dna) throws NotValidDNASequenceException {

        if (personDNADelegate.handleDNARequestValidation(dna)) {
            return ResponseEntity.ok().headers(headers()).body("");
        }

        return ResponseEntity.status(HttpStatus.FORBIDDEN).contentType(MediaType.APPLICATION_JSON).body("");
    }
}