package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class InitEventWrapper {

    
    private InitEvent initEvent;

    public InitEventWrapper(InitEvent initEvent) {
        this.initEvent = initEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(initEvent.getS())) {
            
            return initEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(initEvent.getT())) {
            
            return initEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(initEvent.getUuid())) {
            
            return initEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(initEvent.getShortName())) {
            
            return new IdentifierWrapper(initEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(initEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = initEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(initEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(initEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(initEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(initEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(initEvent.getCategory())) {
            
            return new CategoryStringWrapper(initEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(initEvent.getAdminData())) {
            
            return new AdminDataWrapper(initEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(initEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(initEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(initEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = initEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(initEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(initEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(initEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = initEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(initEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(initEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(initEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(initEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}