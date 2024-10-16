package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DataLimitKindEnumWrapper {

    
    private DataLimitKindEnum dataLimitKindEnum;

    public DataLimitKindEnumWrapper(DataLimitKindEnum dataLimitKindEnum) {
        this.dataLimitKindEnum = dataLimitKindEnum;
    }

   
    public DataLimitKindEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(dataLimitKindEnum.getValue())) {
            
            return dataLimitKindEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataLimitKindEnum.getS())) {
            
            return dataLimitKindEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataLimitKindEnum.getT())) {
            
            return dataLimitKindEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}