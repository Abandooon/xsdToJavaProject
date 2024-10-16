package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class BaseTypeEncodingStringWrapper {

    
    private BaseTypeEncodingString baseTypeEncodingString;

    public BaseTypeEncodingStringWrapper(BaseTypeEncodingString baseTypeEncodingString) {
        this.baseTypeEncodingString = baseTypeEncodingString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(baseTypeEncodingString.getValue())) {
            
            return baseTypeEncodingString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(baseTypeEncodingString.getS())) {
            
            return baseTypeEncodingString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(baseTypeEncodingString.getT())) {
            
            return baseTypeEncodingString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}