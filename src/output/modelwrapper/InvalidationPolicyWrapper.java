package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class InvalidationPolicyWrapper {

    
    private InvalidationPolicy invalidationPolicy;

    public InvalidationPolicyWrapper(InvalidationPolicy invalidationPolicy) {
        this.invalidationPolicy = invalidationPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(invalidationPolicy.getS())) {
            
            return invalidationPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(invalidationPolicy.getT())) {
            
            return invalidationPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public DataElementRef_InvalidationPolicyWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(invalidationPolicy.getDataElementRef())) {
            
            return new DataElementRef_InvalidationPolicyWrapper(invalidationPolicy.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public HandleInvalidEnumWrapper getHandleInvalid() {
        
        if (CollUtil.isNotEmpty(invalidationPolicy.getHandleInvalid())) {
            
            return new HandleInvalidEnumWrapper(invalidationPolicy.getHandleInvalid());
            
        } else {
            return null;
        }
        
    }




    


    
}