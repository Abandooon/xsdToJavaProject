package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PortPrototypeBlueprintInitValueWrapper {

    
    private PortPrototypeBlueprintInitValue portPrototypeBlueprintInitValue;

    public PortPrototypeBlueprintInitValueWrapper(PortPrototypeBlueprintInitValue portPrototypeBlueprintInitValue) {
        this.portPrototypeBlueprintInitValue = portPrototypeBlueprintInitValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprintInitValue.getS())) {
            
            return portPrototypeBlueprintInitValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprintInitValue.getT())) {
            
            return portPrototypeBlueprintInitValue.getT();
            
        } else {
            return null;
        }
        
    }

    public DataPrototypeRefWrapper getDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprintInitValue.getDataPrototypeRef())) {
            
            return new DataPrototypeRefWrapper(portPrototypeBlueprintInitValue.getDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public ValueWrapper getValue() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprintInitValue.getValue())) {
            
            return new ValueWrapper(portPrototypeBlueprintInitValue.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}