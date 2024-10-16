package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class CycleRepetitionWrapper {

    
    private CycleRepetition cycleRepetition;

    public CycleRepetitionWrapper(CycleRepetition cycleRepetition) {
        this.cycleRepetition = cycleRepetition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(cycleRepetition.getS())) {
            
            return cycleRepetition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(cycleRepetition.getT())) {
            
            return cycleRepetition.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getBaseCycle() {
        
        if (CollUtil.isNotEmpty(cycleRepetition.getBaseCycle())) {
            
            return new IntegerWrapper(cycleRepetition.getBaseCycle());
            
        } else {
            return null;
        }
        
    }

    public CycleRepetitionTypeWrapper getCycleRepetition() {
        
        if (CollUtil.isNotEmpty(cycleRepetition.getCycleRepetition())) {
            
            return new CycleRepetitionTypeWrapper(cycleRepetition.getCycleRepetition());
            
        } else {
            return null;
        }
        
    }




    


    
}