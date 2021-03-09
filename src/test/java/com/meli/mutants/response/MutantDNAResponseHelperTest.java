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

import com.meli.mutants.MutantsApplicationTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests class for MutantDNA Response Helper
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 16:05 p. m.
 * @since 1.0.0
 */
class MutantDNAResponseHelperTest extends MutantsApplicationTests {

    /**
     * Tests for Builds error response.
     * */
    @Test
    void buildErrorResponse_test() {

        final String message = "Tests MutantDNAResponseHelper class";
        final HttpStatus httpStatus = HttpStatus.FORBIDDEN;

        final MutantDNAResponseHelper errorBuilderHelper = MutantDNAResponseHelper.builder()
                .errorMessage(message)
                .build();

        final Optional<ResponseEntity<Object>> optionalResponseEntity =
                MutantDNAResponseHelper.buildErrorResponse(message, httpStatus);

        assertNotNull(optionalResponseEntity);
        assertTrue(optionalResponseEntity.isPresent());
        assertEquals(optionalResponseEntity.get().getStatusCode(), httpStatus);
        assertEquals(((MutantDNAResponseHelper) Objects.requireNonNull(optionalResponseEntity.get().getBody())).getErrorMessage(), message);
    }
}