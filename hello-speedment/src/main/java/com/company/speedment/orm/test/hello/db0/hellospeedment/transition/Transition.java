package com.company.speedment.orm.test.hello.db0.hellospeedment.transition;

import com.speedment.core.core.entity.Entity;
import com.speedment.core.core.manager.metaresult.MetaResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * An interface representing an entity (for example, a row) in the Table 'hello.db0.hellospeedment.transition'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
@Entity(managerType = TransitionManager.class,
        builderType = TransitionBuilder.class,
        primaryKeyType = List.class)
public interface Transition {
    
    Integer getFrom();
    
    Integer getTo();
    
    static TransitionBuilder builder() {
        return TransitionManager.get().builder();
    }
    
    default TransitionBuilder toBuilder() {
        return TransitionManager.get().toBuilder(this);
    }
    
    default String toJson() {
        return TransitionManager.get().toJson(this);
    }
    
    static Stream<Transition> stream() {
        return TransitionManager.get().stream();
    }
    
    default Optional<Transition> persist() {
        return TransitionManager.get().persist(this);
    }
    
    default Optional<Transition> update() {
        return TransitionManager.get().update(this);
    }
    
    default Optional<Transition> remove() {
        return TransitionManager.get().remove(this);
    }
    
    default Optional<Transition> persist(Consumer<MetaResult<Transition>> listener) {
        return TransitionManager.get().persist(this, listener);
    }
    
    default Optional<Transition> update(Consumer<MetaResult<Transition>> listener) {
        return TransitionManager.get().update(this, listener);
    }
    
    default Optional<Transition> remove(Consumer<MetaResult<Transition>> listener) {
        return TransitionManager.get().remove(this, listener);
    }
}