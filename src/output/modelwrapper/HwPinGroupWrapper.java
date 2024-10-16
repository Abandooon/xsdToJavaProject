package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class HwPinGroupWrapper {

    
    private HwPinGroup hwPinGroup;

    public HwPinGroupWrapper(HwPinGroup hwPinGroup) {
        this.hwPinGroup = hwPinGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getS())) {
            
            return hwPinGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getT())) {
            
            return hwPinGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getUuid())) {
            
            return hwPinGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getShortName())) {
            
            return new IdentifierWrapper(hwPinGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = hwPinGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(hwPinGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwPinGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getCategory())) {
            
            return new CategoryStringWrapper(hwPinGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getAdminData())) {
            
            return new AdminDataWrapper(hwPinGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwPinGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = hwPinGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public HwTypeRefWrapper getHwTypeRef() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getHwTypeRef())) {
            
            return new HwTypeRefWrapper(hwPinGroup.getHwTypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwCategoryRefWrapper> getHwCategoryRefs() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getHwCategoryRefs())) {
            ArrayList<HwCategoryRef> originalList = hwPinGroup.getHwCategoryRefs();
            ArrayList<HwCategoryRefWrapper> wrapperList = (ArrayList<HwCategoryRefWrapper>)originalList.stream()
                .map(item -> new HwCategoryRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwAttributeValueWrapper> getHwAttributeValues() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getHwAttributeValues())) {
            ArrayList<HwAttributeValue> originalList = hwPinGroup.getHwAttributeValues();
            ArrayList<HwAttributeValueWrapper> wrapperList = (ArrayList<HwAttributeValueWrapper>)originalList.stream()
                .map(item -> new HwAttributeValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public HwPinGroupContentWrapper getHwPinGroupContent() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getHwPinGroupContent())) {
            
            return new HwPinGroupContentWrapper(hwPinGroup.getHwPinGroupContent());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwPinGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(hwPinGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}