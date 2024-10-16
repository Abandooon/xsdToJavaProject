package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class ISignalPortWrapper {

    
    private ISignalPort iSignalPort;

    public ISignalPortWrapper(ISignalPort iSignalPort) {
        this.iSignalPort = iSignalPort;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getS())) {
            
            return iSignalPort.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getT())) {
            
            return iSignalPort.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getUuid())) {
            
            return iSignalPort.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getShortName())) {
            
            return new IdentifierWrapper(iSignalPort.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = iSignalPort.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getLongName())) {
            
            return new MultilanguageLongNameWrapper(iSignalPort.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(iSignalPort.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getCategory())) {
            
            return new CategoryStringWrapper(iSignalPort.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getAdminData())) {
            
            return new AdminDataWrapper(iSignalPort.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iSignalPort.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getAnnotations())) {
            ArrayList<Annotation> originalList = iSignalPort.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(iSignalPort.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignalPort.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DataFilterWrapper getDataFilter() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getDataFilter())) {
            
            return new DataFilterWrapper(iSignalPort.getDataFilter());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeout() {
        
        if (CollUtil.isNotEmpty(iSignalPort.getTimeout())) {
            
            return new TimeValueWrapper(iSignalPort.getTimeout());
            
        } else {
            return null;
        }
        
    }




    


    
}