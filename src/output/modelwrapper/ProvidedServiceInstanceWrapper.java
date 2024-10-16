package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.EventHandler;
    

    
    

    
    

    
    

    
    


public class ProvidedServiceInstanceWrapper {

    
    private ProvidedServiceInstance providedServiceInstance;

    public ProvidedServiceInstanceWrapper(ProvidedServiceInstance providedServiceInstance) {
        this.providedServiceInstance = providedServiceInstance;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getS())) {
            
            return providedServiceInstance.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getT())) {
            
            return providedServiceInstance.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getUuid())) {
            
            return providedServiceInstance.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getShortName())) {
            
            return new IdentifierWrapper(providedServiceInstance.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = providedServiceInstance.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getLongName())) {
            
            return new MultilanguageLongNameWrapper(providedServiceInstance.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(providedServiceInstance.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getCategory())) {
            
            return new CategoryStringWrapper(providedServiceInstance.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getAdminData())) {
            
            return new AdminDataWrapper(providedServiceInstance.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getIntroduction())) {
            
            return new DocumentationBlockWrapper(providedServiceInstance.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getAnnotations())) {
            ArrayList<Annotation> originalList = providedServiceInstance.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RoutingGroupRefWrapper> getRoutingGroupRefs() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getRoutingGroupRefs())) {
            ArrayList<RoutingGroupRef> originalList = providedServiceInstance.getRoutingGroupRefs();
            ArrayList<RoutingGroupRefWrapper> wrapperList = (ArrayList<RoutingGroupRefWrapper>)originalList.stream()
                .map(item -> new RoutingGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EventHandlerWrapper> getEventHandlers() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getEventHandlers())) {
            ArrayList<EventHandler> originalList = providedServiceInstance.getEventHandlers();
            ArrayList<EventHandlerWrapper> wrapperList = (ArrayList<EventHandlerWrapper>)originalList.stream()
                .map(item -> new EventHandlerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getInstanceIdentifier() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getInstanceIdentifier())) {
            
            return new PositiveIntegerWrapper(providedServiceInstance.getInstanceIdentifier());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPriority() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getPriority())) {
            
            return new PositiveIntegerWrapper(providedServiceInstance.getPriority());
            
        } else {
            return null;
        }
        
    }

    public SdServerConfigWrapper getSdServerConfig() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getSdServerConfig())) {
            
            return new SdServerConfigWrapper(providedServiceInstance.getSdServerConfig());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getServiceIdentifier() {
        
        if (CollUtil.isNotEmpty(providedServiceInstance.getServiceIdentifier())) {
            
            return new PositiveIntegerWrapper(providedServiceInstance.getServiceIdentifier());
            
        } else {
            return null;
        }
        
    }




    


    
}