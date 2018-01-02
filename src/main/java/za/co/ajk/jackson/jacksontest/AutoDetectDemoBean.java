package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


/**
 * The @JsonAutoDetect annotation is used at the class level to tell Jackson to override the visibility of the properties of a 
 * class during serialization and deserialization. 
 * You can set the visibility with the following elements:
 * <p>
 * creatorVisibility
 * fieldVisibility
 * getterVisibility
 * setterVisibility
 * isGetterVisibility
 * <p>
 * The JsonAutoDetect class defines public static constants that are similar to Java class visibility levels. They are:
 * <p>
 * ANY
 * DEFAULT
 * NON_PRIVATE
 * NONE
 * PROTECTED_AND_PRIVATE
 * PUBLIC_ONLY
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AutoDetectDemoBean {
    
    private long personId = 123L;
    
    private String name = "James Clark";
    
    public long getPersonId() {
        
        return personId;
        
    }
    
    public void setPersonId(long personId) {
        
        this.personId = personId;
        
    }
    
    public String getName() {
        
        return name;
        
    }
    
    public void setName(String name) {
        
        this.name = name;
        
    }
    
    @Override
    
    public String toString() {
        
        return "IgnoreDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
        
    }
    
}