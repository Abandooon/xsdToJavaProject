package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class SystemTimingWrapper {

    
    private SystemTiming systemTiming;

    public SystemTimingWrapper(SystemTiming systemTiming) {
        this.systemTiming = systemTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(systemTiming.getS())) {
            
            return systemTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(systemTiming.getT())) {
            
            return systemTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(systemTiming.getUuid())) {
            
            return systemTiming.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(systemTiming.getShortName())) {
            
            return new IdentifierWrapper(systemTiming.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(systemTiming.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = systemTiming.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(systemTiming.getLongName())) {
            
            return new MultilanguageLongNameWrapper(systemTiming.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(systemTiming.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(systemTiming.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(systemTiming.getCategory())) {
            
            return new CategoryStringWrapper(systemTiming.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(systemTiming.getAdminData())) {
            
            return new AdminDataWrapper(systemTiming.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(systemTiming.getIntroduction())) {
            
            return new DocumentationBlockWrapper(systemTiming.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(systemTiming.getAnnotations())) {
            ArrayList<Annotation> originalList = systemTiming.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(systemTiming.getVariationPoint())) {
            
            return new VariationPointWrapper(systemTiming.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TimingDescriptionsWrapper getTimingDescriptions() {
        
        if (CollUtil.isNotEmpty(systemTiming.getTimingDescriptions())) {
            
            return new TimingDescriptionsWrapper(systemTiming.getTimingDescriptions());
            
        } else {
            return null;
        }
        
    }

    public TimingGuaranteesWrapper getTimingGuarantees() {
        
        if (CollUtil.isNotEmpty(systemTiming.getTimingGuarantees())) {
            
            return new TimingGuaranteesWrapper(systemTiming.getTimingGuarantees());
            
        } else {
            return null;
        }
        
    }

    public TimingRequirementsWrapper getTimingRequirements() {
        
        if (CollUtil.isNotEmpty(systemTiming.getTimingRequirements())) {
            
            return new TimingRequirementsWrapper(systemTiming.getTimingRequirements());
            
        } else {
            return null;
        }
        
    }

    public SystemRefWrapper getSystemRef() {
        
        if (CollUtil.isNotEmpty(systemTiming.getSystemRef())) {
            
            return new SystemRefWrapper(systemTiming.getSystemRef());
            
        } else {
            return null;
        }
        
    }




    


    
}