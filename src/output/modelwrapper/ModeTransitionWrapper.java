package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ModeTransitionWrapper {

    
    private ModeTransition modeTransition;

    public ModeTransitionWrapper(ModeTransition modeTransition) {
        this.modeTransition = modeTransition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeTransition.getS())) {
            
            return modeTransition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeTransition.getT())) {
            
            return modeTransition.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeTransition.getUuid())) {
            
            return modeTransition.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeTransition.getShortName())) {
            
            return new IdentifierWrapper(modeTransition.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeTransition.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeTransition.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeTransition.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeTransition.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeTransition.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeTransition.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeTransition.getCategory())) {
            
            return new CategoryStringWrapper(modeTransition.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeTransition.getAdminData())) {
            
            return new AdminDataWrapper(modeTransition.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeTransition.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeTransition.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeTransition.getAnnotations())) {
            ArrayList<Annotation> originalList = modeTransition.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EnteredModeRefWrapper getEnteredModeRef() {
        
        if (CollUtil.isNotEmpty(modeTransition.getEnteredModeRef())) {
            
            return new EnteredModeRefWrapper(modeTransition.getEnteredModeRef());
            
        } else {
            return null;
        }
        
    }

    public ExitedModeRefWrapper getExitedModeRef() {
        
        if (CollUtil.isNotEmpty(modeTransition.getExitedModeRef())) {
            
            return new ExitedModeRefWrapper(modeTransition.getExitedModeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}