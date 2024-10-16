package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PortInterfaceBlueprintMappingWrapper {

    
    private PortInterfaceBlueprintMapping portInterfaceBlueprintMapping;

    public PortInterfaceBlueprintMappingWrapper(PortInterfaceBlueprintMapping portInterfaceBlueprintMapping) {
        this.portInterfaceBlueprintMapping = portInterfaceBlueprintMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portInterfaceBlueprintMapping.getS())) {
            
            return portInterfaceBlueprintMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portInterfaceBlueprintMapping.getT())) {
            
            return portInterfaceBlueprintMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public PortInterfaceBlueprintRefWrapper getPortInterfaceBlueprintRef() {
        
        if (CollUtil.isNotEmpty(portInterfaceBlueprintMapping.getPortInterfaceBlueprintRef())) {
            
            return new PortInterfaceBlueprintRefWrapper(portInterfaceBlueprintMapping.getPortInterfaceBlueprintRef());
            
        } else {
            return null;
        }
        
    }

    public DerivedPortInterfaceRefWrapper getDerivedPortInterfaceRef() {
        
        if (CollUtil.isNotEmpty(portInterfaceBlueprintMapping.getDerivedPortInterfaceRef())) {
            
            return new DerivedPortInterfaceRefWrapper(portInterfaceBlueprintMapping.getDerivedPortInterfaceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}