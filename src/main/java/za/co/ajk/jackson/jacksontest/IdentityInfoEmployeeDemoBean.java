package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;


/**
 * The @JsonIdentityInfo tells Jackson to perform serialization or deserialization using the identity of the object. This annotation works similar to the @JsonManagedReference and @JsonBackReference annotations with the difference that @JsonIdentityInfo includes the back reference object.
 
 Let us consider an example where the IdentityInfoEmployeeDemoBean has a bidirectional relationship withIdentityInfoManagerDemoBean using the @JsonIdentityInfo annotation.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "personId")
public class IdentityInfoEmployeeDemoBean {
    
    public long personId = 0;
    
    public String  name = "James Clark";
    
    public IdentityInfoManagerDemoBean manager;
    
    public IdentityInfoEmployeeDemoBean(long personId, String name, IdentityInfoManagerDemoBean manager) {
        
        this.personId = personId;
        
        this.name = name;
        
        this.manager = manager;
        
    }
    
}