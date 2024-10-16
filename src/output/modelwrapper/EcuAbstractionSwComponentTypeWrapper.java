package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EcuAbstractionSwComponentTypeWrapper {

    
    private EcuAbstractionSwComponentType ecuAbstractionSwComponentType;

    public EcuAbstractionSwComponentTypeWrapper(EcuAbstractionSwComponentType ecuAbstractionSwComponentType) {
        this.ecuAbstractionSwComponentType = ecuAbstractionSwComponentType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getS())) {
            
            return ecuAbstractionSwComponentType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getT())) {
            
            return ecuAbstractionSwComponentType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getUuid())) {
            
            return ecuAbstractionSwComponentType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getShortName())) {
            
            return new IdentifierWrapper(ecuAbstractionSwComponentType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecuAbstractionSwComponentType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecuAbstractionSwComponentType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecuAbstractionSwComponentType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getCategory())) {
            
            return new CategoryStringWrapper(ecuAbstractionSwComponentType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getAdminData())) {
            
            return new AdminDataWrapper(ecuAbstractionSwComponentType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecuAbstractionSwComponentType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getAnnotations())) {
            ArrayList<Annotation> originalList = ecuAbstractionSwComponentType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getVariationPoint())) {
            
            return new VariationPointWrapper(ecuAbstractionSwComponentType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(ecuAbstractionSwComponentType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getShortNamePattern())) {
            
            return new StringWrapper(ecuAbstractionSwComponentType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwComponentDocumentationWrapper> getSwComponentDocumentations() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getSwComponentDocumentations())) {
            ArrayList<SwComponentDocumentation> originalList = ecuAbstractionSwComponentType.getSwComponentDocumentations();
            ArrayList<SwComponentDocumentationWrapper> wrapperList = (ArrayList<SwComponentDocumentationWrapper>)originalList.stream()
                .map(item -> new SwComponentDocumentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsistencyNeedsWrapper> getConsistencyNeedss() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getConsistencyNeedss())) {
            ArrayList<ConsistencyNeeds> originalList = ecuAbstractionSwComponentType.getConsistencyNeedss();
            ArrayList<ConsistencyNeedsWrapper> wrapperList = (ArrayList<ConsistencyNeedsWrapper>)originalList.stream()
                .map(item -> new ConsistencyNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PortsWrapper getPorts() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getPorts())) {
            
            return new PortsWrapper(ecuAbstractionSwComponentType.getPorts());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortGroupWrapper> getPortGroups() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getPortGroups())) {
            ArrayList<PortGroup> originalList = ecuAbstractionSwComponentType.getPortGroups();
            ArrayList<PortGroupWrapper> wrapperList = (ArrayList<PortGroupWrapper>)originalList.stream()
                .map(item -> new PortGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitGroupRefWrapper> getUnitGroupRefs() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getUnitGroupRefs())) {
            ArrayList<UnitGroupRef> originalList = ecuAbstractionSwComponentType.getUnitGroupRefs();
            ArrayList<UnitGroupRefWrapper> wrapperList = (ArrayList<UnitGroupRefWrapper>)originalList.stream()
                .map(item -> new UnitGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcInternalBehaviorWrapper> getInternalBehaviors() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getInternalBehaviors())) {
            ArrayList<SwcInternalBehavior> originalList = ecuAbstractionSwComponentType.getInternalBehaviors();
            ArrayList<SwcInternalBehaviorWrapper> wrapperList = (ArrayList<SwcInternalBehaviorWrapper>)originalList.stream()
                .map(item -> new SwcInternalBehaviorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SymbolPropsWrapper getSymbolProps() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getSymbolProps())) {
            
            return new SymbolPropsWrapper(ecuAbstractionSwComponentType.getSymbolProps());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HardwareElementRefWrapper> getHardwareElementRefs() {
        
        if (CollUtil.isNotEmpty(ecuAbstractionSwComponentType.getHardwareElementRefs())) {
            ArrayList<HardwareElementRef> originalList = ecuAbstractionSwComponentType.getHardwareElementRefs();
            ArrayList<HardwareElementRefWrapper> wrapperList = (ArrayList<HardwareElementRefWrapper>)originalList.stream()
                .map(item -> new HardwareElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}