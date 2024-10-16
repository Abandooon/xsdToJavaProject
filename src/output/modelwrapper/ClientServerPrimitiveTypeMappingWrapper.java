package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ClientServerPrimitiveTypeMappingWrapper {

    
    private ClientServerPrimitiveTypeMapping clientServerPrimitiveTypeMapping;

    public ClientServerPrimitiveTypeMappingWrapper(ClientServerPrimitiveTypeMapping clientServerPrimitiveTypeMapping) {
        this.clientServerPrimitiveTypeMapping = clientServerPrimitiveTypeMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerPrimitiveTypeMapping.getS())) {
            
            return clientServerPrimitiveTypeMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerPrimitiveTypeMapping.getT())) {
            
            return clientServerPrimitiveTypeMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ArgumentRefWrapper getArgumentRef() {
        
        if (CollUtil.isNotEmpty(clientServerPrimitiveTypeMapping.getArgumentRef())) {
            
            return new ArgumentRefWrapper(clientServerPrimitiveTypeMapping.getArgumentRef());
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(clientServerPrimitiveTypeMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(clientServerPrimitiveTypeMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}