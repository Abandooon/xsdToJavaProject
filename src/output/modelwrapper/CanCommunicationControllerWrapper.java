package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class CanCommunicationControllerWrapper {

    
    private CanCommunicationController canCommunicationController;

    public CanCommunicationControllerWrapper(CanCommunicationController canCommunicationController) {
        this.canCommunicationController = canCommunicationController;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getS())) {
            
            return canCommunicationController.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getT())) {
            
            return canCommunicationController.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getUuid())) {
            
            return canCommunicationController.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getShortName())) {
            
            return new IdentifierWrapper(canCommunicationController.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canCommunicationController.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canCommunicationController.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canCommunicationController.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getCategory())) {
            
            return new CategoryStringWrapper(canCommunicationController.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getAdminData())) {
            
            return new AdminDataWrapper(canCommunicationController.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canCommunicationController.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getAnnotations())) {
            ArrayList<Annotation> originalList = canCommunicationController.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanCommunicationControllerConditionalWrapper> getCanCommunicationControllerVariants() {
        
        if (CollUtil.isNotEmpty(canCommunicationController.getCanCommunicationControllerVariants())) {
            ArrayList<CanCommunicationControllerConditional> originalList = canCommunicationController.getCanCommunicationControllerVariants();
            ArrayList<CanCommunicationControllerConditionalWrapper> wrapperList = (ArrayList<CanCommunicationControllerConditionalWrapper>)originalList.stream()
                .map(item -> new CanCommunicationControllerConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}