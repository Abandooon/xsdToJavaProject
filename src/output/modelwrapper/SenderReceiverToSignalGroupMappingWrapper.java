package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SenderReceiverToSignalGroupMappingWrapper {

    
    private SenderReceiverToSignalGroupMapping senderReceiverToSignalGroupMapping;

    public SenderReceiverToSignalGroupMappingWrapper(SenderReceiverToSignalGroupMapping senderReceiverToSignalGroupMapping) {
        this.senderReceiverToSignalGroupMapping = senderReceiverToSignalGroupMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getS())) {
            
            return senderReceiverToSignalGroupMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getT())) {
            
            return senderReceiverToSignalGroupMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(senderReceiverToSignalGroupMapping.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EventGroupRefWrapper> getEventGroupRefs() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getEventGroupRefs())) {
            ArrayList<EventGroupRef> originalList = senderReceiverToSignalGroupMapping.getEventGroupRefs();
            ArrayList<EventGroupRefWrapper> wrapperList = (ArrayList<EventGroupRefWrapper>)originalList.stream()
                .map(item -> new EventGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EventHandlerRefWrapper> getEventHandlerRefs() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getEventHandlerRefs())) {
            ArrayList<EventHandlerRef> originalList = senderReceiverToSignalGroupMapping.getEventHandlerRefs();
            ArrayList<EventHandlerRefWrapper> wrapperList = (ArrayList<EventHandlerRefWrapper>)originalList.stream()
                .map(item -> new EventHandlerRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(senderReceiverToSignalGroupMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ServiceInstanceRefWrapper> getServiceInstanceRefs() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getServiceInstanceRefs())) {
            ArrayList<ServiceInstanceRef> originalList = senderReceiverToSignalGroupMapping.getServiceInstanceRefs();
            ArrayList<ServiceInstanceRefWrapper> wrapperList = (ArrayList<ServiceInstanceRefWrapper>)originalList.stream()
                .map(item -> new ServiceInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(senderReceiverToSignalGroupMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public VariableDataPrototypeInSystemInstanceRefWrapper getDataElementIref() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getDataElementIref())) {
            
            return new VariableDataPrototypeInSystemInstanceRefWrapper(senderReceiverToSignalGroupMapping.getDataElementIref());
            
        } else {
            return null;
        }
        
    }

    public SignalGroupRefWrapper getSignalGroupRef() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getSignalGroupRef())) {
            
            return new SignalGroupRefWrapper(senderReceiverToSignalGroupMapping.getSignalGroupRef());
            
        } else {
            return null;
        }
        
    }

    public TypeMappingWrapper getTypeMapping() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalGroupMapping.getTypeMapping())) {
            
            return new TypeMappingWrapper(senderReceiverToSignalGroupMapping.getTypeMapping());
            
        } else {
            return null;
        }
        
    }




    


    
}