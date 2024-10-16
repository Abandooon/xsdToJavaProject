package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class CanNmEcuWrapper {

    
    private CanNmEcu canNmEcu;

    public CanNmEcuWrapper(CanNmEcu canNmEcu) {
        this.canNmEcu = canNmEcu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canNmEcu.getS())) {
            
            return canNmEcu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canNmEcu.getT())) {
            
            return canNmEcu.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmRepeatMsgIndicationEnabled() {
        
        if (CollUtil.isNotEmpty(canNmEcu.getNmRepeatMsgIndicationEnabled())) {
            
            return new BooleanWrapper(canNmEcu.getNmRepeatMsgIndicationEnabled());
            
        } else {
            return null;
        }
        
    }




    


    
}