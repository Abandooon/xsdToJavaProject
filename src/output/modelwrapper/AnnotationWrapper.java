package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Annotation;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class AnnotationWrapper {

    
    private Annotation annotation;

    public AnnotationWrapper(Annotation annotation) {
        this.annotation = annotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(annotation.getS())) {
            
            return annotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(annotation.getT())) {
            
            return annotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(annotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(annotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(annotation.getAnnotationOrigin())) {
            
            return new StringWrapper(annotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(annotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(annotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }




    


    
}