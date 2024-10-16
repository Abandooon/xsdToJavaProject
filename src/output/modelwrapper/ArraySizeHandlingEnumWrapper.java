package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ArraySizeHandlingEnumWrapper {

    
    private ArraySizeHandlingEnum arraySizeHandlingEnum;

    public ArraySizeHandlingEnumWrapper(ArraySizeHandlingEnum arraySizeHandlingEnum) {
        this.arraySizeHandlingEnum = arraySizeHandlingEnum;
    }

   
    public ArraySizeHandlingEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(arraySizeHandlingEnum.getValue())) {
            
            return arraySizeHandlingEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(arraySizeHandlingEnum.getS())) {
            
            return arraySizeHandlingEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(arraySizeHandlingEnum.getT())) {
            
            return arraySizeHandlingEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}