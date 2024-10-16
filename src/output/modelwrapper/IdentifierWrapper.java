package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class IdentifierWrapper {

    
    private Identifier identifier;

    public IdentifierWrapper(Identifier identifier) {
        this.identifier = identifier;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(identifier.getValue())) {
            
            return identifier.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(identifier.getS())) {
            
            return identifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(identifier.getT())) {
            
            return identifier.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getNamePattern() {
        
        if (CollUtil.isNotEmpty(identifier.getNamePattern())) {
            
            return identifier.getNamePattern();
            
        } else {
            return null;
        }
        
    }




    


    
}