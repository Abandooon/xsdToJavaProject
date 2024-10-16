package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwcServiceDependencyWrapper {

    
    private SwcServiceDependency swcServiceDependency;

    public SwcServiceDependencyWrapper(SwcServiceDependency swcServiceDependency) {
        this.swcServiceDependency = swcServiceDependency;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getS())) {
            
            return swcServiceDependency.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getT())) {
            
            return swcServiceDependency.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getUuid())) {
            
            return swcServiceDependency.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getShortName())) {
            
            return new IdentifierWrapper(swcServiceDependency.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swcServiceDependency.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swcServiceDependency.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swcServiceDependency.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getCategory())) {
            
            return new CategoryStringWrapper(swcServiceDependency.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getAdminData())) {
            
            return new AdminDataWrapper(swcServiceDependency.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcServiceDependency.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getAnnotations())) {
            ArrayList<Annotation> originalList = swcServiceDependency.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RoleBasedDataTypeAssignmentWrapper> getAssignedDataTypes() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getAssignedDataTypes())) {
            ArrayList<RoleBasedDataTypeAssignment> originalList = swcServiceDependency.getAssignedDataTypes();
            ArrayList<RoleBasedDataTypeAssignmentWrapper> wrapperList = (ArrayList<RoleBasedDataTypeAssignmentWrapper>)originalList.stream()
                .map(item -> new RoleBasedDataTypeAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SymbolicNamePropsWrapper getSymbolicNameProps() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getSymbolicNameProps())) {
            
            return new SymbolicNamePropsWrapper(swcServiceDependency.getSymbolicNameProps());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RoleBasedDataAssignmentWrapper> getAssignedDatas() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getAssignedDatas())) {
            ArrayList<RoleBasedDataAssignment> originalList = swcServiceDependency.getAssignedDatas();
            ArrayList<RoleBasedDataAssignmentWrapper> wrapperList = (ArrayList<RoleBasedDataAssignmentWrapper>)originalList.stream()
                .map(item -> new RoleBasedDataAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RoleBasedPortAssignmentWrapper> getAssignedPorts() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getAssignedPorts())) {
            ArrayList<RoleBasedPortAssignment> originalList = swcServiceDependency.getAssignedPorts();
            ArrayList<RoleBasedPortAssignmentWrapper> wrapperList = (ArrayList<RoleBasedPortAssignmentWrapper>)originalList.stream()
                .map(item -> new RoleBasedPortAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RepresentedPortGroupRefWrapper getRepresentedPortGroupRef() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getRepresentedPortGroupRef())) {
            
            return new RepresentedPortGroupRefWrapper(swcServiceDependency.getRepresentedPortGroupRef());
            
        } else {
            return null;
        }
        
    }

    public ServiceNeedsWrapper getServiceNeeds() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getServiceNeeds())) {
            
            return new ServiceNeedsWrapper(swcServiceDependency.getServiceNeeds());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcServiceDependency.getVariationPoint())) {
            
            return new VariationPointWrapper(swcServiceDependency.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}