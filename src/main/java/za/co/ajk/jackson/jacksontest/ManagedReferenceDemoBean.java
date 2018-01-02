package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * The @JsonManagedReference and @JsonBackReference annotation are used to create JSON structures that have a bidirectional relationship.
 * Without this annotation, you get an error like this:
 * "com.fasterxml.jackson.databind.JsonMappingException:Infinite recursion (StackOverflowError)"
 */
public class ManagedReferenceDemoBean {
    
    public long personId = 0;
    
    public String  name = "James Clark";
    
    @JsonManagedReference
    
    public BackReferenceDemoBean manager;
    
    public ManagedReferenceDemoBean(long personId, String name, BackReferenceDemoBean manager) {
        
        this.personId = personId;
        
        this.name = name;
        
        this.manager = manager;
        
    }
    
}
