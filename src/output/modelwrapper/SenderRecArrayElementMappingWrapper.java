package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SenderRecArrayElementMappingWrapper {

    
    private SenderRecArrayElementMapping senderRecArrayElementMapping;

    public SenderRecArrayElementMappingWrapper(SenderRecArrayElementMapping senderRecArrayElementMapping) {
        this.senderRecArrayElementMapping = senderRecArrayElementMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(senderRecArrayElementMapping.getS())) {
            
            return senderRecArrayElementMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(senderRecArrayElementMapping.getT())) {
            
            return senderRecArrayElementMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ComplexTypeMapping_SenderRecArrayElementMappingWrapper getComplexTypeMapping() {
        
        if (CollUtil.isNotEmpty(senderRecArrayElementMapping.getComplexTypeMapping())) {
            
            return new ComplexTypeMapping_SenderRecArrayElementMappingWrapper(senderRecArrayElementMapping.getComplexTypeMapping());
            
        } else {
            return null;
        }
        
    }

    public IndexedArrayElementWrapper getIndexedArrayElement() {
        
        if (CollUtil.isNotEmpty(senderRecArrayElementMapping.getIndexedArrayElement())) {
            
            return new IndexedArrayElementWrapper(senderRecArrayElementMapping.getIndexedArrayElement());
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(senderRecArrayElementMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(senderRecArrayElementMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}