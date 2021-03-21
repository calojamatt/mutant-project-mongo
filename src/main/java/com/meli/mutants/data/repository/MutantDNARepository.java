/*
 * Carlos Alberto Maturana Mulett
 *
 * Copyright © 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDNARepository.java
 */

package com.meli.mutants.data.repository;

import com.meli.mutants.data.entities.MutantDNA;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Interface to manage crud operations with the database
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 2/03/21 12:17 a. m.
 * @since 1.0.0
 */
public interface MutantDNARepository extends MongoRepository<MutantDNA, String> {
}
