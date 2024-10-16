package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DataWriteCompletedEventWrapper {

    
    private DataWriteCompletedEvent dataWriteCompletedEvent;

    public DataWriteCompletedEventWrapper(DataWriteCompletedEvent dataWriteCompletedEvent) {
        this.dataWriteCompletedEvent = dataWriteCompletedEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getS())) {
            
            return dataWriteCompletedEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getT())) {
            
            return dataWriteCompletedEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getUuid())) {
            
            return dataWriteCompletedEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getShortName())) {
            
            return new IdentifierWrapper(dataWriteCompletedEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dataWriteCompletedEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dataWriteCompletedEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dataWriteCompletedEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getCategory())) {
            
            return new CategoryStringWrapper(dataWriteCompletedEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getAdminData())) {
            
            return new AdminDataWrapper(dataWriteCompletedEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataWriteCompletedEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = dataWriteCompletedEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(dataWriteCompletedEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = dataWriteCompletedEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(dataWriteCompletedEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(dataWriteCompletedEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventSourceRefWrapper getEventSourceRef() {
        
        if (CollUtil.isNotEmpty(dataWriteCompletedEvent.getEventSourceRef())) {
            
            return new EventSourceRefWrapper(dataWriteCompletedEvent.getEventSourceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}