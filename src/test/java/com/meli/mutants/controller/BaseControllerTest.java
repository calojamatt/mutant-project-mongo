/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * BaseControllerTest.java
 */
package com.meli.mutants.controller;

import com.meli.mutants.MutantsApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to tests base controller
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 8/03/21 10:48 p. m.
 * @since 1.0.0
 */
class BaseControllerTest extends MutantsApplicationTests {

    /**
     * Tests the header creation
     * */
    @Test
    void headers() {
        BaseController baseController = new BaseController();

        HttpHeaders httpHeaders = baseController.headers();
        assertNotNull(httpHeaders);
    }
}