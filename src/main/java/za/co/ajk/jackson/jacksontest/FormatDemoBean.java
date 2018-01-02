package za.co.ajk.jackson.jacksontest;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The @JsonFormat annotation is used to tell Jackson that the format in which the value for a field is serialized. It specifies the format using the JsonFormat.Shape enum.
 
 Let us consider an example Java class that uses the @JsonFormat annotation to modify the Date and Time format of an activeDate field.
 */
public class FormatDemoBean {
    
    @JsonProperty("person-id")
    public long personId = 123L;
    
    @JsonProperty("name")
    public String  name = "James Clark";
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    @JsonProperty("active-date")
    public Date activeDate;
    
    public FormatDemoBean() {
        
    }
    
    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }
    
}