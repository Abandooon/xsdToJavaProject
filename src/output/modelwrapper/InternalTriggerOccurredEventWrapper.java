package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class InternalTriggerOccurredEventWrapper {

    
    private InternalTriggerOccurredEvent internalTriggerOccurredEvent;

    public InternalTriggerOccurredEventWrapper(InternalTriggerOccurredEvent internalTriggerOccurredEvent) {
        this.internalTriggerOccurredEvent = internalTriggerOccurredEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getS())) {
            
            return internalTriggerOccurredEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getT())) {
            
            return internalTriggerOccurredEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getUuid())) {
            
            return internalTriggerOccurredEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getShortName())) {
            
            return new IdentifierWrapper(internalTriggerOccurredEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = internalTriggerOccurredEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(internalTriggerOccurredEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(internalTriggerOccurredEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getCategory())) {
            
            return new CategoryStringWrapper(internalTriggerOccurredEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getAdminData())) {
            
            return new AdminDataWrapper(internalTriggerOccurredEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(internalTriggerOccurredEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = internalTriggerOccurredEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(internalTriggerOccurredEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = internalTriggerOccurredEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(internalTriggerOccurredEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(internalTriggerOccurredEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventSourceRef_InternalTriggerOccurredEventWrapper getEventSourceRef() {
        
        if (CollUtil.isNotEmpty(internalTriggerOccurredEvent.getEventSourceRef())) {
            
            return new EventSourceRef_InternalTriggerOccurredEventWrapper(internalTriggerOccurredEvent.getEventSourceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}