package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class HwElementRefConditionalWrapper {

    
    private HwElementRefConditional hwElementRefConditional;

    public HwElementRefConditionalWrapper(HwElementRefConditional hwElementRefConditional) {
        this.hwElementRefConditional = hwElementRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwElementRefConditional.getS())) {
            
            return hwElementRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwElementRefConditional.getT())) {
            
            return hwElementRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(hwElementRefConditional.getHwElementRef())) {
            
            return new HwElementRefWrapper(hwElementRefConditional.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwElementRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(hwElementRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}