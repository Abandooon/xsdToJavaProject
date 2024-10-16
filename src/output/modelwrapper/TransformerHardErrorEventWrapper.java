package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TransformerHardErrorEventWrapper {

    
    private TransformerHardErrorEvent transformerHardErrorEvent;

    public TransformerHardErrorEventWrapper(TransformerHardErrorEvent transformerHardErrorEvent) {
        this.transformerHardErrorEvent = transformerHardErrorEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getS())) {
            
            return transformerHardErrorEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getT())) {
            
            return transformerHardErrorEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getUuid())) {
            
            return transformerHardErrorEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getShortName())) {
            
            return new IdentifierWrapper(transformerHardErrorEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = transformerHardErrorEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(transformerHardErrorEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(transformerHardErrorEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getCategory())) {
            
            return new CategoryStringWrapper(transformerHardErrorEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getAdminData())) {
            
            return new AdminDataWrapper(transformerHardErrorEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(transformerHardErrorEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = transformerHardErrorEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(transformerHardErrorEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = transformerHardErrorEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(transformerHardErrorEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(transformerHardErrorEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public POperationInAtomicSwcInstanceRefWrapper getOperationIref() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getOperationIref())) {
            
            return new POperationInAtomicSwcInstanceRefWrapper(transformerHardErrorEvent.getOperationIref());
            
        } else {
            return null;
        }
        
    }

    public PTriggerInAtomicSwcTypeInstanceRefWrapper getTriggerIref() {
        
        if (CollUtil.isNotEmpty(transformerHardErrorEvent.getTriggerIref())) {
            
            return new PTriggerInAtomicSwcTypeInstanceRefWrapper(transformerHardErrorEvent.getTriggerIref());
            
        } else {
            return null;
        }
        
    }




    


    
}