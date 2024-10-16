package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class SwAxisTypeWrapper {

    
    private SwAxisType swAxisType;

    public SwAxisTypeWrapper(SwAxisType swAxisType) {
        this.swAxisType = swAxisType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swAxisType.getS())) {
            
            return swAxisType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swAxisType.getT())) {
            
            return swAxisType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swAxisType.getUuid())) {
            
            return swAxisType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swAxisType.getShortName())) {
            
            return new IdentifierWrapper(swAxisType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swAxisType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swAxisType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swAxisType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swAxisType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swAxisType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swAxisType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swAxisType.getCategory())) {
            
            return new CategoryStringWrapper(swAxisType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swAxisType.getAdminData())) {
            
            return new AdminDataWrapper(swAxisType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swAxisType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swAxisType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swAxisType.getAnnotations())) {
            ArrayList<Annotation> originalList = swAxisType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swAxisType.getVariationPoint())) {
            
            return new VariationPointWrapper(swAxisType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getSwGenericAxisDesc() {
        
        if (CollUtil.isNotEmpty(swAxisType.getSwGenericAxisDesc())) {
            
            return new DocumentationBlockWrapper(swAxisType.getSwGenericAxisDesc());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwGenericAxisParamTypeWrapper> getSwGenericAxisParamTypes() {
        
        if (CollUtil.isNotEmpty(swAxisType.getSwGenericAxisParamTypes())) {
            ArrayList<SwGenericAxisParamType> originalList = swAxisType.getSwGenericAxisParamTypes();
            ArrayList<SwGenericAxisParamTypeWrapper> wrapperList = (ArrayList<SwGenericAxisParamTypeWrapper>)originalList.stream()
                .map(item -> new SwGenericAxisParamTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}