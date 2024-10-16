package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswModuleDependencyWrapper {

    
    private BswModuleDependency bswModuleDependency;

    public BswModuleDependencyWrapper(BswModuleDependency bswModuleDependency) {
        this.bswModuleDependency = bswModuleDependency;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getS())) {
            
            return bswModuleDependency.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getT())) {
            
            return bswModuleDependency.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getUuid())) {
            
            return bswModuleDependency.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getShortName())) {
            
            return new IdentifierWrapper(bswModuleDependency.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswModuleDependency.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswModuleDependency.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswModuleDependency.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getCategory())) {
            
            return new CategoryStringWrapper(bswModuleDependency.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getAdminData())) {
            
            return new AdminDataWrapper(bswModuleDependency.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswModuleDependency.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getAnnotations())) {
            ArrayList<Annotation> originalList = bswModuleDependency.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTargetModuleId() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getTargetModuleId())) {
            
            return new PositiveIntegerWrapper(bswModuleDependency.getTargetModuleId());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleDescriptionRefConditionalWrapper> getTargetModuleRefs() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getTargetModuleRefs())) {
            ArrayList<BswModuleDescriptionRefConditional> originalList = bswModuleDependency.getTargetModuleRefs();
            ArrayList<BswModuleDescriptionRefConditionalWrapper> wrapperList = (ArrayList<BswModuleDescriptionRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswModuleDescriptionRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleEntryRefConditionalWrapper> getRequiredEntrys() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getRequiredEntrys())) {
            ArrayList<BswModuleEntryRefConditional> originalList = bswModuleDependency.getRequiredEntrys();
            ArrayList<BswModuleEntryRefConditionalWrapper> wrapperList = (ArrayList<BswModuleEntryRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswModuleEntryRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleEntryRefConditionalWrapper> getExpectedCallbacks() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getExpectedCallbacks())) {
            ArrayList<BswModuleEntryRefConditional> originalList = bswModuleDependency.getExpectedCallbacks();
            ArrayList<BswModuleEntryRefConditionalWrapper> wrapperList = (ArrayList<BswModuleEntryRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswModuleEntryRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ServiceItemsWrapper getServiceItems() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getServiceItems())) {
            
            return new ServiceItemsWrapper(bswModuleDependency.getServiceItems());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModuleDependency.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModuleDependency.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}