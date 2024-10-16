package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class SwcToSwcOperationArgumentsWrapper {

    
    private SwcToSwcOperationArguments swcToSwcOperationArguments;

    public SwcToSwcOperationArgumentsWrapper(SwcToSwcOperationArguments swcToSwcOperationArguments) {
        this.swcToSwcOperationArguments = swcToSwcOperationArguments;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcToSwcOperationArguments.getS())) {
            
            return swcToSwcOperationArguments.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcToSwcOperationArguments.getT())) {
            
            return swcToSwcOperationArguments.getT();
            
        } else {
            return null;
        }
        
    }

    public SwcToSwcOperationArgumentsDirectionEnumWrapper getDirection() {
        
        if (CollUtil.isNotEmpty(swcToSwcOperationArguments.getDirection())) {
            
            return new SwcToSwcOperationArgumentsDirectionEnumWrapper(swcToSwcOperationArguments.getDirection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<OperationInSystemInstanceRefWrapper> getOperationIrefs() {
        
        if (CollUtil.isNotEmpty(swcToSwcOperationArguments.getOperationIrefs())) {
            ArrayList<OperationInSystemInstanceRef> originalList = swcToSwcOperationArguments.getOperationIrefs();
            ArrayList<OperationInSystemInstanceRefWrapper> wrapperList = (ArrayList<OperationInSystemInstanceRefWrapper>)originalList.stream()
                .map(item -> new OperationInSystemInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}