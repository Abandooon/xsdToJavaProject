package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DataSendCompletedEventWrapper {

    
    private DataSendCompletedEvent dataSendCompletedEvent;

    public DataSendCompletedEventWrapper(DataSendCompletedEvent dataSendCompletedEvent) {
        this.dataSendCompletedEvent = dataSendCompletedEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getS())) {
            
            return dataSendCompletedEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getT())) {
            
            return dataSendCompletedEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getUuid())) {
            
            return dataSendCompletedEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getShortName())) {
            
            return new IdentifierWrapper(dataSendCompletedEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dataSendCompletedEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dataSendCompletedEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dataSendCompletedEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getCategory())) {
            
            return new CategoryStringWrapper(dataSendCompletedEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getAdminData())) {
            
            return new AdminDataWrapper(dataSendCompletedEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataSendCompletedEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = dataSendCompletedEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(dataSendCompletedEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = dataSendCompletedEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(dataSendCompletedEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(dataSendCompletedEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventSourceRefWrapper getEventSourceRef() {
        
        if (CollUtil.isNotEmpty(dataSendCompletedEvent.getEventSourceRef())) {
            
            return new EventSourceRefWrapper(dataSendCompletedEvent.getEventSourceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}