package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class TransformationTechnologyWrapper {

    
    private TransformationTechnology transformationTechnology;

    public TransformationTechnologyWrapper(TransformationTechnology transformationTechnology) {
        this.transformationTechnology = transformationTechnology;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getS())) {
            
            return transformationTechnology.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getT())) {
            
            return transformationTechnology.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getUuid())) {
            
            return transformationTechnology.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getShortName())) {
            
            return new IdentifierWrapper(transformationTechnology.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = transformationTechnology.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getLongName())) {
            
            return new MultilanguageLongNameWrapper(transformationTechnology.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(transformationTechnology.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getCategory())) {
            
            return new CategoryStringWrapper(transformationTechnology.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getAdminData())) {
            
            return new AdminDataWrapper(transformationTechnology.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getIntroduction())) {
            
            return new DocumentationBlockWrapper(transformationTechnology.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getAnnotations())) {
            ArrayList<Annotation> originalList = transformationTechnology.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BufferPropertiesWrapper getBufferProperties() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getBufferProperties())) {
            
            return new BufferPropertiesWrapper(transformationTechnology.getBufferProperties());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNeedsOriginalData() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getNeedsOriginalData())) {
            
            return new BooleanWrapper(transformationTechnology.getNeedsOriginalData());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocol() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getProtocol())) {
            
            return new StringWrapper(transformationTechnology.getProtocol());
            
        } else {
            return null;
        }
        
    }

    public TransformationDescriptionsWrapper getTransformationDescriptions() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getTransformationDescriptions())) {
            
            return new TransformationDescriptionsWrapper(transformationTechnology.getTransformationDescriptions());
            
        } else {
            return null;
        }
        
    }

    public TransformerClassEnumWrapper getTransformerClass() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getTransformerClass())) {
            
            return new TransformerClassEnumWrapper(transformationTechnology.getTransformerClass());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getVersion() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getVersion())) {
            
            return new StringWrapper(transformationTechnology.getVersion());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(transformationTechnology.getVariationPoint())) {
            
            return new VariationPointWrapper(transformationTechnology.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}