package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ClientServerRecordElementMappingWrapper {

    
    private ClientServerRecordElementMapping clientServerRecordElementMapping;

    public ClientServerRecordElementMappingWrapper(ClientServerRecordElementMapping clientServerRecordElementMapping) {
        this.clientServerRecordElementMapping = clientServerRecordElementMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerRecordElementMapping.getS())) {
            
            return clientServerRecordElementMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerRecordElementMapping.getT())) {
            
            return clientServerRecordElementMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ApplicationRecordElementRefWrapper getApplicationRecordElementRef() {
        
        if (CollUtil.isNotEmpty(clientServerRecordElementMapping.getApplicationRecordElementRef())) {
            
            return new ApplicationRecordElementRefWrapper(clientServerRecordElementMapping.getApplicationRecordElementRef());
            
        } else {
            return null;
        }
        
    }

    public ComplexTypeMappingWrapper getComplexTypeMapping() {
        
        if (CollUtil.isNotEmpty(clientServerRecordElementMapping.getComplexTypeMapping())) {
            
            return new ComplexTypeMappingWrapper(clientServerRecordElementMapping.getComplexTypeMapping());
            
        } else {
            return null;
        }
        
    }

    public ImplementationRecordElementRefWrapper getImplementationRecordElementRef() {
        
        if (CollUtil.isNotEmpty(clientServerRecordElementMapping.getImplementationRecordElementRef())) {
            
            return new ImplementationRecordElementRefWrapper(clientServerRecordElementMapping.getImplementationRecordElementRef());
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(clientServerRecordElementMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(clientServerRecordElementMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}