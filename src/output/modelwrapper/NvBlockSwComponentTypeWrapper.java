package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class NvBlockSwComponentTypeWrapper {

    
    private NvBlockSwComponentType nvBlockSwComponentType;

    public NvBlockSwComponentTypeWrapper(NvBlockSwComponentType nvBlockSwComponentType) {
        this.nvBlockSwComponentType = nvBlockSwComponentType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getS())) {
            
            return nvBlockSwComponentType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getT())) {
            
            return nvBlockSwComponentType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getUuid())) {
            
            return nvBlockSwComponentType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getShortName())) {
            
            return new IdentifierWrapper(nvBlockSwComponentType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = nvBlockSwComponentType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(nvBlockSwComponentType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(nvBlockSwComponentType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getCategory())) {
            
            return new CategoryStringWrapper(nvBlockSwComponentType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getAdminData())) {
            
            return new AdminDataWrapper(nvBlockSwComponentType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(nvBlockSwComponentType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getAnnotations())) {
            ArrayList<Annotation> originalList = nvBlockSwComponentType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getVariationPoint())) {
            
            return new VariationPointWrapper(nvBlockSwComponentType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(nvBlockSwComponentType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getShortNamePattern())) {
            
            return new StringWrapper(nvBlockSwComponentType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwComponentDocumentationWrapper> getSwComponentDocumentations() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getSwComponentDocumentations())) {
            ArrayList<SwComponentDocumentation> originalList = nvBlockSwComponentType.getSwComponentDocumentations();
            ArrayList<SwComponentDocumentationWrapper> wrapperList = (ArrayList<SwComponentDocumentationWrapper>)originalList.stream()
                .map(item -> new SwComponentDocumentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsistencyNeedsWrapper> getConsistencyNeedss() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getConsistencyNeedss())) {
            ArrayList<ConsistencyNeeds> originalList = nvBlockSwComponentType.getConsistencyNeedss();
            ArrayList<ConsistencyNeedsWrapper> wrapperList = (ArrayList<ConsistencyNeedsWrapper>)originalList.stream()
                .map(item -> new ConsistencyNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PortsWrapper getPorts() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getPorts())) {
            
            return new PortsWrapper(nvBlockSwComponentType.getPorts());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortGroupWrapper> getPortGroups() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getPortGroups())) {
            ArrayList<PortGroup> originalList = nvBlockSwComponentType.getPortGroups();
            ArrayList<PortGroupWrapper> wrapperList = (ArrayList<PortGroupWrapper>)originalList.stream()
                .map(item -> new PortGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitGroupRefWrapper> getUnitGroupRefs() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getUnitGroupRefs())) {
            ArrayList<UnitGroupRef> originalList = nvBlockSwComponentType.getUnitGroupRefs();
            ArrayList<UnitGroupRefWrapper> wrapperList = (ArrayList<UnitGroupRefWrapper>)originalList.stream()
                .map(item -> new UnitGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcInternalBehaviorWrapper> getInternalBehaviors() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getInternalBehaviors())) {
            ArrayList<SwcInternalBehavior> originalList = nvBlockSwComponentType.getInternalBehaviors();
            ArrayList<SwcInternalBehaviorWrapper> wrapperList = (ArrayList<SwcInternalBehaviorWrapper>)originalList.stream()
                .map(item -> new SwcInternalBehaviorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SymbolPropsWrapper getSymbolProps() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getSymbolProps())) {
            
            return new SymbolPropsWrapper(nvBlockSwComponentType.getSymbolProps());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NvBlockDescriptorWrapper> getNvBlockDescriptors() {
        
        if (CollUtil.isNotEmpty(nvBlockSwComponentType.getNvBlockDescriptors())) {
            ArrayList<NvBlockDescriptor> originalList = nvBlockSwComponentType.getNvBlockDescriptors();
            ArrayList<NvBlockDescriptorWrapper> wrapperList = (ArrayList<NvBlockDescriptorWrapper>)originalList.stream()
                .map(item -> new NvBlockDescriptorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}