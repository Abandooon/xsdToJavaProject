package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class BswDebugInfoWrapper {

    
    private BswDebugInfo bswDebugInfo;

    public BswDebugInfoWrapper(BswDebugInfo bswDebugInfo) {
        this.bswDebugInfo = bswDebugInfo;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getS())) {
            
            return bswDebugInfo.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getT())) {
            
            return bswDebugInfo.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getUuid())) {
            
            return bswDebugInfo.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getShortName())) {
            
            return new IdentifierWrapper(bswDebugInfo.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswDebugInfo.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswDebugInfo.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswDebugInfo.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getCategory())) {
            
            return new CategoryStringWrapper(bswDebugInfo.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getAdminData())) {
            
            return new AdminDataWrapper(bswDebugInfo.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswDebugInfo.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getAnnotations())) {
            ArrayList<Annotation> originalList = bswDebugInfo.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ImplementationDataTypeElementWrapper> getLocalDebugDatas() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getLocalDebugDatas())) {
            ArrayList<ImplementationDataTypeElement> originalList = bswDebugInfo.getLocalDebugDatas();
            ArrayList<ImplementationDataTypeElementWrapper> wrapperList = (ArrayList<ImplementationDataTypeElementWrapper>)originalList.stream()
                .map(item -> new ImplementationDataTypeElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterAccessedForDebugRefWrapper> getParameterAccessedForDebugRefs() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getParameterAccessedForDebugRefs())) {
            ArrayList<ParameterAccessedForDebugRef> originalList = bswDebugInfo.getParameterAccessedForDebugRefs();
            ArrayList<ParameterAccessedForDebugRefWrapper> wrapperList = (ArrayList<ParameterAccessedForDebugRefWrapper>)originalList.stream()
                .map(item -> new ParameterAccessedForDebugRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAccessedForDebugRefWrapper> getVariableAccessedForDebugRefs() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getVariableAccessedForDebugRefs())) {
            ArrayList<VariableAccessedForDebugRef> originalList = bswDebugInfo.getVariableAccessedForDebugRefs();
            ArrayList<VariableAccessedForDebugRefWrapper> wrapperList = (ArrayList<VariableAccessedForDebugRefWrapper>)originalList.stream()
                .map(item -> new VariableAccessedForDebugRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswDebugInfo.getVariationPoint())) {
            
            return new VariationPointWrapper(bswDebugInfo.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}