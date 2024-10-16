package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class HandleInvalidEnumWrapper {

    
    private HandleInvalidEnum handleInvalidEnum;

    public HandleInvalidEnumWrapper(HandleInvalidEnum handleInvalidEnum) {
        this.handleInvalidEnum = handleInvalidEnum;
    }

   
    public HandleInvalidEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(handleInvalidEnum.getValue())) {
            
            return handleInvalidEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(handleInvalidEnum.getS())) {
            
            return handleInvalidEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(handleInvalidEnum.getT())) {
            
            return handleInvalidEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}