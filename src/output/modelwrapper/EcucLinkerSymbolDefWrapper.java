package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class EcucLinkerSymbolDefWrapper {

    
    private EcucLinkerSymbolDef ecucLinkerSymbolDef;

    public EcucLinkerSymbolDefWrapper(EcucLinkerSymbolDef ecucLinkerSymbolDef) {
        this.ecucLinkerSymbolDef = ecucLinkerSymbolDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getS())) {
            
            return ecucLinkerSymbolDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getT())) {
            
            return ecucLinkerSymbolDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getUuid())) {
            
            return ecucLinkerSymbolDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getShortName())) {
            
            return new IdentifierWrapper(ecucLinkerSymbolDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucLinkerSymbolDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucLinkerSymbolDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucLinkerSymbolDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucLinkerSymbolDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucLinkerSymbolDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucLinkerSymbolDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucLinkerSymbolDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucLinkerSymbolDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucLinkerSymbolDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucLinkerSymbolDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucLinkerSymbolDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucLinkerSymbolDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucLinkerSymbolDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucLinkerSymbolDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassAffectionWrapper getConfigurationClassAffection() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getConfigurationClassAffection())) {
            
            return new EcucConfigurationClassAffectionWrapper(ecucLinkerSymbolDef.getConfigurationClassAffection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucImplementationConfigurationClassWrapper> getImplementationConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getImplementationConfigClasses())) {
            ArrayList<EcucImplementationConfigurationClass> originalList = ecucLinkerSymbolDef.getImplementationConfigClasses();
            ArrayList<EcucImplementationConfigurationClassWrapper> wrapperList = (ArrayList<EcucImplementationConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucImplementationConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucLinkerSymbolDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getOrigin() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getOrigin())) {
            
            return new StringWrapper(ecucLinkerSymbolDef.getOrigin());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucLinkerSymbolDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantValue() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getPostBuildVariantValue())) {
            
            return new BooleanWrapper(ecucLinkerSymbolDef.getPostBuildVariantValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucLinkerSymbolDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValueConfigurationClassWrapper> getValueConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getValueConfigClasses())) {
            ArrayList<EcucValueConfigurationClass> originalList = ecucLinkerSymbolDef.getValueConfigClasses();
            ArrayList<EcucValueConfigurationClassWrapper> wrapperList = (ArrayList<EcucValueConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucValueConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucDerivationSpecificationWrapper getDerivation() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getDerivation())) {
            
            return new EcucDerivationSpecificationWrapper(ecucLinkerSymbolDef.getDerivation());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSymbolicNameValue() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getSymbolicNameValue())) {
            
            return new BooleanWrapper(ecucLinkerSymbolDef.getSymbolicNameValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWithAuto() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getWithAuto())) {
            
            return new BooleanWrapper(ecucLinkerSymbolDef.getWithAuto());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucLinkerSymbolDefConditionalWrapper> getEcucLinkerSymbolDefVariants() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDef.getEcucLinkerSymbolDefVariants())) {
            ArrayList<EcucLinkerSymbolDefConditional> originalList = ecucLinkerSymbolDef.getEcucLinkerSymbolDefVariants();
            ArrayList<EcucLinkerSymbolDefConditionalWrapper> wrapperList = (ArrayList<EcucLinkerSymbolDefConditionalWrapper>)originalList.stream()
                .map(item -> new EcucLinkerSymbolDefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}