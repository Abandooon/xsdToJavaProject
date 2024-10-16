package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class DataTransformationWrapper {

    
    private DataTransformation dataTransformation;

    public DataTransformationWrapper(DataTransformation dataTransformation) {
        this.dataTransformation = dataTransformation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getS())) {
            
            return dataTransformation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getT())) {
            
            return dataTransformation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getUuid())) {
            
            return dataTransformation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getShortName())) {
            
            return new IdentifierWrapper(dataTransformation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dataTransformation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dataTransformation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dataTransformation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getCategory())) {
            
            return new CategoryStringWrapper(dataTransformation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getAdminData())) {
            
            return new AdminDataWrapper(dataTransformation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataTransformation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getAnnotations())) {
            ArrayList<Annotation> originalList = dataTransformation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getExecuteDespiteDataUnavailability() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getExecuteDespiteDataUnavailability())) {
            
            return new BooleanWrapper(dataTransformation.getExecuteDespiteDataUnavailability());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TransformerChainRefWrapper> getTransformerChainRefs() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getTransformerChainRefs())) {
            ArrayList<TransformerChainRef> originalList = dataTransformation.getTransformerChainRefs();
            ArrayList<TransformerChainRefWrapper> wrapperList = (ArrayList<TransformerChainRefWrapper>)originalList.stream()
                .map(item -> new TransformerChainRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataTransformation.getVariationPoint())) {
            
            return new VariationPointWrapper(dataTransformation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}