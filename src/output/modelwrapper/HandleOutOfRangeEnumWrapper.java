package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class HandleOutOfRangeEnumWrapper {

    
    private HandleOutOfRangeEnum handleOutOfRangeEnum;

    public HandleOutOfRangeEnumWrapper(HandleOutOfRangeEnum handleOutOfRangeEnum) {
        this.handleOutOfRangeEnum = handleOutOfRangeEnum;
    }

   
    public HandleOutOfRangeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(handleOutOfRangeEnum.getValue())) {
            
            return handleOutOfRangeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(handleOutOfRangeEnum.getS())) {
            
            return handleOutOfRangeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(handleOutOfRangeEnum.getT())) {
            
            return handleOutOfRangeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}