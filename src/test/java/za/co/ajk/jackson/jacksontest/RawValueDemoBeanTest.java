package za.co.ajk.jackson.jacksontest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;


public class RawValueDemoBeanTest {
    
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
    public void testSerializingWithJsonRawValue() throws JsonProcessingException {
    
        //  This will include the class name/root node as the master node 
        //  @JsonRootName(value = "Abc") can override the default of Clazz.name
        
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        
        String jsonString = objectMapper.writeValueAsString(new RawValueDemoBean());
        
        System.out.println(jsonString);
        assertThat(jsonString, containsString("James Clark"));
        assertThat(jsonString, containsString("{\"doorNumber\": 1234, " +
                "\"street\": \"phase-1\", \"city\": \"New York\"}"));
        
    }
    
}
