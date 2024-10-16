package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ISignalTriggeringRefConditionalWrapper {

    
    private ISignalTriggeringRefConditional iSignalTriggeringRefConditional;

    public ISignalTriggeringRefConditionalWrapper(ISignalTriggeringRefConditional iSignalTriggeringRefConditional) {
        this.iSignalTriggeringRefConditional = iSignalTriggeringRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalTriggeringRefConditional.getS())) {
            
            return iSignalTriggeringRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalTriggeringRefConditional.getT())) {
            
            return iSignalTriggeringRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public ISignalTriggeringRefWrapper getISignalTriggeringRef() {
        
        if (CollUtil.isNotEmpty(iSignalTriggeringRefConditional.getISignalTriggeringRef())) {
            
            return new ISignalTriggeringRefWrapper(iSignalTriggeringRefConditional.getISignalTriggeringRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignalTriggeringRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignalTriggeringRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}