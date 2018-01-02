package za.co.ajk.jackson.jacksontest;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class PropertyDemoBeanTest {
    
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
    public void testSerializingWithJsonProperty()
            
            throws JsonProcessingException {
        
        String jsonString = objectMapper.writeValueAsString(new PropertyDemoBean());
        
        System.out.println(jsonString);
        
        assertThat(jsonString, containsString("James Clark"));
        
        assertThat(jsonString, containsString("123"));
        
    }
    
    @Test
    
    public void testDeSerializingWithJsonProperty() throws IOException {
        
        String jsonString = "{\"person-id\": 231, \"name\": \"Mary Parker\"}";
        
        ObjectMapper mapper = new ObjectMapper();
        
        PropertyDemoBean bean = objectMapper.readValue(jsonString, PropertyDemoBean.class);
        
        System.out.println(bean);
        
        assertThat(bean.name, is(equalTo("Mary Parker")));
        
        assertThat(bean.personId, is(equalTo(231L)));
        
    }
    
}
