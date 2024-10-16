package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class RoleBasedDataAssignmentWrapper {

    
    private RoleBasedDataAssignment roleBasedDataAssignment;

    public RoleBasedDataAssignmentWrapper(RoleBasedDataAssignment roleBasedDataAssignment) {
        this.roleBasedDataAssignment = roleBasedDataAssignment;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(roleBasedDataAssignment.getS())) {
            
            return roleBasedDataAssignment.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(roleBasedDataAssignment.getT())) {
            
            return roleBasedDataAssignment.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(roleBasedDataAssignment.getRole())) {
            
            return new IdentifierWrapper(roleBasedDataAssignment.getRole());
            
        } else {
            return null;
        }
        
    }

    public AutosarVariableRefWrapper getUsedDataElement() {
        
        if (CollUtil.isNotEmpty(roleBasedDataAssignment.getUsedDataElement())) {
            
            return new AutosarVariableRefWrapper(roleBasedDataAssignment.getUsedDataElement());
            
        } else {
            return null;
        }
        
    }

    public AutosarParameterRefWrapper getUsedParameterElement() {
        
        if (CollUtil.isNotEmpty(roleBasedDataAssignment.getUsedParameterElement())) {
            
            return new AutosarParameterRefWrapper(roleBasedDataAssignment.getUsedParameterElement());
            
        } else {
            return null;
        }
        
    }

    public UsedPimRefWrapper getUsedPimRef() {
        
        if (CollUtil.isNotEmpty(roleBasedDataAssignment.getUsedPimRef())) {
            
            return new UsedPimRefWrapper(roleBasedDataAssignment.getUsedPimRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(roleBasedDataAssignment.getVariationPoint())) {
            
            return new VariationPointWrapper(roleBasedDataAssignment.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}