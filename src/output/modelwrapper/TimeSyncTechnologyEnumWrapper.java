package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TimeSyncTechnologyEnumWrapper {

    
    private TimeSyncTechnologyEnum timeSyncTechnologyEnum;

    public TimeSyncTechnologyEnumWrapper(TimeSyncTechnologyEnum timeSyncTechnologyEnum) {
        this.timeSyncTechnologyEnum = timeSyncTechnologyEnum;
    }

   
    public TimeSyncTechnologyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(timeSyncTechnologyEnum.getValue())) {
            
            return timeSyncTechnologyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(timeSyncTechnologyEnum.getS())) {
            
            return timeSyncTechnologyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(timeSyncTechnologyEnum.getT())) {
            
            return timeSyncTechnologyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}