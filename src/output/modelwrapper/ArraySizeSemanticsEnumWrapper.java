package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ArraySizeSemanticsEnumWrapper {

    
    private ArraySizeSemanticsEnum arraySizeSemanticsEnum;

    public ArraySizeSemanticsEnumWrapper(ArraySizeSemanticsEnum arraySizeSemanticsEnum) {
        this.arraySizeSemanticsEnum = arraySizeSemanticsEnum;
    }

   
    public ArraySizeSemanticsEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(arraySizeSemanticsEnum.getValue())) {
            
            return arraySizeSemanticsEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(arraySizeSemanticsEnum.getS())) {
            
            return arraySizeSemanticsEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(arraySizeSemanticsEnum.getT())) {
            
            return arraySizeSemanticsEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}