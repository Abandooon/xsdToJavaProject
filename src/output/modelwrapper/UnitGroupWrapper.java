package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class UnitGroupWrapper {

    
    private UnitGroup unitGroup;

    public UnitGroupWrapper(UnitGroup unitGroup) {
        this.unitGroup = unitGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(unitGroup.getS())) {
            
            return unitGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(unitGroup.getT())) {
            
            return unitGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(unitGroup.getUuid())) {
            
            return unitGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(unitGroup.getShortName())) {
            
            return new IdentifierWrapper(unitGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(unitGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = unitGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(unitGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(unitGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(unitGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(unitGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(unitGroup.getCategory())) {
            
            return new CategoryStringWrapper(unitGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(unitGroup.getAdminData())) {
            
            return new AdminDataWrapper(unitGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(unitGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(unitGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(unitGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = unitGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(unitGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(unitGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitRefWrapper> getUnitRefs() {
        
        if (CollUtil.isNotEmpty(unitGroup.getUnitRefs())) {
            ArrayList<UnitRef> originalList = unitGroup.getUnitRefs();
            ArrayList<UnitRefWrapper> wrapperList = (ArrayList<UnitRefWrapper>)originalList.stream()
                .map(item -> new UnitRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}