package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventSwcInternalBehaviorTypeEnumWrapper {

    
    private TdEventSwcInternalBehaviorTypeEnum tdEventSwcInternalBehaviorTypeEnum;

    public TdEventSwcInternalBehaviorTypeEnumWrapper(TdEventSwcInternalBehaviorTypeEnum tdEventSwcInternalBehaviorTypeEnum) {
        this.tdEventSwcInternalBehaviorTypeEnum = tdEventSwcInternalBehaviorTypeEnum;
    }

   
    public TdEventSwcInternalBehaviorTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorTypeEnum.getValue())) {
            
            return tdEventSwcInternalBehaviorTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorTypeEnum.getS())) {
            
            return tdEventSwcInternalBehaviorTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorTypeEnum.getT())) {
            
            return tdEventSwcInternalBehaviorTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}