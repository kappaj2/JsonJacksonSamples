package za.co.ajk.jackson.jacksontest;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class SetterDemoBeanTest {
    
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
    public void testDeSerializingWithJsonSetter() throws IOException {
        
        String jsonString = "{\"id\": 231, \"name\": \"Mary Parker\"}";
        
        ObjectMapper mapper = new ObjectMapper();
        
        SetterDemoBean bean = objectMapper.readValue(jsonString, SetterDemoBean.class);
        
        System.out.println(bean);
        
        assertThat(bean.name, is(equalTo("Mary Parker")));
        
        assertThat(bean.personId, is(equalTo(231L)));
        
    }
}
