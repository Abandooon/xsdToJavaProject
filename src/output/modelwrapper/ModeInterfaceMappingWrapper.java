package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class ModeInterfaceMappingWrapper {

    
    private ModeInterfaceMapping modeInterfaceMapping;

    public ModeInterfaceMappingWrapper(ModeInterfaceMapping modeInterfaceMapping) {
        this.modeInterfaceMapping = modeInterfaceMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getS())) {
            
            return modeInterfaceMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getT())) {
            
            return modeInterfaceMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getUuid())) {
            
            return modeInterfaceMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getShortName())) {
            
            return new IdentifierWrapper(modeInterfaceMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeInterfaceMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeInterfaceMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeInterfaceMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getCategory())) {
            
            return new CategoryStringWrapper(modeInterfaceMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getAdminData())) {
            
            return new AdminDataWrapper(modeInterfaceMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeInterfaceMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = modeInterfaceMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(modeInterfaceMapping.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getShortNamePattern())) {
            
            return new StringWrapper(modeInterfaceMapping.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(modeInterfaceMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ModeDeclarationGroupPrototypeMappingWrapper getModeMapping() {
        
        if (CollUtil.isNotEmpty(modeInterfaceMapping.getModeMapping())) {
            
            return new ModeDeclarationGroupPrototypeMappingWrapper(modeInterfaceMapping.getModeMapping());
            
        } else {
            return null;
        }
        
    }




    


    
}