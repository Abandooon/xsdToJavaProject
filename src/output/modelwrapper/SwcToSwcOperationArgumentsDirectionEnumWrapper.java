package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwcToSwcOperationArgumentsDirectionEnumWrapper {

    
    private SwcToSwcOperationArgumentsDirectionEnum swcToSwcOperationArgumentsDirectionEnum;

    public SwcToSwcOperationArgumentsDirectionEnumWrapper(SwcToSwcOperationArgumentsDirectionEnum swcToSwcOperationArgumentsDirectionEnum) {
        this.swcToSwcOperationArgumentsDirectionEnum = swcToSwcOperationArgumentsDirectionEnum;
    }

   
    public SwcToSwcOperationArgumentsDirectionEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(swcToSwcOperationArgumentsDirectionEnum.getValue())) {
            
            return swcToSwcOperationArgumentsDirectionEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcToSwcOperationArgumentsDirectionEnum.getS())) {
            
            return swcToSwcOperationArgumentsDirectionEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcToSwcOperationArgumentsDirectionEnum.getT())) {
            
            return swcToSwcOperationArgumentsDirectionEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}