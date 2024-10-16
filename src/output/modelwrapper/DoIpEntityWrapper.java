package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DoIpEntityWrapper {

    
    private DoIpEntity doIpEntity;

    public DoIpEntityWrapper(DoIpEntity doIpEntity) {
        this.doIpEntity = doIpEntity;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpEntity.getS())) {
            
            return doIpEntity.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpEntity.getT())) {
            
            return doIpEntity.getT();
            
        } else {
            return null;
        }
        
    }

    public DoIpEntityRoleEnumWrapper getDoIpEntityRole() {
        
        if (CollUtil.isNotEmpty(doIpEntity.getDoIpEntityRole())) {
            
            return new DoIpEntityRoleEnumWrapper(doIpEntity.getDoIpEntityRole());
            
        } else {
            return null;
        }
        
    }




    


    
}