package za.co.ajk.jackson.jacksontest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

public class IncludeDemoBeanTest {
    
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
    
    public void testSerializingWithJsonInclude() throws JsonProcessingException {
        
        String jsonString = objectMapper.writeValueAsString(new IncludeDemoBean());
        
        System.out.println(jsonString);
        
        assertThat(jsonString, containsString("123"));
        
        assertThat(jsonString, not(containsString("name")));
        
    }
}
