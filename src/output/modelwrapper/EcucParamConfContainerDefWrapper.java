package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Parameters;
    

    
    

    
    


public class EcucParamConfContainerDefWrapper {

    
    private EcucParamConfContainerDef ecucParamConfContainerDef;

    public EcucParamConfContainerDefWrapper(EcucParamConfContainerDef ecucParamConfContainerDef) {
        this.ecucParamConfContainerDef = ecucParamConfContainerDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getS())) {
            
            return ecucParamConfContainerDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getT())) {
            
            return ecucParamConfContainerDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getUuid())) {
            
            return ecucParamConfContainerDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getShortName())) {
            
            return new IdentifierWrapper(ecucParamConfContainerDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucParamConfContainerDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucParamConfContainerDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucParamConfContainerDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucParamConfContainerDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucParamConfContainerDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucParamConfContainerDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucParamConfContainerDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucParamConfContainerDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucParamConfContainerDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucParamConfContainerDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucParamConfContainerDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucParamConfContainerDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucParamConfContainerDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucParamConfContainerDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DestinationUriRefWrapper> getDestinationUriRefs() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getDestinationUriRefs())) {
            ArrayList<DestinationUriRef> originalList = ecucParamConfContainerDef.getDestinationUriRefs();
            ArrayList<DestinationUriRefWrapper> wrapperList = (ArrayList<DestinationUriRefWrapper>)originalList.stream()
                .map(item -> new DestinationUriRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucParamConfContainerDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildChangeable() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getPostBuildChangeable())) {
            
            return new BooleanWrapper(ecucParamConfContainerDef.getPostBuildChangeable());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucParamConfContainerDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucParamConfContainerDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getMultipleConfigurationContainer() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getMultipleConfigurationContainer())) {
            
            return new BooleanWrapper(ecucParamConfContainerDef.getMultipleConfigurationContainer());
            
        } else {
            return null;
        }
        
    }

    public ParametersWrapper getParameters() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getParameters())) {
            
            return new ParametersWrapper(ecucParamConfContainerDef.getParameters());
            
        } else {
            return null;
        }
        
    }

    public ReferencesWrapper getReferences() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getReferences())) {
            
            return new ReferencesWrapper(ecucParamConfContainerDef.getReferences());
            
        } else {
            return null;
        }
        
    }

    public SubContainersWrapper getSubContainers() {
        
        if (CollUtil.isNotEmpty(ecucParamConfContainerDef.getSubContainers())) {
            
            return new SubContainersWrapper(ecucParamConfContainerDef.getSubContainers());
            
        } else {
            return null;
        }
        
    }




    


    
}