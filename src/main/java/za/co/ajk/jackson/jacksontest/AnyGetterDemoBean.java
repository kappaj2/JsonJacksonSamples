package za.co.ajk.jackson.jacksontest;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;


/**
 *
 
 The @JsonAnyGetter annotation can be used when you don’t want to declare a property or a method for every possible key in JSON.
 This annotation is used on the getter methods which enables you to use a Map to hold all your properties that you want to serialize.
 
 */
public class AnyGetterDemoBean {
    
    public long personId = 123L;
    
    public String  personName = "James Clark";
    
    private Map<String, String> properties = new HashMap<String, String>();
    
    @JsonAnyGetter
    
    public Map<String, String> getProperties() {
        
        return properties;
        
    }
    
}