package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class HwPortMappingWrapper {

    
    private HwPortMapping hwPortMapping;

    public HwPortMappingWrapper(HwPortMapping hwPortMapping) {
        this.hwPortMapping = hwPortMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwPortMapping.getS())) {
            
            return hwPortMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwPortMapping.getT())) {
            
            return hwPortMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationConnectorRefWrapper getCommunicationConnectorRef() {
        
        if (CollUtil.isNotEmpty(hwPortMapping.getCommunicationConnectorRef())) {
            
            return new CommunicationConnectorRefWrapper(hwPortMapping.getCommunicationConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public HwCommunicationPortRefWrapper getHwCommunicationPortRef() {
        
        if (CollUtil.isNotEmpty(hwPortMapping.getHwCommunicationPortRef())) {
            
            return new HwCommunicationPortRefWrapper(hwPortMapping.getHwCommunicationPortRef());
            
        } else {
            return null;
        }
        
    }




    


    
}