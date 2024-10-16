package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class HwCategoryWrapper {

    
    private HwCategory hwCategory;

    public HwCategoryWrapper(HwCategory hwCategory) {
        this.hwCategory = hwCategory;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwCategory.getS())) {
            
            return hwCategory.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwCategory.getT())) {
            
            return hwCategory.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(hwCategory.getUuid())) {
            
            return hwCategory.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(hwCategory.getShortName())) {
            
            return new IdentifierWrapper(hwCategory.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(hwCategory.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = hwCategory.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(hwCategory.getLongName())) {
            
            return new MultilanguageLongNameWrapper(hwCategory.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwCategory.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwCategory.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwCategory.getCategory())) {
            
            return new CategoryStringWrapper(hwCategory.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwCategory.getAdminData())) {
            
            return new AdminDataWrapper(hwCategory.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwCategory.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwCategory.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(hwCategory.getAnnotations())) {
            ArrayList<Annotation> originalList = hwCategory.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwCategory.getVariationPoint())) {
            
            return new VariationPointWrapper(hwCategory.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwAttributeDefWrapper> getHwAttributeDefs() {
        
        if (CollUtil.isNotEmpty(hwCategory.getHwAttributeDefs())) {
            ArrayList<HwAttributeDef> originalList = hwCategory.getHwAttributeDefs();
            ArrayList<HwAttributeDefWrapper> wrapperList = (ArrayList<HwAttributeDefWrapper>)originalList.stream()
                .map(item -> new HwAttributeDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}