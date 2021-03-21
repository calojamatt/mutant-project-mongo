/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * NotValidDNASequenceException.java
 */
package com.meli.mutants.exception;

/**
 * Class to generate exception when a dna character is not valid
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 9:42 a. m.
 * @since 1.0.0
 */
public class NotValidDNASequenceException extends Exception {


    /**
     * Create a new NotValidDNASequenceException
     * @param s the message to send
     * */
    public NotValidDNASequenceException(String s) {
        super(s);
    }
}
