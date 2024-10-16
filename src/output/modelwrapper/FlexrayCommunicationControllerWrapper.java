package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class FlexrayCommunicationControllerWrapper {

    
    private FlexrayCommunicationController flexrayCommunicationController;

    public FlexrayCommunicationControllerWrapper(FlexrayCommunicationController flexrayCommunicationController) {
        this.flexrayCommunicationController = flexrayCommunicationController;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getS())) {
            
            return flexrayCommunicationController.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getT())) {
            
            return flexrayCommunicationController.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getUuid())) {
            
            return flexrayCommunicationController.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getShortName())) {
            
            return new IdentifierWrapper(flexrayCommunicationController.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayCommunicationController.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayCommunicationController.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayCommunicationController.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getCategory())) {
            
            return new CategoryStringWrapper(flexrayCommunicationController.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getAdminData())) {
            
            return new AdminDataWrapper(flexrayCommunicationController.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayCommunicationController.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayCommunicationController.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayCommunicationControllerConditionalWrapper> getFlexrayCommunicationControllerVariants() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationController.getFlexrayCommunicationControllerVariants())) {
            ArrayList<FlexrayCommunicationControllerConditional> originalList = flexrayCommunicationController.getFlexrayCommunicationControllerVariants();
            ArrayList<FlexrayCommunicationControllerConditionalWrapper> wrapperList = (ArrayList<FlexrayCommunicationControllerConditionalWrapper>)originalList.stream()
                .map(item -> new FlexrayCommunicationControllerConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}