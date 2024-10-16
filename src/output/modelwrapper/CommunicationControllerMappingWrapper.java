package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class CommunicationControllerMappingWrapper {

    
    private CommunicationControllerMapping communicationControllerMapping;

    public CommunicationControllerMappingWrapper(CommunicationControllerMapping communicationControllerMapping) {
        this.communicationControllerMapping = communicationControllerMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(communicationControllerMapping.getS())) {
            
            return communicationControllerMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(communicationControllerMapping.getT())) {
            
            return communicationControllerMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationControllerRefWrapper getCommunicationControllerRef() {
        
        if (CollUtil.isNotEmpty(communicationControllerMapping.getCommunicationControllerRef())) {
            
            return new CommunicationControllerRefWrapper(communicationControllerMapping.getCommunicationControllerRef());
            
        } else {
            return null;
        }
        
    }

    public HwCommunicationControllerRefWrapper getHwCommunicationControllerRef() {
        
        if (CollUtil.isNotEmpty(communicationControllerMapping.getHwCommunicationControllerRef())) {
            
            return new HwCommunicationControllerRefWrapper(communicationControllerMapping.getHwCommunicationControllerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}