package com.company.speedment.orm.test.hello.db0.hellospeedment.user.impl;

import com.company.speedment.orm.test.hello.db0.hellospeedment.user.User;
import com.company.speedment.orm.test.hello.db0.hellospeedment.user.UserBuilder;
import com.company.speedment.orm.test.hello.db0.hellospeedment.user.UserManager;
import com.speedment.core.core.manager.sql.AbstractSqlManager;
import com.speedment.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in the Table 'hello.db0.hellospeedment.user'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class UserManagerImpl extends AbstractSqlManager<Integer, User, UserBuilder> implements UserManager {
    
    public UserManagerImpl() {
        setSqlEntityMapper(this::defaultReadEntity);
    }
    
    @Override
    public UserBuilder builder() {
        return new UserImpl();
    }
    
    @Override
    public UserBuilder toBuilder(User prototype) {
        return new UserImpl(prototype);
    }
    
    protected User defaultReadEntity(ResultSet resultSet) {
        final UserBuilder builder = builder();
        try {
            builder.setId(resultSet.getInt("id"));
            builder.setMail(resultSet.getString("mail"));
        }
        catch (SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return builder;
    }
}