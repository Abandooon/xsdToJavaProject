package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswModeSwitchEventWrapper {

    
    private BswModeSwitchEvent bswModeSwitchEvent;

    public BswModeSwitchEventWrapper(BswModeSwitchEvent bswModeSwitchEvent) {
        this.bswModeSwitchEvent = bswModeSwitchEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getS())) {
            
            return bswModeSwitchEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getT())) {
            
            return bswModeSwitchEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getUuid())) {
            
            return bswModeSwitchEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getShortName())) {
            
            return new IdentifierWrapper(bswModeSwitchEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswModeSwitchEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswModeSwitchEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswModeSwitchEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswModeSwitchEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswModeSwitchEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswModeSwitchEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswModeSwitchEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswModeSwitchEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswModeSwitchEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswModeSwitchEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswModeSwitchEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModeSwitchEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ModeActivationKindWrapper getActivation() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getActivation())) {
            
            return new ModeActivationKindWrapper(bswModeSwitchEvent.getActivation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchEvent.getModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswModeSwitchEvent.getModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}