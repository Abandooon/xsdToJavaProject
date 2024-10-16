package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DoIpRoutingActivationAuthenticationNeedsWrapper {

    
    private DoIpRoutingActivationAuthenticationNeeds doIpRoutingActivationAuthenticationNeeds;

    public DoIpRoutingActivationAuthenticationNeedsWrapper(DoIpRoutingActivationAuthenticationNeeds doIpRoutingActivationAuthenticationNeeds) {
        this.doIpRoutingActivationAuthenticationNeeds = doIpRoutingActivationAuthenticationNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getS())) {
            
            return doIpRoutingActivationAuthenticationNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getT())) {
            
            return doIpRoutingActivationAuthenticationNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getUuid())) {
            
            return doIpRoutingActivationAuthenticationNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getShortName())) {
            
            return new IdentifierWrapper(doIpRoutingActivationAuthenticationNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = doIpRoutingActivationAuthenticationNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(doIpRoutingActivationAuthenticationNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(doIpRoutingActivationAuthenticationNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getCategory())) {
            
            return new CategoryStringWrapper(doIpRoutingActivationAuthenticationNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getAdminData())) {
            
            return new AdminDataWrapper(doIpRoutingActivationAuthenticationNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(doIpRoutingActivationAuthenticationNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = doIpRoutingActivationAuthenticationNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataLengthRequest() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getDataLengthRequest())) {
            
            return new PositiveIntegerWrapper(doIpRoutingActivationAuthenticationNeeds.getDataLengthRequest());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataLengthResponse() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getDataLengthResponse())) {
            
            return new PositiveIntegerWrapper(doIpRoutingActivationAuthenticationNeeds.getDataLengthResponse());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getRoutingActivationType() {
        
        if (CollUtil.isNotEmpty(doIpRoutingActivationAuthenticationNeeds.getRoutingActivationType())) {
            
            return new NmtokenStringWrapper(doIpRoutingActivationAuthenticationNeeds.getRoutingActivationType());
            
        } else {
            return null;
        }
        
    }




    


    
}