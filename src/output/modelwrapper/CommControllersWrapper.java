package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class CommControllersWrapper {

    
    private CommControllers commControllers;

    public CommControllersWrapper(CommControllers commControllers) {
        this.commControllers = commControllers;
    }

   
    public ArrayList<CanCommunicationControllerWrapper> getCanCommunicationController() {
        
        if (CollUtil.isNotEmpty(commControllers.getCanCommunicationController())) {
            ArrayList<CanCommunicationController> originalList = commControllers.getCanCommunicationController();
            ArrayList<CanCommunicationControllerWrapper> wrapperList = (ArrayList<CanCommunicationControllerWrapper>)originalList.stream()
                .map(item -> new CanCommunicationControllerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EthernetCommunicationControllerWrapper> getEthernetCommunicationController() {
        
        if (CollUtil.isNotEmpty(commControllers.getEthernetCommunicationController())) {
            ArrayList<EthernetCommunicationController> originalList = commControllers.getEthernetCommunicationController();
            ArrayList<EthernetCommunicationControllerWrapper> wrapperList = (ArrayList<EthernetCommunicationControllerWrapper>)originalList.stream()
                .map(item -> new EthernetCommunicationControllerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayCommunicationControllerWrapper> getFlexrayCommunicationController() {
        
        if (CollUtil.isNotEmpty(commControllers.getFlexrayCommunicationController())) {
            ArrayList<FlexrayCommunicationController> originalList = commControllers.getFlexrayCommunicationController();
            ArrayList<FlexrayCommunicationControllerWrapper> wrapperList = (ArrayList<FlexrayCommunicationControllerWrapper>)originalList.stream()
                .map(item -> new FlexrayCommunicationControllerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinMasterWrapper> getLinMaster() {
        
        if (CollUtil.isNotEmpty(commControllers.getLinMaster())) {
            ArrayList<LinMaster> originalList = commControllers.getLinMaster();
            ArrayList<LinMasterWrapper> wrapperList = (ArrayList<LinMasterWrapper>)originalList.stream()
                .map(item -> new LinMasterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinSlaveWrapper> getLinSlave() {
        
        if (CollUtil.isNotEmpty(commControllers.getLinSlave())) {
            ArrayList<LinSlave> originalList = commControllers.getLinSlave();
            ArrayList<LinSlaveWrapper> wrapperList = (ArrayList<LinSlaveWrapper>)originalList.stream()
                .map(item -> new LinSlaveWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TtcanCommunicationControllerWrapper> getTtcanCommunicationController() {
        
        if (CollUtil.isNotEmpty(commControllers.getTtcanCommunicationController())) {
            ArrayList<TtcanCommunicationController> originalList = commControllers.getTtcanCommunicationController();
            ArrayList<TtcanCommunicationControllerWrapper> wrapperList = (ArrayList<TtcanCommunicationControllerWrapper>)originalList.stream()
                .map(item -> new TtcanCommunicationControllerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedCommunicationControllerWrapper> getUserDefinedCommunicationController() {
        
        if (CollUtil.isNotEmpty(commControllers.getUserDefinedCommunicationController())) {
            ArrayList<UserDefinedCommunicationController> originalList = commControllers.getUserDefinedCommunicationController();
            ArrayList<UserDefinedCommunicationControllerWrapper> wrapperList = (ArrayList<UserDefinedCommunicationControllerWrapper>)originalList.stream()
                .map(item -> new UserDefinedCommunicationControllerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}