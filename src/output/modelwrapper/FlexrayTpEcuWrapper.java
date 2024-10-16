package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class FlexrayTpEcuWrapper {

    
    private FlexrayTpEcu flexrayTpEcu;

    public FlexrayTpEcuWrapper(FlexrayTpEcu flexrayTpEcu) {
        this.flexrayTpEcu = flexrayTpEcu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayTpEcu.getS())) {
            
            return flexrayTpEcu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayTpEcu.getT())) {
            
            return flexrayTpEcu.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCancellation() {
        
        if (CollUtil.isNotEmpty(flexrayTpEcu.getCancellation())) {
            
            return new BooleanWrapper(flexrayTpEcu.getCancellation());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getCycleTimeMainFunction() {
        
        if (CollUtil.isNotEmpty(flexrayTpEcu.getCycleTimeMainFunction())) {
            
            return new TimeValueWrapper(flexrayTpEcu.getCycleTimeMainFunction());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpEcu.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(flexrayTpEcu.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getFullDuplexEnabled() {
        
        if (CollUtil.isNotEmpty(flexrayTpEcu.getFullDuplexEnabled())) {
            
            return new BooleanWrapper(flexrayTpEcu.getFullDuplexEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getTransmitCancellation() {
        
        if (CollUtil.isNotEmpty(flexrayTpEcu.getTransmitCancellation())) {
            
            return new BooleanWrapper(flexrayTpEcu.getTransmitCancellation());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayTpEcu.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayTpEcu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}