package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class PassThroughSwConnectorWrapper {

    
    private PassThroughSwConnector passThroughSwConnector;

    public PassThroughSwConnectorWrapper(PassThroughSwConnector passThroughSwConnector) {
        this.passThroughSwConnector = passThroughSwConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getS())) {
            
            return passThroughSwConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getT())) {
            
            return passThroughSwConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getUuid())) {
            
            return passThroughSwConnector.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getShortName())) {
            
            return new IdentifierWrapper(passThroughSwConnector.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = passThroughSwConnector.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getLongName())) {
            
            return new MultilanguageLongNameWrapper(passThroughSwConnector.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(passThroughSwConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getCategory())) {
            
            return new CategoryStringWrapper(passThroughSwConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getAdminData())) {
            
            return new AdminDataWrapper(passThroughSwConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(passThroughSwConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getAnnotations())) {
            ArrayList<Annotation> originalList = passThroughSwConnector.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MappingRefWrapper getMappingRef() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getMappingRef())) {
            
            return new MappingRefWrapper(passThroughSwConnector.getMappingRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getVariationPoint())) {
            
            return new VariationPointWrapper(passThroughSwConnector.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ProvidedOuterPortRefWrapper getProvidedOuterPortRef() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getProvidedOuterPortRef())) {
            
            return new ProvidedOuterPortRefWrapper(passThroughSwConnector.getProvidedOuterPortRef());
            
        } else {
            return null;
        }
        
    }

    public RequiredOuterPortRefWrapper getRequiredOuterPortRef() {
        
        if (CollUtil.isNotEmpty(passThroughSwConnector.getRequiredOuterPortRef())) {
            
            return new RequiredOuterPortRefWrapper(passThroughSwConnector.getRequiredOuterPortRef());
            
        } else {
            return null;
        }
        
    }




    


    
}