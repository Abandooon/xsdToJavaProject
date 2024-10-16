package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SomeipTransformerSessionHandlingEnumWrapper {

    
    private SomeipTransformerSessionHandlingEnum someipTransformerSessionHandlingEnum;

    public SomeipTransformerSessionHandlingEnumWrapper(SomeipTransformerSessionHandlingEnum someipTransformerSessionHandlingEnum) {
        this.someipTransformerSessionHandlingEnum = someipTransformerSessionHandlingEnum;
    }

   
    public SomeipTransformerSessionHandlingEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(someipTransformerSessionHandlingEnum.getValue())) {
            
            return someipTransformerSessionHandlingEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(someipTransformerSessionHandlingEnum.getS())) {
            
            return someipTransformerSessionHandlingEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(someipTransformerSessionHandlingEnum.getT())) {
            
            return someipTransformerSessionHandlingEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}