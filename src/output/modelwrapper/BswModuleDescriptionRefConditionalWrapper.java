package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class BswModuleDescriptionRefConditionalWrapper {

    
    private BswModuleDescriptionRefConditional bswModuleDescriptionRefConditional;

    public BswModuleDescriptionRefConditionalWrapper(BswModuleDescriptionRefConditional bswModuleDescriptionRefConditional) {
        this.bswModuleDescriptionRefConditional = bswModuleDescriptionRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModuleDescriptionRefConditional.getS())) {
            
            return bswModuleDescriptionRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModuleDescriptionRefConditional.getT())) {
            
            return bswModuleDescriptionRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BswModuleDescriptionRefWrapper getBswModuleDescriptionRef() {
        
        if (CollUtil.isNotEmpty(bswModuleDescriptionRefConditional.getBswModuleDescriptionRef())) {
            
            return new BswModuleDescriptionRefWrapper(bswModuleDescriptionRefConditional.getBswModuleDescriptionRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModuleDescriptionRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModuleDescriptionRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}