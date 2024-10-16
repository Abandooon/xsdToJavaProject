package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NmtokensStringWrapper {

    
    private NmtokensString nmtokensString;

    public NmtokensStringWrapper(NmtokensString nmtokensString) {
        this.nmtokensString = nmtokensString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(nmtokensString.getValue())) {
            
            return nmtokensString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nmtokensString.getS())) {
            
            return nmtokensString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nmtokensString.getT())) {
            
            return nmtokensString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}