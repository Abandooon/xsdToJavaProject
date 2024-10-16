package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class DataMappingsWrapper {

    
    private DataMappings dataMappings;

    public DataMappingsWrapper(DataMappings dataMappings) {
        this.dataMappings = dataMappings;
    }

   
    public ArrayList<ClientServerToSignalGroupMappingWrapper> getClientServerToSignalGroupMapping() {
        
        if (CollUtil.isNotEmpty(dataMappings.getClientServerToSignalGroupMapping())) {
            ArrayList<ClientServerToSignalGroupMapping> originalList = dataMappings.getClientServerToSignalGroupMapping();
            ArrayList<ClientServerToSignalGroupMappingWrapper> wrapperList = (ArrayList<ClientServerToSignalGroupMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerToSignalGroupMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerToSignalMappingWrapper> getClientServerToSignalMapping() {
        
        if (CollUtil.isNotEmpty(dataMappings.getClientServerToSignalMapping())) {
            ArrayList<ClientServerToSignalMapping> originalList = dataMappings.getClientServerToSignalMapping();
            ArrayList<ClientServerToSignalMappingWrapper> wrapperList = (ArrayList<ClientServerToSignalMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerToSignalMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SenderReceiverCompositeElementToSignalMappingWrapper> getSenderReceiverCompositeElementToSignalMapping() {
        
        if (CollUtil.isNotEmpty(dataMappings.getSenderReceiverCompositeElementToSignalMapping())) {
            ArrayList<SenderReceiverCompositeElementToSignalMapping> originalList = dataMappings.getSenderReceiverCompositeElementToSignalMapping();
            ArrayList<SenderReceiverCompositeElementToSignalMappingWrapper> wrapperList = (ArrayList<SenderReceiverCompositeElementToSignalMappingWrapper>)originalList.stream()
                .map(item -> new SenderReceiverCompositeElementToSignalMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SenderReceiverToSignalGroupMappingWrapper> getSenderReceiverToSignalGroupMapping() {
        
        if (CollUtil.isNotEmpty(dataMappings.getSenderReceiverToSignalGroupMapping())) {
            ArrayList<SenderReceiverToSignalGroupMapping> originalList = dataMappings.getSenderReceiverToSignalGroupMapping();
            ArrayList<SenderReceiverToSignalGroupMappingWrapper> wrapperList = (ArrayList<SenderReceiverToSignalGroupMappingWrapper>)originalList.stream()
                .map(item -> new SenderReceiverToSignalGroupMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SenderReceiverToSignalMappingWrapper> getSenderReceiverToSignalMapping() {
        
        if (CollUtil.isNotEmpty(dataMappings.getSenderReceiverToSignalMapping())) {
            ArrayList<SenderReceiverToSignalMapping> originalList = dataMappings.getSenderReceiverToSignalMapping();
            ArrayList<SenderReceiverToSignalMappingWrapper> wrapperList = (ArrayList<SenderReceiverToSignalMappingWrapper>)originalList.stream()
                .map(item -> new SenderReceiverToSignalMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerToSignalMappingWrapper> getTriggerToSignalMapping() {
        
        if (CollUtil.isNotEmpty(dataMappings.getTriggerToSignalMapping())) {
            ArrayList<TriggerToSignalMapping> originalList = dataMappings.getTriggerToSignalMapping();
            ArrayList<TriggerToSignalMappingWrapper> wrapperList = (ArrayList<TriggerToSignalMappingWrapper>)originalList.stream()
                .map(item -> new TriggerToSignalMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}