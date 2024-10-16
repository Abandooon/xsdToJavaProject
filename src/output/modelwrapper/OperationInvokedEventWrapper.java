package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class OperationInvokedEventWrapper {

    
    private OperationInvokedEvent operationInvokedEvent;

    public OperationInvokedEventWrapper(OperationInvokedEvent operationInvokedEvent) {
        this.operationInvokedEvent = operationInvokedEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getS())) {
            
            return operationInvokedEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getT())) {
            
            return operationInvokedEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getUuid())) {
            
            return operationInvokedEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getShortName())) {
            
            return new IdentifierWrapper(operationInvokedEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = operationInvokedEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(operationInvokedEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(operationInvokedEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getCategory())) {
            
            return new CategoryStringWrapper(operationInvokedEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getAdminData())) {
            
            return new AdminDataWrapper(operationInvokedEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(operationInvokedEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = operationInvokedEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(operationInvokedEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = operationInvokedEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(operationInvokedEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(operationInvokedEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public POperationInAtomicSwcInstanceRefWrapper getOperationIref() {
        
        if (CollUtil.isNotEmpty(operationInvokedEvent.getOperationIref())) {
            
            return new POperationInAtomicSwcInstanceRefWrapper(operationInvokedEvent.getOperationIref());
            
        } else {
            return null;
        }
        
    }




    


    
}