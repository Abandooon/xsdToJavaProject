package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    


public class ApplicationRecordDataTypeWrapper {

    
    private ApplicationRecordDataType applicationRecordDataType;

    public ApplicationRecordDataTypeWrapper(ApplicationRecordDataType applicationRecordDataType) {
        this.applicationRecordDataType = applicationRecordDataType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getS())) {
            
            return applicationRecordDataType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getT())) {
            
            return applicationRecordDataType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getUuid())) {
            
            return applicationRecordDataType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getShortName())) {
            
            return new IdentifierWrapper(applicationRecordDataType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = applicationRecordDataType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(applicationRecordDataType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(applicationRecordDataType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getCategory())) {
            
            return new CategoryStringWrapper(applicationRecordDataType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getAdminData())) {
            
            return new AdminDataWrapper(applicationRecordDataType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(applicationRecordDataType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getAnnotations())) {
            ArrayList<Annotation> originalList = applicationRecordDataType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(applicationRecordDataType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getShortNamePattern())) {
            
            return new StringWrapper(applicationRecordDataType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getVariationPoint())) {
            
            return new VariationPointWrapper(applicationRecordDataType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(applicationRecordDataType.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ApplicationRecordElementWrapper> getElements() {
        
        if (CollUtil.isNotEmpty(applicationRecordDataType.getElements())) {
            ArrayList<ApplicationRecordElement> originalList = applicationRecordDataType.getElements();
            ArrayList<ApplicationRecordElementWrapper> wrapperList = (ArrayList<ApplicationRecordElementWrapper>)originalList.stream()
                .map(item -> new ApplicationRecordElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}