/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants
 * HorizontalSearch.java
 */
package com.meli.mutants.delegates.impl;

import com.meli.mutants.delegates.IHorizontalSearch;
import org.springframework.stereotype.Component;

/**
 * Class to // TODO
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 21/03/21 1:33 a. m.
 * @since 1.0.0
 */
@Component
public class HorizontalSearch implements IHorizontalSearch {

    /**
     * horizontal search to see if dna has four sequence character repeated
     *
     * @param dna the dna to validate
     * @return 1 find the sequence character repeated, otherwise 0
     * */
    @Override
    public int search(String... dna) {
        for (String s : dna) {
            int repeated = 1;
            for (int b = 1; b <= s.length()-1; b++) {
                if (s.charAt(b-1) == s.charAt(b)) {
                    repeated += 1;
                }
            }
            if (repeated == 4) {
                return 1;
            }
        }
        return 0;
    }
}
