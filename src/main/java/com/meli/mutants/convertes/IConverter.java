/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * IConverter.java
 */

package com.meli.mutants.convertes;

/**
 * Generic Interface to convert objects
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 12:43 a. m.
 * @since 1.0.0
 */
public interface IConverter<K, T> {

    /**
     * Convert a type K to a type T
     *
     * @param k the type k
     * @return the type T
     * */
    T convert(K k);
}
