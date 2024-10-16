package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SwcBswSynchronizedModeGroupPrototypeWrapper {

    
    private SwcBswSynchronizedModeGroupPrototype swcBswSynchronizedModeGroupPrototype;

    public SwcBswSynchronizedModeGroupPrototypeWrapper(SwcBswSynchronizedModeGroupPrototype swcBswSynchronizedModeGroupPrototype) {
        this.swcBswSynchronizedModeGroupPrototype = swcBswSynchronizedModeGroupPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedModeGroupPrototype.getS())) {
            
            return swcBswSynchronizedModeGroupPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedModeGroupPrototype.getT())) {
            
            return swcBswSynchronizedModeGroupPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public BswModeGroupRefWrapper getBswModeGroupRef() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedModeGroupPrototype.getBswModeGroupRef())) {
            
            return new BswModeGroupRefWrapper(swcBswSynchronizedModeGroupPrototype.getBswModeGroupRef());
            
        } else {
            return null;
        }
        
    }

    public PModeGroupInAtomicSwcInstanceRefWrapper getSwcModeGroupIref() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedModeGroupPrototype.getSwcModeGroupIref())) {
            
            return new PModeGroupInAtomicSwcInstanceRefWrapper(swcBswSynchronizedModeGroupPrototype.getSwcModeGroupIref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcBswSynchronizedModeGroupPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(swcBswSynchronizedModeGroupPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}