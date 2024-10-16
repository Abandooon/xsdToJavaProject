package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwcTimingWrapper {

    
    private SwcTiming swcTiming;

    public SwcTimingWrapper(SwcTiming swcTiming) {
        this.swcTiming = swcTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcTiming.getS())) {
            
            return swcTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcTiming.getT())) {
            
            return swcTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swcTiming.getUuid())) {
            
            return swcTiming.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swcTiming.getShortName())) {
            
            return new IdentifierWrapper(swcTiming.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swcTiming.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swcTiming.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swcTiming.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swcTiming.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swcTiming.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swcTiming.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swcTiming.getCategory())) {
            
            return new CategoryStringWrapper(swcTiming.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swcTiming.getAdminData())) {
            
            return new AdminDataWrapper(swcTiming.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcTiming.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcTiming.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swcTiming.getAnnotations())) {
            ArrayList<Annotation> originalList = swcTiming.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcTiming.getVariationPoint())) {
            
            return new VariationPointWrapper(swcTiming.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TimingDescriptionsWrapper getTimingDescriptions() {
        
        if (CollUtil.isNotEmpty(swcTiming.getTimingDescriptions())) {
            
            return new TimingDescriptionsWrapper(swcTiming.getTimingDescriptions());
            
        } else {
            return null;
        }
        
    }

    public TimingGuaranteesWrapper getTimingGuarantees() {
        
        if (CollUtil.isNotEmpty(swcTiming.getTimingGuarantees())) {
            
            return new TimingGuaranteesWrapper(swcTiming.getTimingGuarantees());
            
        } else {
            return null;
        }
        
    }

    public TimingRequirementsWrapper getTimingRequirements() {
        
        if (CollUtil.isNotEmpty(swcTiming.getTimingRequirements())) {
            
            return new TimingRequirementsWrapper(swcTiming.getTimingRequirements());
            
        } else {
            return null;
        }
        
    }

    public BehaviorRef_SwcImplementationWrapper getBehaviorRef() {
        
        if (CollUtil.isNotEmpty(swcTiming.getBehaviorRef())) {
            
            return new BehaviorRef_SwcImplementationWrapper(swcTiming.getBehaviorRef());
            
        } else {
            return null;
        }
        
    }

    public ComponentRefWrapper getComponentRef() {
        
        if (CollUtil.isNotEmpty(swcTiming.getComponentRef())) {
            
            return new ComponentRefWrapper(swcTiming.getComponentRef());
            
        } else {
            return null;
        }
        
    }




    


    
}