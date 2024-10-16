package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class RoleBasedBswModuleEntryAssignmentWrapper {

    
    private RoleBasedBswModuleEntryAssignment roleBasedBswModuleEntryAssignment;

    public RoleBasedBswModuleEntryAssignmentWrapper(RoleBasedBswModuleEntryAssignment roleBasedBswModuleEntryAssignment) {
        this.roleBasedBswModuleEntryAssignment = roleBasedBswModuleEntryAssignment;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(roleBasedBswModuleEntryAssignment.getS())) {
            
            return roleBasedBswModuleEntryAssignment.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(roleBasedBswModuleEntryAssignment.getT())) {
            
            return roleBasedBswModuleEntryAssignment.getT();
            
        } else {
            return null;
        }
        
    }

    public AssignedEntryRefWrapper getAssignedEntryRef() {
        
        if (CollUtil.isNotEmpty(roleBasedBswModuleEntryAssignment.getAssignedEntryRef())) {
            
            return new AssignedEntryRefWrapper(roleBasedBswModuleEntryAssignment.getAssignedEntryRef());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(roleBasedBswModuleEntryAssignment.getRole())) {
            
            return new IdentifierWrapper(roleBasedBswModuleEntryAssignment.getRole());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(roleBasedBswModuleEntryAssignment.getVariationPoint())) {
            
            return new VariationPointWrapper(roleBasedBswModuleEntryAssignment.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}