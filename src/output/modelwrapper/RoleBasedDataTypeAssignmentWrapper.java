package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class RoleBasedDataTypeAssignmentWrapper {

    
    private RoleBasedDataTypeAssignment roleBasedDataTypeAssignment;

    public RoleBasedDataTypeAssignmentWrapper(RoleBasedDataTypeAssignment roleBasedDataTypeAssignment) {
        this.roleBasedDataTypeAssignment = roleBasedDataTypeAssignment;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(roleBasedDataTypeAssignment.getS())) {
            
            return roleBasedDataTypeAssignment.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(roleBasedDataTypeAssignment.getT())) {
            
            return roleBasedDataTypeAssignment.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(roleBasedDataTypeAssignment.getRole())) {
            
            return new IdentifierWrapper(roleBasedDataTypeAssignment.getRole());
            
        } else {
            return null;
        }
        
    }

    public UsedImplementationDataTypeRefWrapper getUsedImplementationDataTypeRef() {
        
        if (CollUtil.isNotEmpty(roleBasedDataTypeAssignment.getUsedImplementationDataTypeRef())) {
            
            return new UsedImplementationDataTypeRefWrapper(roleBasedDataTypeAssignment.getUsedImplementationDataTypeRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(roleBasedDataTypeAssignment.getVariationPoint())) {
            
            return new VariationPointWrapper(roleBasedDataTypeAssignment.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}