package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswOperationInvokedEventWrapper {

    
    private BswOperationInvokedEvent bswOperationInvokedEvent;

    public BswOperationInvokedEventWrapper(BswOperationInvokedEvent bswOperationInvokedEvent) {
        this.bswOperationInvokedEvent = bswOperationInvokedEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getS())) {
            
            return bswOperationInvokedEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getT())) {
            
            return bswOperationInvokedEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getUuid())) {
            
            return bswOperationInvokedEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getShortName())) {
            
            return new IdentifierWrapper(bswOperationInvokedEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswOperationInvokedEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswOperationInvokedEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswOperationInvokedEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getCategory())) {
            
            return new CategoryStringWrapper(bswOperationInvokedEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getAdminData())) {
            
            return new AdminDataWrapper(bswOperationInvokedEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswOperationInvokedEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswOperationInvokedEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(bswOperationInvokedEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswOperationInvokedEvent.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> getDisabledInModeIrefs() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getDisabledInModeIrefs())) {
            ArrayList<ModeInBswModuleDescriptionInstanceRef> originalList = bswOperationInvokedEvent.getDisabledInModeIrefs();
            ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper> wrapperList = (ArrayList<ModeInBswModuleDescriptionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ModeInBswModuleDescriptionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartsOnEventRefWrapper getStartsOnEventRef() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getStartsOnEventRef())) {
            
            return new StartsOnEventRefWrapper(bswOperationInvokedEvent.getStartsOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(bswOperationInvokedEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EntryRefWrapper getEntryRef() {
        
        if (CollUtil.isNotEmpty(bswOperationInvokedEvent.getEntryRef())) {
            
            return new EntryRefWrapper(bswOperationInvokedEvent.getEntryRef());
            
        } else {
            return null;
        }
        
    }




    


    
}