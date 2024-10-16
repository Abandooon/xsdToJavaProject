package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ModeDeclarationGroupWrapper {

    
    private ModeDeclarationGroup modeDeclarationGroup;

    public ModeDeclarationGroupWrapper(ModeDeclarationGroup modeDeclarationGroup) {
        this.modeDeclarationGroup = modeDeclarationGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getS())) {
            
            return modeDeclarationGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getT())) {
            
            return modeDeclarationGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getUuid())) {
            
            return modeDeclarationGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getShortName())) {
            
            return new IdentifierWrapper(modeDeclarationGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeDeclarationGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeDeclarationGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeDeclarationGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getCategory())) {
            
            return new CategoryStringWrapper(modeDeclarationGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getAdminData())) {
            
            return new AdminDataWrapper(modeDeclarationGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeDeclarationGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = modeDeclarationGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(modeDeclarationGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(modeDeclarationGroup.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getShortNamePattern())) {
            
            return new StringWrapper(modeDeclarationGroup.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public InitialModeRefWrapper getInitialModeRef() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getInitialModeRef())) {
            
            return new InitialModeRefWrapper(modeDeclarationGroup.getInitialModeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationWrapper> getModeDeclarations() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getModeDeclarations())) {
            ArrayList<ModeDeclaration> originalList = modeDeclarationGroup.getModeDeclarations();
            ArrayList<ModeDeclarationWrapper> wrapperList = (ArrayList<ModeDeclarationWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ModeErrorBehaviorWrapper getModeManagerErrorBehavior() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getModeManagerErrorBehavior())) {
            
            return new ModeErrorBehaviorWrapper(modeDeclarationGroup.getModeManagerErrorBehavior());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeTransitionWrapper> getModeTransitions() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getModeTransitions())) {
            ArrayList<ModeTransition> originalList = modeDeclarationGroup.getModeTransitions();
            ArrayList<ModeTransitionWrapper> wrapperList = (ArrayList<ModeTransitionWrapper>)originalList.stream()
                .map(item -> new ModeTransitionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ModeErrorBehaviorWrapper getModeUserErrorBehavior() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getModeUserErrorBehavior())) {
            
            return new ModeErrorBehaviorWrapper(modeDeclarationGroup.getModeUserErrorBehavior());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getOnTransitionValue() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroup.getOnTransitionValue())) {
            
            return new PositiveIntegerWrapper(modeDeclarationGroup.getOnTransitionValue());
            
        } else {
            return null;
        }
        
    }




    


    
}