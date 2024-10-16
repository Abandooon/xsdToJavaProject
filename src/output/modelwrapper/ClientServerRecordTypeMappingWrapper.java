package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ClientServerRecordTypeMappingWrapper {

    
    private ClientServerRecordTypeMapping clientServerRecordTypeMapping;

    public ClientServerRecordTypeMappingWrapper(ClientServerRecordTypeMapping clientServerRecordTypeMapping) {
        this.clientServerRecordTypeMapping = clientServerRecordTypeMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerRecordTypeMapping.getS())) {
            
            return clientServerRecordTypeMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerRecordTypeMapping.getT())) {
            
            return clientServerRecordTypeMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ArgumentRefWrapper getArgumentRef() {
        
        if (CollUtil.isNotEmpty(clientServerRecordTypeMapping.getArgumentRef())) {
            
            return new ArgumentRefWrapper(clientServerRecordTypeMapping.getArgumentRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerRecordElementMappingWrapper> getRecordElementMappings() {
        
        if (CollUtil.isNotEmpty(clientServerRecordTypeMapping.getRecordElementMappings())) {
            ArrayList<ClientServerRecordElementMapping> originalList = clientServerRecordTypeMapping.getRecordElementMappings();
            ArrayList<ClientServerRecordElementMappingWrapper> wrapperList = (ArrayList<ClientServerRecordElementMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerRecordElementMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}