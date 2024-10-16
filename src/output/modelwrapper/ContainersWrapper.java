package stdgui.data.model.modelwrapper;


    
    

    
    


public class ContainersWrapper {

    
    private Containers containers;

    public ContainersWrapper(Containers containers) {
        this.containers = containers;
    }

   
    public ArrayList<EcucChoiceContainerDefWrapper> getEcucChoiceContainerDef() {
        
        if (CollUtil.isNotEmpty(containers.getEcucChoiceContainerDef())) {
            ArrayList<EcucChoiceContainerDef> originalList = containers.getEcucChoiceContainerDef();
            ArrayList<EcucChoiceContainerDefWrapper> wrapperList = (ArrayList<EcucChoiceContainerDefWrapper>)originalList.stream()
                .map(item -> new EcucChoiceContainerDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucParamConfContainerDefWrapper> getEcucParamConfContainerDef() {
        
        if (CollUtil.isNotEmpty(containers.getEcucParamConfContainerDef())) {
            ArrayList<EcucParamConfContainerDef> originalList = containers.getEcucParamConfContainerDef();
            ArrayList<EcucParamConfContainerDefWrapper> wrapperList = (ArrayList<EcucParamConfContainerDefWrapper>)originalList.stream()
                .map(item -> new EcucParamConfContainerDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}