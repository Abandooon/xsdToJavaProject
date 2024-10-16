package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class HandleOutOfRangeStatusEnumWrapper {

    
    private HandleOutOfRangeStatusEnum handleOutOfRangeStatusEnum;

    public HandleOutOfRangeStatusEnumWrapper(HandleOutOfRangeStatusEnum handleOutOfRangeStatusEnum) {
        this.handleOutOfRangeStatusEnum = handleOutOfRangeStatusEnum;
    }

   
    public HandleOutOfRangeStatusEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(handleOutOfRangeStatusEnum.getValue())) {
            
            return handleOutOfRangeStatusEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(handleOutOfRangeStatusEnum.getS())) {
            
            return handleOutOfRangeStatusEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(handleOutOfRangeStatusEnum.getT())) {
            
            return handleOutOfRangeStatusEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}