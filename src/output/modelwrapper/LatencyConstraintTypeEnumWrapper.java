package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class LatencyConstraintTypeEnumWrapper {

    
    private LatencyConstraintTypeEnum latencyConstraintTypeEnum;

    public LatencyConstraintTypeEnumWrapper(LatencyConstraintTypeEnum latencyConstraintTypeEnum) {
        this.latencyConstraintTypeEnum = latencyConstraintTypeEnum;
    }

   
    public LatencyConstraintTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(latencyConstraintTypeEnum.getValue())) {
            
            return latencyConstraintTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(latencyConstraintTypeEnum.getS())) {
            
            return latencyConstraintTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(latencyConstraintTypeEnum.getT())) {
            
            return latencyConstraintTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}