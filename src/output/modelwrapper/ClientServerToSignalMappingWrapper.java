package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ClientServerToSignalMappingWrapper {

    
    private ClientServerToSignalMapping clientServerToSignalMapping;

    public ClientServerToSignalMappingWrapper(ClientServerToSignalMapping clientServerToSignalMapping) {
        this.clientServerToSignalMapping = clientServerToSignalMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getS())) {
            
            return clientServerToSignalMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getT())) {
            
            return clientServerToSignalMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(clientServerToSignalMapping.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EventGroupRefWrapper> getEventGroupRefs() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getEventGroupRefs())) {
            ArrayList<EventGroupRef> originalList = clientServerToSignalMapping.getEventGroupRefs();
            ArrayList<EventGroupRefWrapper> wrapperList = (ArrayList<EventGroupRefWrapper>)originalList.stream()
                .map(item -> new EventGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EventHandlerRefWrapper> getEventHandlerRefs() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getEventHandlerRefs())) {
            ArrayList<EventHandlerRef> originalList = clientServerToSignalMapping.getEventHandlerRefs();
            ArrayList<EventHandlerRefWrapper> wrapperList = (ArrayList<EventHandlerRefWrapper>)originalList.stream()
                .map(item -> new EventHandlerRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(clientServerToSignalMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ServiceInstanceRefWrapper> getServiceInstanceRefs() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getServiceInstanceRefs())) {
            ArrayList<ServiceInstanceRef> originalList = clientServerToSignalMapping.getServiceInstanceRefs();
            ArrayList<ServiceInstanceRefWrapper> wrapperList = (ArrayList<ServiceInstanceRefWrapper>)originalList.stream()
                .map(item -> new ServiceInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(clientServerToSignalMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CallSignalRefWrapper getCallSignalRef() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getCallSignalRef())) {
            
            return new CallSignalRefWrapper(clientServerToSignalMapping.getCallSignalRef());
            
        } else {
            return null;
        }
        
    }

    public OperationInSystemInstanceRefWrapper getClientServerOperationIref() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getClientServerOperationIref())) {
            
            return new OperationInSystemInstanceRefWrapper(clientServerToSignalMapping.getClientServerOperationIref());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getLengthClientId() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getLengthClientId())) {
            
            return new PositiveIntegerWrapper(clientServerToSignalMapping.getLengthClientId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getLengthSequenceCounter() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getLengthSequenceCounter())) {
            
            return new PositiveIntegerWrapper(clientServerToSignalMapping.getLengthSequenceCounter());
            
        } else {
            return null;
        }
        
    }

    public ReturnSignalRefWrapper getReturnSignalRef() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getReturnSignalRef())) {
            
            return new ReturnSignalRefWrapper(clientServerToSignalMapping.getReturnSignalRef());
            
        } else {
            return null;
        }
        
    }

    public SerializerRefWrapper getSerializerRef() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalMapping.getSerializerRef())) {
            
            return new SerializerRefWrapper(clientServerToSignalMapping.getSerializerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}