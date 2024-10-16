package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ExtIdClassEnumWrapper {

    
    private ExtIdClassEnum extIdClassEnum;

    public ExtIdClassEnumWrapper(ExtIdClassEnum extIdClassEnum) {
        this.extIdClassEnum = extIdClassEnum;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(extIdClassEnum.getValue())) {
            
            return extIdClassEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(extIdClassEnum.getS())) {
            
            return extIdClassEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(extIdClassEnum.getT())) {
            
            return extIdClassEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}