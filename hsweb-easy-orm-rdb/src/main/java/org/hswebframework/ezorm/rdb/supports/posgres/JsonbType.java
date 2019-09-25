package org.hswebframework.ezorm.rdb.supports.posgres;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hswebframework.ezorm.rdb.metadata.DataType;

import java.sql.JDBCType;

@Getter
@AllArgsConstructor
public class JsonbType implements DataType {
    public static JsonbType INSTANCE = new JsonbType();

    @Override
    public Class getJavaType() {
        return String.class;
    }

    @Override
    public String getId() {
        return "jsonb";
    }

    @Override
    public String getName() {
        return "jsonb";
    }

    @Override
    public JDBCType getJdbcType() {
        return JDBCType.CLOB;
    }
}
