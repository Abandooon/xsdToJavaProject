package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class CycleCounterWrapper {

    
    private CycleCounter cycleCounter;

    public CycleCounterWrapper(CycleCounter cycleCounter) {
        this.cycleCounter = cycleCounter;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(cycleCounter.getS())) {
            
            return cycleCounter.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(cycleCounter.getT())) {
            
            return cycleCounter.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCycleCounter() {
        
        if (CollUtil.isNotEmpty(cycleCounter.getCycleCounter())) {
            
            return new IntegerWrapper(cycleCounter.getCycleCounter());
            
        } else {
            return null;
        }
        
    }




    


    
}