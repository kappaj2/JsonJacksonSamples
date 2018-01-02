package za.co.ajk.jackson.jacksontest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class FilterDemoBeanTest {
    
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
    public void testSerializingWithJsonFilter()
        
            throws JsonProcessingException {
        
        FilterProvider filterProvider = new SimpleFilterProvider().
                
                addFilter("customFilter",
                        
                        SimpleBeanPropertyFilter.filterOutAllExcept("name"));
        
        String jsonString = objectMapper.writer(filterProvider).
                
                writeValueAsString(new FilterDemoBean());
        
        System.out.println(jsonString);
        
        assertThat(jsonString, containsString("James Clark"));
        
        assertThat(jsonString, not(containsString("123")));
        
    }
    
}
