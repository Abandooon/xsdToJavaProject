package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ClientServerOperationMappingWrapper {

    
    private ClientServerOperationMapping clientServerOperationMapping;

    public ClientServerOperationMappingWrapper(ClientServerOperationMapping clientServerOperationMapping) {
        this.clientServerOperationMapping = clientServerOperationMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerOperationMapping.getS())) {
            
            return clientServerOperationMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerOperationMapping.getT())) {
            
            return clientServerOperationMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataPrototypeMappingWrapper> getArgumentMappings() {
        
        if (CollUtil.isNotEmpty(clientServerOperationMapping.getArgumentMappings())) {
            ArrayList<DataPrototypeMapping> originalList = clientServerOperationMapping.getArgumentMappings();
            ArrayList<DataPrototypeMappingWrapper> wrapperList = (ArrayList<DataPrototypeMappingWrapper>)originalList.stream()
                .map(item -> new DataPrototypeMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FirstOperationRefWrapper getFirstOperationRef() {
        
        if (CollUtil.isNotEmpty(clientServerOperationMapping.getFirstOperationRef())) {
            
            return new FirstOperationRefWrapper(clientServerOperationMapping.getFirstOperationRef());
            
        } else {
            return null;
        }
        
    }

    public SecondOperationRefWrapper getSecondOperationRef() {
        
        if (CollUtil.isNotEmpty(clientServerOperationMapping.getSecondOperationRef())) {
            
            return new SecondOperationRefWrapper(clientServerOperationMapping.getSecondOperationRef());
            
        } else {
            return null;
        }
        
    }




    


    
}