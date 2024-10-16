package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class AsynchronousServerCallReturnsEventWrapper {

    
    private AsynchronousServerCallReturnsEvent asynchronousServerCallReturnsEvent;

    public AsynchronousServerCallReturnsEventWrapper(AsynchronousServerCallReturnsEvent asynchronousServerCallReturnsEvent) {
        this.asynchronousServerCallReturnsEvent = asynchronousServerCallReturnsEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getS())) {
            
            return asynchronousServerCallReturnsEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getT())) {
            
            return asynchronousServerCallReturnsEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getUuid())) {
            
            return asynchronousServerCallReturnsEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getShortName())) {
            
            return new IdentifierWrapper(asynchronousServerCallReturnsEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = asynchronousServerCallReturnsEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(asynchronousServerCallReturnsEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(asynchronousServerCallReturnsEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getCategory())) {
            
            return new CategoryStringWrapper(asynchronousServerCallReturnsEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getAdminData())) {
            
            return new AdminDataWrapper(asynchronousServerCallReturnsEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(asynchronousServerCallReturnsEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = asynchronousServerCallReturnsEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(asynchronousServerCallReturnsEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = asynchronousServerCallReturnsEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(asynchronousServerCallReturnsEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(asynchronousServerCallReturnsEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventSourceRef_AsynchronousServerCallReturnsEventWrapper getEventSourceRef() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallReturnsEvent.getEventSourceRef())) {
            
            return new EventSourceRef_AsynchronousServerCallReturnsEventWrapper(asynchronousServerCallReturnsEvent.getEventSourceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}