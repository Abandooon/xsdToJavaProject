package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ServiceProxySwComponentTypeWrapper {

    
    private ServiceProxySwComponentType serviceProxySwComponentType;

    public ServiceProxySwComponentTypeWrapper(ServiceProxySwComponentType serviceProxySwComponentType) {
        this.serviceProxySwComponentType = serviceProxySwComponentType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getS())) {
            
            return serviceProxySwComponentType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getT())) {
            
            return serviceProxySwComponentType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getUuid())) {
            
            return serviceProxySwComponentType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getShortName())) {
            
            return new IdentifierWrapper(serviceProxySwComponentType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = serviceProxySwComponentType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(serviceProxySwComponentType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(serviceProxySwComponentType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getCategory())) {
            
            return new CategoryStringWrapper(serviceProxySwComponentType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getAdminData())) {
            
            return new AdminDataWrapper(serviceProxySwComponentType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(serviceProxySwComponentType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getAnnotations())) {
            ArrayList<Annotation> originalList = serviceProxySwComponentType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getVariationPoint())) {
            
            return new VariationPointWrapper(serviceProxySwComponentType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(serviceProxySwComponentType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getShortNamePattern())) {
            
            return new StringWrapper(serviceProxySwComponentType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwComponentDocumentationWrapper> getSwComponentDocumentations() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getSwComponentDocumentations())) {
            ArrayList<SwComponentDocumentation> originalList = serviceProxySwComponentType.getSwComponentDocumentations();
            ArrayList<SwComponentDocumentationWrapper> wrapperList = (ArrayList<SwComponentDocumentationWrapper>)originalList.stream()
                .map(item -> new SwComponentDocumentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsistencyNeedsWrapper> getConsistencyNeedss() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getConsistencyNeedss())) {
            ArrayList<ConsistencyNeeds> originalList = serviceProxySwComponentType.getConsistencyNeedss();
            ArrayList<ConsistencyNeedsWrapper> wrapperList = (ArrayList<ConsistencyNeedsWrapper>)originalList.stream()
                .map(item -> new ConsistencyNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PortsWrapper getPorts() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getPorts())) {
            
            return new PortsWrapper(serviceProxySwComponentType.getPorts());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortGroupWrapper> getPortGroups() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getPortGroups())) {
            ArrayList<PortGroup> originalList = serviceProxySwComponentType.getPortGroups();
            ArrayList<PortGroupWrapper> wrapperList = (ArrayList<PortGroupWrapper>)originalList.stream()
                .map(item -> new PortGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitGroupRefWrapper> getUnitGroupRefs() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getUnitGroupRefs())) {
            ArrayList<UnitGroupRef> originalList = serviceProxySwComponentType.getUnitGroupRefs();
            ArrayList<UnitGroupRefWrapper> wrapperList = (ArrayList<UnitGroupRefWrapper>)originalList.stream()
                .map(item -> new UnitGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcInternalBehaviorWrapper> getInternalBehaviors() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getInternalBehaviors())) {
            ArrayList<SwcInternalBehavior> originalList = serviceProxySwComponentType.getInternalBehaviors();
            ArrayList<SwcInternalBehaviorWrapper> wrapperList = (ArrayList<SwcInternalBehaviorWrapper>)originalList.stream()
                .map(item -> new SwcInternalBehaviorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SymbolPropsWrapper getSymbolProps() {
        
        if (CollUtil.isNotEmpty(serviceProxySwComponentType.getSymbolProps())) {
            
            return new SymbolPropsWrapper(serviceProxySwComponentType.getSymbolProps());
            
        } else {
            return null;
        }
        
    }




    


    
}