package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class HwElementWrapper {

    
    private HwElement hwElement;

    public HwElementWrapper(HwElement hwElement) {
        this.hwElement = hwElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwElement.getS())) {
            
            return hwElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwElement.getT())) {
            
            return hwElement.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(hwElement.getUuid())) {
            
            return hwElement.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(hwElement.getShortName())) {
            
            return new IdentifierWrapper(hwElement.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(hwElement.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = hwElement.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(hwElement.getLongName())) {
            
            return new MultilanguageLongNameWrapper(hwElement.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwElement.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwElement.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwElement.getCategory())) {
            
            return new CategoryStringWrapper(hwElement.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwElement.getAdminData())) {
            
            return new AdminDataWrapper(hwElement.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwElement.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwElement.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(hwElement.getAnnotations())) {
            ArrayList<Annotation> originalList = hwElement.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwElement.getVariationPoint())) {
            
            return new VariationPointWrapper(hwElement.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public HwTypeRefWrapper getHwTypeRef() {
        
        if (CollUtil.isNotEmpty(hwElement.getHwTypeRef())) {
            
            return new HwTypeRefWrapper(hwElement.getHwTypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwCategoryRefWrapper> getHwCategoryRefs() {
        
        if (CollUtil.isNotEmpty(hwElement.getHwCategoryRefs())) {
            ArrayList<HwCategoryRef> originalList = hwElement.getHwCategoryRefs();
            ArrayList<HwCategoryRefWrapper> wrapperList = (ArrayList<HwCategoryRefWrapper>)originalList.stream()
                .map(item -> new HwCategoryRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwAttributeValueWrapper> getHwAttributeValues() {
        
        if (CollUtil.isNotEmpty(hwElement.getHwAttributeValues())) {
            ArrayList<HwAttributeValue> originalList = hwElement.getHwAttributeValues();
            ArrayList<HwAttributeValueWrapper> wrapperList = (ArrayList<HwAttributeValueWrapper>)originalList.stream()
                .map(item -> new HwAttributeValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwElementRefConditionalWrapper> getNestedElements() {
        
        if (CollUtil.isNotEmpty(hwElement.getNestedElements())) {
            ArrayList<HwElementRefConditional> originalList = hwElement.getNestedElements();
            ArrayList<HwElementRefConditionalWrapper> wrapperList = (ArrayList<HwElementRefConditionalWrapper>)originalList.stream()
                .map(item -> new HwElementRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwPinGroupWrapper> getHwPinGroups() {
        
        if (CollUtil.isNotEmpty(hwElement.getHwPinGroups())) {
            ArrayList<HwPinGroup> originalList = hwElement.getHwPinGroups();
            ArrayList<HwPinGroupWrapper> wrapperList = (ArrayList<HwPinGroupWrapper>)originalList.stream()
                .map(item -> new HwPinGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwElementConnectorWrapper> getHwElementConnections() {
        
        if (CollUtil.isNotEmpty(hwElement.getHwElementConnections())) {
            ArrayList<HwElementConnector> originalList = hwElement.getHwElementConnections();
            ArrayList<HwElementConnectorWrapper> wrapperList = (ArrayList<HwElementConnectorWrapper>)originalList.stream()
                .map(item -> new HwElementConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}