package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class ExternalTriggerOccurredEventWrapper {

    
    private ExternalTriggerOccurredEvent externalTriggerOccurredEvent;

    public ExternalTriggerOccurredEventWrapper(ExternalTriggerOccurredEvent externalTriggerOccurredEvent) {
        this.externalTriggerOccurredEvent = externalTriggerOccurredEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getS())) {
            
            return externalTriggerOccurredEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getT())) {
            
            return externalTriggerOccurredEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getUuid())) {
            
            return externalTriggerOccurredEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getShortName())) {
            
            return new IdentifierWrapper(externalTriggerOccurredEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = externalTriggerOccurredEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(externalTriggerOccurredEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(externalTriggerOccurredEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getCategory())) {
            
            return new CategoryStringWrapper(externalTriggerOccurredEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getAdminData())) {
            
            return new AdminDataWrapper(externalTriggerOccurredEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(externalTriggerOccurredEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = externalTriggerOccurredEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(externalTriggerOccurredEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = externalTriggerOccurredEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(externalTriggerOccurredEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(externalTriggerOccurredEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public RTriggerInAtomicSwcInstanceRefWrapper getTriggerIref() {
        
        if (CollUtil.isNotEmpty(externalTriggerOccurredEvent.getTriggerIref())) {
            
            return new RTriggerInAtomicSwcInstanceRefWrapper(externalTriggerOccurredEvent.getTriggerIref());
            
        } else {
            return null;
        }
        
    }




    


    
}