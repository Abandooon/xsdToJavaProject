package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ExecutionTimeTypeEnumWrapper {

    
    private ExecutionTimeTypeEnum executionTimeTypeEnum;

    public ExecutionTimeTypeEnumWrapper(ExecutionTimeTypeEnum executionTimeTypeEnum) {
        this.executionTimeTypeEnum = executionTimeTypeEnum;
    }

   
    public ExecutionTimeTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(executionTimeTypeEnum.getValue())) {
            
            return executionTimeTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(executionTimeTypeEnum.getS())) {
            
            return executionTimeTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(executionTimeTypeEnum.getT())) {
            
            return executionTimeTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}