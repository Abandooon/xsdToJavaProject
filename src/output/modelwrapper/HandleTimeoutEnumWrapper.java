package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class HandleTimeoutEnumWrapper {

    
    private HandleTimeoutEnum handleTimeoutEnum;

    public HandleTimeoutEnumWrapper(HandleTimeoutEnum handleTimeoutEnum) {
        this.handleTimeoutEnum = handleTimeoutEnum;
    }

   
    public HandleTimeoutEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(handleTimeoutEnum.getValue())) {
            
            return handleTimeoutEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(handleTimeoutEnum.getS())) {
            
            return handleTimeoutEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(handleTimeoutEnum.getT())) {
            
            return handleTimeoutEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}