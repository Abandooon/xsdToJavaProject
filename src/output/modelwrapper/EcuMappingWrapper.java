package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class EcuMappingWrapper {

    
    private EcuMapping ecuMapping;

    public EcuMappingWrapper(EcuMapping ecuMapping) {
        this.ecuMapping = ecuMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getS())) {
            
            return ecuMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getT())) {
            
            return ecuMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getUuid())) {
            
            return ecuMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getShortName())) {
            
            return new IdentifierWrapper(ecuMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecuMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecuMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecuMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getCategory())) {
            
            return new CategoryStringWrapper(ecuMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getAdminData())) {
            
            return new AdminDataWrapper(ecuMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecuMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = ecuMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CommunicationControllerMappingWrapper> getCommControllerMappings() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getCommControllerMappings())) {
            ArrayList<CommunicationControllerMapping> originalList = ecuMapping.getCommControllerMappings();
            ArrayList<CommunicationControllerMappingWrapper> wrapperList = (ArrayList<CommunicationControllerMappingWrapper>)originalList.stream()
                .map(item -> new CommunicationControllerMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(ecuMapping.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public EcuRef_EcuMappingWrapper getEcuRef() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getEcuRef())) {
            
            return new EcuRef_EcuMappingWrapper(ecuMapping.getEcuRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwPortMappingWrapper> getHwPortMappings() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getHwPortMappings())) {
            ArrayList<HwPortMapping> originalList = ecuMapping.getHwPortMappings();
            ArrayList<HwPortMappingWrapper> wrapperList = (ArrayList<HwPortMappingWrapper>)originalList.stream()
                .map(item -> new HwPortMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecuMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(ecuMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}