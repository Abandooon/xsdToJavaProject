package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswExternalTriggerOccurredEventWrapper {

    
    private BswExternalTriggerOccurredEvent bswExternalTriggerOccurredEvent;

    public BswExternalTriggerOccurredEventWrapper(BswExternalTriggerOccurredEvent bswExternalTriggerOccurredEvent) {
        this.bswExternalTriggerOccurredEvent = bswExternalTriggerOccurredEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getS())) {
            
            return bswExternalTriggerOccurredEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getT())) {
            
            return bswExternalTriggerOccurredEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getUuid())) {
            
            return bswExternalTriggerOccurredEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getShortName())) {
            
            return new IdentifierWrapper(bswExternalTriggerOccurredEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswExternalTriggerOccurredEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswExternalTriggerOccurredEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswExternalTriggerOccurredEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswExternalTriggerOccurredEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswExternalTriggerOccurredEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswExternalTriggerOccurredEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswExternalTriggerOccurredEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswExternalTriggerOccurredEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswExternalTriggerOccurredEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswExternalTriggerOccurredEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswExternalTriggerOccurredEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswExternalTriggerOccurredEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TriggerRefWrapper getTriggerRef() {
        
        if (CollUtil.isNotEmpty(bswExternalTriggerOccurredEvent.getTriggerRef())) {
            
            return new TriggerRefWrapper(bswExternalTriggerOccurredEvent.getTriggerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}