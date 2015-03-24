package com.company.speedment.orm.test.hello.db0.hellospeedment.image;

import com.speedment.orm.core.Buildable;
import java.sql.Timestamp;
import javax.annotation.Generated;

/**
 * A builder representing an entity (for example, a row) in the Table 'hello.db0.hellospeedment.image'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface ImageBuilder extends Image, Buildable<Image> {
    
    ImageBuilder setId(Integer id);
    
    ImageBuilder setTitle(String title);
    
    ImageBuilder setDescription(String description);
    
    ImageBuilder setAuthor(Integer author);
    
    ImageBuilder setPublished(Timestamp published);
    
    ImageBuilder setSrc(String src);
}