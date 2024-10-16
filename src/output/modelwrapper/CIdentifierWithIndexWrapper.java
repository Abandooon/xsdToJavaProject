package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CIdentifierWithIndexWrapper {

    
    private CIdentifierWithIndex cIdentifierWithIndex;

    public CIdentifierWithIndexWrapper(CIdentifierWithIndex cIdentifierWithIndex) {
        this.cIdentifierWithIndex = cIdentifierWithIndex;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(cIdentifierWithIndex.getValue())) {
            
            return cIdentifierWithIndex.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(cIdentifierWithIndex.getS())) {
            
            return cIdentifierWithIndex.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(cIdentifierWithIndex.getT())) {
            
            return cIdentifierWithIndex.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}