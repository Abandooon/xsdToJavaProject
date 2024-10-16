package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class TtcanCommunicationControllerWrapper {

    
    private TtcanCommunicationController ttcanCommunicationController;

    public TtcanCommunicationControllerWrapper(TtcanCommunicationController ttcanCommunicationController) {
        this.ttcanCommunicationController = ttcanCommunicationController;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getS())) {
            
            return ttcanCommunicationController.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getT())) {
            
            return ttcanCommunicationController.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getUuid())) {
            
            return ttcanCommunicationController.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getShortName())) {
            
            return new IdentifierWrapper(ttcanCommunicationController.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ttcanCommunicationController.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ttcanCommunicationController.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ttcanCommunicationController.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getCategory())) {
            
            return new CategoryStringWrapper(ttcanCommunicationController.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getAdminData())) {
            
            return new AdminDataWrapper(ttcanCommunicationController.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ttcanCommunicationController.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getAnnotations())) {
            ArrayList<Annotation> originalList = ttcanCommunicationController.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TtcanCommunicationControllerConditionalWrapper> getTtcanCommunicationControllerVariants() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationController.getTtcanCommunicationControllerVariants())) {
            ArrayList<TtcanCommunicationControllerConditional> originalList = ttcanCommunicationController.getTtcanCommunicationControllerVariants();
            ArrayList<TtcanCommunicationControllerConditionalWrapper> wrapperList = (ArrayList<TtcanCommunicationControllerConditionalWrapper>)originalList.stream()
                .map(item -> new TtcanCommunicationControllerConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}