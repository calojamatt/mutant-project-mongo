/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * BaseController.java
 */
package com.meli.mutants.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * Base controller class for commons behaviors
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 9:36 a. m.
 * @since 1.0.0
 */
public class BaseController {

    /**
     * Create the headers to use in response
     *
     * @return HttpHeaders
     * */
    public HttpHeaders headers() {

        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("charset", "UTF-8");

        return httpHeaders;
    }
}
