package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ServerArgumentImplPolicyEnumWrapper {

    
    private ServerArgumentImplPolicyEnum serverArgumentImplPolicyEnum;

    public ServerArgumentImplPolicyEnumWrapper(ServerArgumentImplPolicyEnum serverArgumentImplPolicyEnum) {
        this.serverArgumentImplPolicyEnum = serverArgumentImplPolicyEnum;
    }

   
    public ServerArgumentImplPolicyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(serverArgumentImplPolicyEnum.getValue())) {
            
            return serverArgumentImplPolicyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(serverArgumentImplPolicyEnum.getS())) {
            
            return serverArgumentImplPolicyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(serverArgumentImplPolicyEnum.getT())) {
            
            return serverArgumentImplPolicyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}