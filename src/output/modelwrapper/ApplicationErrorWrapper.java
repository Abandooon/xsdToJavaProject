package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class ApplicationErrorWrapper {

    
    private ApplicationError applicationError;

    public ApplicationErrorWrapper(ApplicationError applicationError) {
        this.applicationError = applicationError;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationError.getS())) {
            
            return applicationError.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationError.getT())) {
            
            return applicationError.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(applicationError.getUuid())) {
            
            return applicationError.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(applicationError.getShortName())) {
            
            return new IdentifierWrapper(applicationError.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(applicationError.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = applicationError.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(applicationError.getLongName())) {
            
            return new MultilanguageLongNameWrapper(applicationError.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(applicationError.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(applicationError.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(applicationError.getCategory())) {
            
            return new CategoryStringWrapper(applicationError.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(applicationError.getAdminData())) {
            
            return new AdminDataWrapper(applicationError.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(applicationError.getIntroduction())) {
            
            return new DocumentationBlockWrapper(applicationError.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(applicationError.getAnnotations())) {
            ArrayList<Annotation> originalList = applicationError.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getErrorCode() {
        
        if (CollUtil.isNotEmpty(applicationError.getErrorCode())) {
            
            return new IntegerWrapper(applicationError.getErrorCode());
            
        } else {
            return null;
        }
        
    }




    


    
}