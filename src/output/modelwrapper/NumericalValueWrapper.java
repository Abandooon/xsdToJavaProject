package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NumericalValueWrapper {

    
    private NumericalValue numericalValue;

    public NumericalValueWrapper(NumericalValue numericalValue) {
        this.numericalValue = numericalValue;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(numericalValue.getValue())) {
            
            return numericalValue.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(numericalValue.getS())) {
            
            return numericalValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(numericalValue.getT())) {
            
            return numericalValue.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}