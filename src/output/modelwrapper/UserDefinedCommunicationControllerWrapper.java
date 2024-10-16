package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class UserDefinedCommunicationControllerWrapper {

    
    private UserDefinedCommunicationController userDefinedCommunicationController;

    public UserDefinedCommunicationControllerWrapper(UserDefinedCommunicationController userDefinedCommunicationController) {
        this.userDefinedCommunicationController = userDefinedCommunicationController;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getS())) {
            
            return userDefinedCommunicationController.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getT())) {
            
            return userDefinedCommunicationController.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getUuid())) {
            
            return userDefinedCommunicationController.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getShortName())) {
            
            return new IdentifierWrapper(userDefinedCommunicationController.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = userDefinedCommunicationController.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getLongName())) {
            
            return new MultilanguageLongNameWrapper(userDefinedCommunicationController.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedCommunicationController.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedCommunicationController.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedCommunicationController.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedCommunicationController.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getAnnotations())) {
            ArrayList<Annotation> originalList = userDefinedCommunicationController.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedCommunicationControllerConditionalWrapper> getUserDefinedCommunicationControllerVariants() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationController.getUserDefinedCommunicationControllerVariants())) {
            ArrayList<UserDefinedCommunicationControllerConditional> originalList = userDefinedCommunicationController.getUserDefinedCommunicationControllerVariants();
            ArrayList<UserDefinedCommunicationControllerConditionalWrapper> wrapperList = (ArrayList<UserDefinedCommunicationControllerConditionalWrapper>)originalList.stream()
                .map(item -> new UserDefinedCommunicationControllerConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}