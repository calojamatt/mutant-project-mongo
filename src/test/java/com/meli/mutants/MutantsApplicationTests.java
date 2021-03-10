/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantsApplicationTests.java
 */
package com.meli.mutants;

import com.meli.mutants.data.dto.MutantDnaDTO;
import com.meli.mutants.data.entities.MutantDNA;
import com.meli.mutants.data.entities.Stats;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Abstract Class to manage configuration method
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 6/03/21 10:02 a. m.
 * @since 1.0.0
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public abstract class MutantsApplicationTests {

    /** mutant dna string to validate */
    public final static String DNA_MUTANT = "{\"dna\":[\"ATGCGA\",\"CAGTGC\",\"TTATGT\",\"AGAAGG\",\"CCCCTA\",\"TCACTG\"]}";

    /** no mutant dna string to validate */
    public final static String DNA_NO_MUTANT = "{\"dna\":[\"ATGACG\",\"CAGTAC\",\"TCATGT\",\"AGCAGG\",\"CCTCTA\",\"TACTCG\"]}";

    /** invalid dna string to validate */
    public final static String DNA_NO_VALID = "{\"dna\":[\"ATGACX\",\"CAGTGC\",\"TTATGT\",\"AGAAGG\",\"CCACTA\",\"TCACTG\"]}";

    /** invalid dna string to validate */
    public final static String DNA_EMPTY = "{\"dna\":[]}";

    /**
     * creates a new mutant dna
     *
     * @return the mutant dna object created
     * */
    public MutantDNA mutantDNASample(boolean mutant) {

        return MutantDNA.builder()
                .withId(101510L)
                .withDna(DNA_MUTANT)
                .withMutant(mutant)
                .build();
    }

    /**
     * Sample data for stats
     *
     * @return stats
     * */
    public static Stats statsSample() {

         return Stats.builder()
                 .withCountMutantDna(1)
                 .withCountHumanDna(3)
                 .withRatio(0.33F)
                 .build();
    }

    /**
     * Sample data for mutant dna dto
     *
     * @return MutantDnaDTO
     * */
    public MutantDnaDTO createMutantDnaDTO(String dna, boolean mutant) {

        return MutantDnaDTO.builder()
                .withDna(dna)
                .withMutant(mutant)
                .build();
    }

}
