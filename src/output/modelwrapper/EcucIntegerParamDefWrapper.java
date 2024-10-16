package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class EcucIntegerParamDefWrapper {

    
    private EcucIntegerParamDef ecucIntegerParamDef;

    public EcucIntegerParamDefWrapper(EcucIntegerParamDef ecucIntegerParamDef) {
        this.ecucIntegerParamDef = ecucIntegerParamDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getS())) {
            
            return ecucIntegerParamDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getT())) {
            
            return ecucIntegerParamDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getUuid())) {
            
            return ecucIntegerParamDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getShortName())) {
            
            return new IdentifierWrapper(ecucIntegerParamDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucIntegerParamDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucIntegerParamDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucIntegerParamDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucIntegerParamDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucIntegerParamDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucIntegerParamDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucIntegerParamDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucIntegerParamDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucIntegerParamDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucIntegerParamDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucIntegerParamDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucIntegerParamDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucIntegerParamDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucIntegerParamDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassAffectionWrapper getConfigurationClassAffection() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getConfigurationClassAffection())) {
            
            return new EcucConfigurationClassAffectionWrapper(ecucIntegerParamDef.getConfigurationClassAffection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucImplementationConfigurationClassWrapper> getImplementationConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getImplementationConfigClasses())) {
            ArrayList<EcucImplementationConfigurationClass> originalList = ecucIntegerParamDef.getImplementationConfigClasses();
            ArrayList<EcucImplementationConfigurationClassWrapper> wrapperList = (ArrayList<EcucImplementationConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucImplementationConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucIntegerParamDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getOrigin() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getOrigin())) {
            
            return new StringWrapper(ecucIntegerParamDef.getOrigin());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucIntegerParamDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantValue() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getPostBuildVariantValue())) {
            
            return new BooleanWrapper(ecucIntegerParamDef.getPostBuildVariantValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucIntegerParamDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValueConfigurationClassWrapper> getValueConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getValueConfigClasses())) {
            ArrayList<EcucValueConfigurationClass> originalList = ecucIntegerParamDef.getValueConfigClasses();
            ArrayList<EcucValueConfigurationClassWrapper> wrapperList = (ArrayList<EcucValueConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucValueConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucDerivationSpecificationWrapper getDerivation() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getDerivation())) {
            
            return new EcucDerivationSpecificationWrapper(ecucIntegerParamDef.getDerivation());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSymbolicNameValue() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getSymbolicNameValue())) {
            
            return new BooleanWrapper(ecucIntegerParamDef.getSymbolicNameValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWithAuto() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getWithAuto())) {
            
            return new BooleanWrapper(ecucIntegerParamDef.getWithAuto());
            
        } else {
            return null;
        }
        
    }

    public UnlimitedIntegerValueVariationPointWrapper getDefaultValue() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getDefaultValue())) {
            
            return new UnlimitedIntegerValueVariationPointWrapper(ecucIntegerParamDef.getDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public UnlimitedIntegerValueVariationPointWrapper getMax() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getMax())) {
            
            return new UnlimitedIntegerValueVariationPointWrapper(ecucIntegerParamDef.getMax());
            
        } else {
            return null;
        }
        
    }

    public UnlimitedIntegerValueVariationPointWrapper getMin() {
        
        if (CollUtil.isNotEmpty(ecucIntegerParamDef.getMin())) {
            
            return new UnlimitedIntegerValueVariationPointWrapper(ecucIntegerParamDef.getMin());
            
        } else {
            return null;
        }
        
    }




    


    
}