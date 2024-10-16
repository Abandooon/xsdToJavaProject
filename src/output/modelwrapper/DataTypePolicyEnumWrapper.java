package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DataTypePolicyEnumWrapper {

    
    private DataTypePolicyEnum dataTypePolicyEnum;

    public DataTypePolicyEnumWrapper(DataTypePolicyEnum dataTypePolicyEnum) {
        this.dataTypePolicyEnum = dataTypePolicyEnum;
    }

   
    public DataTypePolicyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(dataTypePolicyEnum.getValue())) {
            
            return dataTypePolicyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataTypePolicyEnum.getS())) {
            
            return dataTypePolicyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataTypePolicyEnum.getT())) {
            
            return dataTypePolicyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}