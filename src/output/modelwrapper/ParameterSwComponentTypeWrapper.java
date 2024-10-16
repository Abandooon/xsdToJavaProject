package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ParameterSwComponentTypeWrapper {

    
    private ParameterSwComponentType parameterSwComponentType;

    public ParameterSwComponentTypeWrapper(ParameterSwComponentType parameterSwComponentType) {
        this.parameterSwComponentType = parameterSwComponentType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getS())) {
            
            return parameterSwComponentType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getT())) {
            
            return parameterSwComponentType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getUuid())) {
            
            return parameterSwComponentType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getShortName())) {
            
            return new IdentifierWrapper(parameterSwComponentType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = parameterSwComponentType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(parameterSwComponentType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(parameterSwComponentType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getCategory())) {
            
            return new CategoryStringWrapper(parameterSwComponentType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getAdminData())) {
            
            return new AdminDataWrapper(parameterSwComponentType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(parameterSwComponentType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getAnnotations())) {
            ArrayList<Annotation> originalList = parameterSwComponentType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getVariationPoint())) {
            
            return new VariationPointWrapper(parameterSwComponentType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(parameterSwComponentType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getShortNamePattern())) {
            
            return new StringWrapper(parameterSwComponentType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwComponentDocumentationWrapper> getSwComponentDocumentations() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getSwComponentDocumentations())) {
            ArrayList<SwComponentDocumentation> originalList = parameterSwComponentType.getSwComponentDocumentations();
            ArrayList<SwComponentDocumentationWrapper> wrapperList = (ArrayList<SwComponentDocumentationWrapper>)originalList.stream()
                .map(item -> new SwComponentDocumentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsistencyNeedsWrapper> getConsistencyNeedss() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getConsistencyNeedss())) {
            ArrayList<ConsistencyNeeds> originalList = parameterSwComponentType.getConsistencyNeedss();
            ArrayList<ConsistencyNeedsWrapper> wrapperList = (ArrayList<ConsistencyNeedsWrapper>)originalList.stream()
                .map(item -> new ConsistencyNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PortsWrapper getPorts() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getPorts())) {
            
            return new PortsWrapper(parameterSwComponentType.getPorts());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortGroupWrapper> getPortGroups() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getPortGroups())) {
            ArrayList<PortGroup> originalList = parameterSwComponentType.getPortGroups();
            ArrayList<PortGroupWrapper> wrapperList = (ArrayList<PortGroupWrapper>)originalList.stream()
                .map(item -> new PortGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitGroupRefWrapper> getUnitGroupRefs() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getUnitGroupRefs())) {
            ArrayList<UnitGroupRef> originalList = parameterSwComponentType.getUnitGroupRefs();
            ArrayList<UnitGroupRefWrapper> wrapperList = (ArrayList<UnitGroupRefWrapper>)originalList.stream()
                .map(item -> new UnitGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantMappingRefWrapper> getConstantMappingRefs() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getConstantMappingRefs())) {
            ArrayList<ConstantMappingRef> originalList = parameterSwComponentType.getConstantMappingRefs();
            ArrayList<ConstantMappingRefWrapper> wrapperList = (ArrayList<ConstantMappingRefWrapper>)originalList.stream()
                .map(item -> new ConstantMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTypeMappingRefWrapper> getDataTypeMappingRefs() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getDataTypeMappingRefs())) {
            ArrayList<DataTypeMappingRef> originalList = parameterSwComponentType.getDataTypeMappingRefs();
            ArrayList<DataTypeMappingRefWrapper> wrapperList = (ArrayList<DataTypeMappingRefWrapper>)originalList.stream()
                .map(item -> new DataTypeMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InstantiationDataDefPropsWrapper> getInstantiationDataDefPropss() {
        
        if (CollUtil.isNotEmpty(parameterSwComponentType.getInstantiationDataDefPropss())) {
            ArrayList<InstantiationDataDefProps> originalList = parameterSwComponentType.getInstantiationDataDefPropss();
            ArrayList<InstantiationDataDefPropsWrapper> wrapperList = (ArrayList<InstantiationDataDefPropsWrapper>)originalList.stream()
                .map(item -> new InstantiationDataDefPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}