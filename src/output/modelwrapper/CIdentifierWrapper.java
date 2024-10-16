package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class CIdentifierWrapper {

    
    private CIdentifier cIdentifier;

    public CIdentifierWrapper(CIdentifier cIdentifier) {
        this.cIdentifier = cIdentifier;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(cIdentifier.getValue())) {
            
            return cIdentifier.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(cIdentifier.getS())) {
            
            return cIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(cIdentifier.getT())) {
            
            return cIdentifier.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getNamePattern() {
        
        if (CollUtil.isNotEmpty(cIdentifier.getNamePattern())) {
            
            return cIdentifier.getNamePattern();
            
        } else {
            return null;
        }
        
    }




    


    
}