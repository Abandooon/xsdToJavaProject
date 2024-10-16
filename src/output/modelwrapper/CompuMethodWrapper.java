package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    


public class CompuMethodWrapper {

    
    private CompuMethod compuMethod;

    public CompuMethodWrapper(CompuMethod compuMethod) {
        this.compuMethod = compuMethod;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuMethod.getS())) {
            
            return compuMethod.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuMethod.getT())) {
            
            return compuMethod.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(compuMethod.getUuid())) {
            
            return compuMethod.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(compuMethod.getShortName())) {
            
            return new IdentifierWrapper(compuMethod.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(compuMethod.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = compuMethod.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(compuMethod.getLongName())) {
            
            return new MultilanguageLongNameWrapper(compuMethod.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(compuMethod.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(compuMethod.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(compuMethod.getCategory())) {
            
            return new CategoryStringWrapper(compuMethod.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(compuMethod.getAdminData())) {
            
            return new AdminDataWrapper(compuMethod.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(compuMethod.getIntroduction())) {
            
            return new DocumentationBlockWrapper(compuMethod.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(compuMethod.getAnnotations())) {
            ArrayList<Annotation> originalList = compuMethod.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(compuMethod.getVariationPoint())) {
            
            return new VariationPointWrapper(compuMethod.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(compuMethod.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(compuMethod.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(compuMethod.getShortNamePattern())) {
            
            return new StringWrapper(compuMethod.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public DisplayFormatStringWrapper getDisplayFormat() {
        
        if (CollUtil.isNotEmpty(compuMethod.getDisplayFormat())) {
            
            return new DisplayFormatStringWrapper(compuMethod.getDisplayFormat());
            
        } else {
            return null;
        }
        
    }

    public UnitRefWrapper getUnitRef() {
        
        if (CollUtil.isNotEmpty(compuMethod.getUnitRef())) {
            
            return new UnitRefWrapper(compuMethod.getUnitRef());
            
        } else {
            return null;
        }
        
    }

    public CompuWrapper getCompuInternalToPhys() {
        
        if (CollUtil.isNotEmpty(compuMethod.getCompuInternalToPhys())) {
            
            return new CompuWrapper(compuMethod.getCompuInternalToPhys());
            
        } else {
            return null;
        }
        
    }

    public CompuWrapper getCompuPhysToInternal() {
        
        if (CollUtil.isNotEmpty(compuMethod.getCompuPhysToInternal())) {
            
            return new CompuWrapper(compuMethod.getCompuPhysToInternal());
            
        } else {
            return null;
        }
        
    }




    


    
}