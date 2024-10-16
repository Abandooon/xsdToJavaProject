package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class BusSpecificNmEcuWrapper {

    
    private BusSpecificNmEcu busSpecificNmEcu;

    public BusSpecificNmEcuWrapper(BusSpecificNmEcu busSpecificNmEcu) {
        this.busSpecificNmEcu = busSpecificNmEcu;
    }

   
    public CanNmEcuWrapper getCanNmEcu() {
        
        if (CollUtil.isNotEmpty(busSpecificNmEcu.getCanNmEcu())) {
            
            return new CanNmEcuWrapper(busSpecificNmEcu.getCanNmEcu());
            
        } else {
            return null;
        }
        
    }

    public FlexrayNmEcuWrapper getFlexrayNmEcu() {
        
        if (CollUtil.isNotEmpty(busSpecificNmEcu.getFlexrayNmEcu())) {
            
            return new FlexrayNmEcuWrapper(busSpecificNmEcu.getFlexrayNmEcu());
            
        } else {
            return null;
        }
        
    }

    public J1939NmEcuWrapper getJ1939NmEcu() {
        
        if (CollUtil.isNotEmpty(busSpecificNmEcu.getJ1939NmEcu())) {
            
            return new J1939NmEcuWrapper(busSpecificNmEcu.getJ1939NmEcu());
            
        } else {
            return null;
        }
        
    }

    public UdpNmEcuWrapper getUdpNmEcu() {
        
        if (CollUtil.isNotEmpty(busSpecificNmEcu.getUdpNmEcu())) {
            
            return new UdpNmEcuWrapper(busSpecificNmEcu.getUdpNmEcu());
            
        } else {
            return null;
        }
        
    }




    


    
}