package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SenderRecRecordTypeMappingWrapper {

    
    private SenderRecRecordTypeMapping senderRecRecordTypeMapping;

    public SenderRecRecordTypeMappingWrapper(SenderRecRecordTypeMapping senderRecRecordTypeMapping) {
        this.senderRecRecordTypeMapping = senderRecRecordTypeMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(senderRecRecordTypeMapping.getS())) {
            
            return senderRecRecordTypeMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(senderRecRecordTypeMapping.getT())) {
            
            return senderRecRecordTypeMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SenderRecRecordElementMappingWrapper> getRecordElementMappings() {
        
        if (CollUtil.isNotEmpty(senderRecRecordTypeMapping.getRecordElementMappings())) {
            ArrayList<SenderRecRecordElementMapping> originalList = senderRecRecordTypeMapping.getRecordElementMappings();
            ArrayList<SenderRecRecordElementMappingWrapper> wrapperList = (ArrayList<SenderRecRecordElementMappingWrapper>)originalList.stream()
                .map(item -> new SenderRecRecordElementMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}