package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ModeDeclarationMappingWrapper {

    
    private ModeDeclarationMapping modeDeclarationMapping;

    public ModeDeclarationMappingWrapper(ModeDeclarationMapping modeDeclarationMapping) {
        this.modeDeclarationMapping = modeDeclarationMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getS())) {
            
            return modeDeclarationMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getT())) {
            
            return modeDeclarationMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getUuid())) {
            
            return modeDeclarationMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getShortName())) {
            
            return new IdentifierWrapper(modeDeclarationMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeDeclarationMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeDeclarationMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeDeclarationMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getCategory())) {
            
            return new CategoryStringWrapper(modeDeclarationMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getAdminData())) {
            
            return new AdminDataWrapper(modeDeclarationMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeDeclarationMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = modeDeclarationMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FirstModeRefWrapper> getFirstModeRefs() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getFirstModeRefs())) {
            ArrayList<FirstModeRef> originalList = modeDeclarationMapping.getFirstModeRefs();
            ArrayList<FirstModeRefWrapper> wrapperList = (ArrayList<FirstModeRefWrapper>)originalList.stream()
                .map(item -> new FirstModeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SecondModeRefWrapper getSecondModeRef() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMapping.getSecondModeRef())) {
            
            return new SecondModeRefWrapper(modeDeclarationMapping.getSecondModeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}