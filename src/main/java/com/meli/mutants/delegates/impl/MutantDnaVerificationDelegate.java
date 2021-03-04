/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * MutantDnaVerificationDelegate.java
 */

package com.meli.mutants.delegates.impl;

import com.meli.mutants.data.dto.PersonDnaDTO;
import com.meli.mutants.delegates.IMutantDnaVerificationDelegate;
import org.springframework.stereotype.Component;

/**
 * Delegate class to validate DNA mutant characters
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 4/03/21 1:16 a. m.
 * @since 1.0.0
 */
@Component
public class MutantDnaVerificationDelegate implements IMutantDnaVerificationDelegate {

    /**
     * {@inheritDoc}
     * */
    @Override
    public boolean isMutant(PersonDnaDTO personDnaDTO) {
        return false;
    }
}
