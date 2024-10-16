package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class EcucInstanceReferenceDefWrapper {

    
    private EcucInstanceReferenceDef ecucInstanceReferenceDef;

    public EcucInstanceReferenceDefWrapper(EcucInstanceReferenceDef ecucInstanceReferenceDef) {
        this.ecucInstanceReferenceDef = ecucInstanceReferenceDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getS())) {
            
            return ecucInstanceReferenceDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getT())) {
            
            return ecucInstanceReferenceDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getUuid())) {
            
            return ecucInstanceReferenceDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getShortName())) {
            
            return new IdentifierWrapper(ecucInstanceReferenceDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucInstanceReferenceDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucInstanceReferenceDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucInstanceReferenceDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucInstanceReferenceDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucInstanceReferenceDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucInstanceReferenceDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucInstanceReferenceDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucInstanceReferenceDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucInstanceReferenceDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucInstanceReferenceDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucInstanceReferenceDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucInstanceReferenceDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucInstanceReferenceDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucInstanceReferenceDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassAffectionWrapper getConfigurationClassAffection() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getConfigurationClassAffection())) {
            
            return new EcucConfigurationClassAffectionWrapper(ecucInstanceReferenceDef.getConfigurationClassAffection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucImplementationConfigurationClassWrapper> getImplementationConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getImplementationConfigClasses())) {
            ArrayList<EcucImplementationConfigurationClass> originalList = ecucInstanceReferenceDef.getImplementationConfigClasses();
            ArrayList<EcucImplementationConfigurationClassWrapper> wrapperList = (ArrayList<EcucImplementationConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucImplementationConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucInstanceReferenceDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getOrigin() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getOrigin())) {
            
            return new StringWrapper(ecucInstanceReferenceDef.getOrigin());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucInstanceReferenceDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantValue() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getPostBuildVariantValue())) {
            
            return new BooleanWrapper(ecucInstanceReferenceDef.getPostBuildVariantValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucInstanceReferenceDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValueConfigurationClassWrapper> getValueConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getValueConfigClasses())) {
            ArrayList<EcucValueConfigurationClass> originalList = ecucInstanceReferenceDef.getValueConfigClasses();
            ArrayList<EcucValueConfigurationClassWrapper> wrapperList = (ArrayList<EcucValueConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucValueConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getDestinationContext() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getDestinationContext())) {
            
            return new StringWrapper(ecucInstanceReferenceDef.getDestinationContext());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getDestinationType() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceDef.getDestinationType())) {
            
            return new StringWrapper(ecucInstanceReferenceDef.getDestinationType());
            
        } else {
            return null;
        }
        
    }




    


    
}