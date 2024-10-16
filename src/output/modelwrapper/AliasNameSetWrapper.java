package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class AliasNameSetWrapper {

    
    private AliasNameSet aliasNameSet;

    public AliasNameSetWrapper(AliasNameSet aliasNameSet) {
        this.aliasNameSet = aliasNameSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getS())) {
            
            return aliasNameSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getT())) {
            
            return aliasNameSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getUuid())) {
            
            return aliasNameSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getShortName())) {
            
            return new IdentifierWrapper(aliasNameSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = aliasNameSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(aliasNameSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(aliasNameSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getCategory())) {
            
            return new CategoryStringWrapper(aliasNameSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getAdminData())) {
            
            return new AdminDataWrapper(aliasNameSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(aliasNameSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getAnnotations())) {
            ArrayList<Annotation> originalList = aliasNameSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getVariationPoint())) {
            
            return new VariationPointWrapper(aliasNameSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(aliasNameSet.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getShortNamePattern())) {
            
            return new StringWrapper(aliasNameSet.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AliasNameAssignmentWrapper> getAliasNames() {
        
        if (CollUtil.isNotEmpty(aliasNameSet.getAliasNames())) {
            ArrayList<AliasNameAssignment> originalList = aliasNameSet.getAliasNames();
            ArrayList<AliasNameAssignmentWrapper> wrapperList = (ArrayList<AliasNameAssignmentWrapper>)originalList.stream()
                .map(item -> new AliasNameAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}