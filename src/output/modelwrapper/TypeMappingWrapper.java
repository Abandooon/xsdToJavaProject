package stdgui.data.model.modelwrapper;


    
    

    
    


public class TypeMappingWrapper {

    
    private TypeMapping typeMapping;

    public TypeMappingWrapper(TypeMapping typeMapping) {
        this.typeMapping = typeMapping;
    }

   
    public SenderRecArrayTypeMappingWrapper getSenderRecArrayTypeMapping() {
        
        if (CollUtil.isNotEmpty(typeMapping.getSenderRecArrayTypeMapping())) {
            
            return new SenderRecArrayTypeMappingWrapper(typeMapping.getSenderRecArrayTypeMapping());
            
        } else {
            return null;
        }
        
    }

    public SenderRecRecordTypeMappingWrapper getSenderRecRecordTypeMapping() {
        
        if (CollUtil.isNotEmpty(typeMapping.getSenderRecRecordTypeMapping())) {
            
            return new SenderRecRecordTypeMappingWrapper(typeMapping.getSenderRecRecordTypeMapping());
            
        } else {
            return null;
        }
        
    }




    


    
}