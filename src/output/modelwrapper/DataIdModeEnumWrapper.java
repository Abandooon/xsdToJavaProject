package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DataIdModeEnumWrapper {

    
    private DataIdModeEnum dataIdModeEnum;

    public DataIdModeEnumWrapper(DataIdModeEnum dataIdModeEnum) {
        this.dataIdModeEnum = dataIdModeEnum;
    }

   
    public DataIdModeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(dataIdModeEnum.getValue())) {
            
            return dataIdModeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataIdModeEnum.getS())) {
            
            return dataIdModeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataIdModeEnum.getT())) {
            
            return dataIdModeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}