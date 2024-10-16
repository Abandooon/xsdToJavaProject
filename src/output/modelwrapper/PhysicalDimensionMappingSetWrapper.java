package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class PhysicalDimensionMappingSetWrapper {

    
    private PhysicalDimensionMappingSet physicalDimensionMappingSet;

    public PhysicalDimensionMappingSetWrapper(PhysicalDimensionMappingSet physicalDimensionMappingSet) {
        this.physicalDimensionMappingSet = physicalDimensionMappingSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getS())) {
            
            return physicalDimensionMappingSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getT())) {
            
            return physicalDimensionMappingSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getUuid())) {
            
            return physicalDimensionMappingSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getShortName())) {
            
            return new IdentifierWrapper(physicalDimensionMappingSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = physicalDimensionMappingSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(physicalDimensionMappingSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(physicalDimensionMappingSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getCategory())) {
            
            return new CategoryStringWrapper(physicalDimensionMappingSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getAdminData())) {
            
            return new AdminDataWrapper(physicalDimensionMappingSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(physicalDimensionMappingSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getAnnotations())) {
            ArrayList<Annotation> originalList = physicalDimensionMappingSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getVariationPoint())) {
            
            return new VariationPointWrapper(physicalDimensionMappingSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PhysicalDimensionMappingWrapper> getPhysicalDimensionMappings() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMappingSet.getPhysicalDimensionMappings())) {
            ArrayList<PhysicalDimensionMapping> originalList = physicalDimensionMappingSet.getPhysicalDimensionMappings();
            ArrayList<PhysicalDimensionMappingWrapper> wrapperList = (ArrayList<PhysicalDimensionMappingWrapper>)originalList.stream()
                .map(item -> new PhysicalDimensionMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}