package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwBaseTypeWrapper {

    
    private SwBaseType swBaseType;

    public SwBaseTypeWrapper(SwBaseType swBaseType) {
        this.swBaseType = swBaseType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swBaseType.getS())) {
            
            return swBaseType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swBaseType.getT())) {
            
            return swBaseType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swBaseType.getUuid())) {
            
            return swBaseType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swBaseType.getShortName())) {
            
            return new IdentifierWrapper(swBaseType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swBaseType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swBaseType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swBaseType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swBaseType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swBaseType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swBaseType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swBaseType.getCategory())) {
            
            return new CategoryStringWrapper(swBaseType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swBaseType.getAdminData())) {
            
            return new AdminDataWrapper(swBaseType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swBaseType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swBaseType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swBaseType.getAnnotations())) {
            ArrayList<Annotation> originalList = swBaseType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(swBaseType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(swBaseType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(swBaseType.getShortNamePattern())) {
            
            return new StringWrapper(swBaseType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swBaseType.getVariationPoint())) {
            
            return new VariationPointWrapper(swBaseType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getBaseTypeSize() {
        
        if (CollUtil.isNotEmpty(swBaseType.getBaseTypeSize())) {
            
            return new PositiveIntegerWrapper(swBaseType.getBaseTypeSize());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxBaseTypeSize() {
        
        if (CollUtil.isNotEmpty(swBaseType.getMaxBaseTypeSize())) {
            
            return new PositiveIntegerWrapper(swBaseType.getMaxBaseTypeSize());
            
        } else {
            return null;
        }
        
    }

    public BaseTypeEncodingStringWrapper getBaseTypeEncoding() {
        
        if (CollUtil.isNotEmpty(swBaseType.getBaseTypeEncoding())) {
            
            return new BaseTypeEncodingStringWrapper(swBaseType.getBaseTypeEncoding());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMemAlignment() {
        
        if (CollUtil.isNotEmpty(swBaseType.getMemAlignment())) {
            
            return new PositiveIntegerWrapper(swBaseType.getMemAlignment());
            
        } else {
            return null;
        }
        
    }

    public ByteOrderEnumWrapper getByteOrder() {
        
        if (CollUtil.isNotEmpty(swBaseType.getByteOrder())) {
            
            return new ByteOrderEnumWrapper(swBaseType.getByteOrder());
            
        } else {
            return null;
        }
        
    }

    public NativeDeclarationStringWrapper getNativeDeclaration() {
        
        if (CollUtil.isNotEmpty(swBaseType.getNativeDeclaration())) {
            
            return new NativeDeclarationStringWrapper(swBaseType.getNativeDeclaration());
            
        } else {
            return null;
        }
        
    }




    


    
}