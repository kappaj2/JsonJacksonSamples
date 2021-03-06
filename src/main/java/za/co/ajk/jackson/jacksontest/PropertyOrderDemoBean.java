package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The @JsonPropertyOrder annotation tells Jackson to serialize the Java object to JSON in the order specified as the arguments of the annotation. 
 * This annotation also allows partial ordering. The properties are first serialized in the order in which they are found, 
 * followed by any other properties not included in the annotation.
 */
@JsonPropertyOrder({"name", "personId"})
public class PropertyOrderDemoBean {
    
    public long personId = 123L;
    
    public String  name = "James Clark";
    
}