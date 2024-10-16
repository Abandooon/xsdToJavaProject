package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class EcucEnumerationParamDefWrapper {

    
    private EcucEnumerationParamDef ecucEnumerationParamDef;

    public EcucEnumerationParamDefWrapper(EcucEnumerationParamDef ecucEnumerationParamDef) {
        this.ecucEnumerationParamDef = ecucEnumerationParamDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getS())) {
            
            return ecucEnumerationParamDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getT())) {
            
            return ecucEnumerationParamDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getUuid())) {
            
            return ecucEnumerationParamDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getShortName())) {
            
            return new IdentifierWrapper(ecucEnumerationParamDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucEnumerationParamDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucEnumerationParamDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucEnumerationParamDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucEnumerationParamDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucEnumerationParamDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucEnumerationParamDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucEnumerationParamDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucEnumerationParamDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucEnumerationParamDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucEnumerationParamDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucEnumerationParamDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucEnumerationParamDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucEnumerationParamDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucEnumerationParamDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassAffectionWrapper getConfigurationClassAffection() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getConfigurationClassAffection())) {
            
            return new EcucConfigurationClassAffectionWrapper(ecucEnumerationParamDef.getConfigurationClassAffection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucImplementationConfigurationClassWrapper> getImplementationConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getImplementationConfigClasses())) {
            ArrayList<EcucImplementationConfigurationClass> originalList = ecucEnumerationParamDef.getImplementationConfigClasses();
            ArrayList<EcucImplementationConfigurationClassWrapper> wrapperList = (ArrayList<EcucImplementationConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucImplementationConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucEnumerationParamDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getOrigin() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getOrigin())) {
            
            return new StringWrapper(ecucEnumerationParamDef.getOrigin());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucEnumerationParamDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantValue() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getPostBuildVariantValue())) {
            
            return new BooleanWrapper(ecucEnumerationParamDef.getPostBuildVariantValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucEnumerationParamDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValueConfigurationClassWrapper> getValueConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getValueConfigClasses())) {
            ArrayList<EcucValueConfigurationClass> originalList = ecucEnumerationParamDef.getValueConfigClasses();
            ArrayList<EcucValueConfigurationClassWrapper> wrapperList = (ArrayList<EcucValueConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucValueConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucDerivationSpecificationWrapper getDerivation() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getDerivation())) {
            
            return new EcucDerivationSpecificationWrapper(ecucEnumerationParamDef.getDerivation());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSymbolicNameValue() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getSymbolicNameValue())) {
            
            return new BooleanWrapper(ecucEnumerationParamDef.getSymbolicNameValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWithAuto() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getWithAuto())) {
            
            return new BooleanWrapper(ecucEnumerationParamDef.getWithAuto());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getDefaultValue() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getDefaultValue())) {
            
            return new IdentifierWrapper(ecucEnumerationParamDef.getDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucEnumerationLiteralDefWrapper> getLiterals() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationParamDef.getLiterals())) {
            ArrayList<EcucEnumerationLiteralDef> originalList = ecucEnumerationParamDef.getLiterals();
            ArrayList<EcucEnumerationLiteralDefWrapper> wrapperList = (ArrayList<EcucEnumerationLiteralDefWrapper>)originalList.stream()
                .map(item -> new EcucEnumerationLiteralDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}