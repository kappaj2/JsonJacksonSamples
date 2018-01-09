package za.co.ajk.jackson.jacksontest;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;


public class ArrayTestBean extends ArrayList<CcmReportLocation> {
    
    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
    private List<CcmReportLocation> reportLocations = new ArrayList<>();
    
    public List<CcmReportLocation> getReportLocations() {
        return this.reportLocations;
    }
    
    public void setReportLocations(List<CcmReportLocation> reportLocations) {
        this.reportLocations = reportLocations;
    }
}
