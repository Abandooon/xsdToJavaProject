package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventBswInternalBehaviorTypeEnumWrapper {

    
    private TdEventBswInternalBehaviorTypeEnum tdEventBswInternalBehaviorTypeEnum;

    public TdEventBswInternalBehaviorTypeEnumWrapper(TdEventBswInternalBehaviorTypeEnum tdEventBswInternalBehaviorTypeEnum) {
        this.tdEventBswInternalBehaviorTypeEnum = tdEventBswInternalBehaviorTypeEnum;
    }

   
    public TdEventBswInternalBehaviorTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehaviorTypeEnum.getValue())) {
            
            return tdEventBswInternalBehaviorTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehaviorTypeEnum.getS())) {
            
            return tdEventBswInternalBehaviorTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehaviorTypeEnum.getT())) {
            
            return tdEventBswInternalBehaviorTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}