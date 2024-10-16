package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TtcanTriggerTypeWrapper {

    
    private TtcanTriggerType ttcanTriggerType;

    public TtcanTriggerTypeWrapper(TtcanTriggerType ttcanTriggerType) {
        this.ttcanTriggerType = ttcanTriggerType;
    }

   
    public TtcanTriggerTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(ttcanTriggerType.getValue())) {
            
            return ttcanTriggerType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ttcanTriggerType.getS())) {
            
            return ttcanTriggerType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ttcanTriggerType.getT())) {
            
            return ttcanTriggerType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}