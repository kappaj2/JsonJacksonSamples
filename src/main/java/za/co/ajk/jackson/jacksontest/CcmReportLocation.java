package za.co.ajk.jackson.jacksontest;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class CcmReportLocation {
    
    private String xmlReportLocation;
    private String jsonReportLocation;
    private String reportKey;
    private String type;
    
    public String getXmlReportLocation() {
        return this.xmlReportLocation;
    }
    
    public void setXmlReportLocation(String xmlReportLocation) {
        this.xmlReportLocation = xmlReportLocation;
    }
    
    public String getJsonReportLocation() {
        return this.jsonReportLocation;
    }
    
    public void setJsonReportLocation(String jsonReportLocation) {
        this.jsonReportLocation = jsonReportLocation;
    }
    
    public String getReportKey() {
        return this.reportKey;
    }
    
    public void setReportKey(String reportKey) {
        this.reportKey = reportKey;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
