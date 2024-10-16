package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class VerbatimStringPlainWrapper {

    
    private VerbatimStringPlain verbatimStringPlain;

    public VerbatimStringPlainWrapper(VerbatimStringPlain verbatimStringPlain) {
        this.verbatimStringPlain = verbatimStringPlain;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(verbatimStringPlain.getValue())) {
            
            return verbatimStringPlain.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(verbatimStringPlain.getS())) {
            
            return verbatimStringPlain.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(verbatimStringPlain.getT())) {
            
            return verbatimStringPlain.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}