package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class SdWrapper {

    
    private Sd sd;

    public SdWrapper(Sd sd) {
        this.sd = sd;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(sd.getValue())) {
            
            return sd.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sd.getS())) {
            
            return sd.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sd.getT())) {
            
            return sd.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getGid() {
        
        if (CollUtil.isNotEmpty(sd.getGid())) {
            
            return sd.getGid();
            
        } else {
            return null;
        }
        
    }




    


    
}