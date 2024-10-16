package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class IntervalTypeEnumWrapper {

    
    private IntervalTypeEnum intervalTypeEnum;

    public IntervalTypeEnumWrapper(IntervalTypeEnum intervalTypeEnum) {
        this.intervalTypeEnum = intervalTypeEnum;
    }

   
    public IntervalTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(intervalTypeEnum.getValue())) {
            
            return intervalTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(intervalTypeEnum.getS())) {
            
            return intervalTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(intervalTypeEnum.getT())) {
            
            return intervalTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}