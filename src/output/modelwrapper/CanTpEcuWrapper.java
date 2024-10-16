package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class CanTpEcuWrapper {

    
    private CanTpEcu canTpEcu;

    public CanTpEcuWrapper(CanTpEcu canTpEcu) {
        this.canTpEcu = canTpEcu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canTpEcu.getS())) {
            
            return canTpEcu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canTpEcu.getT())) {
            
            return canTpEcu.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getCycleTimeMainFunction() {
        
        if (CollUtil.isNotEmpty(canTpEcu.getCycleTimeMainFunction())) {
            
            return new TimeValueWrapper(canTpEcu.getCycleTimeMainFunction());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(canTpEcu.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(canTpEcu.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canTpEcu.getVariationPoint())) {
            
            return new VariationPointWrapper(canTpEcu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}