package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * The @JsonSetter annotation tells Jackson to deserialize the JSON into Java object using the name given in the setter method. 
 * Use this annotation when your JSON property names are different to the fields of the Java object class, and you want to map them.
 */
public class SetterDemoBean {
    
    public long personId = 0;
    
    public String  name = "James Clark";
    
    @JsonSetter("id")
    public void setPersonId(long personId) {
        this.personId = personId;
    }
    
    @Override
    public String toString() {
        
        return "SetterDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}