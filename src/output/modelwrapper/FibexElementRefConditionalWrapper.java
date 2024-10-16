package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class FibexElementRefConditionalWrapper {

    
    private FibexElementRefConditional fibexElementRefConditional;

    public FibexElementRefConditionalWrapper(FibexElementRefConditional fibexElementRefConditional) {
        this.fibexElementRefConditional = fibexElementRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fibexElementRefConditional.getS())) {
            
            return fibexElementRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fibexElementRefConditional.getT())) {
            
            return fibexElementRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public FibexElementRefWrapper getFibexElementRef() {
        
        if (CollUtil.isNotEmpty(fibexElementRefConditional.getFibexElementRef())) {
            
            return new FibexElementRefWrapper(fibexElementRefConditional.getFibexElementRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(fibexElementRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(fibexElementRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}