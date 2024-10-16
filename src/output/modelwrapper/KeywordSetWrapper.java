package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class KeywordSetWrapper {

    
    private KeywordSet keywordSet;

    public KeywordSetWrapper(KeywordSet keywordSet) {
        this.keywordSet = keywordSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(keywordSet.getS())) {
            
            return keywordSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(keywordSet.getT())) {
            
            return keywordSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(keywordSet.getUuid())) {
            
            return keywordSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(keywordSet.getShortName())) {
            
            return new IdentifierWrapper(keywordSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(keywordSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = keywordSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(keywordSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(keywordSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(keywordSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(keywordSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(keywordSet.getCategory())) {
            
            return new CategoryStringWrapper(keywordSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(keywordSet.getAdminData())) {
            
            return new AdminDataWrapper(keywordSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(keywordSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(keywordSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(keywordSet.getAnnotations())) {
            ArrayList<Annotation> originalList = keywordSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(keywordSet.getVariationPoint())) {
            
            return new VariationPointWrapper(keywordSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(keywordSet.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(keywordSet.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(keywordSet.getShortNamePattern())) {
            
            return new StringWrapper(keywordSet.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<KeywordWrapper> getKeywords() {
        
        if (CollUtil.isNotEmpty(keywordSet.getKeywords())) {
            ArrayList<Keyword> originalList = keywordSet.getKeywords();
            ArrayList<KeywordWrapper> wrapperList = (ArrayList<KeywordWrapper>)originalList.stream()
                .map(item -> new KeywordWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}