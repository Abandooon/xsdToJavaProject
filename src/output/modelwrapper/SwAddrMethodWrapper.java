package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    


public class SwAddrMethodWrapper {

    
    private SwAddrMethod swAddrMethod;

    public SwAddrMethodWrapper(SwAddrMethod swAddrMethod) {
        this.swAddrMethod = swAddrMethod;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getS())) {
            
            return swAddrMethod.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getT())) {
            
            return swAddrMethod.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getUuid())) {
            
            return swAddrMethod.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getShortName())) {
            
            return new IdentifierWrapper(swAddrMethod.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swAddrMethod.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swAddrMethod.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swAddrMethod.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getCategory())) {
            
            return new CategoryStringWrapper(swAddrMethod.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getAdminData())) {
            
            return new AdminDataWrapper(swAddrMethod.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swAddrMethod.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getAnnotations())) {
            ArrayList<Annotation> originalList = swAddrMethod.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getVariationPoint())) {
            
            return new VariationPointWrapper(swAddrMethod.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(swAddrMethod.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getShortNamePattern())) {
            
            return new StringWrapper(swAddrMethod.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public MemoryAllocationKeywordPolicyTypeWrapper getMemoryAllocationKeywordPolicy() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getMemoryAllocationKeywordPolicy())) {
            
            return new MemoryAllocationKeywordPolicyTypeWrapper(swAddrMethod.getMemoryAllocationKeywordPolicy());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IdentifierWrapper> getOptions() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getOptions())) {
            ArrayList<Identifier> originalList = swAddrMethod.getOptions();
            ArrayList<IdentifierWrapper> wrapperList = (ArrayList<IdentifierWrapper>)originalList.stream()
                .map(item -> new IdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SectionInitializationPolicyTypeWrapper getSectionInitializationPolicy() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getSectionInitializationPolicy())) {
            
            return new SectionInitializationPolicyTypeWrapper(swAddrMethod.getSectionInitializationPolicy());
            
        } else {
            return null;
        }
        
    }

    public MemorySectionTypeWrapper getSectionType() {
        
        if (CollUtil.isNotEmpty(swAddrMethod.getSectionType())) {
            
            return new MemorySectionTypeWrapper(swAddrMethod.getSectionType());
            
        } else {
            return null;
        }
        
    }




    


    
}