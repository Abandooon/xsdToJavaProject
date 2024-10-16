package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EcuCommPortInstancesWrapper {

    
    private EcuCommPortInstances ecuCommPortInstances;

    public EcuCommPortInstancesWrapper(EcuCommPortInstances ecuCommPortInstances) {
        this.ecuCommPortInstances = ecuCommPortInstances;
    }

   
    public ArrayList<FramePortWrapper> getFramePort() {
        
        if (CollUtil.isNotEmpty(ecuCommPortInstances.getFramePort())) {
            ArrayList<FramePort> originalList = ecuCommPortInstances.getFramePort();
            ArrayList<FramePortWrapper> wrapperList = (ArrayList<FramePortWrapper>)originalList.stream()
                .map(item -> new FramePortWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<IPduPortWrapper> getIPduPort() {
        
        if (CollUtil.isNotEmpty(ecuCommPortInstances.getIPduPort())) {
            ArrayList<IPduPort> originalList = ecuCommPortInstances.getIPduPort();
            ArrayList<IPduPortWrapper> wrapperList = (ArrayList<IPduPortWrapper>)originalList.stream()
                .map(item -> new IPduPortWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalPortWrapper> getISignalPort() {
        
        if (CollUtil.isNotEmpty(ecuCommPortInstances.getISignalPort())) {
            ArrayList<ISignalPort> originalList = ecuCommPortInstances.getISignalPort();
            ArrayList<ISignalPortWrapper> wrapperList = (ArrayList<ISignalPortWrapper>)originalList.stream()
                .map(item -> new ISignalPortWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}