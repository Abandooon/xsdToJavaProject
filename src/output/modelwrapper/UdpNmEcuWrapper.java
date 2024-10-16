package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class UdpNmEcuWrapper {

    
    private UdpNmEcu udpNmEcu;

    public UdpNmEcuWrapper(UdpNmEcu udpNmEcu) {
        this.udpNmEcu = udpNmEcu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(udpNmEcu.getS())) {
            
            return udpNmEcu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(udpNmEcu.getT())) {
            
            return udpNmEcu.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmRepeatMsgIndicationEnabled() {
        
        if (CollUtil.isNotEmpty(udpNmEcu.getNmRepeatMsgIndicationEnabled())) {
            
            return new BooleanWrapper(udpNmEcu.getNmRepeatMsgIndicationEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmSynchronizationPointEnabled() {
        
        if (CollUtil.isNotEmpty(udpNmEcu.getNmSynchronizationPointEnabled())) {
            
            return new BooleanWrapper(udpNmEcu.getNmSynchronizationPointEnabled());
            
        } else {
            return null;
        }
        
    }




    


    
}