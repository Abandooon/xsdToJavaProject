package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DataFilterTypeEnumWrapper {

    
    private DataFilterTypeEnum dataFilterTypeEnum;

    public DataFilterTypeEnumWrapper(DataFilterTypeEnum dataFilterTypeEnum) {
        this.dataFilterTypeEnum = dataFilterTypeEnum;
    }

   
    public DataFilterTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(dataFilterTypeEnum.getValue())) {
            
            return dataFilterTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataFilterTypeEnum.getS())) {
            
            return dataFilterTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataFilterTypeEnum.getT())) {
            
            return dataFilterTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}