package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class AutosarOperationArgumentInstanceWrapper {

    
    private AutosarOperationArgumentInstance autosarOperationArgumentInstance;

    public AutosarOperationArgumentInstanceWrapper(AutosarOperationArgumentInstance autosarOperationArgumentInstance) {
        this.autosarOperationArgumentInstance = autosarOperationArgumentInstance;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getS())) {
            
            return autosarOperationArgumentInstance.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getT())) {
            
            return autosarOperationArgumentInstance.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getUuid())) {
            
            return autosarOperationArgumentInstance.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getShortName())) {
            
            return new IdentifierWrapper(autosarOperationArgumentInstance.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = autosarOperationArgumentInstance.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getLongName())) {
            
            return new MultilanguageLongNameWrapper(autosarOperationArgumentInstance.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(autosarOperationArgumentInstance.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getCategory())) {
            
            return new CategoryStringWrapper(autosarOperationArgumentInstance.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getAdminData())) {
            
            return new AdminDataWrapper(autosarOperationArgumentInstance.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getIntroduction())) {
            
            return new DocumentationBlockWrapper(autosarOperationArgumentInstance.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getAnnotations())) {
            ArrayList<Annotation> originalList = autosarOperationArgumentInstance.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public OperationArgumentInComponentInstanceRefWrapper getOperationArgumentInstanceIref() {
        
        if (CollUtil.isNotEmpty(autosarOperationArgumentInstance.getOperationArgumentInstanceIref())) {
            
            return new OperationArgumentInComponentInstanceRefWrapper(autosarOperationArgumentInstance.getOperationArgumentInstanceIref());
            
        } else {
            return null;
        }
        
    }




    


    
}