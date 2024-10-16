package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class AutosarVariableInstanceWrapper {

    
    private AutosarVariableInstance autosarVariableInstance;

    public AutosarVariableInstanceWrapper(AutosarVariableInstance autosarVariableInstance) {
        this.autosarVariableInstance = autosarVariableInstance;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getS())) {
            
            return autosarVariableInstance.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getT())) {
            
            return autosarVariableInstance.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getUuid())) {
            
            return autosarVariableInstance.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getShortName())) {
            
            return new IdentifierWrapper(autosarVariableInstance.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = autosarVariableInstance.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getLongName())) {
            
            return new MultilanguageLongNameWrapper(autosarVariableInstance.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(autosarVariableInstance.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getCategory())) {
            
            return new CategoryStringWrapper(autosarVariableInstance.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getAdminData())) {
            
            return new AdminDataWrapper(autosarVariableInstance.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getIntroduction())) {
            
            return new DocumentationBlockWrapper(autosarVariableInstance.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getAnnotations())) {
            ArrayList<Annotation> originalList = autosarVariableInstance.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariableInComponentInstanceRefWrapper getVariableInstanceIref() {
        
        if (CollUtil.isNotEmpty(autosarVariableInstance.getVariableInstanceIref())) {
            
            return new VariableInComponentInstanceRefWrapper(autosarVariableInstance.getVariableInstanceIref());
            
        } else {
            return null;
        }
        
    }




    


    
}