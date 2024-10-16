package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TtWrapper {

    
    private Tt tt;

    public TtWrapper(Tt tt) {
        this.tt = tt;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(tt.getValue())) {
            
            return tt.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tt.getS())) {
            
            return tt.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tt.getT())) {
            
            return tt.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getType() {
        
        if (CollUtil.isNotEmpty(tt.getType())) {
            
            return tt.getType();
            
        } else {
            return null;
        }
        
    }




    


    
}