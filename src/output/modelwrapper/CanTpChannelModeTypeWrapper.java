package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CanTpChannelModeTypeWrapper {

    
    private CanTpChannelModeType canTpChannelModeType;

    public CanTpChannelModeTypeWrapper(CanTpChannelModeType canTpChannelModeType) {
        this.canTpChannelModeType = canTpChannelModeType;
    }

   
    public CanTpChannelModeTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(canTpChannelModeType.getValue())) {
            
            return canTpChannelModeType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canTpChannelModeType.getS())) {
            
            return canTpChannelModeType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canTpChannelModeType.getT())) {
            
            return canTpChannelModeType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}