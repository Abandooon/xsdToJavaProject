package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ApplicationEndpointWrapper {

    
    private ApplicationEndpoint applicationEndpoint;

    public ApplicationEndpointWrapper(ApplicationEndpoint applicationEndpoint) {
        this.applicationEndpoint = applicationEndpoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getS())) {
            
            return applicationEndpoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getT())) {
            
            return applicationEndpoint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getUuid())) {
            
            return applicationEndpoint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getShortName())) {
            
            return new IdentifierWrapper(applicationEndpoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = applicationEndpoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(applicationEndpoint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(applicationEndpoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getCategory())) {
            
            return new CategoryStringWrapper(applicationEndpoint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getAdminData())) {
            
            return new AdminDataWrapper(applicationEndpoint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(applicationEndpoint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getAnnotations())) {
            ArrayList<Annotation> originalList = applicationEndpoint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsumedServiceInstanceWrapper> getConsumedServiceInstances() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getConsumedServiceInstances())) {
            ArrayList<ConsumedServiceInstance> originalList = applicationEndpoint.getConsumedServiceInstances();
            ArrayList<ConsumedServiceInstanceWrapper> wrapperList = (ArrayList<ConsumedServiceInstanceWrapper>)originalList.stream()
                .map(item -> new ConsumedServiceInstanceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiscoveryTechnologyWrapper getDiscoveryTechnology() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getDiscoveryTechnology())) {
            
            return new DiscoveryTechnologyWrapper(applicationEndpoint.getDiscoveryTechnology());
            
        } else {
            return null;
        }
        
    }

    public NetworkEndpointRefWrapper getNetworkEndpointRef() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getNetworkEndpointRef())) {
            
            return new NetworkEndpointRefWrapper(applicationEndpoint.getNetworkEndpointRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPriority() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getPriority())) {
            
            return new PositiveIntegerWrapper(applicationEndpoint.getPriority());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ProvidedServiceInstanceWrapper> getProvidedServiceInstances() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getProvidedServiceInstances())) {
            ArrayList<ProvidedServiceInstance> originalList = applicationEndpoint.getProvidedServiceInstances();
            ArrayList<ProvidedServiceInstanceWrapper> wrapperList = (ArrayList<ProvidedServiceInstanceWrapper>)originalList.stream()
                .map(item -> new ProvidedServiceInstanceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RemotingTechnologyWrapper getRemotingTechnology() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getRemotingTechnology())) {
            
            return new RemotingTechnologyWrapper(applicationEndpoint.getRemotingTechnology());
            
        } else {
            return null;
        }
        
    }

    public SerializationTechnologyRefWrapper getSerializationTechnologyRef() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getSerializationTechnologyRef())) {
            
            return new SerializationTechnologyRefWrapper(applicationEndpoint.getSerializationTechnologyRef());
            
        } else {
            return null;
        }
        
    }

    public TpConfigurationWrapper getTpConfiguration() {
        
        if (CollUtil.isNotEmpty(applicationEndpoint.getTpConfiguration())) {
            
            return new TpConfigurationWrapper(applicationEndpoint.getTpConfiguration());
            
        } else {
            return null;
        }
        
    }




    


    
}