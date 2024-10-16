package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class AclRoleWrapper {

    
    private AclRole aclRole;

    public AclRoleWrapper(AclRole aclRole) {
        this.aclRole = aclRole;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(aclRole.getS())) {
            
            return aclRole.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(aclRole.getT())) {
            
            return aclRole.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(aclRole.getUuid())) {
            
            return aclRole.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(aclRole.getShortName())) {
            
            return new IdentifierWrapper(aclRole.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(aclRole.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = aclRole.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(aclRole.getLongName())) {
            
            return new MultilanguageLongNameWrapper(aclRole.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(aclRole.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(aclRole.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(aclRole.getCategory())) {
            
            return new CategoryStringWrapper(aclRole.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(aclRole.getAdminData())) {
            
            return new AdminDataWrapper(aclRole.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(aclRole.getIntroduction())) {
            
            return new DocumentationBlockWrapper(aclRole.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(aclRole.getAnnotations())) {
            ArrayList<Annotation> originalList = aclRole.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(aclRole.getVariationPoint())) {
            
            return new VariationPointWrapper(aclRole.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(aclRole.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(aclRole.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(aclRole.getShortNamePattern())) {
            
            return new StringWrapper(aclRole.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public UriStringWrapper getLdapUrl() {
        
        if (CollUtil.isNotEmpty(aclRole.getLdapUrl())) {
            
            return new UriStringWrapper(aclRole.getLdapUrl());
            
        } else {
            return null;
        }
        
    }




    


    
}