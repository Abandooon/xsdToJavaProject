package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswAsynchronousServerCallReturnsEventWrapper {

    
    private BswAsynchronousServerCallReturnsEvent bswAsynchronousServerCallReturnsEvent;

    public BswAsynchronousServerCallReturnsEventWrapper(BswAsynchronousServerCallReturnsEvent bswAsynchronousServerCallReturnsEvent) {
        this.bswAsynchronousServerCallReturnsEvent = bswAsynchronousServerCallReturnsEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getS())) {
            
            return bswAsynchronousServerCallReturnsEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getT())) {
            
            return bswAsynchronousServerCallReturnsEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getUuid())) {
            
            return bswAsynchronousServerCallReturnsEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getShortName())) {
            
            return new IdentifierWrapper(bswAsynchronousServerCallReturnsEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswAsynchronousServerCallReturnsEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswAsynchronousServerCallReturnsEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswAsynchronousServerCallReturnsEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswAsynchronousServerCallReturnsEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswAsynchronousServerCallReturnsEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswAsynchronousServerCallReturnsEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswAsynchronousServerCallReturnsEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswAsynchronousServerCallReturnsEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswAsynchronousServerCallReturnsEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswAsynchronousServerCallReturnsEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswAsynchronousServerCallReturnsEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswAsynchronousServerCallReturnsEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventSourceRef_BswAsynchronousServerCallReturnsEventWrapper getEventSourceRef() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallReturnsEvent.getEventSourceRef())) {
            
            return new EventSourceRef_BswAsynchronousServerCallReturnsEventWrapper(bswAsynchronousServerCallReturnsEvent.getEventSourceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}