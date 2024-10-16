package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ValignEnumWrapper {

    
    private ValignEnum valignEnum;

    public ValignEnumWrapper(ValignEnum valignEnum) {
        this.valignEnum = valignEnum;
    }

   
    public ValignEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(valignEnum.getValue())) {
            
            return valignEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(valignEnum.getS())) {
            
            return valignEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(valignEnum.getT())) {
            
            return valignEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}