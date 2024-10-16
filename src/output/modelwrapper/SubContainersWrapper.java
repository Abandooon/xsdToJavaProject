package stdgui.data.model.modelwrapper;


    
    

    
    


public class SubContainersWrapper {

    
    private SubContainers subContainers;

    public SubContainersWrapper(SubContainers subContainers) {
        this.subContainers = subContainers;
    }

   
    public ArrayList<EcucChoiceContainerDefWrapper> getEcucChoiceContainerDef() {
        
        if (CollUtil.isNotEmpty(subContainers.getEcucChoiceContainerDef())) {
            ArrayList<EcucChoiceContainerDef> originalList = subContainers.getEcucChoiceContainerDef();
            ArrayList<EcucChoiceContainerDefWrapper> wrapperList = (ArrayList<EcucChoiceContainerDefWrapper>)originalList.stream()
                .map(item -> new EcucChoiceContainerDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucParamConfContainerDefWrapper> getEcucParamConfContainerDef() {
        
        if (CollUtil.isNotEmpty(subContainers.getEcucParamConfContainerDef())) {
            ArrayList<EcucParamConfContainerDef> originalList = subContainers.getEcucParamConfContainerDef();
            ArrayList<EcucParamConfContainerDefWrapper> wrapperList = (ArrayList<EcucParamConfContainerDefWrapper>)originalList.stream()
                .map(item -> new EcucParamConfContainerDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}