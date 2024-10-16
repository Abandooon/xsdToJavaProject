package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventBswModuleTypeEnumWrapper {

    
    private TdEventBswModuleTypeEnum tdEventBswModuleTypeEnum;

    public TdEventBswModuleTypeEnumWrapper(TdEventBswModuleTypeEnum tdEventBswModuleTypeEnum) {
        this.tdEventBswModuleTypeEnum = tdEventBswModuleTypeEnum;
    }

   
    public TdEventBswModuleTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventBswModuleTypeEnum.getValue())) {
            
            return tdEventBswModuleTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventBswModuleTypeEnum.getS())) {
            
            return tdEventBswModuleTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventBswModuleTypeEnum.getT())) {
            
            return tdEventBswModuleTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}