package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class DataTypeMappingSetWrapper {

    
    private DataTypeMappingSet dataTypeMappingSet;

    public DataTypeMappingSetWrapper(DataTypeMappingSet dataTypeMappingSet) {
        this.dataTypeMappingSet = dataTypeMappingSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getS())) {
            
            return dataTypeMappingSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getT())) {
            
            return dataTypeMappingSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getUuid())) {
            
            return dataTypeMappingSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getShortName())) {
            
            return new IdentifierWrapper(dataTypeMappingSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dataTypeMappingSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dataTypeMappingSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dataTypeMappingSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getCategory())) {
            
            return new CategoryStringWrapper(dataTypeMappingSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getAdminData())) {
            
            return new AdminDataWrapper(dataTypeMappingSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataTypeMappingSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getAnnotations())) {
            ArrayList<Annotation> originalList = dataTypeMappingSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getVariationPoint())) {
            
            return new VariationPointWrapper(dataTypeMappingSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(dataTypeMappingSet.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getShortNamePattern())) {
            
            return new StringWrapper(dataTypeMappingSet.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTypeMapWrapper> getDataTypeMaps() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getDataTypeMaps())) {
            ArrayList<DataTypeMap> originalList = dataTypeMappingSet.getDataTypeMaps();
            ArrayList<DataTypeMapWrapper> wrapperList = (ArrayList<DataTypeMapWrapper>)originalList.stream()
                .map(item -> new DataTypeMapWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeRequestTypeMapWrapper> getModeRequestTypeMaps() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingSet.getModeRequestTypeMaps())) {
            ArrayList<ModeRequestTypeMap> originalList = dataTypeMappingSet.getModeRequestTypeMaps();
            ArrayList<ModeRequestTypeMapWrapper> wrapperList = (ArrayList<ModeRequestTypeMapWrapper>)originalList.stream()
                .map(item -> new ModeRequestTypeMapWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}