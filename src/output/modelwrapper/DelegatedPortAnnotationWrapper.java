package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class DelegatedPortAnnotationWrapper {

    
    private DelegatedPortAnnotation delegatedPortAnnotation;

    public DelegatedPortAnnotationWrapper(DelegatedPortAnnotation delegatedPortAnnotation) {
        this.delegatedPortAnnotation = delegatedPortAnnotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(delegatedPortAnnotation.getS())) {
            
            return delegatedPortAnnotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(delegatedPortAnnotation.getT())) {
            
            return delegatedPortAnnotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(delegatedPortAnnotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(delegatedPortAnnotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(delegatedPortAnnotation.getAnnotationOrigin())) {
            
            return new StringWrapper(delegatedPortAnnotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(delegatedPortAnnotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(delegatedPortAnnotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }

    public SignalFanEnumWrapper getSignalFan() {
        
        if (CollUtil.isNotEmpty(delegatedPortAnnotation.getSignalFan())) {
            
            return new SignalFanEnumWrapper(delegatedPortAnnotation.getSignalFan());
            
        } else {
            return null;
        }
        
    }




    


    
}