package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class FrArTpAckTypeWrapper {

    
    private FrArTpAckType frArTpAckType;

    public FrArTpAckTypeWrapper(FrArTpAckType frArTpAckType) {
        this.frArTpAckType = frArTpAckType;
    }

   
    public FrArTpAckTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(frArTpAckType.getValue())) {
            
            return frArTpAckType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(frArTpAckType.getS())) {
            
            return frArTpAckType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(frArTpAckType.getT())) {
            
            return frArTpAckType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}