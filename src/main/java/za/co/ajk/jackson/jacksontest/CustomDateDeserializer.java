package za.co.ajk.jackson.jacksontest;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;


public class CustomDateDeserializer extends StdDeserializer<Date> {
    
    private static SimpleDateFormat simpleDateFormat =
            new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    
    public CustomDateDeserializer() {
        this(null);
    }
    
    public CustomDateDeserializer(Class<?> c) {
        super(c);
    }
    
    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws
                                                                                                  IOException,
                                                                                                  JsonProcessingException {
        
        String date = jsonParser.getText();
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        
    }
    
}