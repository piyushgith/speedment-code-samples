package com.company.speedment.orm.test.hello.db0.hellospeedment.image;

import com.speedment.core.core.entity.Entity;
import com.speedment.core.core.manager.metaresult.MetaResult;
import java.lang.Integer;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * An interface representing an entity (for example, a row) in the Table 'hello.db0.hellospeedment.image'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
@Entity(managerType = ImageManager.class,
        builderType = ImageBuilder.class,
        primaryKeyType = Integer.class)
public interface Image {
    
    Integer getId();
    
    String getTitle();
    
    String getDescription();
    
    Integer getAuthor();
    
    Timestamp getPublished();
    
    String getSrc();
    
    static ImageBuilder builder() {
        return ImageManager.get().builder();
    }
    
    default ImageBuilder toBuilder() {
        return ImageManager.get().toBuilder(this);
    }
    
    default String toJson() {
        return ImageManager.get().toJson(this);
    }
    
    static Stream<Image> stream() {
        return ImageManager.get().stream();
    }
    
    default Optional<Image> persist() {
        return ImageManager.get().persist(this);
    }
    
    default Optional<Image> update() {
        return ImageManager.get().update(this);
    }
    
    default Optional<Image> remove() {
        return ImageManager.get().remove(this);
    }
    
    default Optional<Image> persist(Consumer<MetaResult<Image>> listener) {
        return ImageManager.get().persist(this, listener);
    }
    
    default Optional<Image> update(Consumer<MetaResult<Image>> listener) {
        return ImageManager.get().update(this, listener);
    }
    
    default Optional<Image> remove(Consumer<MetaResult<Image>> listener) {
        return ImageManager.get().remove(this, listener);
    }
}