package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EcucModuleConfigurationValuesWrapper {

    
    private EcucModuleConfigurationValues ecucModuleConfigurationValues;

    public EcucModuleConfigurationValuesWrapper(EcucModuleConfigurationValues ecucModuleConfigurationValues) {
        this.ecucModuleConfigurationValues = ecucModuleConfigurationValues;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getS())) {
            
            return ecucModuleConfigurationValues.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getT())) {
            
            return ecucModuleConfigurationValues.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getUuid())) {
            
            return ecucModuleConfigurationValues.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getShortName())) {
            
            return new IdentifierWrapper(ecucModuleConfigurationValues.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucModuleConfigurationValues.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucModuleConfigurationValues.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucModuleConfigurationValues.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getCategory())) {
            
            return new CategoryStringWrapper(ecucModuleConfigurationValues.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getAdminData())) {
            
            return new AdminDataWrapper(ecucModuleConfigurationValues.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucModuleConfigurationValues.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucModuleConfigurationValues.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucModuleConfigurationValues.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DefinitionRef_EcucModuleConfigurationValuesWrapper getDefinitionRef() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getDefinitionRef())) {
            
            return new DefinitionRef_EcucModuleConfigurationValuesWrapper(ecucModuleConfigurationValues.getDefinitionRef());
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getEcucDefEdition() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getEcucDefEdition())) {
            
            return new RevisionLabelStringWrapper(ecucModuleConfigurationValues.getEcucDefEdition());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationVariantEnumWrapper getImplementationConfigVariant() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getImplementationConfigVariant())) {
            
            return new EcucConfigurationVariantEnumWrapper(ecucModuleConfigurationValues.getImplementationConfigVariant());
            
        } else {
            return null;
        }
        
    }

    public ModuleDescriptionRefWrapper getModuleDescriptionRef() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getModuleDescriptionRef())) {
            
            return new ModuleDescriptionRefWrapper(ecucModuleConfigurationValues.getModuleDescriptionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucContainerValueWrapper> getContainers() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValues.getContainers())) {
            ArrayList<EcucContainerValue> originalList = ecucModuleConfigurationValues.getContainers();
            ArrayList<EcucContainerValueWrapper> wrapperList = (ArrayList<EcucContainerValueWrapper>)originalList.stream()
                .map(item -> new EcucContainerValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}