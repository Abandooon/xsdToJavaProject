package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class FloatEnumWrapper {

    
    private FloatEnum floatEnum;

    public FloatEnumWrapper(FloatEnum floatEnum) {
        this.floatEnum = floatEnum;
    }

   
    public FloatEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(floatEnum.getValue())) {
            
            return floatEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(floatEnum.getS())) {
            
            return floatEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(floatEnum.getT())) {
            
            return floatEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}