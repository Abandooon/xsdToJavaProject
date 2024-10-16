package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MaxCommModeEnumWrapper {

    
    private MaxCommModeEnum maxCommModeEnum;

    public MaxCommModeEnumWrapper(MaxCommModeEnum maxCommModeEnum) {
        this.maxCommModeEnum = maxCommModeEnum;
    }

   
    public MaxCommModeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(maxCommModeEnum.getValue())) {
            
            return maxCommModeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(maxCommModeEnum.getS())) {
            
            return maxCommModeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(maxCommModeEnum.getT())) {
            
            return maxCommModeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}