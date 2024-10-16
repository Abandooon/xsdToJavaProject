package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DataReceivedEventWrapper {

    
    private DataReceivedEvent dataReceivedEvent;

    public DataReceivedEventWrapper(DataReceivedEvent dataReceivedEvent) {
        this.dataReceivedEvent = dataReceivedEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getS())) {
            
            return dataReceivedEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getT())) {
            
            return dataReceivedEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getUuid())) {
            
            return dataReceivedEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getShortName())) {
            
            return new IdentifierWrapper(dataReceivedEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dataReceivedEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dataReceivedEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dataReceivedEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getCategory())) {
            
            return new CategoryStringWrapper(dataReceivedEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getAdminData())) {
            
            return new AdminDataWrapper(dataReceivedEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataReceivedEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = dataReceivedEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(dataReceivedEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = dataReceivedEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(dataReceivedEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(dataReceivedEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public RVariableInAtomicSwcInstanceRefWrapper getDataIref() {
        
        if (CollUtil.isNotEmpty(dataReceivedEvent.getDataIref())) {
            
            return new RVariableInAtomicSwcInstanceRefWrapper(dataReceivedEvent.getDataIref());
            
        } else {
            return null;
        }
        
    }




    


    
}