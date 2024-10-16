package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PortPrototypeBlueprintMappingWrapper {

    
    private PortPrototypeBlueprintMapping portPrototypeBlueprintMapping;

    public PortPrototypeBlueprintMappingWrapper(PortPrototypeBlueprintMapping portPrototypeBlueprintMapping) {
        this.portPrototypeBlueprintMapping = portPrototypeBlueprintMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprintMapping.getS())) {
            
            return portPrototypeBlueprintMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprintMapping.getT())) {
            
            return portPrototypeBlueprintMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeBlueprintRefWrapper getPortPrototypeBlueprintRef() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprintMapping.getPortPrototypeBlueprintRef())) {
            
            return new PortPrototypeBlueprintRefWrapper(portPrototypeBlueprintMapping.getPortPrototypeBlueprintRef());
            
        } else {
            return null;
        }
        
    }

    public DerivedPortPrototypeRefWrapper getDerivedPortPrototypeRef() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprintMapping.getDerivedPortPrototypeRef())) {
            
            return new DerivedPortPrototypeRefWrapper(portPrototypeBlueprintMapping.getDerivedPortPrototypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}