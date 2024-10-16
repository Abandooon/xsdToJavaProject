package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswModeSwitchedAckEventWrapper {

    
    private BswModeSwitchedAckEvent bswModeSwitchedAckEvent;

    public BswModeSwitchedAckEventWrapper(BswModeSwitchedAckEvent bswModeSwitchedAckEvent) {
        this.bswModeSwitchedAckEvent = bswModeSwitchedAckEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getS())) {
            
            return bswModeSwitchedAckEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getT())) {
            
            return bswModeSwitchedAckEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getUuid())) {
            
            return bswModeSwitchedAckEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getShortName())) {
            
            return new IdentifierWrapper(bswModeSwitchedAckEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswModeSwitchedAckEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswModeSwitchedAckEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswModeSwitchedAckEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswModeSwitchedAckEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswModeSwitchedAckEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswModeSwitchedAckEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswModeSwitchedAckEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswModeSwitchedAckEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswModeSwitchedAckEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswModeSwitchedAckEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswModeSwitchedAckEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModeSwitchedAckEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ModeGroupRefWrapper getModeGroupRef() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchedAckEvent.getModeGroupRef())) {
            
            return new ModeGroupRefWrapper(bswModeSwitchedAckEvent.getModeGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}