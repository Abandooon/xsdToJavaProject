package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class GatewayWrapper {

    
    private Gateway gateway;

    public GatewayWrapper(Gateway gateway) {
        this.gateway = gateway;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(gateway.getS())) {
            
            return gateway.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(gateway.getT())) {
            
            return gateway.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(gateway.getUuid())) {
            
            return gateway.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(gateway.getShortName())) {
            
            return new IdentifierWrapper(gateway.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(gateway.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = gateway.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(gateway.getLongName())) {
            
            return new MultilanguageLongNameWrapper(gateway.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(gateway.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(gateway.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(gateway.getCategory())) {
            
            return new CategoryStringWrapper(gateway.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(gateway.getAdminData())) {
            
            return new AdminDataWrapper(gateway.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(gateway.getIntroduction())) {
            
            return new DocumentationBlockWrapper(gateway.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(gateway.getAnnotations())) {
            ArrayList<Annotation> originalList = gateway.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(gateway.getVariationPoint())) {
            
            return new VariationPointWrapper(gateway.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EcuRefWrapper getEcuRef() {
        
        if (CollUtil.isNotEmpty(gateway.getEcuRef())) {
            
            return new EcuRefWrapper(gateway.getEcuRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FrameMappingWrapper> getFrameMappings() {
        
        if (CollUtil.isNotEmpty(gateway.getFrameMappings())) {
            ArrayList<FrameMapping> originalList = gateway.getFrameMappings();
            ArrayList<FrameMappingWrapper> wrapperList = (ArrayList<FrameMappingWrapper>)originalList.stream()
                .map(item -> new FrameMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<IPduMappingWrapper> getIPduMappings() {
        
        if (CollUtil.isNotEmpty(gateway.getIPduMappings())) {
            ArrayList<IPduMapping> originalList = gateway.getIPduMappings();
            ArrayList<IPduMappingWrapper> wrapperList = (ArrayList<IPduMappingWrapper>)originalList.stream()
                .map(item -> new IPduMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalMappingWrapper> getSignalMappings() {
        
        if (CollUtil.isNotEmpty(gateway.getSignalMappings())) {
            ArrayList<ISignalMapping> originalList = gateway.getSignalMappings();
            ArrayList<ISignalMappingWrapper> wrapperList = (ArrayList<ISignalMappingWrapper>)originalList.stream()
                .map(item -> new ISignalMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}