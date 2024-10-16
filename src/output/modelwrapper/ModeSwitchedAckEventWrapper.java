package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class ModeSwitchedAckEventWrapper {

    
    private ModeSwitchedAckEvent modeSwitchedAckEvent;

    public ModeSwitchedAckEventWrapper(ModeSwitchedAckEvent modeSwitchedAckEvent) {
        this.modeSwitchedAckEvent = modeSwitchedAckEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getS())) {
            
            return modeSwitchedAckEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getT())) {
            
            return modeSwitchedAckEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getUuid())) {
            
            return modeSwitchedAckEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getShortName())) {
            
            return new IdentifierWrapper(modeSwitchedAckEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeSwitchedAckEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeSwitchedAckEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeSwitchedAckEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getCategory())) {
            
            return new CategoryStringWrapper(modeSwitchedAckEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getAdminData())) {
            
            return new AdminDataWrapper(modeSwitchedAckEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeSwitchedAckEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = modeSwitchedAckEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(modeSwitchedAckEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = modeSwitchedAckEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(modeSwitchedAckEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(modeSwitchedAckEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventSourceRef_ModeSwitchedAckEventWrapper getEventSourceRef() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckEvent.getEventSourceRef())) {
            
            return new EventSourceRef_ModeSwitchedAckEventWrapper(modeSwitchedAckEvent.getEventSourceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}