package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswInternalTriggerOccurredEventWrapper {

    
    private BswInternalTriggerOccurredEvent bswInternalTriggerOccurredEvent;

    public BswInternalTriggerOccurredEventWrapper(BswInternalTriggerOccurredEvent bswInternalTriggerOccurredEvent) {
        this.bswInternalTriggerOccurredEvent = bswInternalTriggerOccurredEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getS())) {
            
            return bswInternalTriggerOccurredEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getT())) {
            
            return bswInternalTriggerOccurredEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getUuid())) {
            
            return bswInternalTriggerOccurredEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getShortName())) {
            
            return new IdentifierWrapper(bswInternalTriggerOccurredEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswInternalTriggerOccurredEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswInternalTriggerOccurredEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswInternalTriggerOccurredEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswInternalTriggerOccurredEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswInternalTriggerOccurredEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswInternalTriggerOccurredEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswInternalTriggerOccurredEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswInternalTriggerOccurredEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswInternalTriggerOccurredEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswInternalTriggerOccurredEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswInternalTriggerOccurredEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswInternalTriggerOccurredEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventSourceRef_BswInternalTriggerOccurredEventWrapper getEventSourceRef() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggerOccurredEvent.getEventSourceRef())) {
            
            return new EventSourceRef_BswInternalTriggerOccurredEventWrapper(bswInternalTriggerOccurredEvent.getEventSourceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}