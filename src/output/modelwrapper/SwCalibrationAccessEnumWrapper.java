package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwCalibrationAccessEnumWrapper {

    
    private SwCalibrationAccessEnum swCalibrationAccessEnum;

    public SwCalibrationAccessEnumWrapper(SwCalibrationAccessEnum swCalibrationAccessEnum) {
        this.swCalibrationAccessEnum = swCalibrationAccessEnum;
    }

   
    public SwCalibrationAccessEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(swCalibrationAccessEnum.getValue())) {
            
            return swCalibrationAccessEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swCalibrationAccessEnum.getS())) {
            
            return swCalibrationAccessEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swCalibrationAccessEnum.getT())) {
            
            return swCalibrationAccessEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}