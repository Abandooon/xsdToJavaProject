package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    


public class PortPrototypeBlueprintWrapper {

    
    private PortPrototypeBlueprint portPrototypeBlueprint;

    public PortPrototypeBlueprintWrapper(PortPrototypeBlueprint portPrototypeBlueprint) {
        this.portPrototypeBlueprint = portPrototypeBlueprint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getS())) {
            
            return portPrototypeBlueprint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getT())) {
            
            return portPrototypeBlueprint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getUuid())) {
            
            return portPrototypeBlueprint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getShortName())) {
            
            return new IdentifierWrapper(portPrototypeBlueprint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = portPrototypeBlueprint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(portPrototypeBlueprint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(portPrototypeBlueprint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getCategory())) {
            
            return new CategoryStringWrapper(portPrototypeBlueprint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getAdminData())) {
            
            return new AdminDataWrapper(portPrototypeBlueprint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(portPrototypeBlueprint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getAnnotations())) {
            ArrayList<Annotation> originalList = portPrototypeBlueprint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getVariationPoint())) {
            
            return new VariationPointWrapper(portPrototypeBlueprint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(portPrototypeBlueprint.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getShortNamePattern())) {
            
            return new StringWrapper(portPrototypeBlueprint.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortPrototypeBlueprintInitValueWrapper> getInitValues() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getInitValues())) {
            ArrayList<PortPrototypeBlueprintInitValue> originalList = portPrototypeBlueprint.getInitValues();
            ArrayList<PortPrototypeBlueprintInitValueWrapper> wrapperList = (ArrayList<PortPrototypeBlueprintInitValueWrapper>)originalList.stream()
                .map(item -> new PortPrototypeBlueprintInitValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public InterfaceRefWrapper getInterfaceRef() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getInterfaceRef())) {
            
            return new InterfaceRefWrapper(portPrototypeBlueprint.getInterfaceRef());
            
        } else {
            return null;
        }
        
    }

    public ProvidedComSpecsWrapper getProvidedComSpecs() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getProvidedComSpecs())) {
            
            return new ProvidedComSpecsWrapper(portPrototypeBlueprint.getProvidedComSpecs());
            
        } else {
            return null;
        }
        
    }

    public RequiredComSpecsWrapper getRequiredComSpecs() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprint.getRequiredComSpecs())) {
            
            return new RequiredComSpecsWrapper(portPrototypeBlueprint.getRequiredComSpecs());
            
        } else {
            return null;
        }
        
    }




    


    
}