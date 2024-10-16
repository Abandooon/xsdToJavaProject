package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AclScopeEnumWrapper {

    
    private AclScopeEnum aclScopeEnum;

    public AclScopeEnumWrapper(AclScopeEnum aclScopeEnum) {
        this.aclScopeEnum = aclScopeEnum;
    }

   
    public AclScopeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(aclScopeEnum.getValue())) {
            
            return aclScopeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(aclScopeEnum.getS())) {
            
            return aclScopeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(aclScopeEnum.getT())) {
            
            return aclScopeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}