package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class SenderRecRecordElementMappingWrapper {

    
    private SenderRecRecordElementMapping senderRecRecordElementMapping;

    public SenderRecRecordElementMappingWrapper(SenderRecRecordElementMapping senderRecRecordElementMapping) {
        this.senderRecRecordElementMapping = senderRecRecordElementMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(senderRecRecordElementMapping.getS())) {
            
            return senderRecRecordElementMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(senderRecRecordElementMapping.getT())) {
            
            return senderRecRecordElementMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ApplicationRecordElementRefWrapper getApplicationRecordElementRef() {
        
        if (CollUtil.isNotEmpty(senderRecRecordElementMapping.getApplicationRecordElementRef())) {
            
            return new ApplicationRecordElementRefWrapper(senderRecRecordElementMapping.getApplicationRecordElementRef());
            
        } else {
            return null;
        }
        
    }

    public ComplexTypeMapping_SenderRecArrayElementMappingWrapper getComplexTypeMapping() {
        
        if (CollUtil.isNotEmpty(senderRecRecordElementMapping.getComplexTypeMapping())) {
            
            return new ComplexTypeMapping_SenderRecArrayElementMappingWrapper(senderRecRecordElementMapping.getComplexTypeMapping());
            
        } else {
            return null;
        }
        
    }

    public ImplementationRecordElementRefWrapper getImplementationRecordElementRef() {
        
        if (CollUtil.isNotEmpty(senderRecRecordElementMapping.getImplementationRecordElementRef())) {
            
            return new ImplementationRecordElementRefWrapper(senderRecRecordElementMapping.getImplementationRecordElementRef());
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(senderRecRecordElementMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(senderRecRecordElementMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}