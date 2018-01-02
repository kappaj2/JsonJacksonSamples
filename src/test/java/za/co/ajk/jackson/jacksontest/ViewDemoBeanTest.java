package za.co.ajk.jackson.jacksontest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;


public class ViewDemoBeanTest {
    
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
    public void testSerializingWithJsonView()
            
            throws JsonProcessingException {
        
        String jsonString = objectMapper.writerWithView(Views.Public.class)
                
                .writeValueAsString(new ViewDemoBean());
        
        String jsonStringInternal = objectMapper.writerWithView(Views.Internal.class)
                
                .writeValueAsString(new ViewDemoBean());
        
        System.out.println(jsonString);
        
        System.out.println(jsonStringInternal);
        
        assertThat(jsonString, containsString("James Clark"));
        
        assertThat(jsonString, not(containsString("gender")));
        
        assertThat(jsonStringInternal, containsString("gender"));
        
    }
}
