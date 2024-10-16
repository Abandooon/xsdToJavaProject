package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class RoleBasedPortAssignmentWrapper {

    
    private RoleBasedPortAssignment roleBasedPortAssignment;

    public RoleBasedPortAssignmentWrapper(RoleBasedPortAssignment roleBasedPortAssignment) {
        this.roleBasedPortAssignment = roleBasedPortAssignment;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(roleBasedPortAssignment.getS())) {
            
            return roleBasedPortAssignment.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(roleBasedPortAssignment.getT())) {
            
            return roleBasedPortAssignment.getT();
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeRefWrapper getPortPrototypeRef() {
        
        if (CollUtil.isNotEmpty(roleBasedPortAssignment.getPortPrototypeRef())) {
            
            return new PortPrototypeRefWrapper(roleBasedPortAssignment.getPortPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(roleBasedPortAssignment.getRole())) {
            
            return new IdentifierWrapper(roleBasedPortAssignment.getRole());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(roleBasedPortAssignment.getVariationPoint())) {
            
            return new VariationPointWrapper(roleBasedPortAssignment.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}