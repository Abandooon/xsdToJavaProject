package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CanFrameRxBehaviorEnumWrapper {

    
    private CanFrameRxBehaviorEnum canFrameRxBehaviorEnum;

    public CanFrameRxBehaviorEnumWrapper(CanFrameRxBehaviorEnum canFrameRxBehaviorEnum) {
        this.canFrameRxBehaviorEnum = canFrameRxBehaviorEnum;
    }

   
    public CanFrameRxBehaviorEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(canFrameRxBehaviorEnum.getValue())) {
            
            return canFrameRxBehaviorEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canFrameRxBehaviorEnum.getS())) {
            
            return canFrameRxBehaviorEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canFrameRxBehaviorEnum.getT())) {
            
            return canFrameRxBehaviorEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}