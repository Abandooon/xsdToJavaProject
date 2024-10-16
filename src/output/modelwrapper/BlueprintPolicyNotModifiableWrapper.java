package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class BlueprintPolicyNotModifiableWrapper {

    
    private BlueprintPolicyNotModifiable blueprintPolicyNotModifiable;

    public BlueprintPolicyNotModifiableWrapper(BlueprintPolicyNotModifiable blueprintPolicyNotModifiable) {
        this.blueprintPolicyNotModifiable = blueprintPolicyNotModifiable;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(blueprintPolicyNotModifiable.getS())) {
            
            return blueprintPolicyNotModifiable.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(blueprintPolicyNotModifiable.getT())) {
            
            return blueprintPolicyNotModifiable.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAttributeName() {
        
        if (CollUtil.isNotEmpty(blueprintPolicyNotModifiable.getAttributeName())) {
            
            return new StringWrapper(blueprintPolicyNotModifiable.getAttributeName());
            
        } else {
            return null;
        }
        
    }




    


    
}