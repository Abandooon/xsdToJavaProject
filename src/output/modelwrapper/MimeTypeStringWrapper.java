package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MimeTypeStringWrapper {

    
    private MimeTypeString mimeTypeString;

    public MimeTypeStringWrapper(MimeTypeString mimeTypeString) {
        this.mimeTypeString = mimeTypeString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(mimeTypeString.getValue())) {
            
            return mimeTypeString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mimeTypeString.getS())) {
            
            return mimeTypeString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mimeTypeString.getT())) {
            
            return mimeTypeString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}