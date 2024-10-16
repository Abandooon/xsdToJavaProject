package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CanFrameTxBehaviorEnumWrapper {

    
    private CanFrameTxBehaviorEnum canFrameTxBehaviorEnum;

    public CanFrameTxBehaviorEnumWrapper(CanFrameTxBehaviorEnum canFrameTxBehaviorEnum) {
        this.canFrameTxBehaviorEnum = canFrameTxBehaviorEnum;
    }

   
    public CanFrameTxBehaviorEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(canFrameTxBehaviorEnum.getValue())) {
            
            return canFrameTxBehaviorEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canFrameTxBehaviorEnum.getS())) {
            
            return canFrameTxBehaviorEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canFrameTxBehaviorEnum.getT())) {
            
            return canFrameTxBehaviorEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}