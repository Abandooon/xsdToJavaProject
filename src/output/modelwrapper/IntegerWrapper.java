package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Integer;


    
    

    
    

    
    


public class IntegerWrapper {

    
    private Integer integer1;

    public IntegerWrapper(Integer integer1) {
        this.integer1 = integer1;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(integer1.getValue())) {
            
            return integer1.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(integer1.getS())) {
            
            return integer1.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(integer1.getT())) {
            
            return integer1.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}