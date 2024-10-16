package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventOperationTypeEnumWrapper {

    
    private TdEventOperationTypeEnum tdEventOperationTypeEnum;

    public TdEventOperationTypeEnumWrapper(TdEventOperationTypeEnum tdEventOperationTypeEnum) {
        this.tdEventOperationTypeEnum = tdEventOperationTypeEnum;
    }

   
    public TdEventOperationTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventOperationTypeEnum.getValue())) {
            
            return tdEventOperationTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventOperationTypeEnum.getS())) {
            
            return tdEventOperationTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventOperationTypeEnum.getT())) {
            
            return tdEventOperationTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}