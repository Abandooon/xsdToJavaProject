package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class UriStringWrapper {

    
    private UriString uriString;

    public UriStringWrapper(UriString uriString) {
        this.uriString = uriString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(uriString.getValue())) {
            
            return uriString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(uriString.getS())) {
            
            return uriString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(uriString.getT())) {
            
            return uriString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}