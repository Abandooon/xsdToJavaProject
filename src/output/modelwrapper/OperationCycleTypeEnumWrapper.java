package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class OperationCycleTypeEnumWrapper {

    
    private OperationCycleTypeEnum operationCycleTypeEnum;

    public OperationCycleTypeEnumWrapper(OperationCycleTypeEnum operationCycleTypeEnum) {
        this.operationCycleTypeEnum = operationCycleTypeEnum;
    }

   
    public OperationCycleTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(operationCycleTypeEnum.getValue())) {
            
            return operationCycleTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(operationCycleTypeEnum.getS())) {
            
            return operationCycleTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(operationCycleTypeEnum.getT())) {
            
            return operationCycleTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}