package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ClientServerArrayTypeMappingWrapper {

    
    private ClientServerArrayTypeMapping clientServerArrayTypeMapping;

    public ClientServerArrayTypeMappingWrapper(ClientServerArrayTypeMapping clientServerArrayTypeMapping) {
        this.clientServerArrayTypeMapping = clientServerArrayTypeMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerArrayTypeMapping.getS())) {
            
            return clientServerArrayTypeMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerArrayTypeMapping.getT())) {
            
            return clientServerArrayTypeMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ArgumentRefWrapper getArgumentRef() {
        
        if (CollUtil.isNotEmpty(clientServerArrayTypeMapping.getArgumentRef())) {
            
            return new ArgumentRefWrapper(clientServerArrayTypeMapping.getArgumentRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerArrayElementMappingWrapper> getArrayElementMappings() {
        
        if (CollUtil.isNotEmpty(clientServerArrayTypeMapping.getArrayElementMappings())) {
            ArrayList<ClientServerArrayElementMapping> originalList = clientServerArrayTypeMapping.getArrayElementMappings();
            ArrayList<ClientServerArrayElementMappingWrapper> wrapperList = (ArrayList<ClientServerArrayElementMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerArrayElementMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}