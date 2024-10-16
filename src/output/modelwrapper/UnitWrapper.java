package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    


public class UnitWrapper {

    
    private Unit unit;

    public UnitWrapper(Unit unit) {
        this.unit = unit;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(unit.getS())) {
            
            return unit.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(unit.getT())) {
            
            return unit.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(unit.getUuid())) {
            
            return unit.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(unit.getShortName())) {
            
            return new IdentifierWrapper(unit.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(unit.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = unit.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(unit.getLongName())) {
            
            return new MultilanguageLongNameWrapper(unit.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(unit.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(unit.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(unit.getCategory())) {
            
            return new CategoryStringWrapper(unit.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(unit.getAdminData())) {
            
            return new AdminDataWrapper(unit.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(unit.getIntroduction())) {
            
            return new DocumentationBlockWrapper(unit.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(unit.getAnnotations())) {
            ArrayList<Annotation> originalList = unit.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(unit.getVariationPoint())) {
            
            return new VariationPointWrapper(unit.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public SingleLanguageUnitNamesWrapper getDisplayName() {
        
        if (CollUtil.isNotEmpty(unit.getDisplayName())) {
            
            return new SingleLanguageUnitNamesWrapper(unit.getDisplayName());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getFactorSiToUnit() {
        
        if (CollUtil.isNotEmpty(unit.getFactorSiToUnit())) {
            
            return new FloatWrapper(unit.getFactorSiToUnit());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getOffsetSiToUnit() {
        
        if (CollUtil.isNotEmpty(unit.getOffsetSiToUnit())) {
            
            return new FloatWrapper(unit.getOffsetSiToUnit());
            
        } else {
            return null;
        }
        
    }

    public PhysicalDimensionRefWrapper getPhysicalDimensionRef() {
        
        if (CollUtil.isNotEmpty(unit.getPhysicalDimensionRef())) {
            
            return new PhysicalDimensionRefWrapper(unit.getPhysicalDimensionRef());
            
        } else {
            return null;
        }
        
    }




    


    
}