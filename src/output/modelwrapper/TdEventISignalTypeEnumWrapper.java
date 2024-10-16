package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventISignalTypeEnumWrapper {

    
    private TdEventISignalTypeEnum tdEventISignalTypeEnum;

    public TdEventISignalTypeEnumWrapper(TdEventISignalTypeEnum tdEventISignalTypeEnum) {
        this.tdEventISignalTypeEnum = tdEventISignalTypeEnum;
    }

   
    public TdEventISignalTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventISignalTypeEnum.getValue())) {
            
            return tdEventISignalTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventISignalTypeEnum.getS())) {
            
            return tdEventISignalTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventISignalTypeEnum.getT())) {
            
            return tdEventISignalTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}