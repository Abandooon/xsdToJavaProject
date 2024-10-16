package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class WaitPointWrapper {

    
    private WaitPoint waitPoint;

    public WaitPointWrapper(WaitPoint waitPoint) {
        this.waitPoint = waitPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(waitPoint.getS())) {
            
            return waitPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(waitPoint.getT())) {
            
            return waitPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(waitPoint.getUuid())) {
            
            return waitPoint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(waitPoint.getShortName())) {
            
            return new IdentifierWrapper(waitPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(waitPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = waitPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(waitPoint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(waitPoint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(waitPoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(waitPoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(waitPoint.getCategory())) {
            
            return new CategoryStringWrapper(waitPoint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(waitPoint.getAdminData())) {
            
            return new AdminDataWrapper(waitPoint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(waitPoint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(waitPoint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(waitPoint.getAnnotations())) {
            ArrayList<Annotation> originalList = waitPoint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeout() {
        
        if (CollUtil.isNotEmpty(waitPoint.getTimeout())) {
            
            return new TimeValueWrapper(waitPoint.getTimeout());
            
        } else {
            return null;
        }
        
    }

    public TriggerRef_WaitPointWrapper getTriggerRef() {
        
        if (CollUtil.isNotEmpty(waitPoint.getTriggerRef())) {
            
            return new TriggerRef_WaitPointWrapper(waitPoint.getTriggerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}