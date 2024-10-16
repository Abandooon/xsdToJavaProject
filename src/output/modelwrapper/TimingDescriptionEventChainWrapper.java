package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class TimingDescriptionEventChainWrapper {

    
    private TimingDescriptionEventChain timingDescriptionEventChain;

    public TimingDescriptionEventChainWrapper(TimingDescriptionEventChain timingDescriptionEventChain) {
        this.timingDescriptionEventChain = timingDescriptionEventChain;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getS())) {
            
            return timingDescriptionEventChain.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getT())) {
            
            return timingDescriptionEventChain.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getUuid())) {
            
            return timingDescriptionEventChain.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getShortName())) {
            
            return new IdentifierWrapper(timingDescriptionEventChain.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = timingDescriptionEventChain.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getLongName())) {
            
            return new MultilanguageLongNameWrapper(timingDescriptionEventChain.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(timingDescriptionEventChain.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getCategory())) {
            
            return new CategoryStringWrapper(timingDescriptionEventChain.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getAdminData())) {
            
            return new AdminDataWrapper(timingDescriptionEventChain.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getIntroduction())) {
            
            return new DocumentationBlockWrapper(timingDescriptionEventChain.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getAnnotations())) {
            ArrayList<Annotation> originalList = timingDescriptionEventChain.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getVariationPoint())) {
            
            return new VariationPointWrapper(timingDescriptionEventChain.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public StimulusRefWrapper getStimulusRef() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getStimulusRef())) {
            
            return new StimulusRefWrapper(timingDescriptionEventChain.getStimulusRef());
            
        } else {
            return null;
        }
        
    }

    public ResponseRef_TimingDescriptionEventChainWrapper getResponseRef() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getResponseRef())) {
            
            return new ResponseRef_TimingDescriptionEventChainWrapper(timingDescriptionEventChain.getResponseRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SegmentRefWrapper> getSegmentRefs() {
        
        if (CollUtil.isNotEmpty(timingDescriptionEventChain.getSegmentRefs())) {
            ArrayList<SegmentRef> originalList = timingDescriptionEventChain.getSegmentRefs();
            ArrayList<SegmentRefWrapper> wrapperList = (ArrayList<SegmentRefWrapper>)originalList.stream()
                .map(item -> new SegmentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}