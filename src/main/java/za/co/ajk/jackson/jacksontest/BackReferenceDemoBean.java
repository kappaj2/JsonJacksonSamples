package za.co.ajk.jackson.jacksontest;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class BackReferenceDemoBean {
    
    public long personId = 123;
    
    public String  name = "John Thomas";
    
    @JsonBackReference
    
    public List<ManagedReferenceDemoBean> employees;
    
    public BackReferenceDemoBean(long personId, String name) {
        
        this.personId = personId;
        
        this.name = name;
        
        employees = new ArrayList<ManagedReferenceDemoBean>();
        
    }
    
    public void addEmployees(ManagedReferenceDemoBean managedReferenceDemoBean){
        
        employees.add(managedReferenceDemoBean);
        
    }
    
}