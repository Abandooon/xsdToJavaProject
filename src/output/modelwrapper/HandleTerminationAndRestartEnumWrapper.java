package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class HandleTerminationAndRestartEnumWrapper {

    
    private HandleTerminationAndRestartEnum handleTerminationAndRestartEnum;

    public HandleTerminationAndRestartEnumWrapper(HandleTerminationAndRestartEnum handleTerminationAndRestartEnum) {
        this.handleTerminationAndRestartEnum = handleTerminationAndRestartEnum;
    }

   
    public HandleTerminationAndRestartEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(handleTerminationAndRestartEnum.getValue())) {
            
            return handleTerminationAndRestartEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(handleTerminationAndRestartEnum.getS())) {
            
            return handleTerminationAndRestartEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(handleTerminationAndRestartEnum.getT())) {
            
            return handleTerminationAndRestartEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}