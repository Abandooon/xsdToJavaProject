package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class VariationPointProxyWrapper {

    
    private VariationPointProxy variationPointProxy;

    public VariationPointProxyWrapper(VariationPointProxy variationPointProxy) {
        this.variationPointProxy = variationPointProxy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getS())) {
            
            return variationPointProxy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getT())) {
            
            return variationPointProxy.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getUuid())) {
            
            return variationPointProxy.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getShortName())) {
            
            return new IdentifierWrapper(variationPointProxy.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = variationPointProxy.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getLongName())) {
            
            return new MultilanguageLongNameWrapper(variationPointProxy.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(variationPointProxy.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getCategory())) {
            
            return new CategoryStringWrapper(variationPointProxy.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getAdminData())) {
            
            return new AdminDataWrapper(variationPointProxy.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getIntroduction())) {
            
            return new DocumentationBlockWrapper(variationPointProxy.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getAnnotations())) {
            ArrayList<Annotation> originalList = variationPointProxy.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ConditionByFormulaWrapper getConditionAccess() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getConditionAccess())) {
            
            return new ConditionByFormulaWrapper(variationPointProxy.getConditionAccess());
            
        } else {
            return null;
        }
        
    }

    public ImplementationDataTypeRefWrapper getImplementationDataTypeRef() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getImplementationDataTypeRef())) {
            
            return new ImplementationDataTypeRefWrapper(variationPointProxy.getImplementationDataTypeRef());
            
        } else {
            return null;
        }
        
    }

    public PostBuildValueAccessRefWrapper getPostBuildValueAccessRef() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getPostBuildValueAccessRef())) {
            
            return new PostBuildValueAccessRefWrapper(variationPointProxy.getPostBuildValueAccessRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PostBuildVariantConditionWrapper> getPostBuildVariantConditions() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getPostBuildVariantConditions())) {
            ArrayList<PostBuildVariantCondition> originalList = variationPointProxy.getPostBuildVariantConditions();
            ArrayList<PostBuildVariantConditionWrapper> wrapperList = (ArrayList<PostBuildVariantConditionWrapper>)originalList.stream()
                .map(item -> new PostBuildVariantConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ValueAccessWrapper getValueAccess() {
        
        if (CollUtil.isNotEmpty(variationPointProxy.getValueAccess())) {
            
            return new ValueAccessWrapper(variationPointProxy.getValueAccess());
            
        } else {
            return null;
        }
        
    }




    


    
}