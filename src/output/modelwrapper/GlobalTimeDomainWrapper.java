package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class GlobalTimeDomainWrapper {

    
    private GlobalTimeDomain globalTimeDomain;

    public GlobalTimeDomainWrapper(GlobalTimeDomain globalTimeDomain) {
        this.globalTimeDomain = globalTimeDomain;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getS())) {
            
            return globalTimeDomain.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getT())) {
            
            return globalTimeDomain.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getUuid())) {
            
            return globalTimeDomain.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getShortName())) {
            
            return new IdentifierWrapper(globalTimeDomain.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = globalTimeDomain.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getLongName())) {
            
            return new MultilanguageLongNameWrapper(globalTimeDomain.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(globalTimeDomain.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getCategory())) {
            
            return new CategoryStringWrapper(globalTimeDomain.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getAdminData())) {
            
            return new AdminDataWrapper(globalTimeDomain.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getIntroduction())) {
            
            return new DocumentationBlockWrapper(globalTimeDomain.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getAnnotations())) {
            ArrayList<Annotation> originalList = globalTimeDomain.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getVariationPoint())) {
            
            return new VariationPointWrapper(globalTimeDomain.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CommunicationClusterRefWrapper> getCommunicationClusterRefs() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getCommunicationClusterRefs())) {
            ArrayList<CommunicationClusterRef> originalList = globalTimeDomain.getCommunicationClusterRefs();
            ArrayList<CommunicationClusterRefWrapper> wrapperList = (ArrayList<CommunicationClusterRefWrapper>)originalList.stream()
                .map(item -> new CommunicationClusterRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDomainId() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getDomainId())) {
            
            return new PositiveIntegerWrapper(globalTimeDomain.getDomainId());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getFollowUpTimeoutValue() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getFollowUpTimeoutValue())) {
            
            return new TimeValueWrapper(globalTimeDomain.getFollowUpTimeoutValue());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<GlobalTimeGatewayWrapper> getGateways() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getGateways())) {
            ArrayList<GlobalTimeGateway> originalList = globalTimeDomain.getGateways();
            ArrayList<GlobalTimeGatewayWrapper> wrapperList = (ArrayList<GlobalTimeGatewayWrapper>)originalList.stream()
                .map(item -> new GlobalTimeGatewayWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public GlobalTimePduRefWrapper getGlobalTimePduRef() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getGlobalTimePduRef())) {
            
            return new GlobalTimePduRefWrapper(globalTimeDomain.getGlobalTimePduRef());
            
        } else {
            return null;
        }
        
    }

    public MasterWrapper getMaster() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getMaster())) {
            
            return new MasterWrapper(globalTimeDomain.getMaster());
            
        } else {
            return null;
        }
        
    }

    public OffsetTimeDomainRefWrapper getOffsetTimeDomainRef() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getOffsetTimeDomainRef())) {
            
            return new OffsetTimeDomainRefWrapper(globalTimeDomain.getOffsetTimeDomainRef());
            
        } else {
            return null;
        }
        
    }

    public SlavesWrapper getSlaves() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getSlaves())) {
            
            return new SlavesWrapper(globalTimeDomain.getSlaves());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SubDomainRefWrapper> getSubDomainRefs() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getSubDomainRefs())) {
            ArrayList<SubDomainRef> originalList = globalTimeDomain.getSubDomainRefs();
            ArrayList<SubDomainRefWrapper> wrapperList = (ArrayList<SubDomainRefWrapper>)originalList.stream()
                .map(item -> new SubDomainRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSyncLossThreshold() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getSyncLossThreshold())) {
            
            return new TimeValueWrapper(globalTimeDomain.getSyncLossThreshold());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSyncLossTimeout() {
        
        if (CollUtil.isNotEmpty(globalTimeDomain.getSyncLossTimeout())) {
            
            return new TimeValueWrapper(globalTimeDomain.getSyncLossTimeout());
            
        } else {
            return null;
        }
        
    }




    


    
}