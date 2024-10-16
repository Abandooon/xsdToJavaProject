package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DataTransformationSetWrapper {

    
    private DataTransformationSet dataTransformationSet;

    public DataTransformationSetWrapper(DataTransformationSet dataTransformationSet) {
        this.dataTransformationSet = dataTransformationSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getS())) {
            
            return dataTransformationSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getT())) {
            
            return dataTransformationSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getUuid())) {
            
            return dataTransformationSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getShortName())) {
            
            return new IdentifierWrapper(dataTransformationSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dataTransformationSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dataTransformationSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dataTransformationSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getCategory())) {
            
            return new CategoryStringWrapper(dataTransformationSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getAdminData())) {
            
            return new AdminDataWrapper(dataTransformationSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataTransformationSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getAnnotations())) {
            ArrayList<Annotation> originalList = dataTransformationSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getVariationPoint())) {
            
            return new VariationPointWrapper(dataTransformationSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTransformationWrapper> getDataTransformations() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getDataTransformations())) {
            ArrayList<DataTransformation> originalList = dataTransformationSet.getDataTransformations();
            ArrayList<DataTransformationWrapper> wrapperList = (ArrayList<DataTransformationWrapper>)originalList.stream()
                .map(item -> new DataTransformationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TransformationTechnologyWrapper> getTransformationTechnologys() {
        
        if (CollUtil.isNotEmpty(dataTransformationSet.getTransformationTechnologys())) {
            ArrayList<TransformationTechnology> originalList = dataTransformationSet.getTransformationTechnologys();
            ArrayList<TransformationTechnologyWrapper> wrapperList = (ArrayList<TransformationTechnologyWrapper>)originalList.stream()
                .map(item -> new TransformationTechnologyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}