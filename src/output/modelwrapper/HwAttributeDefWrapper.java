package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class HwAttributeDefWrapper {

    
    private HwAttributeDef hwAttributeDef;

    public HwAttributeDefWrapper(HwAttributeDef hwAttributeDef) {
        this.hwAttributeDef = hwAttributeDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getS())) {
            
            return hwAttributeDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getT())) {
            
            return hwAttributeDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getUuid())) {
            
            return hwAttributeDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getShortName())) {
            
            return new IdentifierWrapper(hwAttributeDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = hwAttributeDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(hwAttributeDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwAttributeDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getCategory())) {
            
            return new CategoryStringWrapper(hwAttributeDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getAdminData())) {
            
            return new AdminDataWrapper(hwAttributeDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwAttributeDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getAnnotations())) {
            ArrayList<Annotation> originalList = hwAttributeDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwAttributeLiteralDefWrapper> getHwAttributeLiterals() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getHwAttributeLiterals())) {
            ArrayList<HwAttributeLiteralDef> originalList = hwAttributeDef.getHwAttributeLiterals();
            ArrayList<HwAttributeLiteralDefWrapper> wrapperList = (ArrayList<HwAttributeLiteralDefWrapper>)originalList.stream()
                .map(item -> new HwAttributeLiteralDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsRequired() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getIsRequired())) {
            
            return new BooleanWrapper(hwAttributeDef.getIsRequired());
            
        } else {
            return null;
        }
        
    }

    public UnitRefWrapper getUnitRef() {
        
        if (CollUtil.isNotEmpty(hwAttributeDef.getUnitRef())) {
            
            return new UnitRefWrapper(hwAttributeDef.getUnitRef());
            
        } else {
            return null;
        }
        
    }




    


    
}