package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Float;


    
    

    
    

    
    


public class FloatWrapper {

    
    private Float float1;

    public FloatWrapper(Float float1) {
        this.float1 = float1;
    }

   
    public java.lang.Double getValue() {
        
        if (CollUtil.isNotEmpty(float1.getValue())) {
            
            return float1.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(float1.getS())) {
            
            return float1.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(float1.getT())) {
            
            return float1.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}