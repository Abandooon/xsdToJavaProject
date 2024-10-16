package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class BswBackgroundEventWrapper {

    
    private BswBackgroundEvent bswBackgroundEvent;

    public BswBackgroundEventWrapper(BswBackgroundEvent bswBackgroundEvent) {
        this.bswBackgroundEvent = bswBackgroundEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getS())) {
            
            return bswBackgroundEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getT())) {
            
            return bswBackgroundEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getUuid())) {
            
            return bswBackgroundEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getShortName())) {
            
            return new IdentifierWrapper(bswBackgroundEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswBackgroundEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswBackgroundEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswBackgroundEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswBackgroundEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswBackgroundEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswBackgroundEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswBackgroundEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswBackgroundEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswBackgroundEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswBackgroundEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswBackgroundEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswBackgroundEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswBackgroundEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}