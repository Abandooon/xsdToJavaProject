package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class EcucModuleDefWrapper {

    
    private EcucModuleDef ecucModuleDef;

    public EcucModuleDefWrapper(EcucModuleDef ecucModuleDef) {
        this.ecucModuleDef = ecucModuleDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getS())) {
            
            return ecucModuleDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getT())) {
            
            return ecucModuleDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getUuid())) {
            
            return ecucModuleDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getShortName())) {
            
            return new IdentifierWrapper(ecucModuleDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucModuleDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucModuleDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucModuleDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucModuleDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucModuleDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucModuleDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucModuleDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucModuleDef.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(ecucModuleDef.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getShortNamePattern())) {
            
            return new StringWrapper(ecucModuleDef.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucModuleDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucModuleDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucModuleDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucModuleDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucModuleDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucModuleDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucModuleDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getApiServicePrefix() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getApiServicePrefix())) {
            
            return new CIdentifierWrapper(ecucModuleDef.getApiServicePrefix());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantSupport() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getPostBuildVariantSupport())) {
            
            return new BooleanWrapper(ecucModuleDef.getPostBuildVariantSupport());
            
        } else {
            return null;
        }
        
    }

    public RefinedModuleDefRefWrapper getRefinedModuleDefRef() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getRefinedModuleDefRef())) {
            
            return new RefinedModuleDefRefWrapper(ecucModuleDef.getRefinedModuleDefRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucConfigurationVariantEnumWrapper> getSupportedConfigVariants() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getSupportedConfigVariants())) {
            ArrayList<EcucConfigurationVariantEnum> originalList = ecucModuleDef.getSupportedConfigVariants();
            ArrayList<EcucConfigurationVariantEnumWrapper> wrapperList = (ArrayList<EcucConfigurationVariantEnumWrapper>)originalList.stream()
                .map(item -> new EcucConfigurationVariantEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ContainersWrapper getContainers() {
        
        if (CollUtil.isNotEmpty(ecucModuleDef.getContainers())) {
            
            return new ContainersWrapper(ecucModuleDef.getContainers());
            
        } else {
            return null;
        }
        
    }




    


    
}