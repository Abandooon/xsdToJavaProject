package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class ParameterAccessWrapper {

    
    private ParameterAccess parameterAccess;

    public ParameterAccessWrapper(ParameterAccess parameterAccess) {
        this.parameterAccess = parameterAccess;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getS())) {
            
            return parameterAccess.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getT())) {
            
            return parameterAccess.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getUuid())) {
            
            return parameterAccess.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getShortName())) {
            
            return new IdentifierWrapper(parameterAccess.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = parameterAccess.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getLongName())) {
            
            return new MultilanguageLongNameWrapper(parameterAccess.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(parameterAccess.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getCategory())) {
            
            return new CategoryStringWrapper(parameterAccess.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getAdminData())) {
            
            return new AdminDataWrapper(parameterAccess.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getIntroduction())) {
            
            return new DocumentationBlockWrapper(parameterAccess.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getAnnotations())) {
            ArrayList<Annotation> originalList = parameterAccess.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public AutosarParameterRefWrapper getAccessedParameter() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getAccessedParameter())) {
            
            return new AutosarParameterRefWrapper(parameterAccess.getAccessedParameter());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(parameterAccess.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(parameterAccess.getVariationPoint())) {
            
            return new VariationPointWrapper(parameterAccess.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}