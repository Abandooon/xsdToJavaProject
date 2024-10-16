package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class BusDependentNmEcusWrapper {

    
    private BusDependentNmEcus busDependentNmEcus;

    public BusDependentNmEcusWrapper(BusDependentNmEcus busDependentNmEcus) {
        this.busDependentNmEcus = busDependentNmEcus;
    }

   
    public ArrayList<CanNmEcuWrapper> getCanNmEcu() {
        
        if (CollUtil.isNotEmpty(busDependentNmEcus.getCanNmEcu())) {
            ArrayList<CanNmEcu> originalList = busDependentNmEcus.getCanNmEcu();
            ArrayList<CanNmEcuWrapper> wrapperList = (ArrayList<CanNmEcuWrapper>)originalList.stream()
                .map(item -> new CanNmEcuWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayNmEcuWrapper> getFlexrayNmEcu() {
        
        if (CollUtil.isNotEmpty(busDependentNmEcus.getFlexrayNmEcu())) {
            ArrayList<FlexrayNmEcu> originalList = busDependentNmEcus.getFlexrayNmEcu();
            ArrayList<FlexrayNmEcuWrapper> wrapperList = (ArrayList<FlexrayNmEcuWrapper>)originalList.stream()
                .map(item -> new FlexrayNmEcuWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939NmEcuWrapper> getJ1939NmEcu() {
        
        if (CollUtil.isNotEmpty(busDependentNmEcus.getJ1939NmEcu())) {
            ArrayList<J1939NmEcu> originalList = busDependentNmEcus.getJ1939NmEcu();
            ArrayList<J1939NmEcuWrapper> wrapperList = (ArrayList<J1939NmEcuWrapper>)originalList.stream()
                .map(item -> new J1939NmEcuWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UdpNmEcuWrapper> getUdpNmEcu() {
        
        if (CollUtil.isNotEmpty(busDependentNmEcus.getUdpNmEcu())) {
            ArrayList<UdpNmEcu> originalList = busDependentNmEcus.getUdpNmEcu();
            ArrayList<UdpNmEcuWrapper> wrapperList = (ArrayList<UdpNmEcuWrapper>)originalList.stream()
                .map(item -> new UdpNmEcuWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}