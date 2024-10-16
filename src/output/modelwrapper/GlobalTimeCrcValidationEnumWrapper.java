package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class GlobalTimeCrcValidationEnumWrapper {

    
    private GlobalTimeCrcValidationEnum globalTimeCrcValidationEnum;

    public GlobalTimeCrcValidationEnumWrapper(GlobalTimeCrcValidationEnum globalTimeCrcValidationEnum) {
        this.globalTimeCrcValidationEnum = globalTimeCrcValidationEnum;
    }

   
    public GlobalTimeCrcValidationEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(globalTimeCrcValidationEnum.getValue())) {
            
            return globalTimeCrcValidationEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeCrcValidationEnum.getS())) {
            
            return globalTimeCrcValidationEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeCrcValidationEnum.getT())) {
            
            return globalTimeCrcValidationEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}