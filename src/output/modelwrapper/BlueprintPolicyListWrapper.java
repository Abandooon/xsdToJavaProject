package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    


public class BlueprintPolicyListWrapper {

    
    private BlueprintPolicyList blueprintPolicyList;

    public BlueprintPolicyListWrapper(BlueprintPolicyList blueprintPolicyList) {
        this.blueprintPolicyList = blueprintPolicyList;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(blueprintPolicyList.getS())) {
            
            return blueprintPolicyList.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(blueprintPolicyList.getT())) {
            
            return blueprintPolicyList.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAttributeName() {
        
        if (CollUtil.isNotEmpty(blueprintPolicyList.getAttributeName())) {
            
            return new StringWrapper(blueprintPolicyList.getAttributeName());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getBlueprintDerivationGuide() {
        
        if (CollUtil.isNotEmpty(blueprintPolicyList.getBlueprintDerivationGuide())) {
            
            return new DocumentationBlockWrapper(blueprintPolicyList.getBlueprintDerivationGuide());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getMaxNumberOfElements() {
        
        if (CollUtil.isNotEmpty(blueprintPolicyList.getMaxNumberOfElements())) {
            
            return new PositiveIntegerValueVariationPointWrapper(blueprintPolicyList.getMaxNumberOfElements());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getMinNumberOfElements() {
        
        if (CollUtil.isNotEmpty(blueprintPolicyList.getMinNumberOfElements())) {
            
            return new PositiveIntegerValueVariationPointWrapper(blueprintPolicyList.getMinNumberOfElements());
            
        } else {
            return null;
        }
        
    }




    


    
}