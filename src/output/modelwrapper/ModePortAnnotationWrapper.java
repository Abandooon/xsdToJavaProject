package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class ModePortAnnotationWrapper {

    
    private ModePortAnnotation modePortAnnotation;

    public ModePortAnnotationWrapper(ModePortAnnotation modePortAnnotation) {
        this.modePortAnnotation = modePortAnnotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modePortAnnotation.getS())) {
            
            return modePortAnnotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modePortAnnotation.getT())) {
            
            return modePortAnnotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(modePortAnnotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(modePortAnnotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(modePortAnnotation.getAnnotationOrigin())) {
            
            return new StringWrapper(modePortAnnotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(modePortAnnotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(modePortAnnotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }

    public ModeGroupRefWrapper getModeGroupRef() {
        
        if (CollUtil.isNotEmpty(modePortAnnotation.getModeGroupRef())) {
            
            return new ModeGroupRefWrapper(modePortAnnotation.getModeGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}