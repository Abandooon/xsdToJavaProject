package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class EcucStringParamDefWrapper {

    
    private EcucStringParamDef ecucStringParamDef;

    public EcucStringParamDefWrapper(EcucStringParamDef ecucStringParamDef) {
        this.ecucStringParamDef = ecucStringParamDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getS())) {
            
            return ecucStringParamDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getT())) {
            
            return ecucStringParamDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getUuid())) {
            
            return ecucStringParamDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getShortName())) {
            
            return new IdentifierWrapper(ecucStringParamDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucStringParamDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucStringParamDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucStringParamDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucStringParamDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucStringParamDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucStringParamDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucStringParamDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucStringParamDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucStringParamDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucStringParamDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucStringParamDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucStringParamDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucStringParamDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucStringParamDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassAffectionWrapper getConfigurationClassAffection() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getConfigurationClassAffection())) {
            
            return new EcucConfigurationClassAffectionWrapper(ecucStringParamDef.getConfigurationClassAffection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucImplementationConfigurationClassWrapper> getImplementationConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getImplementationConfigClasses())) {
            ArrayList<EcucImplementationConfigurationClass> originalList = ecucStringParamDef.getImplementationConfigClasses();
            ArrayList<EcucImplementationConfigurationClassWrapper> wrapperList = (ArrayList<EcucImplementationConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucImplementationConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucStringParamDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getOrigin() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getOrigin())) {
            
            return new StringWrapper(ecucStringParamDef.getOrigin());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucStringParamDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantValue() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getPostBuildVariantValue())) {
            
            return new BooleanWrapper(ecucStringParamDef.getPostBuildVariantValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucStringParamDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValueConfigurationClassWrapper> getValueConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getValueConfigClasses())) {
            ArrayList<EcucValueConfigurationClass> originalList = ecucStringParamDef.getValueConfigClasses();
            ArrayList<EcucValueConfigurationClassWrapper> wrapperList = (ArrayList<EcucValueConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucValueConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucDerivationSpecificationWrapper getDerivation() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getDerivation())) {
            
            return new EcucDerivationSpecificationWrapper(ecucStringParamDef.getDerivation());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSymbolicNameValue() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getSymbolicNameValue())) {
            
            return new BooleanWrapper(ecucStringParamDef.getSymbolicNameValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWithAuto() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getWithAuto())) {
            
            return new BooleanWrapper(ecucStringParamDef.getWithAuto());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucStringParamDefConditionalWrapper> getEcucStringParamDefVariants() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDef.getEcucStringParamDefVariants())) {
            ArrayList<EcucStringParamDefConditional> originalList = ecucStringParamDef.getEcucStringParamDefVariants();
            ArrayList<EcucStringParamDefConditionalWrapper> wrapperList = (ArrayList<EcucStringParamDefConditionalWrapper>)originalList.stream()
                .map(item -> new EcucStringParamDefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}