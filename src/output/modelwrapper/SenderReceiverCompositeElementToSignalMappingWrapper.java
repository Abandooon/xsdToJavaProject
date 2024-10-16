package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SenderReceiverCompositeElementToSignalMappingWrapper {

    
    private SenderReceiverCompositeElementToSignalMapping senderReceiverCompositeElementToSignalMapping;

    public SenderReceiverCompositeElementToSignalMappingWrapper(SenderReceiverCompositeElementToSignalMapping senderReceiverCompositeElementToSignalMapping) {
        this.senderReceiverCompositeElementToSignalMapping = senderReceiverCompositeElementToSignalMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getS())) {
            
            return senderReceiverCompositeElementToSignalMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getT())) {
            
            return senderReceiverCompositeElementToSignalMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(senderReceiverCompositeElementToSignalMapping.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EventGroupRefWrapper> getEventGroupRefs() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getEventGroupRefs())) {
            ArrayList<EventGroupRef> originalList = senderReceiverCompositeElementToSignalMapping.getEventGroupRefs();
            ArrayList<EventGroupRefWrapper> wrapperList = (ArrayList<EventGroupRefWrapper>)originalList.stream()
                .map(item -> new EventGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EventHandlerRefWrapper> getEventHandlerRefs() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getEventHandlerRefs())) {
            ArrayList<EventHandlerRef> originalList = senderReceiverCompositeElementToSignalMapping.getEventHandlerRefs();
            ArrayList<EventHandlerRefWrapper> wrapperList = (ArrayList<EventHandlerRefWrapper>)originalList.stream()
                .map(item -> new EventHandlerRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(senderReceiverCompositeElementToSignalMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ServiceInstanceRefWrapper> getServiceInstanceRefs() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getServiceInstanceRefs())) {
            ArrayList<ServiceInstanceRef> originalList = senderReceiverCompositeElementToSignalMapping.getServiceInstanceRefs();
            ArrayList<ServiceInstanceRefWrapper> wrapperList = (ArrayList<ServiceInstanceRefWrapper>)originalList.stream()
                .map(item -> new ServiceInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(senderReceiverCompositeElementToSignalMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public VariableDataPrototypeInSystemInstanceRefWrapper getDataElementIref() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getDataElementIref())) {
            
            return new VariableDataPrototypeInSystemInstanceRefWrapper(senderReceiverCompositeElementToSignalMapping.getDataElementIref());
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(senderReceiverCompositeElementToSignalMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }

    public TypeMappingWrapper getTypeMapping() {
        
        if (CollUtil.isNotEmpty(senderReceiverCompositeElementToSignalMapping.getTypeMapping())) {
            
            return new TypeMappingWrapper(senderReceiverCompositeElementToSignalMapping.getTypeMapping());
            
        } else {
            return null;
        }
        
    }




    


    
}