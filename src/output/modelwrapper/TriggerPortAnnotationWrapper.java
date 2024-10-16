package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class TriggerPortAnnotationWrapper {

    
    private TriggerPortAnnotation triggerPortAnnotation;

    public TriggerPortAnnotationWrapper(TriggerPortAnnotation triggerPortAnnotation) {
        this.triggerPortAnnotation = triggerPortAnnotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(triggerPortAnnotation.getS())) {
            
            return triggerPortAnnotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(triggerPortAnnotation.getT())) {
            
            return triggerPortAnnotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(triggerPortAnnotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(triggerPortAnnotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(triggerPortAnnotation.getAnnotationOrigin())) {
            
            return new StringWrapper(triggerPortAnnotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(triggerPortAnnotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(triggerPortAnnotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }

    public TriggerRefWrapper getTriggerRef() {
        
        if (CollUtil.isNotEmpty(triggerPortAnnotation.getTriggerRef())) {
            
            return new TriggerRefWrapper(triggerPortAnnotation.getTriggerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}