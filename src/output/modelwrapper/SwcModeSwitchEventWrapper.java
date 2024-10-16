package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwcModeSwitchEventWrapper {

    
    private SwcModeSwitchEvent swcModeSwitchEvent;

    public SwcModeSwitchEventWrapper(SwcModeSwitchEvent swcModeSwitchEvent) {
        this.swcModeSwitchEvent = swcModeSwitchEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getS())) {
            
            return swcModeSwitchEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getT())) {
            
            return swcModeSwitchEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getUuid())) {
            
            return swcModeSwitchEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getShortName())) {
            
            return new IdentifierWrapper(swcModeSwitchEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swcModeSwitchEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swcModeSwitchEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swcModeSwitchEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getCategory())) {
            
            return new CategoryStringWrapper(swcModeSwitchEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getAdminData())) {
            
            return new AdminDataWrapper(swcModeSwitchEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcModeSwitchEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = swcModeSwitchEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(swcModeSwitchEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = swcModeSwitchEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(swcModeSwitchEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(swcModeSwitchEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ModeActivationKindWrapper getActivation() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getActivation())) {
            
            return new ModeActivationKindWrapper(swcModeSwitchEvent.getActivation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getModeIrefs() {
        
        if (CollUtil.isNotEmpty(swcModeSwitchEvent.getModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = swcModeSwitchEvent.getModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}