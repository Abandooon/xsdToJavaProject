package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class SymbolStringWrapper {

    
    private SymbolString symbolString;

    public SymbolStringWrapper(SymbolString symbolString) {
        this.symbolString = symbolString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(symbolString.getValue())) {
            
            return symbolString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(symbolString.getS())) {
            
            return symbolString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(symbolString.getT())) {
            
            return symbolString.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getNamePattern() {
        
        if (CollUtil.isNotEmpty(symbolString.getNamePattern())) {
            
            return symbolString.getNamePattern();
            
        } else {
            return null;
        }
        
    }




    


    
}