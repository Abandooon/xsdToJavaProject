package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DtcKindEnumWrapper {

    
    private DtcKindEnum dtcKindEnum;

    public DtcKindEnumWrapper(DtcKindEnum dtcKindEnum) {
        this.dtcKindEnum = dtcKindEnum;
    }

   
    public DtcKindEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(dtcKindEnum.getValue())) {
            
            return dtcKindEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dtcKindEnum.getS())) {
            
            return dtcKindEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dtcKindEnum.getT())) {
            
            return dtcKindEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}