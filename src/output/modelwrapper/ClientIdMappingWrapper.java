package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ClientIdMappingWrapper {

    
    private ClientIdMapping clientIdMapping;

    public ClientIdMappingWrapper(ClientIdMapping clientIdMapping) {
        this.clientIdMapping = clientIdMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientIdMapping.getS())) {
            
            return clientIdMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientIdMapping.getT())) {
            
            return clientIdMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(clientIdMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(clientIdMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}