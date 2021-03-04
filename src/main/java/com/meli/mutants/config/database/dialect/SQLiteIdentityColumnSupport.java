/*
 * Development and Technologies Solutions S.A.S
 * retentionreport
 * SQLiteIdentityColumnSupport.java
 *
 * Derechos de Autor 2015-2020 D&TS ©
 * Todos los Derechos Reservados.
 */
package com.meli.mutants.config.database.dialect;

import org.hibernate.MappingException;
import org.hibernate.dialect.identity.IdentityColumnSupportImpl;

/**
 * @author: Carlos M
 * @version: 1.0.1
 * @created: 09/02/2020 5:39 PM
 */
public class SQLiteIdentityColumnSupport extends IdentityColumnSupportImpl {

    @Override
    public boolean supportsIdentityColumns() {
        return true;
    }

    @Override
    public String getIdentitySelectString(String table, String column, int type)
            throws MappingException {
        return "select last_insert_rowid()";
    }

    @Override
    public String getIdentityColumnString(int type) throws MappingException {
        return "integer";
    }
}