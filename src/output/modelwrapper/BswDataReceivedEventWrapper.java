package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswDataReceivedEventWrapper {

    
    private BswDataReceivedEvent bswDataReceivedEvent;

    public BswDataReceivedEventWrapper(BswDataReceivedEvent bswDataReceivedEvent) {
        this.bswDataReceivedEvent = bswDataReceivedEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getS())) {
            
            return bswDataReceivedEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getT())) {
            
            return bswDataReceivedEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getUuid())) {
            
            return bswDataReceivedEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getShortName())) {
            
            return new IdentifierWrapper(bswDataReceivedEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswDataReceivedEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswDataReceivedEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswDataReceivedEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswDataReceivedEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswDataReceivedEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswDataReceivedEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswDataReceivedEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswDataReceivedEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswDataReceivedEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswDataReceivedEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswDataReceivedEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswDataReceivedEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DataRefWrapper getDataRef() {
        
        if (CollUtil.isNotEmpty(bswDataReceivedEvent.getDataRef())) {
            
            return new DataRefWrapper(bswDataReceivedEvent.getDataRef());
            
        } else {
            return null;
        }
        
    }




    


    
}