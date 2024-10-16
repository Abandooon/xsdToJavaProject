package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EcucContainerValueWrapper {

    
    private EcucContainerValue ecucContainerValue;

    public EcucContainerValueWrapper(EcucContainerValue ecucContainerValue) {
        this.ecucContainerValue = ecucContainerValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getS())) {
            
            return ecucContainerValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getT())) {
            
            return ecucContainerValue.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getUuid())) {
            
            return ecucContainerValue.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getShortName())) {
            
            return new IdentifierWrapper(ecucContainerValue.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucContainerValue.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucContainerValue.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucContainerValue.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getCategory())) {
            
            return new CategoryStringWrapper(ecucContainerValue.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getAdminData())) {
            
            return new AdminDataWrapper(ecucContainerValue.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucContainerValue.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucContainerValue.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getIndex())) {
            
            return new PositiveIntegerWrapper(ecucContainerValue.getIndex());
            
        } else {
            return null;
        }
        
    }

    public DefinitionRefWrapper getDefinitionRef() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getDefinitionRef())) {
            
            return new DefinitionRefWrapper(ecucContainerValue.getDefinitionRef());
            
        } else {
            return null;
        }
        
    }

    public ParameterValuesWrapper getParameterValues() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getParameterValues())) {
            
            return new ParameterValuesWrapper(ecucContainerValue.getParameterValues());
            
        } else {
            return null;
        }
        
    }

    public ReferenceValuesWrapper getReferenceValues() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getReferenceValues())) {
            
            return new ReferenceValuesWrapper(ecucContainerValue.getReferenceValues());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucContainerValueWrapper> getSubContainers() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getSubContainers())) {
            ArrayList<EcucContainerValue> originalList = ecucContainerValue.getSubContainers();
            ArrayList<EcucContainerValueWrapper> wrapperList = (ArrayList<EcucContainerValueWrapper>)originalList.stream()
                .map(item -> new EcucContainerValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucContainerValue.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucContainerValue.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}