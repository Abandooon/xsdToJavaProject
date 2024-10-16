package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswModeManagerErrorEventWrapper {

    
    private BswModeManagerErrorEvent bswModeManagerErrorEvent;

    public BswModeManagerErrorEventWrapper(BswModeManagerErrorEvent bswModeManagerErrorEvent) {
        this.bswModeManagerErrorEvent = bswModeManagerErrorEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getS())) {
            
            return bswModeManagerErrorEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getT())) {
            
            return bswModeManagerErrorEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getUuid())) {
            
            return bswModeManagerErrorEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getShortName())) {
            
            return new IdentifierWrapper(bswModeManagerErrorEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswModeManagerErrorEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswModeManagerErrorEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswModeManagerErrorEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswModeManagerErrorEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswModeManagerErrorEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswModeManagerErrorEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswModeManagerErrorEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswModeManagerErrorEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswModeManagerErrorEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswModeManagerErrorEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswModeManagerErrorEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModeManagerErrorEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ModeGroupRefWrapper getModeGroupRef() {
        
        if (CollUtil.isNotEmpty(bswModeManagerErrorEvent.getModeGroupRef())) {
            
            return new ModeGroupRefWrapper(bswModeManagerErrorEvent.getModeGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}