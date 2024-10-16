package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CanTpAddressingFormatTypeWrapper {

    
    private CanTpAddressingFormatType canTpAddressingFormatType;

    public CanTpAddressingFormatTypeWrapper(CanTpAddressingFormatType canTpAddressingFormatType) {
        this.canTpAddressingFormatType = canTpAddressingFormatType;
    }

   
    public CanTpAddressingFormatTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(canTpAddressingFormatType.getValue())) {
            
            return canTpAddressingFormatType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canTpAddressingFormatType.getS())) {
            
            return canTpAddressingFormatType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canTpAddressingFormatType.getT())) {
            
            return canTpAddressingFormatType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}