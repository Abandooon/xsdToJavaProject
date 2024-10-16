package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventTriggerTypeEnumWrapper {

    
    private TdEventTriggerTypeEnum tdEventTriggerTypeEnum;

    public TdEventTriggerTypeEnumWrapper(TdEventTriggerTypeEnum tdEventTriggerTypeEnum) {
        this.tdEventTriggerTypeEnum = tdEventTriggerTypeEnum;
    }

   
    public TdEventTriggerTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventTriggerTypeEnum.getValue())) {
            
            return tdEventTriggerTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventTriggerTypeEnum.getS())) {
            
            return tdEventTriggerTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventTriggerTypeEnum.getT())) {
            
            return tdEventTriggerTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}