package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class EcucChoiceContainerDefWrapper {

    
    private EcucChoiceContainerDef ecucChoiceContainerDef;

    public EcucChoiceContainerDefWrapper(EcucChoiceContainerDef ecucChoiceContainerDef) {
        this.ecucChoiceContainerDef = ecucChoiceContainerDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getS())) {
            
            return ecucChoiceContainerDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getT())) {
            
            return ecucChoiceContainerDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getUuid())) {
            
            return ecucChoiceContainerDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getShortName())) {
            
            return new IdentifierWrapper(ecucChoiceContainerDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucChoiceContainerDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucChoiceContainerDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucChoiceContainerDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucChoiceContainerDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucChoiceContainerDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucChoiceContainerDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucChoiceContainerDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucChoiceContainerDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucChoiceContainerDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucChoiceContainerDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucChoiceContainerDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucChoiceContainerDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucChoiceContainerDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucChoiceContainerDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DestinationUriRefWrapper> getDestinationUriRefs() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getDestinationUriRefs())) {
            ArrayList<DestinationUriRef> originalList = ecucChoiceContainerDef.getDestinationUriRefs();
            ArrayList<DestinationUriRefWrapper> wrapperList = (ArrayList<DestinationUriRefWrapper>)originalList.stream()
                .map(item -> new DestinationUriRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucChoiceContainerDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildChangeable() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getPostBuildChangeable())) {
            
            return new BooleanWrapper(ecucChoiceContainerDef.getPostBuildChangeable());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucChoiceContainerDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucChoiceContainerDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucParamConfContainerDefWrapper> getChoices() {
        
        if (CollUtil.isNotEmpty(ecucChoiceContainerDef.getChoices())) {
            ArrayList<EcucParamConfContainerDef> originalList = ecucChoiceContainerDef.getChoices();
            ArrayList<EcucParamConfContainerDefWrapper> wrapperList = (ArrayList<EcucParamConfContainerDefWrapper>)originalList.stream()
                .map(item -> new EcucParamConfContainerDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}