/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNAResponseHelper.java
 */
package com.meli.mutants.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

/**
 * Class to build the error response to send
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 10:34 a. m.
 * @since 1.0.0
 */
@AllArgsConstructor
@Getter
@Builder
public class MutantDNAResponseHelper {

    /** the error message to send to view */
    @JsonProperty("error_message")
    private final String errorMessage;

    /**
     * Builds error response. returns a response entity with the response of the operation
     *
     * @param errorMessage, The error to send in the response
     * @return error response entity
     */
    public static Optional<ResponseEntity<Object>> buildErrorResponse(final String errorMessage, final HttpStatus httpStatus) {

        final MutantDNAResponseHelper errorBuilderHelper = MutantDNAResponseHelper.builder()
                .errorMessage(errorMessage)
                .build();
        return Optional.of(new ResponseEntity<>(errorBuilderHelper, httpStatus));
    }
}
