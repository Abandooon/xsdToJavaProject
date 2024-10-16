package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ComplexDeviceDriverSwComponentTypeWrapper {

    
    private ComplexDeviceDriverSwComponentType complexDeviceDriverSwComponentType;

    public ComplexDeviceDriverSwComponentTypeWrapper(ComplexDeviceDriverSwComponentType complexDeviceDriverSwComponentType) {
        this.complexDeviceDriverSwComponentType = complexDeviceDriverSwComponentType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getS())) {
            
            return complexDeviceDriverSwComponentType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getT())) {
            
            return complexDeviceDriverSwComponentType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getUuid())) {
            
            return complexDeviceDriverSwComponentType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getShortName())) {
            
            return new IdentifierWrapper(complexDeviceDriverSwComponentType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = complexDeviceDriverSwComponentType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(complexDeviceDriverSwComponentType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(complexDeviceDriverSwComponentType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getCategory())) {
            
            return new CategoryStringWrapper(complexDeviceDriverSwComponentType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getAdminData())) {
            
            return new AdminDataWrapper(complexDeviceDriverSwComponentType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(complexDeviceDriverSwComponentType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getAnnotations())) {
            ArrayList<Annotation> originalList = complexDeviceDriverSwComponentType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getVariationPoint())) {
            
            return new VariationPointWrapper(complexDeviceDriverSwComponentType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(complexDeviceDriverSwComponentType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getShortNamePattern())) {
            
            return new StringWrapper(complexDeviceDriverSwComponentType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwComponentDocumentationWrapper> getSwComponentDocumentations() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getSwComponentDocumentations())) {
            ArrayList<SwComponentDocumentation> originalList = complexDeviceDriverSwComponentType.getSwComponentDocumentations();
            ArrayList<SwComponentDocumentationWrapper> wrapperList = (ArrayList<SwComponentDocumentationWrapper>)originalList.stream()
                .map(item -> new SwComponentDocumentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsistencyNeedsWrapper> getConsistencyNeedss() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getConsistencyNeedss())) {
            ArrayList<ConsistencyNeeds> originalList = complexDeviceDriverSwComponentType.getConsistencyNeedss();
            ArrayList<ConsistencyNeedsWrapper> wrapperList = (ArrayList<ConsistencyNeedsWrapper>)originalList.stream()
                .map(item -> new ConsistencyNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PortsWrapper getPorts() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getPorts())) {
            
            return new PortsWrapper(complexDeviceDriverSwComponentType.getPorts());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortGroupWrapper> getPortGroups() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getPortGroups())) {
            ArrayList<PortGroup> originalList = complexDeviceDriverSwComponentType.getPortGroups();
            ArrayList<PortGroupWrapper> wrapperList = (ArrayList<PortGroupWrapper>)originalList.stream()
                .map(item -> new PortGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitGroupRefWrapper> getUnitGroupRefs() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getUnitGroupRefs())) {
            ArrayList<UnitGroupRef> originalList = complexDeviceDriverSwComponentType.getUnitGroupRefs();
            ArrayList<UnitGroupRefWrapper> wrapperList = (ArrayList<UnitGroupRefWrapper>)originalList.stream()
                .map(item -> new UnitGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcInternalBehaviorWrapper> getInternalBehaviors() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getInternalBehaviors())) {
            ArrayList<SwcInternalBehavior> originalList = complexDeviceDriverSwComponentType.getInternalBehaviors();
            ArrayList<SwcInternalBehaviorWrapper> wrapperList = (ArrayList<SwcInternalBehaviorWrapper>)originalList.stream()
                .map(item -> new SwcInternalBehaviorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SymbolPropsWrapper getSymbolProps() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getSymbolProps())) {
            
            return new SymbolPropsWrapper(complexDeviceDriverSwComponentType.getSymbolProps());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HardwareElementRefWrapper> getHardwareElementRefs() {
        
        if (CollUtil.isNotEmpty(complexDeviceDriverSwComponentType.getHardwareElementRefs())) {
            ArrayList<HardwareElementRef> originalList = complexDeviceDriverSwComponentType.getHardwareElementRefs();
            ArrayList<HardwareElementRefWrapper> wrapperList = (ArrayList<HardwareElementRefWrapper>)originalList.stream()
                .map(item -> new HardwareElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}