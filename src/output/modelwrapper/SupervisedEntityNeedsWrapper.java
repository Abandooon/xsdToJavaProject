package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class SupervisedEntityNeedsWrapper {

    
    private SupervisedEntityNeeds supervisedEntityNeeds;

    public SupervisedEntityNeedsWrapper(SupervisedEntityNeeds supervisedEntityNeeds) {
        this.supervisedEntityNeeds = supervisedEntityNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getS())) {
            
            return supervisedEntityNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getT())) {
            
            return supervisedEntityNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getUuid())) {
            
            return supervisedEntityNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getShortName())) {
            
            return new IdentifierWrapper(supervisedEntityNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = supervisedEntityNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(supervisedEntityNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(supervisedEntityNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getCategory())) {
            
            return new CategoryStringWrapper(supervisedEntityNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getAdminData())) {
            
            return new AdminDataWrapper(supervisedEntityNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(supervisedEntityNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = supervisedEntityNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getActivateAtStart() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getActivateAtStart())) {
            
            return new BooleanWrapper(supervisedEntityNeeds.getActivateAtStart());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableDeactivation() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getEnableDeactivation())) {
            
            return new BooleanWrapper(supervisedEntityNeeds.getEnableDeactivation());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getExpectedAliveCycle() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getExpectedAliveCycle())) {
            
            return new TimeValueWrapper(supervisedEntityNeeds.getExpectedAliveCycle());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMaxAliveCycle() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getMaxAliveCycle())) {
            
            return new TimeValueWrapper(supervisedEntityNeeds.getMaxAliveCycle());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinAliveCycle() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getMinAliveCycle())) {
            
            return new TimeValueWrapper(supervisedEntityNeeds.getMinAliveCycle());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getToleratedFailedCycles() {
        
        if (CollUtil.isNotEmpty(supervisedEntityNeeds.getToleratedFailedCycles())) {
            
            return new PositiveIntegerWrapper(supervisedEntityNeeds.getToleratedFailedCycles());
            
        } else {
            return null;
        }
        
    }




    


    
}