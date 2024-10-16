package stdgui.data.model.modelwrapper;


    
    

    
    


public class CompositeTypeMappingsWrapper {

    
    private CompositeTypeMappings compositeTypeMappings;

    public CompositeTypeMappingsWrapper(CompositeTypeMappings compositeTypeMappings) {
        this.compositeTypeMappings = compositeTypeMappings;
    }

   
    public ArrayList<ClientServerArrayTypeMappingWrapper> getClientServerArrayTypeMapping() {
        
        if (CollUtil.isNotEmpty(compositeTypeMappings.getClientServerArrayTypeMapping())) {
            ArrayList<ClientServerArrayTypeMapping> originalList = compositeTypeMappings.getClientServerArrayTypeMapping();
            ArrayList<ClientServerArrayTypeMappingWrapper> wrapperList = (ArrayList<ClientServerArrayTypeMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerArrayTypeMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerRecordTypeMappingWrapper> getClientServerRecordTypeMapping() {
        
        if (CollUtil.isNotEmpty(compositeTypeMappings.getClientServerRecordTypeMapping())) {
            ArrayList<ClientServerRecordTypeMapping> originalList = compositeTypeMappings.getClientServerRecordTypeMapping();
            ArrayList<ClientServerRecordTypeMappingWrapper> wrapperList = (ArrayList<ClientServerRecordTypeMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerRecordTypeMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}