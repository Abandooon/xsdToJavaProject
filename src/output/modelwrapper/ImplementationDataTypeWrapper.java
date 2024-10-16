package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    


public class ImplementationDataTypeWrapper {

    
    private ImplementationDataType implementationDataType;

    public ImplementationDataTypeWrapper(ImplementationDataType implementationDataType) {
        this.implementationDataType = implementationDataType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getS())) {
            
            return implementationDataType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getT())) {
            
            return implementationDataType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getUuid())) {
            
            return implementationDataType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getShortName())) {
            
            return new IdentifierWrapper(implementationDataType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = implementationDataType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(implementationDataType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(implementationDataType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getCategory())) {
            
            return new CategoryStringWrapper(implementationDataType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getAdminData())) {
            
            return new AdminDataWrapper(implementationDataType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(implementationDataType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getAnnotations())) {
            ArrayList<Annotation> originalList = implementationDataType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(implementationDataType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getShortNamePattern())) {
            
            return new StringWrapper(implementationDataType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getVariationPoint())) {
            
            return new VariationPointWrapper(implementationDataType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(implementationDataType.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getDynamicArraySizeProfile() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getDynamicArraySizeProfile())) {
            
            return new StringWrapper(implementationDataType.getDynamicArraySizeProfile());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ImplementationDataTypeElementWrapper> getSubElements() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getSubElements())) {
            ArrayList<ImplementationDataTypeElement> originalList = implementationDataType.getSubElements();
            ArrayList<ImplementationDataTypeElementWrapper> wrapperList = (ArrayList<ImplementationDataTypeElementWrapper>)originalList.stream()
                .map(item -> new ImplementationDataTypeElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SymbolPropsWrapper getSymbolProps() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getSymbolProps())) {
            
            return new SymbolPropsWrapper(implementationDataType.getSymbolProps());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getTypeEmitter() {
        
        if (CollUtil.isNotEmpty(implementationDataType.getTypeEmitter())) {
            
            return new NmtokenStringWrapper(implementationDataType.getTypeEmitter());
            
        } else {
            return null;
        }
        
    }




    


    
}