package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DtcFormatTypeEnumWrapper {

    
    private DtcFormatTypeEnum dtcFormatTypeEnum;

    public DtcFormatTypeEnumWrapper(DtcFormatTypeEnum dtcFormatTypeEnum) {
        this.dtcFormatTypeEnum = dtcFormatTypeEnum;
    }

   
    public DtcFormatTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(dtcFormatTypeEnum.getValue())) {
            
            return dtcFormatTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dtcFormatTypeEnum.getS())) {
            
            return dtcFormatTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dtcFormatTypeEnum.getT())) {
            
            return dtcFormatTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}