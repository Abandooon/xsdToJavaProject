package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class HwPinWrapper {

    
    private HwPin hwPin;

    public HwPinWrapper(HwPin hwPin) {
        this.hwPin = hwPin;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwPin.getS())) {
            
            return hwPin.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwPin.getT())) {
            
            return hwPin.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(hwPin.getUuid())) {
            
            return hwPin.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(hwPin.getShortName())) {
            
            return new IdentifierWrapper(hwPin.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(hwPin.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = hwPin.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(hwPin.getLongName())) {
            
            return new MultilanguageLongNameWrapper(hwPin.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwPin.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwPin.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwPin.getCategory())) {
            
            return new CategoryStringWrapper(hwPin.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwPin.getAdminData())) {
            
            return new AdminDataWrapper(hwPin.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwPin.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwPin.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(hwPin.getAnnotations())) {
            ArrayList<Annotation> originalList = hwPin.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public HwTypeRefWrapper getHwTypeRef() {
        
        if (CollUtil.isNotEmpty(hwPin.getHwTypeRef())) {
            
            return new HwTypeRefWrapper(hwPin.getHwTypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwCategoryRefWrapper> getHwCategoryRefs() {
        
        if (CollUtil.isNotEmpty(hwPin.getHwCategoryRefs())) {
            ArrayList<HwCategoryRef> originalList = hwPin.getHwCategoryRefs();
            ArrayList<HwCategoryRefWrapper> wrapperList = (ArrayList<HwCategoryRefWrapper>)originalList.stream()
                .map(item -> new HwCategoryRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwAttributeValueWrapper> getHwAttributeValues() {
        
        if (CollUtil.isNotEmpty(hwPin.getHwAttributeValues())) {
            ArrayList<HwAttributeValue> originalList = hwPin.getHwAttributeValues();
            ArrayList<HwAttributeValueWrapper> wrapperList = (ArrayList<HwAttributeValueWrapper>)originalList.stream()
                .map(item -> new HwAttributeValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPinNumber() {
        
        if (CollUtil.isNotEmpty(hwPin.getPinNumber())) {
            
            return new IntegerWrapper(hwPin.getPinNumber());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwPin.getVariationPoint())) {
            
            return new VariationPointWrapper(hwPin.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}