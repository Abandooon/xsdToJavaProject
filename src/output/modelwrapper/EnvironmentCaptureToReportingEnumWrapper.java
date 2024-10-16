package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EnvironmentCaptureToReportingEnumWrapper {

    
    private EnvironmentCaptureToReportingEnum environmentCaptureToReportingEnum;

    public EnvironmentCaptureToReportingEnumWrapper(EnvironmentCaptureToReportingEnum environmentCaptureToReportingEnum) {
        this.environmentCaptureToReportingEnum = environmentCaptureToReportingEnum;
    }

   
    public EnvironmentCaptureToReportingEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(environmentCaptureToReportingEnum.getValue())) {
            
            return environmentCaptureToReportingEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(environmentCaptureToReportingEnum.getS())) {
            
            return environmentCaptureToReportingEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(environmentCaptureToReportingEnum.getT())) {
            
            return environmentCaptureToReportingEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}