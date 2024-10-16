package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SlavesWrapper {

    
    private Slaves slaves;

    public SlavesWrapper(Slaves slaves) {
        this.slaves = slaves;
    }

   
    public ArrayList<GlobalTimeCanSlaveWrapper> getGlobalTimeCanSlave() {
        
        if (CollUtil.isNotEmpty(slaves.getGlobalTimeCanSlave())) {
            ArrayList<GlobalTimeCanSlave> originalList = slaves.getGlobalTimeCanSlave();
            ArrayList<GlobalTimeCanSlaveWrapper> wrapperList = (ArrayList<GlobalTimeCanSlaveWrapper>)originalList.stream()
                .map(item -> new GlobalTimeCanSlaveWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<GlobalTimeEthSlaveWrapper> getGlobalTimeEthSlave() {
        
        if (CollUtil.isNotEmpty(slaves.getGlobalTimeEthSlave())) {
            ArrayList<GlobalTimeEthSlave> originalList = slaves.getGlobalTimeEthSlave();
            ArrayList<GlobalTimeEthSlaveWrapper> wrapperList = (ArrayList<GlobalTimeEthSlaveWrapper>)originalList.stream()
                .map(item -> new GlobalTimeEthSlaveWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<GlobalTimeFrSlaveWrapper> getGlobalTimeFrSlave() {
        
        if (CollUtil.isNotEmpty(slaves.getGlobalTimeFrSlave())) {
            ArrayList<GlobalTimeFrSlave> originalList = slaves.getGlobalTimeFrSlave();
            ArrayList<GlobalTimeFrSlaveWrapper> wrapperList = (ArrayList<GlobalTimeFrSlaveWrapper>)originalList.stream()
                .map(item -> new GlobalTimeFrSlaveWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}