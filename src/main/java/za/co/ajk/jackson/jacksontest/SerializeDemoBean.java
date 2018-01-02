package za.co.ajk.jackson.jacksontest;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class SerializeDemoBean {
    
    public long personId = 123L;
    
    public String  name = "James Clark";
    
    @JsonSerialize(using = CustomDateSerializer.class)
    
    public Date activeDate;
    
    public void setActiveDate(Date activeDate) {
        
        this.activeDate = activeDate;
        
    }
    
}