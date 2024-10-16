package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class DiagEventDebounceTimeBasedWrapper {

    
    private DiagEventDebounceTimeBased diagEventDebounceTimeBased;

    public DiagEventDebounceTimeBasedWrapper(DiagEventDebounceTimeBased diagEventDebounceTimeBased) {
        this.diagEventDebounceTimeBased = diagEventDebounceTimeBased;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getS())) {
            
            return diagEventDebounceTimeBased.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getT())) {
            
            return diagEventDebounceTimeBased.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getUuid())) {
            
            return diagEventDebounceTimeBased.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getShortName())) {
            
            return new IdentifierWrapper(diagEventDebounceTimeBased.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagEventDebounceTimeBased.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagEventDebounceTimeBased.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagEventDebounceTimeBased.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getCategory())) {
            
            return new CategoryStringWrapper(diagEventDebounceTimeBased.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getAdminData())) {
            
            return new AdminDataWrapper(diagEventDebounceTimeBased.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagEventDebounceTimeBased.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getAnnotations())) {
            ArrayList<Annotation> originalList = diagEventDebounceTimeBased.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeFailedThreshold() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getTimeFailedThreshold())) {
            
            return new TimeValueWrapper(diagEventDebounceTimeBased.getTimeFailedThreshold());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimePassedThreshold() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceTimeBased.getTimePassedThreshold())) {
            
            return new TimeValueWrapper(diagEventDebounceTimeBased.getTimePassedThreshold());
            
        } else {
            return null;
        }
        
    }




    


    
}