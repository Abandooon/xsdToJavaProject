package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TriggerToSignalMappingWrapper {

    
    private TriggerToSignalMapping triggerToSignalMapping;

    public TriggerToSignalMappingWrapper(TriggerToSignalMapping triggerToSignalMapping) {
        this.triggerToSignalMapping = triggerToSignalMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getS())) {
            
            return triggerToSignalMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getT())) {
            
            return triggerToSignalMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(triggerToSignalMapping.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EventGroupRefWrapper> getEventGroupRefs() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getEventGroupRefs())) {
            ArrayList<EventGroupRef> originalList = triggerToSignalMapping.getEventGroupRefs();
            ArrayList<EventGroupRefWrapper> wrapperList = (ArrayList<EventGroupRefWrapper>)originalList.stream()
                .map(item -> new EventGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EventHandlerRefWrapper> getEventHandlerRefs() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getEventHandlerRefs())) {
            ArrayList<EventHandlerRef> originalList = triggerToSignalMapping.getEventHandlerRefs();
            ArrayList<EventHandlerRefWrapper> wrapperList = (ArrayList<EventHandlerRefWrapper>)originalList.stream()
                .map(item -> new EventHandlerRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(triggerToSignalMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ServiceInstanceRefWrapper> getServiceInstanceRefs() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getServiceInstanceRefs())) {
            ArrayList<ServiceInstanceRef> originalList = triggerToSignalMapping.getServiceInstanceRefs();
            ArrayList<ServiceInstanceRefWrapper> wrapperList = (ArrayList<ServiceInstanceRefWrapper>)originalList.stream()
                .map(item -> new ServiceInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(triggerToSignalMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TriggerInSystemInstanceRefWrapper getTriggerIref() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getTriggerIref())) {
            
            return new TriggerInSystemInstanceRefWrapper(triggerToSignalMapping.getTriggerIref());
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(triggerToSignalMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(triggerToSignalMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}