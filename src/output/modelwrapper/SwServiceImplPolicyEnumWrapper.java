package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwServiceImplPolicyEnumWrapper {

    
    private SwServiceImplPolicyEnum swServiceImplPolicyEnum;

    public SwServiceImplPolicyEnumWrapper(SwServiceImplPolicyEnum swServiceImplPolicyEnum) {
        this.swServiceImplPolicyEnum = swServiceImplPolicyEnum;
    }

   
    public SwServiceImplPolicyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(swServiceImplPolicyEnum.getValue())) {
            
            return swServiceImplPolicyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swServiceImplPolicyEnum.getS())) {
            
            return swServiceImplPolicyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swServiceImplPolicyEnum.getT())) {
            
            return swServiceImplPolicyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}