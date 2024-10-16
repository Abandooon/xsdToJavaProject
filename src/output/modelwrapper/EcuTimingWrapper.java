package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class EcuTimingWrapper {

    
    private EcuTiming ecuTiming;

    public EcuTimingWrapper(EcuTiming ecuTiming) {
        this.ecuTiming = ecuTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getS())) {
            
            return ecuTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getT())) {
            
            return ecuTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getUuid())) {
            
            return ecuTiming.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getShortName())) {
            
            return new IdentifierWrapper(ecuTiming.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecuTiming.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecuTiming.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecuTiming.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getCategory())) {
            
            return new CategoryStringWrapper(ecuTiming.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getAdminData())) {
            
            return new AdminDataWrapper(ecuTiming.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecuTiming.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getAnnotations())) {
            ArrayList<Annotation> originalList = ecuTiming.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getVariationPoint())) {
            
            return new VariationPointWrapper(ecuTiming.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TimingDescriptionsWrapper getTimingDescriptions() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getTimingDescriptions())) {
            
            return new TimingDescriptionsWrapper(ecuTiming.getTimingDescriptions());
            
        } else {
            return null;
        }
        
    }

    public TimingGuaranteesWrapper getTimingGuarantees() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getTimingGuarantees())) {
            
            return new TimingGuaranteesWrapper(ecuTiming.getTimingGuarantees());
            
        } else {
            return null;
        }
        
    }

    public TimingRequirementsWrapper getTimingRequirements() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getTimingRequirements())) {
            
            return new TimingRequirementsWrapper(ecuTiming.getTimingRequirements());
            
        } else {
            return null;
        }
        
    }

    public EcuConfigurationRefWrapper getEcuConfigurationRef() {
        
        if (CollUtil.isNotEmpty(ecuTiming.getEcuConfigurationRef())) {
            
            return new EcuConfigurationRefWrapper(ecuTiming.getEcuConfigurationRef());
            
        } else {
            return null;
        }
        
    }




    


    
}