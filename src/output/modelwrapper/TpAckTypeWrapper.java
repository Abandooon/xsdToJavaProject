package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TpAckTypeWrapper {

    
    private TpAckType tpAckType;

    public TpAckTypeWrapper(TpAckType tpAckType) {
        this.tpAckType = tpAckType;
    }

   
    public TpAckTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(tpAckType.getValue())) {
            
            return tpAckType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tpAckType.getS())) {
            
            return tpAckType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tpAckType.getT())) {
            
            return tpAckType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}