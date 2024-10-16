package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class EcucForeignReferenceDefWrapper {

    
    private EcucForeignReferenceDef ecucForeignReferenceDef;

    public EcucForeignReferenceDefWrapper(EcucForeignReferenceDef ecucForeignReferenceDef) {
        this.ecucForeignReferenceDef = ecucForeignReferenceDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getS())) {
            
            return ecucForeignReferenceDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getT())) {
            
            return ecucForeignReferenceDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getUuid())) {
            
            return ecucForeignReferenceDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getShortName())) {
            
            return new IdentifierWrapper(ecucForeignReferenceDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucForeignReferenceDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucForeignReferenceDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucForeignReferenceDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucForeignReferenceDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucForeignReferenceDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucForeignReferenceDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucForeignReferenceDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RelatedTraceItemRefWrapper getRelatedTraceItemRef() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getRelatedTraceItemRef())) {
            
            return new RelatedTraceItemRefWrapper(ecucForeignReferenceDef.getRelatedTraceItemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValidationConditionWrapper> getEcucValidationConds() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getEcucValidationConds())) {
            ArrayList<EcucValidationCondition> originalList = ecucForeignReferenceDef.getEcucValidationConds();
            ArrayList<EcucValidationConditionWrapper> wrapperList = (ArrayList<EcucValidationConditionWrapper>)originalList.stream()
                .map(item -> new EcucValidationConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucForeignReferenceDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getLowerMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getLowerMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucForeignReferenceDef.getLowerMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getUpperMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getUpperMultiplicity())) {
            
            return new PositiveIntegerValueVariationPointWrapper(ecucForeignReferenceDef.getUpperMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUpperMultiplicityInfinite() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getUpperMultiplicityInfinite())) {
            
            return new BooleanValueVariationPointWrapper(ecucForeignReferenceDef.getUpperMultiplicityInfinite());
            
        } else {
            return null;
        }
        
    }

    public EcucScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getScope())) {
            
            return new EcucScopeEnumWrapper(ecucForeignReferenceDef.getScope());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassAffectionWrapper getConfigurationClassAffection() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getConfigurationClassAffection())) {
            
            return new EcucConfigurationClassAffectionWrapper(ecucForeignReferenceDef.getConfigurationClassAffection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucImplementationConfigurationClassWrapper> getImplementationConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getImplementationConfigClasses())) {
            ArrayList<EcucImplementationConfigurationClass> originalList = ecucForeignReferenceDef.getImplementationConfigClasses();
            ArrayList<EcucImplementationConfigurationClassWrapper> wrapperList = (ArrayList<EcucImplementationConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucImplementationConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultiplicityConfigurationClassWrapper> getMultiplicityConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getMultiplicityConfigClasses())) {
            ArrayList<EcucMultiplicityConfigurationClass> originalList = ecucForeignReferenceDef.getMultiplicityConfigClasses();
            ArrayList<EcucMultiplicityConfigurationClassWrapper> wrapperList = (ArrayList<EcucMultiplicityConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucMultiplicityConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getOrigin() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getOrigin())) {
            
            return new StringWrapper(ecucForeignReferenceDef.getOrigin());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantMultiplicity() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getPostBuildVariantMultiplicity())) {
            
            return new BooleanWrapper(ecucForeignReferenceDef.getPostBuildVariantMultiplicity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPostBuildVariantValue() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getPostBuildVariantValue())) {
            
            return new BooleanWrapper(ecucForeignReferenceDef.getPostBuildVariantValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequiresIndex() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getRequiresIndex())) {
            
            return new BooleanWrapper(ecucForeignReferenceDef.getRequiresIndex());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValueConfigurationClassWrapper> getValueConfigClasses() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getValueConfigClasses())) {
            ArrayList<EcucValueConfigurationClass> originalList = ecucForeignReferenceDef.getValueConfigClasses();
            ArrayList<EcucValueConfigurationClassWrapper> wrapperList = (ArrayList<EcucValueConfigurationClassWrapper>)originalList.stream()
                .map(item -> new EcucValueConfigurationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getDestinationType() {
        
        if (CollUtil.isNotEmpty(ecucForeignReferenceDef.getDestinationType())) {
            
            return new StringWrapper(ecucForeignReferenceDef.getDestinationType());
            
        } else {
            return null;
        }
        
    }




    


    
}