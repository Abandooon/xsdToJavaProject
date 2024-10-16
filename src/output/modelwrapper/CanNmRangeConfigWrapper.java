package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class CanNmRangeConfigWrapper {

    
    private CanNmRangeConfig canNmRangeConfig;

    public CanNmRangeConfigWrapper(CanNmRangeConfig canNmRangeConfig) {
        this.canNmRangeConfig = canNmRangeConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canNmRangeConfig.getS())) {
            
            return canNmRangeConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canNmRangeConfig.getT())) {
            
            return canNmRangeConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getLowerCanId() {
        
        if (CollUtil.isNotEmpty(canNmRangeConfig.getLowerCanId())) {
            
            return new PositiveIntegerWrapper(canNmRangeConfig.getLowerCanId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getUpperCanId() {
        
        if (CollUtil.isNotEmpty(canNmRangeConfig.getUpperCanId())) {
            
            return new PositiveIntegerWrapper(canNmRangeConfig.getUpperCanId());
            
        } else {
            return null;
        }
        
    }




    


    
}