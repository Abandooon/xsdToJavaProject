package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswServiceDependencyWrapper {

    
    private BswServiceDependency bswServiceDependency;

    public BswServiceDependencyWrapper(BswServiceDependency bswServiceDependency) {
        this.bswServiceDependency = bswServiceDependency;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswServiceDependency.getS())) {
            
            return bswServiceDependency.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswServiceDependency.getT())) {
            
            return bswServiceDependency.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RoleBasedDataTypeAssignmentWrapper> getAssignedDataTypes() {
        
        if (CollUtil.isNotEmpty(bswServiceDependency.getAssignedDataTypes())) {
            ArrayList<RoleBasedDataTypeAssignment> originalList = bswServiceDependency.getAssignedDataTypes();
            ArrayList<RoleBasedDataTypeAssignmentWrapper> wrapperList = (ArrayList<RoleBasedDataTypeAssignmentWrapper>)originalList.stream()
                .map(item -> new RoleBasedDataTypeAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SymbolicNamePropsWrapper getSymbolicNameProps() {
        
        if (CollUtil.isNotEmpty(bswServiceDependency.getSymbolicNameProps())) {
            
            return new SymbolicNamePropsWrapper(bswServiceDependency.getSymbolicNameProps());
            
        } else {
            return null;
        }
        
    }

    public BswServiceDependencyIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(bswServiceDependency.getIdent())) {
            
            return new BswServiceDependencyIdentWrapper(bswServiceDependency.getIdent());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RoleBasedDataAssignmentWrapper> getAssignedDatas() {
        
        if (CollUtil.isNotEmpty(bswServiceDependency.getAssignedDatas())) {
            ArrayList<RoleBasedDataAssignment> originalList = bswServiceDependency.getAssignedDatas();
            ArrayList<RoleBasedDataAssignmentWrapper> wrapperList = (ArrayList<RoleBasedDataAssignmentWrapper>)originalList.stream()
                .map(item -> new RoleBasedDataAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RoleBasedBswModuleEntryAssignmentWrapper> getAssignedEntryRoles() {
        
        if (CollUtil.isNotEmpty(bswServiceDependency.getAssignedEntryRoles())) {
            ArrayList<RoleBasedBswModuleEntryAssignment> originalList = bswServiceDependency.getAssignedEntryRoles();
            ArrayList<RoleBasedBswModuleEntryAssignmentWrapper> wrapperList = (ArrayList<RoleBasedBswModuleEntryAssignmentWrapper>)originalList.stream()
                .map(item -> new RoleBasedBswModuleEntryAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ServiceNeedsWrapper getServiceNeeds() {
        
        if (CollUtil.isNotEmpty(bswServiceDependency.getServiceNeeds())) {
            
            return new ServiceNeedsWrapper(bswServiceDependency.getServiceNeeds());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswServiceDependency.getVariationPoint())) {
            
            return new VariationPointWrapper(bswServiceDependency.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}