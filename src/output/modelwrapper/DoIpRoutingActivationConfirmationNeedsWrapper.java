package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DoIpRoutingActivationConfirmationNeedsWrapper {

    
    private DoIpRoutingActivationConfirmationNeeds doIpRoutingActivationConfirmationNeeds;

    public DoIpRoutingActivationConfirmationNeedsWrapper(DoIpRoutingActivationConfirmationNeeds doIpRoutingActivationConfirmationNeeds) {
        this.doIpRoutingActivationConfirmationNeeds = doIpRoutingActivationConfirmationNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getS())) {
            
            return doIpRoutingActivationConfirmationNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getT())) {
            
            return doIpRoutingActivationConfirmationNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getUuid())) {
            
            return doIpRoutingActivationConfirmationNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getShortName())) {
            
            return new IdentifierWrapper(doIpRoutingActivationConfirmationNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = doIpRoutingActivationConfirmationNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(doIpRoutingActivationConfirmationNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(doIpRoutingActivationConfirmationNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getCategory())) {
            
            return new CategoryStringWrapper(doIpRoutingActivationConfirmationNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getAdminData())) {
            
            return new AdminDataWrapper(doIpRoutingActivationConfirmationNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(doIpRoutingActivationConfirmationNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = doIpRoutingActivationConfirmationNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataLengthRequest() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getDataLengthRequest())) {
            
            return new PositiveIntegerWrapper(doIpRoutingActivationConfirmationNeeds.getDataLengthRequest());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataLengthResponse() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getDataLengthResponse())) {
            
            return new PositiveIntegerWrapper(doIpRoutingActivationConfirmationNeeds.getDataLengthResponse());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getRoutingActivationType() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationConfirmationNeeds.getRoutingActivationType())) {
            
            return new NmtokenStringWrapper(doIpRoutingActivationConfirmationNeeds.getRoutingActivationType());
            
        } else {
            return null;
        }
        
    }




    


    
}