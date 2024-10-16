package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ObdRatioConnectionKindEnumWrapper {

    
    private ObdRatioConnectionKindEnum obdRatioConnectionKindEnum;

    public ObdRatioConnectionKindEnumWrapper(ObdRatioConnectionKindEnum obdRatioConnectionKindEnum) {
        this.obdRatioConnectionKindEnum = obdRatioConnectionKindEnum;
    }

   
    public ObdRatioConnectionKindEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(obdRatioConnectionKindEnum.getValue())) {
            
            return obdRatioConnectionKindEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(obdRatioConnectionKindEnum.getS())) {
            
            return obdRatioConnectionKindEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(obdRatioConnectionKindEnum.getT())) {
            
            return obdRatioConnectionKindEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}