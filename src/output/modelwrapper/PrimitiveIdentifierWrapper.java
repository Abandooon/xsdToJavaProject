package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class PrimitiveIdentifierWrapper {

    
    private PrimitiveIdentifier primitiveIdentifier;

    public PrimitiveIdentifierWrapper(PrimitiveIdentifier primitiveIdentifier) {
        this.primitiveIdentifier = primitiveIdentifier;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(primitiveIdentifier.getValue())) {
            
            return primitiveIdentifier.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(primitiveIdentifier.getS())) {
            
            return primitiveIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(primitiveIdentifier.getT())) {
            
            return primitiveIdentifier.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}