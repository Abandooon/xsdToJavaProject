package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class HwTypeWrapper {

    
    private HwType hwType;

    public HwTypeWrapper(HwType hwType) {
        this.hwType = hwType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwType.getS())) {
            
            return hwType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwType.getT())) {
            
            return hwType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(hwType.getUuid())) {
            
            return hwType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(hwType.getShortName())) {
            
            return new IdentifierWrapper(hwType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(hwType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = hwType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(hwType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(hwType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwType.getCategory())) {
            
            return new CategoryStringWrapper(hwType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwType.getAdminData())) {
            
            return new AdminDataWrapper(hwType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(hwType.getAnnotations())) {
            ArrayList<Annotation> originalList = hwType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwType.getVariationPoint())) {
            
            return new VariationPointWrapper(hwType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public HwTypeRefWrapper getHwTypeRef() {
        
        if (CollUtil.isNotEmpty(hwType.getHwTypeRef())) {
            
            return new HwTypeRefWrapper(hwType.getHwTypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwCategoryRefWrapper> getHwCategoryRefs() {
        
        if (CollUtil.isNotEmpty(hwType.getHwCategoryRefs())) {
            ArrayList<HwCategoryRef> originalList = hwType.getHwCategoryRefs();
            ArrayList<HwCategoryRefWrapper> wrapperList = (ArrayList<HwCategoryRefWrapper>)originalList.stream()
                .map(item -> new HwCategoryRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwAttributeValueWrapper> getHwAttributeValues() {
        
        if (CollUtil.isNotEmpty(hwType.getHwAttributeValues())) {
            ArrayList<HwAttributeValue> originalList = hwType.getHwAttributeValues();
            ArrayList<HwAttributeValueWrapper> wrapperList = (ArrayList<HwAttributeValueWrapper>)originalList.stream()
                .map(item -> new HwAttributeValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}