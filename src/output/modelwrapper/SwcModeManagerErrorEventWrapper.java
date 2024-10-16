package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class SwcModeManagerErrorEventWrapper {

    
    private SwcModeManagerErrorEvent swcModeManagerErrorEvent;

    public SwcModeManagerErrorEventWrapper(SwcModeManagerErrorEvent swcModeManagerErrorEvent) {
        this.swcModeManagerErrorEvent = swcModeManagerErrorEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getS())) {
            
            return swcModeManagerErrorEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getT())) {
            
            return swcModeManagerErrorEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getUuid())) {
            
            return swcModeManagerErrorEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getShortName())) {
            
            return new IdentifierWrapper(swcModeManagerErrorEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swcModeManagerErrorEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swcModeManagerErrorEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swcModeManagerErrorEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getCategory())) {
            
            return new CategoryStringWrapper(swcModeManagerErrorEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getAdminData())) {
            
            return new AdminDataWrapper(swcModeManagerErrorEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcModeManagerErrorEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = swcModeManagerErrorEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ActivationReasonRepresentationRefWrapper getActivationReasonRepresentationRef() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getActivationReasonRepresentationRef())) {
            
            return new ActivationReasonRepresentationRefWrapper(swcModeManagerErrorEvent.getActivationReasonRepresentationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RModeInAtomicSwcInstanceRefWrapper> getDisabledModeIrefs() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getDisabledModeIrefs())) {
            ArrayList<RModeInAtomicSwcInstanceRef> originalList = swcModeManagerErrorEvent.getDisabledModeIrefs();
            ArrayList<RModeInAtomicSwcInstanceRefWrapper> wrapperList = (ArrayList<RModeInAtomicSwcInstanceRefWrapper>)originalList.stream()
                .map(item -> new RModeInAtomicSwcInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StartOnEventRefWrapper getStartOnEventRef() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getStartOnEventRef())) {
            
            return new StartOnEventRefWrapper(swcModeManagerErrorEvent.getStartOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(swcModeManagerErrorEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PModeGroupInAtomicSwcInstanceRefWrapper getModeGroupIref() {
        
        if (CollUtil.isNotEmpty(swcModeManagerErrorEvent.getModeGroupIref())) {
            
            return new PModeGroupInAtomicSwcInstanceRefWrapper(swcModeManagerErrorEvent.getModeGroupIref());
            
        } else {
            return null;
        }
        
    }




    


    
}