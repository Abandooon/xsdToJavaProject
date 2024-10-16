package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class EthernetCommunicationControllerWrapper {

    
    private EthernetCommunicationController ethernetCommunicationController;

    public EthernetCommunicationControllerWrapper(EthernetCommunicationController ethernetCommunicationController) {
        this.ethernetCommunicationController = ethernetCommunicationController;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getS())) {
            
            return ethernetCommunicationController.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getT())) {
            
            return ethernetCommunicationController.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getUuid())) {
            
            return ethernetCommunicationController.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getShortName())) {
            
            return new IdentifierWrapper(ethernetCommunicationController.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ethernetCommunicationController.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ethernetCommunicationController.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ethernetCommunicationController.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getCategory())) {
            
            return new CategoryStringWrapper(ethernetCommunicationController.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getAdminData())) {
            
            return new AdminDataWrapper(ethernetCommunicationController.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ethernetCommunicationController.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getAnnotations())) {
            ArrayList<Annotation> originalList = ethernetCommunicationController.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EthernetCommunicationControllerConditionalWrapper> getEthernetCommunicationControllerVariants() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationController.getEthernetCommunicationControllerVariants())) {
            ArrayList<EthernetCommunicationControllerConditional> originalList = ethernetCommunicationController.getEthernetCommunicationControllerVariants();
            ArrayList<EthernetCommunicationControllerConditionalWrapper> wrapperList = (ArrayList<EthernetCommunicationControllerConditionalWrapper>)originalList.stream()
                .map(item -> new EthernetCommunicationControllerConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}