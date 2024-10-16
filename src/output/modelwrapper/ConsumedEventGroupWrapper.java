package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ConsumedEventGroupWrapper {

    
    private ConsumedEventGroup consumedEventGroup;

    public ConsumedEventGroupWrapper(ConsumedEventGroup consumedEventGroup) {
        this.consumedEventGroup = consumedEventGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getS())) {
            
            return consumedEventGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getT())) {
            
            return consumedEventGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getUuid())) {
            
            return consumedEventGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getShortName())) {
            
            return new IdentifierWrapper(consumedEventGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = consumedEventGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(consumedEventGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(consumedEventGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getCategory())) {
            
            return new CategoryStringWrapper(consumedEventGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getAdminData())) {
            
            return new AdminDataWrapper(consumedEventGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(consumedEventGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = consumedEventGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ApplicationEndpointRefWrapper getApplicationEndpointRef() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getApplicationEndpointRef())) {
            
            return new ApplicationEndpointRefWrapper(consumedEventGroup.getApplicationEndpointRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getEventGroupIdentifier() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getEventGroupIdentifier())) {
            
            return new PositiveIntegerWrapper(consumedEventGroup.getEventGroupIdentifier());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getInstanceIdentifier() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getInstanceIdentifier())) {
            
            return new PositiveIntegerWrapper(consumedEventGroup.getInstanceIdentifier());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPriority() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getPriority())) {
            
            return new PositiveIntegerWrapper(consumedEventGroup.getPriority());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RoutingGroupRefWrapper> getRoutingGroupRefs() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getRoutingGroupRefs())) {
            ArrayList<RoutingGroupRef> originalList = consumedEventGroup.getRoutingGroupRefs();
            ArrayList<RoutingGroupRefWrapper> wrapperList = (ArrayList<RoutingGroupRefWrapper>)originalList.stream()
                .map(item -> new RoutingGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SdClientConfigWrapper getSdClientConfig() {
        
        if (CollUtil.isNotEmpty(consumedEventGroup.getSdClientConfig())) {
            
            return new SdClientConfigWrapper(consumedEventGroup.getSdClientConfig());
            
        } else {
            return null;
        }
        
    }




    


    
}