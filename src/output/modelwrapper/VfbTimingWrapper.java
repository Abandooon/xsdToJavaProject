package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    


public class VfbTimingWrapper {

    
    private VfbTiming vfbTiming;

    public VfbTimingWrapper(VfbTiming vfbTiming) {
        this.vfbTiming = vfbTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getS())) {
            
            return vfbTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getT())) {
            
            return vfbTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getUuid())) {
            
            return vfbTiming.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getShortName())) {
            
            return new IdentifierWrapper(vfbTiming.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = vfbTiming.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getLongName())) {
            
            return new MultilanguageLongNameWrapper(vfbTiming.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(vfbTiming.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getCategory())) {
            
            return new CategoryStringWrapper(vfbTiming.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getAdminData())) {
            
            return new AdminDataWrapper(vfbTiming.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getIntroduction())) {
            
            return new DocumentationBlockWrapper(vfbTiming.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getAnnotations())) {
            ArrayList<Annotation> originalList = vfbTiming.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(vfbTiming.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getShortNamePattern())) {
            
            return new StringWrapper(vfbTiming.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getVariationPoint())) {
            
            return new VariationPointWrapper(vfbTiming.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TimingDescriptionsWrapper getTimingDescriptions() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getTimingDescriptions())) {
            
            return new TimingDescriptionsWrapper(vfbTiming.getTimingDescriptions());
            
        } else {
            return null;
        }
        
    }

    public TimingGuaranteesWrapper getTimingGuarantees() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getTimingGuarantees())) {
            
            return new TimingGuaranteesWrapper(vfbTiming.getTimingGuarantees());
            
        } else {
            return null;
        }
        
    }

    public TimingRequirementsWrapper getTimingRequirements() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getTimingRequirements())) {
            
            return new TimingRequirementsWrapper(vfbTiming.getTimingRequirements());
            
        } else {
            return null;
        }
        
    }

    public ComponentRefWrapper getComponentRef() {
        
        if (CollUtil.isNotEmpty(vfbTiming.getComponentRef())) {
            
            return new ComponentRefWrapper(vfbTiming.getComponentRef());
            
        } else {
            return null;
        }
        
    }




    


    
}