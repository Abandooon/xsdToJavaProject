package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SwcBswSynchronizedTriggerWrapper {

    
    private SwcBswSynchronizedTrigger swcBswSynchronizedTrigger;

    public SwcBswSynchronizedTriggerWrapper(SwcBswSynchronizedTrigger swcBswSynchronizedTrigger) {
        this.swcBswSynchronizedTrigger = swcBswSynchronizedTrigger;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedTrigger.getS())) {
            
            return swcBswSynchronizedTrigger.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedTrigger.getT())) {
            
            return swcBswSynchronizedTrigger.getT();
            
        } else {
            return null;
        }
        
    }

    public BswTriggerRefWrapper getBswTriggerRef() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedTrigger.getBswTriggerRef())) {
            
            return new BswTriggerRefWrapper(swcBswSynchronizedTrigger.getBswTriggerRef());
            
        } else {
            return null;
        }
        
    }

    public PTriggerInAtomicSwcTypeInstanceRefWrapper getSwcTriggerIref() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedTrigger.getSwcTriggerIref())) {
            
            return new PTriggerInAtomicSwcTypeInstanceRefWrapper(swcBswSynchronizedTrigger.getSwcTriggerIref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedTrigger.getVariationPoint())) {
            
            return new VariationPointWrapper(swcBswSynchronizedTrigger.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}