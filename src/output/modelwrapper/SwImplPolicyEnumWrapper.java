package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwImplPolicyEnumWrapper {

    
    private SwImplPolicyEnum swImplPolicyEnum;

    public SwImplPolicyEnumWrapper(SwImplPolicyEnum swImplPolicyEnum) {
        this.swImplPolicyEnum = swImplPolicyEnum;
    }

   
    public SwImplPolicyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(swImplPolicyEnum.getValue())) {
            
            return swImplPolicyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swImplPolicyEnum.getS())) {
            
            return swImplPolicyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swImplPolicyEnum.getT())) {
            
            return swImplPolicyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}