package com.bytebeats.mybatis3.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import java.sql.Connection;
import java.util.Properties;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @date 2017-02-17 11:52
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class, Integer.class}) })
public class SQLStatsInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        String sql = boundSql.getSql();
        System.out.println("exec sql:"+sql);
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        String dialect = properties.getProperty("dialect");
        System.out.println("dialect:"+dialect);
    }
}
