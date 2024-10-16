package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventFrameTypeEnumWrapper {

    
    private TdEventFrameTypeEnum tdEventFrameTypeEnum;

    public TdEventFrameTypeEnumWrapper(TdEventFrameTypeEnum tdEventFrameTypeEnum) {
        this.tdEventFrameTypeEnum = tdEventFrameTypeEnum;
    }

   
    public TdEventFrameTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventFrameTypeEnum.getValue())) {
            
            return tdEventFrameTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventFrameTypeEnum.getS())) {
            
            return tdEventFrameTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventFrameTypeEnum.getT())) {
            
            return tdEventFrameTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}