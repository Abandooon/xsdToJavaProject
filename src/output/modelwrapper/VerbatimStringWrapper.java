package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class VerbatimStringWrapper {

    
    private VerbatimString verbatimString;

    public VerbatimStringWrapper(VerbatimString verbatimString) {
        this.verbatimString = verbatimString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(verbatimString.getValue())) {
            
            return verbatimString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(verbatimString.getS())) {
            
            return verbatimString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(verbatimString.getT())) {
            
            return verbatimString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}