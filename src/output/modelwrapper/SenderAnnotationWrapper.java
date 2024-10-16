package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class SenderAnnotationWrapper {

    
    private SenderAnnotation senderAnnotation;

    public SenderAnnotationWrapper(SenderAnnotation senderAnnotation) {
        this.senderAnnotation = senderAnnotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(senderAnnotation.getS())) {
            
            return senderAnnotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(senderAnnotation.getT())) {
            
            return senderAnnotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(senderAnnotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(senderAnnotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(senderAnnotation.getAnnotationOrigin())) {
            
            return new StringWrapper(senderAnnotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(senderAnnotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(senderAnnotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getComputed() {
        
        if (CollUtil.isNotEmpty(senderAnnotation.getComputed())) {
            
            return new BooleanWrapper(senderAnnotation.getComputed());
            
        } else {
            return null;
        }
        
    }

    public DataElementRef_InvalidationPolicyWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(senderAnnotation.getDataElementRef())) {
            
            return new DataElementRef_InvalidationPolicyWrapper(senderAnnotation.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public DataLimitKindEnumWrapper getLimitKind() {
        
        if (CollUtil.isNotEmpty(senderAnnotation.getLimitKind())) {
            
            return new DataLimitKindEnumWrapper(senderAnnotation.getLimitKind());
            
        } else {
            return null;
        }
        
    }

    public ProcessingKindEnumWrapper getProcessingKind() {
        
        if (CollUtil.isNotEmpty(senderAnnotation.getProcessingKind())) {
            
            return new ProcessingKindEnumWrapper(senderAnnotation.getProcessingKind());
            
        } else {
            return null;
        }
        
    }




    


    
}