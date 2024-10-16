package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class PortsWrapper {

    
    private Ports ports;

    public PortsWrapper(Ports ports) {
        this.ports = ports;
    }

   
    public ArrayList<PPortPrototypeWrapper> getPPortPrototype() {
        
        if (CollUtil.isNotEmpty(ports.getPPortPrototype())) {
            ArrayList<PPortPrototype> originalList = ports.getPPortPrototype();
            ArrayList<PPortPrototypeWrapper> wrapperList = (ArrayList<PPortPrototypeWrapper>)originalList.stream()
                .map(item -> new PPortPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PrPortPrototypeWrapper> getPrPortPrototype() {
        
        if (CollUtil.isNotEmpty(ports.getPrPortPrototype())) {
            ArrayList<PrPortPrototype> originalList = ports.getPrPortPrototype();
            ArrayList<PrPortPrototypeWrapper> wrapperList = (ArrayList<PrPortPrototypeWrapper>)originalList.stream()
                .map(item -> new PrPortPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RPortPrototypeWrapper> getRPortPrototype() {
        
        if (CollUtil.isNotEmpty(ports.getRPortPrototype())) {
            ArrayList<RPortPrototype> originalList = ports.getRPortPrototype();
            ArrayList<RPortPrototypeWrapper> wrapperList = (ArrayList<RPortPrototypeWrapper>)originalList.stream()
                .map(item -> new RPortPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}