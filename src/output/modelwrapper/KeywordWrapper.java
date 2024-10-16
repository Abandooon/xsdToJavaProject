package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class KeywordWrapper {

    
    private Keyword keyword;

    public KeywordWrapper(Keyword keyword) {
        this.keyword = keyword;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(keyword.getS())) {
            
            return keyword.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(keyword.getT())) {
            
            return keyword.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(keyword.getUuid())) {
            
            return keyword.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(keyword.getShortName())) {
            
            return new IdentifierWrapper(keyword.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(keyword.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = keyword.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(keyword.getLongName())) {
            
            return new MultilanguageLongNameWrapper(keyword.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(keyword.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(keyword.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(keyword.getCategory())) {
            
            return new CategoryStringWrapper(keyword.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(keyword.getAdminData())) {
            
            return new AdminDataWrapper(keyword.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(keyword.getIntroduction())) {
            
            return new DocumentationBlockWrapper(keyword.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(keyword.getAnnotations())) {
            ArrayList<Annotation> originalList = keyword.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getAbbrName() {
        
        if (CollUtil.isNotEmpty(keyword.getAbbrName())) {
            
            return new NmtokenStringWrapper(keyword.getAbbrName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NmtokenStringWrapper> getClassifications() {
        
        if (CollUtil.isNotEmpty(keyword.getClassifications())) {
            ArrayList<NmtokenString> originalList = keyword.getClassifications();
            ArrayList<NmtokenStringWrapper> wrapperList = (ArrayList<NmtokenStringWrapper>)originalList.stream()
                .map(item -> new NmtokenStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}