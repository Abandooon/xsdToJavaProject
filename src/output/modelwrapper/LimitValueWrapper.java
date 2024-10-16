package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class LimitValueWrapper {

    
    private LimitValue limitValue;

    public LimitValueWrapper(LimitValue limitValue) {
        this.limitValue = limitValue;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(limitValue.getValue())) {
            
            return limitValue.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(limitValue.getS())) {
            
            return limitValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(limitValue.getT())) {
            
            return limitValue.getT();
            
        } else {
            return null;
        }
        
    }

    public IntervalTypeEnumSimple getIntervalType() {
        
        if (CollUtil.isNotEmpty(limitValue.getIntervalType())) {
            
            return limitValue.getIntervalType();
            
        } else {
            return null;
        }
        
    }




    


    
}