package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SenderRecArrayTypeMappingWrapper {

    
    private SenderRecArrayTypeMapping senderRecArrayTypeMapping;

    public SenderRecArrayTypeMappingWrapper(SenderRecArrayTypeMapping senderRecArrayTypeMapping) {
        this.senderRecArrayTypeMapping = senderRecArrayTypeMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(senderRecArrayTypeMapping.getS())) {
            
            return senderRecArrayTypeMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(senderRecArrayTypeMapping.getT())) {
            
            return senderRecArrayTypeMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SenderRecArrayElementMappingWrapper> getArrayElementMappings() {
        
        if (CollUtil.isNotEmpty(senderRecArrayTypeMapping.getArrayElementMappings())) {
            ArrayList<SenderRecArrayElementMapping> originalList = senderRecArrayTypeMapping.getArrayElementMappings();
            ArrayList<SenderRecArrayElementMappingWrapper> wrapperList = (ArrayList<SenderRecArrayElementMappingWrapper>)originalList.stream()
                .map(item -> new SenderRecArrayElementMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}