package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NmClusterCouplingsWrapper {

    
    private NmClusterCouplings nmClusterCouplings;

    public NmClusterCouplingsWrapper(NmClusterCouplings nmClusterCouplings) {
        this.nmClusterCouplings = nmClusterCouplings;
    }

   
    public ArrayList<CanNmClusterCouplingWrapper> getCanNmClusterCoupling() {
        
        if (CollUtil.isNotEmpty(nmClusterCouplings.getCanNmClusterCoupling())) {
            ArrayList<CanNmClusterCoupling> originalList = nmClusterCouplings.getCanNmClusterCoupling();
            ArrayList<CanNmClusterCouplingWrapper> wrapperList = (ArrayList<CanNmClusterCouplingWrapper>)originalList.stream()
                .map(item -> new CanNmClusterCouplingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayNmClusterCouplingWrapper> getFlexrayNmClusterCoupling() {
        
        if (CollUtil.isNotEmpty(nmClusterCouplings.getFlexrayNmClusterCoupling())) {
            ArrayList<FlexrayNmClusterCoupling> originalList = nmClusterCouplings.getFlexrayNmClusterCoupling();
            ArrayList<FlexrayNmClusterCouplingWrapper> wrapperList = (ArrayList<FlexrayNmClusterCouplingWrapper>)originalList.stream()
                .map(item -> new FlexrayNmClusterCouplingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UdpNmClusterCouplingWrapper> getUdpNmClusterCoupling() {
        
        if (CollUtil.isNotEmpty(nmClusterCouplings.getUdpNmClusterCoupling())) {
            ArrayList<UdpNmClusterCoupling> originalList = nmClusterCouplings.getUdpNmClusterCoupling();
            ArrayList<UdpNmClusterCouplingWrapper> wrapperList = (ArrayList<UdpNmClusterCouplingWrapper>)originalList.stream()
                .map(item -> new UdpNmClusterCouplingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}