package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class EcucFunctionNameDefWrapper {

    
    private EcucFunctionNameDef ecucFunctionNameDef;

    public EcucFunctionNameDefWrapper(EcucFunctionNameDef ecucFunctionNameDef) {
        this.ecucFunctionNameDef = ecucFunctionNameDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getS())) {
            
            return ecucFunctionNameDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getT())) {
            
            return ecucFunctionNameDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getUuid())) {
            
            return ecucFunctionNameDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getShortName())) {
            
            return new IdentifierWrapper(ecucFunctionNameDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucFunctionNameDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucFunctionNameDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucFunctionNameDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucFunctionNameDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucFunctionNameDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucFunctionNameDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucFunctionNameDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucFunctionNameDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucFunctionNameDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucFunctionNameDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucFunctionNameDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucFunctionNameDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucFunctionNameDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucFunctionNameDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassAffectionWrapper getConfigurationClassAffection() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getConfigurationClassAffection())) {
            
            return new EcucConfigurationClassAffectionWrapper(ecucFunctionNameDef.getConfigurationClassAffection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucImplementationConfigurationClassWrapper> getImplementationConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getImplementationConfigClasses())) {
            ArrayList<EcucImplementationConfigurationClass> originalList = ecucFunctionNameDef.getImplementationConfigClasses();
            ArrayList<EcucImplementationConfigurationClassWrapper> wrapperList = (ArrayList<EcucImplementationConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucImplementationConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucFunctionNameDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getOrigin() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getOrigin())) {
            
            return new StringWrapper(ecucFunctionNameDef.getOrigin());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucFunctionNameDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantValue() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getPostBuildVariantValue())) {
            
            return new BooleanWrapper(ecucFunctionNameDef.getPostBuildVariantValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucFunctionNameDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValueConfigurationClassWrapper> getValueConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getValueConfigClasses())) {
            ArrayList<EcucValueConfigurationClass> originalList = ecucFunctionNameDef.getValueConfigClasses();
            ArrayList<EcucValueConfigurationClassWrapper> wrapperList = (ArrayList<EcucValueConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucValueConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucDerivationSpecificationWrapper getDerivation() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getDerivation())) {
            
            return new EcucDerivationSpecificationWrapper(ecucFunctionNameDef.getDerivation());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSymbolicNameValue() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getSymbolicNameValue())) {
            
            return new BooleanWrapper(ecucFunctionNameDef.getSymbolicNameValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWithAuto() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getWithAuto())) {
            
            return new BooleanWrapper(ecucFunctionNameDef.getWithAuto());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucFunctionNameDefConditionalWrapper> getEcucFunctionNameDefVariants() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDef.getEcucFunctionNameDefVariants())) {
            ArrayList<EcucFunctionNameDefConditional> originalList = ecucFunctionNameDef.getEcucFunctionNameDefVariants();
            ArrayList<EcucFunctionNameDefConditionalWrapper> wrapperList = (ArrayList<EcucFunctionNameDefConditionalWrapper>)originalList.stream()
                .map(item -> new EcucFunctionNameDefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}