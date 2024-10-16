package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class ReceiverAnnotationWrapper {

    
    private ReceiverAnnotation receiverAnnotation;

    public ReceiverAnnotationWrapper(ReceiverAnnotation receiverAnnotation) {
        this.receiverAnnotation = receiverAnnotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getS())) {
            
            return receiverAnnotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getT())) {
            
            return receiverAnnotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(receiverAnnotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getAnnotationOrigin())) {
            
            return new StringWrapper(receiverAnnotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(receiverAnnotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getComputed() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getComputed())) {
            
            return new BooleanWrapper(receiverAnnotation.getComputed());
            
        } else {
            return null;
        }
        
    }

    public DataElementRef_InvalidationPolicyWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getDataElementRef())) {
            
            return new DataElementRef_InvalidationPolicyWrapper(receiverAnnotation.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public DataLimitKindEnumWrapper getLimitKind() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getLimitKind())) {
            
            return new DataLimitKindEnumWrapper(receiverAnnotation.getLimitKind());
            
        } else {
            return null;
        }
        
    }

    public ProcessingKindEnumWrapper getProcessingKind() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getProcessingKind())) {
            
            return new ProcessingKindEnumWrapper(receiverAnnotation.getProcessingKind());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getSignalAge() {
        
        if (CollUtil.isNotEmpty(receiverAnnotation.getSignalAge())) {
            
            return new MultidimensionalTimeWrapper(receiverAnnotation.getSignalAge());
            
        } else {
            return null;
        }
        
    }




    


    
}