package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class CompositionSwComponentTypeWrapper {

    
    private CompositionSwComponentType compositionSwComponentType;

    public CompositionSwComponentTypeWrapper(CompositionSwComponentType compositionSwComponentType) {
        this.compositionSwComponentType = compositionSwComponentType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getS())) {
            
            return compositionSwComponentType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getT())) {
            
            return compositionSwComponentType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getUuid())) {
            
            return compositionSwComponentType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getShortName())) {
            
            return new IdentifierWrapper(compositionSwComponentType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = compositionSwComponentType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(compositionSwComponentType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(compositionSwComponentType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getCategory())) {
            
            return new CategoryStringWrapper(compositionSwComponentType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getAdminData())) {
            
            return new AdminDataWrapper(compositionSwComponentType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(compositionSwComponentType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getAnnotations())) {
            ArrayList<Annotation> originalList = compositionSwComponentType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getVariationPoint())) {
            
            return new VariationPointWrapper(compositionSwComponentType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(compositionSwComponentType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getShortNamePattern())) {
            
            return new StringWrapper(compositionSwComponentType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwComponentDocumentationWrapper> getSwComponentDocumentations() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getSwComponentDocumentations())) {
            ArrayList<SwComponentDocumentation> originalList = compositionSwComponentType.getSwComponentDocumentations();
            ArrayList<SwComponentDocumentationWrapper> wrapperList = (ArrayList<SwComponentDocumentationWrapper>)originalList.stream()
                .map(item -> new SwComponentDocumentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsistencyNeedsWrapper> getConsistencyNeedss() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getConsistencyNeedss())) {
            ArrayList<ConsistencyNeeds> originalList = compositionSwComponentType.getConsistencyNeedss();
            ArrayList<ConsistencyNeedsWrapper> wrapperList = (ArrayList<ConsistencyNeedsWrapper>)originalList.stream()
                .map(item -> new ConsistencyNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PortsWrapper getPorts() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getPorts())) {
            
            return new PortsWrapper(compositionSwComponentType.getPorts());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortGroupWrapper> getPortGroups() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getPortGroups())) {
            ArrayList<PortGroup> originalList = compositionSwComponentType.getPortGroups();
            ArrayList<PortGroupWrapper> wrapperList = (ArrayList<PortGroupWrapper>)originalList.stream()
                .map(item -> new PortGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitGroupRefWrapper> getUnitGroupRefs() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getUnitGroupRefs())) {
            ArrayList<UnitGroupRef> originalList = compositionSwComponentType.getUnitGroupRefs();
            ArrayList<UnitGroupRefWrapper> wrapperList = (ArrayList<UnitGroupRefWrapper>)originalList.stream()
                .map(item -> new UnitGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwComponentPrototypeWrapper> getComponents() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getComponents())) {
            ArrayList<SwComponentPrototype> originalList = compositionSwComponentType.getComponents();
            ArrayList<SwComponentPrototypeWrapper> wrapperList = (ArrayList<SwComponentPrototypeWrapper>)originalList.stream()
                .map(item -> new SwComponentPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public Connectors_CompositionSwComponentTypeWrapper getConnectors() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getConnectors())) {
            
            return new Connectors_CompositionSwComponentTypeWrapper(compositionSwComponentType.getConnectors());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantValueMappingRefWrapper> getConstantValueMappingRefs() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getConstantValueMappingRefs())) {
            ArrayList<ConstantValueMappingRef> originalList = compositionSwComponentType.getConstantValueMappingRefs();
            ArrayList<ConstantValueMappingRefWrapper> wrapperList = (ArrayList<ConstantValueMappingRefWrapper>)originalList.stream()
                .map(item -> new ConstantValueMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTypeMappingRefWrapper> getDataTypeMappingRefs() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getDataTypeMappingRefs())) {
            ArrayList<DataTypeMappingRef> originalList = compositionSwComponentType.getDataTypeMappingRefs();
            ArrayList<DataTypeMappingRefWrapper> wrapperList = (ArrayList<DataTypeMappingRefWrapper>)originalList.stream()
                .map(item -> new DataTypeMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InstantiationTimingEventPropsWrapper> getInstantiationRteEventPropss() {
        
        if (CollUtil.isNotEmpty(compositionSwComponentType.getInstantiationRteEventPropss())) {
            ArrayList<InstantiationTimingEventProps> originalList = compositionSwComponentType.getInstantiationRteEventPropss();
            ArrayList<InstantiationTimingEventPropsWrapper> wrapperList = (ArrayList<InstantiationTimingEventPropsWrapper>)originalList.stream()
                .map(item -> new InstantiationTimingEventPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}