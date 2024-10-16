package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class BswCallTypeWrapper {

    
    private BswCallType bswCallType;

    public BswCallTypeWrapper(BswCallType bswCallType) {
        this.bswCallType = bswCallType;
    }

   
    public BswCallTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(bswCallType.getValue())) {
            
            return bswCallType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswCallType.getS())) {
            
            return bswCallType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswCallType.getT())) {
            
            return bswCallType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}