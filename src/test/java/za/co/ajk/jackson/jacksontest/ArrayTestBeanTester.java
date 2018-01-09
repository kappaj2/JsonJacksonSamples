package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.databind.ObjectMapper;


public class ArrayTestBeanTester {
    
    public static void main(String[] args) throws Exception{
        
        String raw = "[\n"
                + "  {\n"
                + "    \"xmlReportLocation\": \"http://ccm-stage-2.us-east-1.elasticbeanstalk.com/v1/reports/clients/f220d08a-0bac-4093-bc16-865deb83828b/reports/f3a9e8be-effa-4644-98cf-f443d8ad95ae.xml\",\n"
                + "    \"jsonReportLocation\": \"http://ccm-stage-2.us-east-1.elasticbeanstalk.com/v1/reports/clients/f220d08a-0bac-4093-bc16-865deb83828b/reports/f3a9e8be-effa-4644-98cf-f443d8ad95ae.json\",\n"
                + "    \"reportKey\": \"f3a9e8be-effa-4644-98cf-f443d8ad95ae\",\n"
                + "    \"type\": \"TUC_VANTAGE_SCORE_3\"\n"
                + "  },\n"
                + "  {\n"
                + "    \"xmlReportLocation\": \"http://ccm-stage-2.us-east-1.elasticbeanstalk.com/v1/reports/clients/f220d08a-0bac-4093-bc16-865deb83828b/reports/8dd2a3dc-c76b-4009-899b-80408b5cc745.xml\",\n"
                + "    \"jsonReportLocation\": \"http://ccm-stage-2.us-east-1.elasticbeanstalk.com/v1/reports/clients/f220d08a-0bac-4093-bc16-865deb83828b/reports/8dd2a3dc-c76b-4009-899b-80408b5cc745.json\",\n"
                + "    \"reportKey\": \"8dd2a3dc-c76b-4009-899b-80408b5cc745\",\n"
                + "    \"type\": \"MERGE_CREDIT_REPORTS\"\n"
                + "  }\n"
                + "]";
    
        ObjectMapper mapper = new ObjectMapper();
    
        ArrayTestBean bean = mapper.readValue(raw, ArrayTestBean.class);
        
        bean.getReportLocations();
        
    }
}
