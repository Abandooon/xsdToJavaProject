package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class NvDataPortAnnotationWrapper {

    
    private NvDataPortAnnotation nvDataPortAnnotation;

    public NvDataPortAnnotationWrapper(NvDataPortAnnotation nvDataPortAnnotation) {
        this.nvDataPortAnnotation = nvDataPortAnnotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvDataPortAnnotation.getS())) {
            
            return nvDataPortAnnotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvDataPortAnnotation.getT())) {
            
            return nvDataPortAnnotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(nvDataPortAnnotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(nvDataPortAnnotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(nvDataPortAnnotation.getAnnotationOrigin())) {
            
            return new StringWrapper(nvDataPortAnnotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(nvDataPortAnnotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(nvDataPortAnnotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }

    public VariableRefWrapper getVariableRef() {
        
        if (CollUtil.isNotEmpty(nvDataPortAnnotation.getVariableRef())) {
            
            return new VariableRefWrapper(nvDataPortAnnotation.getVariableRef());
            
        } else {
            return null;
        }
        
    }




    


    
}