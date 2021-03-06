package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The @JsonIgnoreProperties annotation is used at the class level to ignore fields during serialization and deserialization. 
 * The properties that are declared in this annotation will not be mapped to the JSON content.
 */
@JsonIgnoreProperties({"userId", "gender"})
public class IgnorePropertiesDemoBean {
    
    public long  userId = 0;
    public String  name = "James Clark";
    public String  gender  = null;
    
    @Override
    public String toString() {
        
        return "IgnorePropertiesDemoBean{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
        
    }
    
}