package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.annotation.JacksonInject;


/**
 * The @JacksonInject annotation is used to tell Jackson that particular values of the deserialized object will be injected
 * and not read from the JSON string.
 */
public class JacksonInjectDemoBean {
    
    @JacksonInject
    public long personId = 0;
    public String  name = "James Clark";
    
    @Override
    public String toString() {
        
        return "JacksonInjectDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
        
    }
    
}