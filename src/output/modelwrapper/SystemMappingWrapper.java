package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SystemMappingWrapper {

    
    private SystemMapping systemMapping;

    public SystemMappingWrapper(SystemMapping systemMapping) {
        this.systemMapping = systemMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(systemMapping.getS())) {
            
            return systemMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(systemMapping.getT())) {
            
            return systemMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(systemMapping.getUuid())) {
            
            return systemMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(systemMapping.getShortName())) {
            
            return new IdentifierWrapper(systemMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(systemMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = systemMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(systemMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(systemMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(systemMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(systemMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(systemMapping.getCategory())) {
            
            return new CategoryStringWrapper(systemMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(systemMapping.getAdminData())) {
            
            return new AdminDataWrapper(systemMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(systemMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(systemMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(systemMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = systemMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DataMappingsWrapper getDataMappings() {
        
        if (CollUtil.isNotEmpty(systemMapping.getDataMappings())) {
            
            return new DataMappingsWrapper(systemMapping.getDataMappings());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcuMappingWrapper> getEcuResourceMappings() {
        
        if (CollUtil.isNotEmpty(systemMapping.getEcuResourceMappings())) {
            ArrayList<EcuMapping> originalList = systemMapping.getEcuResourceMappings();
            ArrayList<EcuMappingWrapper> wrapperList = (ArrayList<EcuMappingWrapper>)originalList.stream()
                .map(item -> new EcuMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MappingConstraintsWrapper getMappingConstraints() {
        
        if (CollUtil.isNotEmpty(systemMapping.getMappingConstraints())) {
            
            return new MappingConstraintsWrapper(systemMapping.getMappingConstraints());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PncMappingWrapper> getPncMappings() {
        
        if (CollUtil.isNotEmpty(systemMapping.getPncMappings())) {
            ArrayList<PncMapping> originalList = systemMapping.getPncMappings();
            ArrayList<PncMappingWrapper> wrapperList = (ArrayList<PncMappingWrapper>)originalList.stream()
                .map(item -> new PncMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcuResourceEstimationWrapper> getResourceEstimations() {
        
        if (CollUtil.isNotEmpty(systemMapping.getResourceEstimations())) {
            ArrayList<EcuResourceEstimation> originalList = systemMapping.getResourceEstimations();
            ArrayList<EcuResourceEstimationWrapper> wrapperList = (ArrayList<EcuResourceEstimationWrapper>)originalList.stream()
                .map(item -> new EcuResourceEstimationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SignalPathConstraintsWrapper getSignalPathConstraints() {
        
        if (CollUtil.isNotEmpty(systemMapping.getSignalPathConstraints())) {
            
            return new SignalPathConstraintsWrapper(systemMapping.getSignalPathConstraints());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToImplMappingWrapper> getSwImplMappings() {
        
        if (CollUtil.isNotEmpty(systemMapping.getSwImplMappings())) {
            ArrayList<SwcToImplMapping> originalList = systemMapping.getSwImplMappings();
            ArrayList<SwcToImplMappingWrapper> wrapperList = (ArrayList<SwcToImplMappingWrapper>)originalList.stream()
                .map(item -> new SwcToImplMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToEcuMappingWrapper> getSwMappings() {
        
        if (CollUtil.isNotEmpty(systemMapping.getSwMappings())) {
            ArrayList<SwcToEcuMapping> originalList = systemMapping.getSwMappings();
            ArrayList<SwcToEcuMappingWrapper> wrapperList = (ArrayList<SwcToEcuMappingWrapper>)originalList.stream()
                .map(item -> new SwcToEcuMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(systemMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(systemMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}