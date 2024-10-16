package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ByteOrderEnumWrapper {

    
    private ByteOrderEnum byteOrderEnum;

    public ByteOrderEnumWrapper(ByteOrderEnum byteOrderEnum) {
        this.byteOrderEnum = byteOrderEnum;
    }

   
    public ByteOrderEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(byteOrderEnum.getValue())) {
            
            return byteOrderEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(byteOrderEnum.getS())) {
            
            return byteOrderEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(byteOrderEnum.getT())) {
            
            return byteOrderEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}