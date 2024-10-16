package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class ExternalTriggeringPointIdentWrapper {

    
    private ExternalTriggeringPointIdent externalTriggeringPointIdent;

    public ExternalTriggeringPointIdentWrapper(ExternalTriggeringPointIdent externalTriggeringPointIdent) {
        this.externalTriggeringPointIdent = externalTriggeringPointIdent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getS())) {
            
            return externalTriggeringPointIdent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getT())) {
            
            return externalTriggeringPointIdent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getUuid())) {
            
            return externalTriggeringPointIdent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getShortName())) {
            
            return new IdentifierWrapper(externalTriggeringPointIdent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = externalTriggeringPointIdent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(externalTriggeringPointIdent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(externalTriggeringPointIdent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getCategory())) {
            
            return new CategoryStringWrapper(externalTriggeringPointIdent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getAdminData())) {
            
            return new AdminDataWrapper(externalTriggeringPointIdent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(externalTriggeringPointIdent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPointIdent.getAnnotations())) {
            ArrayList<Annotation> originalList = externalTriggeringPointIdent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}