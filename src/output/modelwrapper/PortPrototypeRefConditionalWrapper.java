package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PortPrototypeRefConditionalWrapper {

    
    private PortPrototypeRefConditional portPrototypeRefConditional;

    public PortPrototypeRefConditionalWrapper(PortPrototypeRefConditional portPrototypeRefConditional) {
        this.portPrototypeRefConditional = portPrototypeRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portPrototypeRefConditional.getS())) {
            
            return portPrototypeRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portPrototypeRefConditional.getT())) {
            
            return portPrototypeRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeRefWrapper getPortPrototypeRef() {
        
        if (CollUtil.isNotEmpty(portPrototypeRefConditional.getPortPrototypeRef())) {
            
            return new PortPrototypeRefWrapper(portPrototypeRefConditional.getPortPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(portPrototypeRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(portPrototypeRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}