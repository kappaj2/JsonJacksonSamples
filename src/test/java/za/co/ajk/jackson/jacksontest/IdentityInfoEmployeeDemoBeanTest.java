package za.co.ajk.jackson.jacksontest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class IdentityInfoEmployeeDemoBeanTest {
    
    private ObjectMapper objectMapper;
    
    @Before
    public void setUp() throws Exception {
        objectMapper = new ObjectMapper();
    }
    
    @After
    public void tearDown() throws Exception {
        objectMapper = null;
    }
    
    @Test
    public void testSerializingWithJsonIdentityInfo()
        
            throws JsonProcessingException {
        
        IdentityInfoManagerDemoBean demoBean = new IdentityInfoManagerDemoBean(123L, "Mary Parker");
        
        IdentityInfoEmployeeDemoBean bean = new IdentityInfoEmployeeDemoBean(231L, "John Thomas", demoBean);
        
        demoBean.addEmployees(bean);
        
        String jsonString = objectMapper.writeValueAsString(bean);
        
        System.out.println(jsonString);
        
        assertThat(jsonString, containsString("John Thomas"));
        
        assertThat(jsonString, containsString("231"));
        
        assertThat(jsonString, containsString("employees"));
        
    }
}
