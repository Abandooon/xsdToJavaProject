package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RunModeWrapper {

    
    private RunMode runMode;

    public RunModeWrapper(RunMode runMode) {
        this.runMode = runMode;
    }

   
    public RunModeSimple getValue() {
        
        if (CollUtil.isNotEmpty(runMode.getValue())) {
            
            return runMode.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(runMode.getS())) {
            
            return runMode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(runMode.getT())) {
            
            return runMode.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}