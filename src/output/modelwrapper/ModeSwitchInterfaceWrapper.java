package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class ModeSwitchInterfaceWrapper {

    
    private ModeSwitchInterface modeSwitchInterface;

    public ModeSwitchInterfaceWrapper(ModeSwitchInterface modeSwitchInterface) {
        this.modeSwitchInterface = modeSwitchInterface;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getS())) {
            
            return modeSwitchInterface.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getT())) {
            
            return modeSwitchInterface.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getUuid())) {
            
            return modeSwitchInterface.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getShortName())) {
            
            return new IdentifierWrapper(modeSwitchInterface.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeSwitchInterface.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeSwitchInterface.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeSwitchInterface.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getCategory())) {
            
            return new CategoryStringWrapper(modeSwitchInterface.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getAdminData())) {
            
            return new AdminDataWrapper(modeSwitchInterface.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeSwitchInterface.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getAnnotations())) {
            ArrayList<Annotation> originalList = modeSwitchInterface.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getVariationPoint())) {
            
            return new VariationPointWrapper(modeSwitchInterface.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(modeSwitchInterface.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getShortNamePattern())) {
            
            return new StringWrapper(modeSwitchInterface.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsService() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getIsService())) {
            
            return new BooleanWrapper(modeSwitchInterface.getIsService());
            
        } else {
            return null;
        }
        
    }

    public ServiceProviderEnumWrapper getServiceKind() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getServiceKind())) {
            
            return new ServiceProviderEnumWrapper(modeSwitchInterface.getServiceKind());
            
        } else {
            return null;
        }
        
    }

    public ModeDeclarationGroupPrototypeWrapper getModeGroup() {
        
        if (CollUtil.isNotEmpty(modeSwitchInterface.getModeGroup())) {
            
            return new ModeDeclarationGroupPrototypeWrapper(modeSwitchInterface.getModeGroup());
            
        } else {
            return null;
        }
        
    }




    


    
}