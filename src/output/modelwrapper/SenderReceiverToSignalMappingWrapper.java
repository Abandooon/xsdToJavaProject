package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SenderReceiverToSignalMappingWrapper {

    
    private SenderReceiverToSignalMapping senderReceiverToSignalMapping;

    public SenderReceiverToSignalMappingWrapper(SenderReceiverToSignalMapping senderReceiverToSignalMapping) {
        this.senderReceiverToSignalMapping = senderReceiverToSignalMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getS())) {
            
            return senderReceiverToSignalMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getT())) {
            
            return senderReceiverToSignalMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(senderReceiverToSignalMapping.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EventGroupRefWrapper> getEventGroupRefs() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getEventGroupRefs())) {
            ArrayList<EventGroupRef> originalList = senderReceiverToSignalMapping.getEventGroupRefs();
            ArrayList<EventGroupRefWrapper> wrapperList = (ArrayList<EventGroupRefWrapper>)originalList.stream()
                .map(item -> new EventGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EventHandlerRefWrapper> getEventHandlerRefs() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getEventHandlerRefs())) {
            ArrayList<EventHandlerRef> originalList = senderReceiverToSignalMapping.getEventHandlerRefs();
            ArrayList<EventHandlerRefWrapper> wrapperList = (ArrayList<EventHandlerRefWrapper>)originalList.stream()
                .map(item -> new EventHandlerRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(senderReceiverToSignalMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ServiceInstanceRefWrapper> getServiceInstanceRefs() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getServiceInstanceRefs())) {
            ArrayList<ServiceInstanceRef> originalList = senderReceiverToSignalMapping.getServiceInstanceRefs();
            ArrayList<ServiceInstanceRefWrapper> wrapperList = (ArrayList<ServiceInstanceRefWrapper>)originalList.stream()
                .map(item -> new ServiceInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(senderReceiverToSignalMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public VariableDataPrototypeInSystemInstanceRefWrapper getDataElementIref() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getDataElementIref())) {
            
            return new VariableDataPrototypeInSystemInstanceRefWrapper(senderReceiverToSignalMapping.getDataElementIref());
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(senderReceiverToSignalMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(senderReceiverToSignalMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}