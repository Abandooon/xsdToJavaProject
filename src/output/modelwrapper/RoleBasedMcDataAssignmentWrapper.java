package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class RoleBasedMcDataAssignmentWrapper {

    
    private RoleBasedMcDataAssignment roleBasedMcDataAssignment;

    public RoleBasedMcDataAssignmentWrapper(RoleBasedMcDataAssignment roleBasedMcDataAssignment) {
        this.roleBasedMcDataAssignment = roleBasedMcDataAssignment;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(roleBasedMcDataAssignment.getS())) {
            
            return roleBasedMcDataAssignment.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(roleBasedMcDataAssignment.getT())) {
            
            return roleBasedMcDataAssignment.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<McDataInstanceRefWrapper> getMcDataInstanceRefs() {
        
        if (CollUtil.isNotEmpty(roleBasedMcDataAssignment.getMcDataInstanceRefs())) {
            ArrayList<McDataInstanceRef> originalList = roleBasedMcDataAssignment.getMcDataInstanceRefs();
            ArrayList<McDataInstanceRefWrapper> wrapperList = (ArrayList<McDataInstanceRefWrapper>)originalList.stream()
                .map(item -> new McDataInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(roleBasedMcDataAssignment.getRole())) {
            
            return new IdentifierWrapper(roleBasedMcDataAssignment.getRole());
            
        } else {
            return null;
        }
        
    }




    


    
}