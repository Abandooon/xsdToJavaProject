package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DoIpEntityRoleEnumWrapper {

    
    private DoIpEntityRoleEnum doIpEntityRoleEnum;

    public DoIpEntityRoleEnumWrapper(DoIpEntityRoleEnum doIpEntityRoleEnum) {
        this.doIpEntityRoleEnum = doIpEntityRoleEnum;
    }

   
    public DoIpEntityRoleEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(doIpEntityRoleEnum.getValue())) {
            
            return doIpEntityRoleEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpEntityRoleEnum.getS())) {
            
            return doIpEntityRoleEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpEntityRoleEnum.getT())) {
            
            return doIpEntityRoleEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}