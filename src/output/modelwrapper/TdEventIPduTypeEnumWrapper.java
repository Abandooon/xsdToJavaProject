package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventIPduTypeEnumWrapper {

    
    private TdEventIPduTypeEnum tdEventIPduTypeEnum;

    public TdEventIPduTypeEnumWrapper(TdEventIPduTypeEnum tdEventIPduTypeEnum) {
        this.tdEventIPduTypeEnum = tdEventIPduTypeEnum;
    }

   
    public TdEventIPduTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventIPduTypeEnum.getValue())) {
            
            return tdEventIPduTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventIPduTypeEnum.getS())) {
            
            return tdEventIPduTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventIPduTypeEnum.getT())) {
            
            return tdEventIPduTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}