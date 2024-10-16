package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class AclOperationWrapper {

    
    private AclOperation aclOperation;

    public AclOperationWrapper(AclOperation aclOperation) {
        this.aclOperation = aclOperation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(aclOperation.getS())) {
            
            return aclOperation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(aclOperation.getT())) {
            
            return aclOperation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(aclOperation.getUuid())) {
            
            return aclOperation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(aclOperation.getShortName())) {
            
            return new IdentifierWrapper(aclOperation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(aclOperation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = aclOperation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(aclOperation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(aclOperation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(aclOperation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(aclOperation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(aclOperation.getCategory())) {
            
            return new CategoryStringWrapper(aclOperation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(aclOperation.getAdminData())) {
            
            return new AdminDataWrapper(aclOperation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(aclOperation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(aclOperation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(aclOperation.getAnnotations())) {
            ArrayList<Annotation> originalList = aclOperation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(aclOperation.getVariationPoint())) {
            
            return new VariationPointWrapper(aclOperation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(aclOperation.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(aclOperation.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(aclOperation.getShortNamePattern())) {
            
            return new StringWrapper(aclOperation.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ImpliedOperationRefWrapper> getImpliedOperationRefs() {
        
        if (CollUtil.isNotEmpty(aclOperation.getImpliedOperationRefs())) {
            ArrayList<ImpliedOperationRef> originalList = aclOperation.getImpliedOperationRefs();
            ArrayList<ImpliedOperationRefWrapper> wrapperList = (ArrayList<ImpliedOperationRefWrapper>)originalList.stream()
                .map(item -> new ImpliedOperationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}