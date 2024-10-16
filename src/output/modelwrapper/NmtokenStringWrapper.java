package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NmtokenStringWrapper {

    
    private NmtokenString nmtokenString;

    public NmtokenStringWrapper(NmtokenString nmtokenString) {
        this.nmtokenString = nmtokenString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(nmtokenString.getValue())) {
            
            return nmtokenString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nmtokenString.getS())) {
            
            return nmtokenString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nmtokenString.getT())) {
            
            return nmtokenString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}