package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NmCoordinatorRoleEnumWrapper {

    
    private NmCoordinatorRoleEnum nmCoordinatorRoleEnum;

    public NmCoordinatorRoleEnumWrapper(NmCoordinatorRoleEnum nmCoordinatorRoleEnum) {
        this.nmCoordinatorRoleEnum = nmCoordinatorRoleEnum;
    }

   
    public NmCoordinatorRoleEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(nmCoordinatorRoleEnum.getValue())) {
            
            return nmCoordinatorRoleEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nmCoordinatorRoleEnum.getS())) {
            
            return nmCoordinatorRoleEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nmCoordinatorRoleEnum.getT())) {
            
            return nmCoordinatorRoleEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}