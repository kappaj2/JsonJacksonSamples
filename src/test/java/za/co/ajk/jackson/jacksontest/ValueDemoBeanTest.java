package za.co.ajk.jackson.jacksontest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class ValueDemoBeanTest {
    
    private ObjectMapper objectMapper;
    
    @Before
    public void setUp() throws Exception{
        objectMapper = new ObjectMapper();
    }
    
    @After
    public void tearDown() throws Exception{
        objectMapper = null;
    }
    
    @Test
    public void testSerializingWithJsonValue() throws JsonProcessingException{
        
        String jsonString = objectMapper.writeValueAsString(new ValueDemoBean());
        
        System.out.println(jsonString);
        
        assertThat(jsonString, containsString("James Clark"));
        
        assertThat(jsonString, containsString("James Clark,123"));
        
    }
    
}