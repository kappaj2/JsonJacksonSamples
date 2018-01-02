package za.co.ajk.jackson.jacksontest;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class AnySetterDemoBean {
    
    public long personId = 123L;
    
    public String  personName = "James Clark";
    
    private Map<String, String> properties = new HashMap<String, String>();
    
    @JsonAnySetter
    public void setProperties(String key, String value){
        properties.put(key, value);
    }
    
    public Map<String, String> getProperties() {
        return properties;
    }
    
    @Override
    public String toString() {
        
        return "AnySetterDemoBean{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", properties=" + properties +
                '}';
        
    }
    
}