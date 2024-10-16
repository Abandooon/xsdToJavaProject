package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SupscriptWrapper {

    
    private Supscript supscript;

    public SupscriptWrapper(Supscript supscript) {
        this.supscript = supscript;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(supscript.getValue())) {
            
            return supscript.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(supscript.getS())) {
            
            return supscript.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(supscript.getT())) {
            
            return supscript.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}