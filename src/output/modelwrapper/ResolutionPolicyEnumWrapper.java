package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ResolutionPolicyEnumWrapper {

    
    private ResolutionPolicyEnum resolutionPolicyEnum;

    public ResolutionPolicyEnumWrapper(ResolutionPolicyEnum resolutionPolicyEnum) {
        this.resolutionPolicyEnum = resolutionPolicyEnum;
    }

   
    public ResolutionPolicyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(resolutionPolicyEnum.getValue())) {
            
            return resolutionPolicyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(resolutionPolicyEnum.getS())) {
            
            return resolutionPolicyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(resolutionPolicyEnum.getT())) {
            
            return resolutionPolicyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}