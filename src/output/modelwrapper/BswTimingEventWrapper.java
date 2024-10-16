package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswTimingEventWrapper {

    
    private BswTimingEvent bswTimingEvent;

    public BswTimingEventWrapper(BswTimingEvent bswTimingEvent) {
        this.bswTimingEvent = bswTimingEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getS())) {
            
            return bswTimingEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getT())) {
            
            return bswTimingEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getUuid())) {
            
            return bswTimingEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getShortName())) {
            
            return new IdentifierWrapper(bswTimingEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswTimingEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswTimingEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswTimingEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswTimingEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswTimingEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswTimingEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswTimingEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswTimingEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswTimingEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswTimingEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswTimingEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswTimingEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getPeriod() {
        
        if (CollUtil.isNotEmpty(bswTimingEvent.getPeriod())) {
            
            return new TimeValueWrapper(bswTimingEvent.getPeriod());
            
        } else {
            return null;
        }
        
    }




    


    
}