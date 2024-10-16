package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class BlueprintPolicySingleWrapper {

    
    private BlueprintPolicySingle blueprintPolicySingle;

    public BlueprintPolicySingleWrapper(BlueprintPolicySingle blueprintPolicySingle) {
        this.blueprintPolicySingle = blueprintPolicySingle;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(blueprintPolicySingle.getS())) {
            
            return blueprintPolicySingle.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(blueprintPolicySingle.getT())) {
            
            return blueprintPolicySingle.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAttributeName() {
        
        if (CollUtil.isNotEmpty(blueprintPolicySingle.getAttributeName())) {
            
            return new StringWrapper(blueprintPolicySingle.getAttributeName());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getBlueprintDerivationGuide() {
        
        if (CollUtil.isNotEmpty(blueprintPolicySingle.getBlueprintDerivationGuide())) {
            
            return new DocumentationBlockWrapper(blueprintPolicySingle.getBlueprintDerivationGuide());
            
        } else {
            return null;
        }
        
    }




    


    
}