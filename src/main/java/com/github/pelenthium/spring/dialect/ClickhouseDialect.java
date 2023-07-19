package com.github.pelenthium.spring.dialect;

import org.springframework.data.relational.core.dialect.AnsiDialect;
import org.springframework.data.relational.core.dialect.LimitClause;
import org.springframework.data.relational.core.dialect.LockClause;
import org.springframework.data.relational.core.sql.LockOptions;

public class ClickhouseDialect extends AnsiDialect {

    static final ClickhouseDialect INSTANCE = new ClickhouseDialect();

    static final LimitClause LIMIT_INSTANCE = new LimitClause() {
        @Override
        public String getLimit(long limit) {
            return String.format("LIMIT %d", limit);
        }

        @Override
        public String getOffset(long offset) {
            return getLimitOffset(Long.MAX_VALUE, offset);
        }

        @Override
        public String getLimitOffset(long limit, long offset) {
            return String.format("LIMIT %d OFFSET %d", limit, offset);
        }

        @Override
        public Position getClausePosition() {
            return Position.AFTER_ORDER_BY;
        }
    };

    static final LockClause LOCK_INSTANCE = new LockClause() {
        @Override
        public String getLock(LockOptions lockOptions) {
            return "";
        }

        @Override
        public LockClause.Position getClausePosition() {
            return null;
        }
    };

    private ClickhouseDialect() {
    }

    @Override
    public LockClause lock() {
        return LOCK_INSTANCE;
    }

    @Override
    public LimitClause limit() {
        return LIMIT_INSTANCE;
    }
}
