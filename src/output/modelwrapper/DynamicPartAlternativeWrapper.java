package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class DynamicPartAlternativeWrapper {

    
    private DynamicPartAlternative dynamicPartAlternative;

    public DynamicPartAlternativeWrapper(DynamicPartAlternative dynamicPartAlternative) {
        this.dynamicPartAlternative = dynamicPartAlternative;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dynamicPartAlternative.getS())) {
            
            return dynamicPartAlternative.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dynamicPartAlternative.getT())) {
            
            return dynamicPartAlternative.getT();
            
        } else {
            return null;
        }
        
    }

    public IPduRefWrapper getIPduRef() {
        
        if (CollUtil.isNotEmpty(dynamicPartAlternative.getIPduRef())) {
            
            return new IPduRefWrapper(dynamicPartAlternative.getIPduRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getInitialDynamicPart() {
        
        if (CollUtil.isNotEmpty(dynamicPartAlternative.getInitialDynamicPart())) {
            
            return new BooleanWrapper(dynamicPartAlternative.getInitialDynamicPart());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSelectorFieldCode() {
        
        if (CollUtil.isNotEmpty(dynamicPartAlternative.getSelectorFieldCode())) {
            
            return new IntegerWrapper(dynamicPartAlternative.getSelectorFieldCode());
            
        } else {
            return null;
        }
        
    }




    


    
}