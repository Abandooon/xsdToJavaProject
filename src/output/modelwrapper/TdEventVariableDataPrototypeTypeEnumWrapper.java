package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventVariableDataPrototypeTypeEnumWrapper {

    
    private TdEventVariableDataPrototypeTypeEnum tdEventVariableDataPrototypeTypeEnum;

    public TdEventVariableDataPrototypeTypeEnumWrapper(TdEventVariableDataPrototypeTypeEnum tdEventVariableDataPrototypeTypeEnum) {
        this.tdEventVariableDataPrototypeTypeEnum = tdEventVariableDataPrototypeTypeEnum;
    }

   
    public TdEventVariableDataPrototypeTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototypeTypeEnum.getValue())) {
            
            return tdEventVariableDataPrototypeTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototypeTypeEnum.getS())) {
            
            return tdEventVariableDataPrototypeTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototypeTypeEnum.getT())) {
            
            return tdEventVariableDataPrototypeTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}