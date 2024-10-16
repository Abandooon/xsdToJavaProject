package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class DiagEventDebounceCounterBasedWrapper {

    
    private DiagEventDebounceCounterBased diagEventDebounceCounterBased;

    public DiagEventDebounceCounterBasedWrapper(DiagEventDebounceCounterBased diagEventDebounceCounterBased) {
        this.diagEventDebounceCounterBased = diagEventDebounceCounterBased;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getS())) {
            
            return diagEventDebounceCounterBased.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getT())) {
            
            return diagEventDebounceCounterBased.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getUuid())) {
            
            return diagEventDebounceCounterBased.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getShortName())) {
            
            return new IdentifierWrapper(diagEventDebounceCounterBased.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagEventDebounceCounterBased.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagEventDebounceCounterBased.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagEventDebounceCounterBased.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getCategory())) {
            
            return new CategoryStringWrapper(diagEventDebounceCounterBased.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getAdminData())) {
            
            return new AdminDataWrapper(diagEventDebounceCounterBased.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagEventDebounceCounterBased.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getAnnotations())) {
            ArrayList<Annotation> originalList = diagEventDebounceCounterBased.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCounterDecrementStepSize() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getCounterDecrementStepSize())) {
            
            return new IntegerWrapper(diagEventDebounceCounterBased.getCounterDecrementStepSize());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCounterFailedThreshold() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getCounterFailedThreshold())) {
            
            return new IntegerWrapper(diagEventDebounceCounterBased.getCounterFailedThreshold());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCounterIncrementStepSize() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getCounterIncrementStepSize())) {
            
            return new IntegerWrapper(diagEventDebounceCounterBased.getCounterIncrementStepSize());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCounterJumpDown() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getCounterJumpDown())) {
            
            return new BooleanWrapper(diagEventDebounceCounterBased.getCounterJumpDown());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCounterJumpDownValue() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getCounterJumpDownValue())) {
            
            return new IntegerWrapper(diagEventDebounceCounterBased.getCounterJumpDownValue());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCounterJumpUp() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getCounterJumpUp())) {
            
            return new BooleanWrapper(diagEventDebounceCounterBased.getCounterJumpUp());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCounterJumpUpValue() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getCounterJumpUpValue())) {
            
            return new IntegerWrapper(diagEventDebounceCounterBased.getCounterJumpUpValue());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCounterPassedThreshold() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceCounterBased.getCounterPassedThreshold())) {
            
            return new IntegerWrapper(diagEventDebounceCounterBased.getCounterPassedThreshold());
            
        } else {
            return null;
        }
        
    }




    


    
}