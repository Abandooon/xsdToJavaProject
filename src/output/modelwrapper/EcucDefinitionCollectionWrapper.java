package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class EcucDefinitionCollectionWrapper {

    
    private EcucDefinitionCollection ecucDefinitionCollection;

    public EcucDefinitionCollectionWrapper(EcucDefinitionCollection ecucDefinitionCollection) {
        this.ecucDefinitionCollection = ecucDefinitionCollection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getS())) {
            
            return ecucDefinitionCollection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getT())) {
            
            return ecucDefinitionCollection.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getUuid())) {
            
            return ecucDefinitionCollection.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getShortName())) {
            
            return new IdentifierWrapper(ecucDefinitionCollection.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucDefinitionCollection.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucDefinitionCollection.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucDefinitionCollection.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getCategory())) {
            
            return new CategoryStringWrapper(ecucDefinitionCollection.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getAdminData())) {
            
            return new AdminDataWrapper(ecucDefinitionCollection.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucDefinitionCollection.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucDefinitionCollection.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucDefinitionCollection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(ecucDefinitionCollection.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getShortNamePattern())) {
            
            return new StringWrapper(ecucDefinitionCollection.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModuleRefWrapper> getModuleRefs() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionCollection.getModuleRefs())) {
            ArrayList<ModuleRef> originalList = ecucDefinitionCollection.getModuleRefs();
            ArrayList<ModuleRefWrapper> wrapperList = (ArrayList<ModuleRefWrapper>)originalList.stream()
                .map(item -> new ModuleRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}