package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ClientServerToSignalGroupMappingWrapper {

    
    private ClientServerToSignalGroupMapping clientServerToSignalGroupMapping;

    public ClientServerToSignalGroupMappingWrapper(ClientServerToSignalGroupMapping clientServerToSignalGroupMapping) {
        this.clientServerToSignalGroupMapping = clientServerToSignalGroupMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getS())) {
            
            return clientServerToSignalGroupMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getT())) {
            
            return clientServerToSignalGroupMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(clientServerToSignalGroupMapping.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EventGroupRefWrapper> getEventGroupRefs() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getEventGroupRefs())) {
            ArrayList<EventGroupRef> originalList = clientServerToSignalGroupMapping.getEventGroupRefs();
            ArrayList<EventGroupRefWrapper> wrapperList = (ArrayList<EventGroupRefWrapper>)originalList.stream()
                .map(item -> new EventGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EventHandlerRefWrapper> getEventHandlerRefs() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getEventHandlerRefs())) {
            ArrayList<EventHandlerRef> originalList = clientServerToSignalGroupMapping.getEventHandlerRefs();
            ArrayList<EventHandlerRefWrapper> wrapperList = (ArrayList<EventHandlerRefWrapper>)originalList.stream()
                .map(item -> new EventHandlerRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(clientServerToSignalGroupMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ServiceInstanceRefWrapper> getServiceInstanceRefs() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getServiceInstanceRefs())) {
            ArrayList<ServiceInstanceRef> originalList = clientServerToSignalGroupMapping.getServiceInstanceRefs();
            ArrayList<ServiceInstanceRefWrapper> wrapperList = (ArrayList<ServiceInstanceRefWrapper>)originalList.stream()
                .map(item -> new ServiceInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(clientServerToSignalGroupMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ApplicationErrorMappingWrapper getApplicationError() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getApplicationError())) {
            
            return new ApplicationErrorMappingWrapper(clientServerToSignalGroupMapping.getApplicationError());
            
        } else {
            return null;
        }
        
    }

    public ClientIdMappingWrapper getClientId() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getClientId())) {
            
            return new ClientIdMappingWrapper(clientServerToSignalGroupMapping.getClientId());
            
        } else {
            return null;
        }
        
    }

    public CompositeTypeMappingsWrapper getCompositeTypeMappings() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getCompositeTypeMappings())) {
            
            return new CompositeTypeMappingsWrapper(clientServerToSignalGroupMapping.getCompositeTypeMappings());
            
        } else {
            return null;
        }
        
    }

    public EmptySignalMappingWrapper getEmptySignal() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getEmptySignal())) {
            
            return new EmptySignalMappingWrapper(clientServerToSignalGroupMapping.getEmptySignal());
            
        } else {
            return null;
        }
        
    }

    public OperationInSystemInstanceRefWrapper getMappedOperationIref() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getMappedOperationIref())) {
            
            return new OperationInSystemInstanceRefWrapper(clientServerToSignalGroupMapping.getMappedOperationIref());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerPrimitiveTypeMappingWrapper> getPrimitiveTypeMappings() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getPrimitiveTypeMappings())) {
            ArrayList<ClientServerPrimitiveTypeMapping> originalList = clientServerToSignalGroupMapping.getPrimitiveTypeMappings();
            ArrayList<ClientServerPrimitiveTypeMappingWrapper> wrapperList = (ArrayList<ClientServerPrimitiveTypeMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerPrimitiveTypeMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RequestGroupRefWrapper getRequestGroupRef() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getRequestGroupRef())) {
            
            return new RequestGroupRefWrapper(clientServerToSignalGroupMapping.getRequestGroupRef());
            
        } else {
            return null;
        }
        
    }

    public ResponseGroupRefWrapper getResponseGroupRef() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getResponseGroupRef())) {
            
            return new ResponseGroupRefWrapper(clientServerToSignalGroupMapping.getResponseGroupRef());
            
        } else {
            return null;
        }
        
    }

    public SequenceCounterMappingWrapper getSequenceCounter() {
        
        if (CollUtil.isNotEmpty(clientServerToSignalGroupMapping.getSequenceCounter())) {
            
            return new SequenceCounterMappingWrapper(clientServerToSignalGroupMapping.getSequenceCounter());
            
        } else {
            return null;
        }
        
    }




    


    
}