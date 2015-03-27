package com.company.speedment.orm.test.hare.db0.hares.hare.impl;

import com.company.speedment.orm.test.hare.db0.hares.hare.Hare;
import com.company.speedment.orm.test.hare.db0.hares.hare.HareBuilder;
import com.company.speedment.orm.test.hare.db0.hares.hare.HareManager;
import com.speedment.orm.core.manager.AbstractSqlManager;
import java.lang.RuntimeException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in the Table 'hare.db0.hares.hare'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class HareManagerImpl extends AbstractSqlManager<Integer, Hare, HareBuilder> implements HareManager {
    
    public HareManagerImpl() {
        setSqlEntityMapper(this::defaultReadEntity);
    }
    
    @Override
    public HareBuilder builder() {
        return new HareImpl();
    }
    
    @Override
    public HareBuilder toBuilder(Hare prototype) {
        return new HareImpl(prototype);
    }
    
    @Override
    public Hare persist(Hare entity) {
        return entity;
    }
    
    @Override
    public Hare remove(Hare entity) {
        return entity;
    }
    
    protected Hare defaultReadEntity(ResultSet resultSet) {
        final HareBuilder builder = builder();
        try {
            builder.setId(resultSet.getInt("id"));
            builder.setName(resultSet.getString("name"));
            builder.setColor(resultSet.getString("color"));
            builder.setAge(resultSet.getInt("age"));
        }
        catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
        return builder;
    }
}