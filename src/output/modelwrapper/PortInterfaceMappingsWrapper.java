package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PortInterfaceMappingsWrapper {

    
    private PortInterfaceMappings portInterfaceMappings;

    public PortInterfaceMappingsWrapper(PortInterfaceMappings portInterfaceMappings) {
        this.portInterfaceMappings = portInterfaceMappings;
    }

   
    public ArrayList<ClientServerInterfaceMappingWrapper> getClientServerInterfaceMapping() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappings.getClientServerInterfaceMapping())) {
            ArrayList<ClientServerInterfaceMapping> originalList = portInterfaceMappings.getClientServerInterfaceMapping();
            ArrayList<ClientServerInterfaceMappingWrapper> wrapperList = (ArrayList<ClientServerInterfaceMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerInterfaceMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInterfaceMappingWrapper> getModeInterfaceMapping() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappings.getModeInterfaceMapping())) {
            ArrayList<ModeInterfaceMapping> originalList = portInterfaceMappings.getModeInterfaceMapping();
            ArrayList<ModeInterfaceMappingWrapper> wrapperList = (ArrayList<ModeInterfaceMappingWrapper>)originalList.stream()
                .map(item -> new ModeInterfaceMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerInterfaceMappingWrapper> getTriggerInterfaceMapping() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappings.getTriggerInterfaceMapping())) {
            ArrayList<TriggerInterfaceMapping> originalList = portInterfaceMappings.getTriggerInterfaceMapping();
            ArrayList<TriggerInterfaceMappingWrapper> wrapperList = (ArrayList<TriggerInterfaceMappingWrapper>)originalList.stream()
                .map(item -> new TriggerInterfaceMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAndParameterInterfaceMappingWrapper> getVariableAndParameterInterfaceMapping() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappings.getVariableAndParameterInterfaceMapping())) {
            ArrayList<VariableAndParameterInterfaceMapping> originalList = portInterfaceMappings.getVariableAndParameterInterfaceMapping();
            ArrayList<VariableAndParameterInterfaceMappingWrapper> wrapperList = (ArrayList<VariableAndParameterInterfaceMappingWrapper>)originalList.stream()
                .map(item -> new VariableAndParameterInterfaceMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}