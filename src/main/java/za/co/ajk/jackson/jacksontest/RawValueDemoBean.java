package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;


//  This will give it a fixed value of the class name - the @JsonRootName will be ignored
//@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT, use= JsonTypeInfo.Id.NAME)
@JsonRootName(value = "my_pojo") 
public class RawValueDemoBean {
    
    public long personId = 0;
    public String  name = "James Clark";
    
    @JsonRawValue
    public String address = "{\"doorNumber\": 1234, \"street\": \"phase-1\", " +
            "\"city\": \"New York\"}";
    
}