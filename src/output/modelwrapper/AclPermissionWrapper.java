package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    


public class AclPermissionWrapper {

    
    private AclPermission aclPermission;

    public AclPermissionWrapper(AclPermission aclPermission) {
        this.aclPermission = aclPermission;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(aclPermission.getS())) {
            
            return aclPermission.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(aclPermission.getT())) {
            
            return aclPermission.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(aclPermission.getUuid())) {
            
            return aclPermission.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(aclPermission.getShortName())) {
            
            return new IdentifierWrapper(aclPermission.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(aclPermission.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = aclPermission.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(aclPermission.getLongName())) {
            
            return new MultilanguageLongNameWrapper(aclPermission.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(aclPermission.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(aclPermission.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(aclPermission.getCategory())) {
            
            return new CategoryStringWrapper(aclPermission.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(aclPermission.getAdminData())) {
            
            return new AdminDataWrapper(aclPermission.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(aclPermission.getIntroduction())) {
            
            return new DocumentationBlockWrapper(aclPermission.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(aclPermission.getAnnotations())) {
            ArrayList<Annotation> originalList = aclPermission.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(aclPermission.getVariationPoint())) {
            
            return new VariationPointWrapper(aclPermission.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(aclPermission.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(aclPermission.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(aclPermission.getShortNamePattern())) {
            
            return new StringWrapper(aclPermission.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NmtokenStringWrapper> getAclContexts() {
        
        if (CollUtil.isNotEmpty(aclPermission.getAclContexts())) {
            ArrayList<NmtokenString> originalList = aclPermission.getAclContexts();
            ArrayList<NmtokenStringWrapper> wrapperList = (ArrayList<NmtokenStringWrapper>)originalList.stream()
                .map(item -> new NmtokenStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AclObjectRefWrapper> getAclObjectRefs() {
        
        if (CollUtil.isNotEmpty(aclPermission.getAclObjectRefs())) {
            ArrayList<AclObjectRef> originalList = aclPermission.getAclObjectRefs();
            ArrayList<AclObjectRefWrapper> wrapperList = (ArrayList<AclObjectRefWrapper>)originalList.stream()
                .map(item -> new AclObjectRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AclOperationRefWrapper> getAclOperationRefs() {
        
        if (CollUtil.isNotEmpty(aclPermission.getAclOperationRefs())) {
            ArrayList<AclOperationRef> originalList = aclPermission.getAclOperationRefs();
            ArrayList<AclOperationRefWrapper> wrapperList = (ArrayList<AclOperationRefWrapper>)originalList.stream()
                .map(item -> new AclOperationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AclRoleRefWrapper> getAclRoleRefs() {
        
        if (CollUtil.isNotEmpty(aclPermission.getAclRoleRefs())) {
            ArrayList<AclRoleRef> originalList = aclPermission.getAclRoleRefs();
            ArrayList<AclRoleRefWrapper> wrapperList = (ArrayList<AclRoleRefWrapper>)originalList.stream()
                .map(item -> new AclRoleRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public AclScopeEnumWrapper getAclScope() {
        
        if (CollUtil.isNotEmpty(aclPermission.getAclScope())) {
            
            return new AclScopeEnumWrapper(aclPermission.getAclScope());
            
        } else {
            return null;
        }
        
    }




    


    
}