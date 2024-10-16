package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DataReceiveErrorEventWrapper {

    
    private DataReceiveErrorEvent dataReceiveErrorEvent;

    public DataReceiveErrorEventWrapper(DataReceiveErrorEvent dataReceiveErrorEvent) {
        this.dataReceiveErrorEvent = dataReceiveErrorEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getS())) {
            
            return dataReceiveErrorEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getT())) {
            
            return dataReceiveErrorEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getUuid())) {
            
            return dataReceiveErrorEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getShortName())) {
            
            return new IdentifierWrapper(dataReceiveErrorEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dataReceiveErrorEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dataReceiveErrorEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dataReceiveErrorEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getCategory())) {
            
            return new CategoryStringWrapper(dataReceiveErrorEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getAdminData())) {
            
            return new AdminDataWrapper(dataReceiveErrorEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataReceiveErrorEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = dataReceiveErrorEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(dataReceiveErrorEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = dataReceiveErrorEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(dataReceiveErrorEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(dataReceiveErrorEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public RVariableInAtomicSwcInstanceRefWrapper getDataIref() {
        
        if (CollUtil.isNotEmpty(dataReceiveErrorEvent.getDataIref())) {
            
            return new RVariableInAtomicSwcInstanceRefWrapper(dataReceiveErrorEvent.getDataIref());
            
        } else {
            return null;
        }
        
    }




    


    
}