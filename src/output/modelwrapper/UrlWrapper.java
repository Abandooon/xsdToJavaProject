package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class UrlWrapper {

    
    private Url url;

    public UrlWrapper(Url url) {
        this.url = url;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(url.getValue())) {
            
            return url.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(url.getS())) {
            
            return url.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(url.getT())) {
            
            return url.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getMimeType() {
        
        if (CollUtil.isNotEmpty(url.getMimeType())) {
            
            return url.getMimeType();
            
        } else {
            return null;
        }
        
    }




    


    
}