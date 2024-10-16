package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class NumericalOrTextWrapper {

    
    private NumericalOrText numericalOrText;

    public NumericalOrTextWrapper(NumericalOrText numericalOrText) {
        this.numericalOrText = numericalOrText;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(numericalOrText.getS())) {
            
            return numericalOrText.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(numericalOrText.getT())) {
            
            return numericalOrText.getT();
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getVf() {
        
        if (CollUtil.isNotEmpty(numericalOrText.getVf())) {
            
            return new NumericalValueVariationPointWrapper(numericalOrText.getVf());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getVt() {
        
        if (CollUtil.isNotEmpty(numericalOrText.getVt())) {
            
            return new StringWrapper(numericalOrText.getVt());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(numericalOrText.getVariationPoint())) {
            
            return new VariationPointWrapper(numericalOrText.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}