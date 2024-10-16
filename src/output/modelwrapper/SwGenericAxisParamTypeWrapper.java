package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class SwGenericAxisParamTypeWrapper {

    
    private SwGenericAxisParamType swGenericAxisParamType;

    public SwGenericAxisParamTypeWrapper(SwGenericAxisParamType swGenericAxisParamType) {
        this.swGenericAxisParamType = swGenericAxisParamType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getS())) {
            
            return swGenericAxisParamType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getT())) {
            
            return swGenericAxisParamType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getUuid())) {
            
            return swGenericAxisParamType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getShortName())) {
            
            return new IdentifierWrapper(swGenericAxisParamType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swGenericAxisParamType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swGenericAxisParamType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swGenericAxisParamType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getCategory())) {
            
            return new CategoryStringWrapper(swGenericAxisParamType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getAdminData())) {
            
            return new AdminDataWrapper(swGenericAxisParamType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swGenericAxisParamType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getAnnotations())) {
            ArrayList<Annotation> originalList = swGenericAxisParamType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DataConstrRefWrapper getDataConstrRef() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamType.getDataConstrRef())) {
            
            return new DataConstrRefWrapper(swGenericAxisParamType.getDataConstrRef());
            
        } else {
            return null;
        }
        
    }




    


    
}