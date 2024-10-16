package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class EcucFloatParamDefWrapper {

    
    private EcucFloatParamDef ecucFloatParamDef;

    public EcucFloatParamDefWrapper(EcucFloatParamDef ecucFloatParamDef) {
        this.ecucFloatParamDef = ecucFloatParamDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getS())) {
            
            return ecucFloatParamDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getT())) {
            
            return ecucFloatParamDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getUuid())) {
            
            return ecucFloatParamDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getShortName())) {
            
            return new IdentifierWrapper(ecucFloatParamDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucFloatParamDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucFloatParamDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucFloatParamDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucFloatParamDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucFloatParamDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucFloatParamDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucFloatParamDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucFloatParamDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucFloatParamDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucFloatParamDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucFloatParamDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucFloatParamDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucFloatParamDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucFloatParamDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassAffectionWrapper getConfigurationClassAffection() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getConfigurationClassAffection())) {
            
            return new EcucConfigurationClassAffectionWrapper(ecucFloatParamDef.getConfigurationClassAffection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucImplementationConfigurationClassWrapper> getImplementationConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getImplementationConfigClasses())) {
            ArrayList<EcucImplementationConfigurationClass> originalList = ecucFloatParamDef.getImplementationConfigClasses();
            ArrayList<EcucImplementationConfigurationClassWrapper> wrapperList = (ArrayList<EcucImplementationConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucImplementationConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucFloatParamDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getOrigin() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getOrigin())) {
            
            return new StringWrapper(ecucFloatParamDef.getOrigin());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucFloatParamDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantValue() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getPostBuildVariantValue())) {
            
            return new BooleanWrapper(ecucFloatParamDef.getPostBuildVariantValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucFloatParamDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValueConfigurationClassWrapper> getValueConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getValueConfigClasses())) {
            ArrayList<EcucValueConfigurationClass> originalList = ecucFloatParamDef.getValueConfigClasses();
            ArrayList<EcucValueConfigurationClassWrapper> wrapperList = (ArrayList<EcucValueConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucValueConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucDerivationSpecificationWrapper getDerivation() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getDerivation())) {
            
            return new EcucDerivationSpecificationWrapper(ecucFloatParamDef.getDerivation());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSymbolicNameValue() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getSymbolicNameValue())) {
            
            return new BooleanWrapper(ecucFloatParamDef.getSymbolicNameValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWithAuto() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getWithAuto())) {
            
            return new BooleanWrapper(ecucFloatParamDef.getWithAuto());
            
        } else {
            return null;
        }
        
    }

    public FloatValueVariationPointWrapper getDefaultValue() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getDefaultValue())) {
            
            return new FloatValueVariationPointWrapper(ecucFloatParamDef.getDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getMax() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getMax())) {
            
            return new LimitWrapper(ecucFloatParamDef.getMax());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getMin() {
        
        if (CollUtil.isNotEmpty(ecucFloatParamDef.getMin())) {
            
            return new LimitWrapper(ecucFloatParamDef.getMin());
            
        } else {
            return null;
        }
        
    }




    


    
}