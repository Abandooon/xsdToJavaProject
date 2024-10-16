package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class BlueprintMapsWrapper {

    
    private BlueprintMaps blueprintMaps;

    public BlueprintMapsWrapper(BlueprintMaps blueprintMaps) {
        this.blueprintMaps = blueprintMaps;
    }

   
    public ArrayList<BlueprintMappingWrapper> getBlueprintMapping() {
        
        if (CollUtil.isNotEmpty(blueprintMaps.getBlueprintMapping())) {
            ArrayList<BlueprintMapping> originalList = blueprintMaps.getBlueprintMapping();
            ArrayList<BlueprintMappingWrapper> wrapperList = (ArrayList<BlueprintMappingWrapper>)originalList.stream()
                .map(item -> new BlueprintMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PortInterfaceBlueprintMappingWrapper> getPortInterfaceBlueprintMapping() {
        
        if (CollUtil.isNotEmpty(blueprintMaps.getPortInterfaceBlueprintMapping())) {
            ArrayList<PortInterfaceBlueprintMapping> originalList = blueprintMaps.getPortInterfaceBlueprintMapping();
            ArrayList<PortInterfaceBlueprintMappingWrapper> wrapperList = (ArrayList<PortInterfaceBlueprintMappingWrapper>)originalList.stream()
                .map(item -> new PortInterfaceBlueprintMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PortPrototypeBlueprintMappingWrapper> getPortPrototypeBlueprintMapping() {
        
        if (CollUtil.isNotEmpty(blueprintMaps.getPortPrototypeBlueprintMapping())) {
            ArrayList<PortPrototypeBlueprintMapping> originalList = blueprintMaps.getPortPrototypeBlueprintMapping();
            ArrayList<PortPrototypeBlueprintMappingWrapper> wrapperList = (ArrayList<PortPrototypeBlueprintMappingWrapper>)originalList.stream()
                .map(item -> new PortPrototypeBlueprintMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}