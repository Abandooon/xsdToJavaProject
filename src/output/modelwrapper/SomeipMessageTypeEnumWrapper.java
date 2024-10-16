package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SomeipMessageTypeEnumWrapper {

    
    private SomeipMessageTypeEnum someipMessageTypeEnum;

    public SomeipMessageTypeEnumWrapper(SomeipMessageTypeEnum someipMessageTypeEnum) {
        this.someipMessageTypeEnum = someipMessageTypeEnum;
    }

   
    public SomeipMessageTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(someipMessageTypeEnum.getValue())) {
            
            return someipMessageTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(someipMessageTypeEnum.getS())) {
            
            return someipMessageTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(someipMessageTypeEnum.getT())) {
            
            return someipMessageTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}