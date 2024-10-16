package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class ParameterPortAnnotationWrapper {

    
    private ParameterPortAnnotation parameterPortAnnotation;

    public ParameterPortAnnotationWrapper(ParameterPortAnnotation parameterPortAnnotation) {
        this.parameterPortAnnotation = parameterPortAnnotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(parameterPortAnnotation.getS())) {
            
            return parameterPortAnnotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(parameterPortAnnotation.getT())) {
            
            return parameterPortAnnotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(parameterPortAnnotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(parameterPortAnnotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(parameterPortAnnotation.getAnnotationOrigin())) {
            
            return new StringWrapper(parameterPortAnnotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(parameterPortAnnotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(parameterPortAnnotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }

    public ParameterRefWrapper getParameterRef() {
        
        if (CollUtil.isNotEmpty(parameterPortAnnotation.getParameterRef())) {
            
            return new ParameterRefWrapper(parameterPortAnnotation.getParameterRef());
            
        } else {
            return null;
        }
        
    }




    


    
}