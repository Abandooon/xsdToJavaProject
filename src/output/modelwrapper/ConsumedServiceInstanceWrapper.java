package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class ConsumedServiceInstanceWrapper {

    
    private ConsumedServiceInstance consumedServiceInstance;

    public ConsumedServiceInstanceWrapper(ConsumedServiceInstance consumedServiceInstance) {
        this.consumedServiceInstance = consumedServiceInstance;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getS())) {
            
            return consumedServiceInstance.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getT())) {
            
            return consumedServiceInstance.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getUuid())) {
            
            return consumedServiceInstance.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getShortName())) {
            
            return new IdentifierWrapper(consumedServiceInstance.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = consumedServiceInstance.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getLongName())) {
            
            return new MultilanguageLongNameWrapper(consumedServiceInstance.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(consumedServiceInstance.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getCategory())) {
            
            return new CategoryStringWrapper(consumedServiceInstance.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getAdminData())) {
            
            return new AdminDataWrapper(consumedServiceInstance.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getIntroduction())) {
            
            return new DocumentationBlockWrapper(consumedServiceInstance.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getAnnotations())) {
            ArrayList<Annotation> originalList = consumedServiceInstance.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RoutingGroupRefWrapper> getRoutingGroupRefs() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getRoutingGroupRefs())) {
            ArrayList<RoutingGroupRef> originalList = consumedServiceInstance.getRoutingGroupRefs();
            ArrayList<RoutingGroupRefWrapper> wrapperList = (ArrayList<RoutingGroupRefWrapper>)originalList.stream()
                .map(item -> new RoutingGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsumedEventGroupWrapper> getConsumedEventGroups() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getConsumedEventGroups())) {
            ArrayList<ConsumedEventGroup> originalList = consumedServiceInstance.getConsumedEventGroups();
            ArrayList<ConsumedEventGroupWrapper> wrapperList = (ArrayList<ConsumedEventGroupWrapper>)originalList.stream()
                .map(item -> new ConsumedEventGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ProvidedServiceInstanceRefWrapper getProvidedServiceInstanceRef() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getProvidedServiceInstanceRef())) {
            
            return new ProvidedServiceInstanceRefWrapper(consumedServiceInstance.getProvidedServiceInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public SdClientConfigWrapper getSdClientConfig() {
        
        if (CollUtil.isNotEmpty(consumedServiceInstance.getSdClientConfig())) {
            
            return new SdClientConfigWrapper(consumedServiceInstance.getSdClientConfig());
            
        } else {
            return null;
        }
        
    }




    


    
}