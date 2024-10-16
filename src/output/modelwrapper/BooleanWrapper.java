package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Boolean;


    
    

    
    

    
    


public class BooleanWrapper {

    
    private Boolean boolean1;

    public BooleanWrapper(Boolean boolean1) {
        this.boolean1 = boolean1;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(boolean1.getValue())) {
            
            return boolean1.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(boolean1.getS())) {
            
            return boolean1.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(boolean1.getT())) {
            
            return boolean1.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}