package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class BswModuleTimingWrapper {

    
    private BswModuleTiming bswModuleTiming;

    public BswModuleTimingWrapper(BswModuleTiming bswModuleTiming) {
        this.bswModuleTiming = bswModuleTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getS())) {
            
            return bswModuleTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getT())) {
            
            return bswModuleTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getUuid())) {
            
            return bswModuleTiming.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getShortName())) {
            
            return new IdentifierWrapper(bswModuleTiming.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswModuleTiming.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswModuleTiming.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswModuleTiming.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getCategory())) {
            
            return new CategoryStringWrapper(bswModuleTiming.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getAdminData())) {
            
            return new AdminDataWrapper(bswModuleTiming.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswModuleTiming.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getAnnotations())) {
            ArrayList<Annotation> originalList = bswModuleTiming.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModuleTiming.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TimingDescriptionsWrapper getTimingDescriptions() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getTimingDescriptions())) {
            
            return new TimingDescriptionsWrapper(bswModuleTiming.getTimingDescriptions());
            
        } else {
            return null;
        }
        
    }

    public TimingGuaranteesWrapper getTimingGuarantees() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getTimingGuarantees())) {
            
            return new TimingGuaranteesWrapper(bswModuleTiming.getTimingGuarantees());
            
        } else {
            return null;
        }
        
    }

    public TimingRequirementsWrapper getTimingRequirements() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getTimingRequirements())) {
            
            return new TimingRequirementsWrapper(bswModuleTiming.getTimingRequirements());
            
        } else {
            return null;
        }
        
    }

    public BehaviorRefWrapper getBehaviorRef() {
        
        if (CollUtil.isNotEmpty(bswModuleTiming.getBehaviorRef())) {
            
            return new BehaviorRefWrapper(bswModuleTiming.getBehaviorRef());
            
        } else {
            return null;
        }
        
    }




    


    
}