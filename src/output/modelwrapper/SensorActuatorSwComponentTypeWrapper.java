package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SensorActuatorSwComponentTypeWrapper {

    
    private SensorActuatorSwComponentType sensorActuatorSwComponentType;

    public SensorActuatorSwComponentTypeWrapper(SensorActuatorSwComponentType sensorActuatorSwComponentType) {
        this.sensorActuatorSwComponentType = sensorActuatorSwComponentType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getS())) {
            
            return sensorActuatorSwComponentType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getT())) {
            
            return sensorActuatorSwComponentType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getUuid())) {
            
            return sensorActuatorSwComponentType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getShortName())) {
            
            return new IdentifierWrapper(sensorActuatorSwComponentType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = sensorActuatorSwComponentType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(sensorActuatorSwComponentType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(sensorActuatorSwComponentType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getCategory())) {
            
            return new CategoryStringWrapper(sensorActuatorSwComponentType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getAdminData())) {
            
            return new AdminDataWrapper(sensorActuatorSwComponentType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(sensorActuatorSwComponentType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getAnnotations())) {
            ArrayList<Annotation> originalList = sensorActuatorSwComponentType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getVariationPoint())) {
            
            return new VariationPointWrapper(sensorActuatorSwComponentType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(sensorActuatorSwComponentType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getShortNamePattern())) {
            
            return new StringWrapper(sensorActuatorSwComponentType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwComponentDocumentationWrapper> getSwComponentDocumentations() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getSwComponentDocumentations())) {
            ArrayList<SwComponentDocumentation> originalList = sensorActuatorSwComponentType.getSwComponentDocumentations();
            ArrayList<SwComponentDocumentationWrapper> wrapperList = (ArrayList<SwComponentDocumentationWrapper>)originalList.stream()
                .map(item -> new SwComponentDocumentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsistencyNeedsWrapper> getConsistencyNeedss() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getConsistencyNeedss())) {
            ArrayList<ConsistencyNeeds> originalList = sensorActuatorSwComponentType.getConsistencyNeedss();
            ArrayList<ConsistencyNeedsWrapper> wrapperList = (ArrayList<ConsistencyNeedsWrapper>)originalList.stream()
                .map(item -> new ConsistencyNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PortsWrapper getPorts() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getPorts())) {
            
            return new PortsWrapper(sensorActuatorSwComponentType.getPorts());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortGroupWrapper> getPortGroups() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getPortGroups())) {
            ArrayList<PortGroup> originalList = sensorActuatorSwComponentType.getPortGroups();
            ArrayList<PortGroupWrapper> wrapperList = (ArrayList<PortGroupWrapper>)originalList.stream()
                .map(item -> new PortGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitGroupRefWrapper> getUnitGroupRefs() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getUnitGroupRefs())) {
            ArrayList<UnitGroupRef> originalList = sensorActuatorSwComponentType.getUnitGroupRefs();
            ArrayList<UnitGroupRefWrapper> wrapperList = (ArrayList<UnitGroupRefWrapper>)originalList.stream()
                .map(item -> new UnitGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcInternalBehaviorWrapper> getInternalBehaviors() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getInternalBehaviors())) {
            ArrayList<SwcInternalBehavior> originalList = sensorActuatorSwComponentType.getInternalBehaviors();
            ArrayList<SwcInternalBehaviorWrapper> wrapperList = (ArrayList<SwcInternalBehaviorWrapper>)originalList.stream()
                .map(item -> new SwcInternalBehaviorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SymbolPropsWrapper getSymbolProps() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getSymbolProps())) {
            
            return new SymbolPropsWrapper(sensorActuatorSwComponentType.getSymbolProps());
            
        } else {
            return null;
        }
        
    }

    public SensorActuatorRefWrapper getSensorActuatorRef() {
        
        if (CollUtil.isNotEmpty(sensorActuatorSwComponentType.getSensorActuatorRef())) {
            
            return new SensorActuatorRefWrapper(sensorActuatorSwComponentType.getSensorActuatorRef());
            
        } else {
            return null;
        }
        
    }




    


    
}