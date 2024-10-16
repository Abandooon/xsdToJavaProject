package stdgui.data.model.modelwrapper;


    
    

    
    


public class ComplexTypeMapping_SenderRecArrayElementMappingWrapper {

    
    private ComplexTypeMapping_SenderRecArrayElementMapping complexTypeMapping_SenderRecArrayElementMapping;

    public ComplexTypeMapping_SenderRecArrayElementMappingWrapper(ComplexTypeMapping_SenderRecArrayElementMapping complexTypeMapping_SenderRecArrayElementMapping) {
        this.complexTypeMapping_SenderRecArrayElementMapping = complexTypeMapping_SenderRecArrayElementMapping;
    }

   
    public SenderRecArrayTypeMappingWrapper getSenderRecArrayTypeMapping() {
        
        if (CollUtil.isNotEmpty(complexTypeMapping_SenderRecArrayElementMapping.getSenderRecArrayTypeMapping())) {
            
            return new SenderRecArrayTypeMappingWrapper(complexTypeMapping_SenderRecArrayElementMapping.getSenderRecArrayTypeMapping());
            
        } else {
            return null;
        }
        
    }

    public SenderRecRecordTypeMappingWrapper getSenderRecRecordTypeMapping() {
        
        if (CollUtil.isNotEmpty(complexTypeMapping_SenderRecArrayElementMapping.getSenderRecRecordTypeMapping())) {
            
            return new SenderRecRecordTypeMappingWrapper(complexTypeMapping_SenderRecArrayElementMapping.getSenderRecRecordTypeMapping());
            
        } else {
            return null;
        }
        
    }




    


    
}