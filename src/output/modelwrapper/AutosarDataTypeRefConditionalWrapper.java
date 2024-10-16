package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class AutosarDataTypeRefConditionalWrapper {

    
    private AutosarDataTypeRefConditional autosarDataTypeRefConditional;

    public AutosarDataTypeRefConditionalWrapper(AutosarDataTypeRefConditional autosarDataTypeRefConditional) {
        this.autosarDataTypeRefConditional = autosarDataTypeRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(autosarDataTypeRefConditional.getS())) {
            
            return autosarDataTypeRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(autosarDataTypeRefConditional.getT())) {
            
            return autosarDataTypeRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public AutosarDataTypeRefWrapper getAutosarDataTypeRef() {
        
        if (CollUtil.isNotEmpty(autosarDataTypeRefConditional.getAutosarDataTypeRef())) {
            
            return new AutosarDataTypeRefWrapper(autosarDataTypeRefConditional.getAutosarDataTypeRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(autosarDataTypeRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(autosarDataTypeRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}