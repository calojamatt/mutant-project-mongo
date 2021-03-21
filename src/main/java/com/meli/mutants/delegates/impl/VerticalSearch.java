/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants
 * VerticalSearch.java
 */
package com.meli.mutants.delegates.impl;

import com.meli.mutants.delegates.IVerticalSearch;
import org.springframework.stereotype.Component;

/**
 * Class to // TODO
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 21/03/21 1:36 a. m.
 * @since 1.0.0
 */
@Component
public class VerticalSearch implements IVerticalSearch {


    /**
     * vertical search to see if dna has four sequence character repeated
     *
     * @param dna the dna to validate
     * @return 1 find the sequence character repeated, otherwise 0
     * */
    @Override
    public int search(String... dna) {
        final int dnaLength = dna.length-1;
        for (int a = 0; a < dnaLength && a < dna[a].length(); a++) {
            int repeated = 1;
            for (int b = 1; b <= dnaLength; b++) {
                final String current = dna[b-1];
                final String next = dna[b];
                if (current.charAt(a) == next.charAt(a)) {
                    repeated += 1;
                }
                if (repeated == 4) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
