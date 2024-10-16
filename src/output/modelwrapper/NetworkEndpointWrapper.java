package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    


public class NetworkEndpointWrapper {

    
    private NetworkEndpoint networkEndpoint;

    public NetworkEndpointWrapper(NetworkEndpoint networkEndpoint) {
        this.networkEndpoint = networkEndpoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getS())) {
            
            return networkEndpoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getT())) {
            
            return networkEndpoint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getUuid())) {
            
            return networkEndpoint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getShortName())) {
            
            return new IdentifierWrapper(networkEndpoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = networkEndpoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(networkEndpoint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(networkEndpoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getCategory())) {
            
            return new CategoryStringWrapper(networkEndpoint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getAdminData())) {
            
            return new AdminDataWrapper(networkEndpoint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(networkEndpoint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getAnnotations())) {
            ArrayList<Annotation> originalList = networkEndpoint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getFullyQualifiedDomainName() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getFullyQualifiedDomainName())) {
            
            return new StringWrapper(networkEndpoint.getFullyQualifiedDomainName());
            
        } else {
            return null;
        }
        
    }

    public InfrastructureServicesWrapper getInfrastructureServices() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getInfrastructureServices())) {
            
            return new InfrastructureServicesWrapper(networkEndpoint.getInfrastructureServices());
            
        } else {
            return null;
        }
        
    }

    public NetworkEndpointAddressesWrapper getNetworkEndpointAddresses() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getNetworkEndpointAddresses())) {
            
            return new NetworkEndpointAddressesWrapper(networkEndpoint.getNetworkEndpointAddresses());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPriority() {
        
        if (CollUtil.isNotEmpty(networkEndpoint.getPriority())) {
            
            return new PositiveIntegerWrapper(networkEndpoint.getPriority());
            
        } else {
            return null;
        }
        
    }




    


    
}