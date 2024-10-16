package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwVariableAccessImplPolicyEnumWrapper {

    
    private SwVariableAccessImplPolicyEnum swVariableAccessImplPolicyEnum;

    public SwVariableAccessImplPolicyEnumWrapper(SwVariableAccessImplPolicyEnum swVariableAccessImplPolicyEnum) {
        this.swVariableAccessImplPolicyEnum = swVariableAccessImplPolicyEnum;
    }

   
    public SwVariableAccessImplPolicyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(swVariableAccessImplPolicyEnum.getValue())) {
            
            return swVariableAccessImplPolicyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swVariableAccessImplPolicyEnum.getS())) {
            
            return swVariableAccessImplPolicyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swVariableAccessImplPolicyEnum.getT())) {
            
            return swVariableAccessImplPolicyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}