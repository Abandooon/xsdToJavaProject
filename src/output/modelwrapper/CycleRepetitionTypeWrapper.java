package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CycleRepetitionTypeWrapper {

    
    private CycleRepetitionType cycleRepetitionType;

    public CycleRepetitionTypeWrapper(CycleRepetitionType cycleRepetitionType) {
        this.cycleRepetitionType = cycleRepetitionType;
    }

   
    public CycleRepetitionTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(cycleRepetitionType.getValue())) {
            
            return cycleRepetitionType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(cycleRepetitionType.getS())) {
            
            return cycleRepetitionType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(cycleRepetitionType.getT())) {
            
            return cycleRepetitionType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}