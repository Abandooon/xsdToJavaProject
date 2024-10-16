package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CanAddressingModeTypeWrapper {

    
    private CanAddressingModeType canAddressingModeType;

    public CanAddressingModeTypeWrapper(CanAddressingModeType canAddressingModeType) {
        this.canAddressingModeType = canAddressingModeType;
    }

   
    public CanAddressingModeTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(canAddressingModeType.getValue())) {
            
            return canAddressingModeType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canAddressingModeType.getS())) {
            
            return canAddressingModeType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canAddressingModeType.getT())) {
            
            return canAddressingModeType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}