package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DelegationSwConnectorWrapper {

    
    private DelegationSwConnector delegationSwConnector;

    public DelegationSwConnectorWrapper(DelegationSwConnector delegationSwConnector) {
        this.delegationSwConnector = delegationSwConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getS())) {
            
            return delegationSwConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getT())) {
            
            return delegationSwConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getUuid())) {
            
            return delegationSwConnector.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getShortName())) {
            
            return new IdentifierWrapper(delegationSwConnector.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = delegationSwConnector.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getLongName())) {
            
            return new MultilanguageLongNameWrapper(delegationSwConnector.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(delegationSwConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getCategory())) {
            
            return new CategoryStringWrapper(delegationSwConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getAdminData())) {
            
            return new AdminDataWrapper(delegationSwConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(delegationSwConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getAnnotations())) {
            ArrayList<Annotation> originalList = delegationSwConnector.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MappingRefWrapper getMappingRef() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getMappingRef())) {
            
            return new MappingRefWrapper(delegationSwConnector.getMappingRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getVariationPoint())) {
            
            return new VariationPointWrapper(delegationSwConnector.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public InnerPortIrefWrapper getInnerPortIref() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getInnerPortIref())) {
            
            return new InnerPortIrefWrapper(delegationSwConnector.getInnerPortIref());
            
        } else {
            return null;
        }
        
    }

    public OuterPortRefWrapper getOuterPortRef() {
        
        if (CollUtil.isNotEmpty(delegationSwConnector.getOuterPortRef())) {
            
            return new OuterPortRefWrapper(delegationSwConnector.getOuterPortRef());
            
        } else {
            return null;
        }
        
    }




    


    
}