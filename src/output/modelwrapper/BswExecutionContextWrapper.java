package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class BswExecutionContextWrapper {

    
    private BswExecutionContext bswExecutionContext;

    public BswExecutionContextWrapper(BswExecutionContext bswExecutionContext) {
        this.bswExecutionContext = bswExecutionContext;
    }

   
    public BswExecutionContextSimple getValue() {
        
        if (CollUtil.isNotEmpty(bswExecutionContext.getValue())) {
            
            return bswExecutionContext.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswExecutionContext.getS())) {
            
            return bswExecutionContext.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswExecutionContext.getT())) {
            
            return bswExecutionContext.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}