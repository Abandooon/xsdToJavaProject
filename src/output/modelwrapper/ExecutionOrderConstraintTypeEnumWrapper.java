package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ExecutionOrderConstraintTypeEnumWrapper {

    
    private ExecutionOrderConstraintTypeEnum executionOrderConstraintTypeEnum;

    public ExecutionOrderConstraintTypeEnumWrapper(ExecutionOrderConstraintTypeEnum executionOrderConstraintTypeEnum) {
        this.executionOrderConstraintTypeEnum = executionOrderConstraintTypeEnum;
    }

   
    public ExecutionOrderConstraintTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraintTypeEnum.getValue())) {
            
            return executionOrderConstraintTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraintTypeEnum.getS())) {
            
            return executionOrderConstraintTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraintTypeEnum.getT())) {
            
            return executionOrderConstraintTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}