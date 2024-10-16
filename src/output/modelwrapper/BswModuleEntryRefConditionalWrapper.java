package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class BswModuleEntryRefConditionalWrapper {

    
    private BswModuleEntryRefConditional bswModuleEntryRefConditional;

    public BswModuleEntryRefConditionalWrapper(BswModuleEntryRefConditional bswModuleEntryRefConditional) {
        this.bswModuleEntryRefConditional = bswModuleEntryRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModuleEntryRefConditional.getS())) {
            
            return bswModuleEntryRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModuleEntryRefConditional.getT())) {
            
            return bswModuleEntryRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BswModuleEntryRefWrapper getBswModuleEntryRef() {
        
        if (CollUtil.isNotEmpty(bswModuleEntryRefConditional.getBswModuleEntryRef())) {
            
            return new BswModuleEntryRefWrapper(bswModuleEntryRefConditional.getBswModuleEntryRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModuleEntryRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModuleEntryRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}