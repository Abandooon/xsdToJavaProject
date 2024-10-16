package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class ISignalGroupWrapper {

    
    private ISignalGroup iSignalGroup;

    public ISignalGroupWrapper(ISignalGroup iSignalGroup) {
        this.iSignalGroup = iSignalGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getS())) {
            
            return iSignalGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getT())) {
            
            return iSignalGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getUuid())) {
            
            return iSignalGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getShortName())) {
            
            return new IdentifierWrapper(iSignalGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = iSignalGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(iSignalGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(iSignalGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getCategory())) {
            
            return new CategoryStringWrapper(iSignalGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getAdminData())) {
            
            return new AdminDataWrapper(iSignalGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iSignalGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = iSignalGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignalGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTransformationRefConditionalWrapper> getComBasedSignalGroupTransformations() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getComBasedSignalGroupTransformations())) {
            ArrayList<DataTransformationRefConditional> originalList = iSignalGroup.getComBasedSignalGroupTransformations();
            ArrayList<DataTransformationRefConditionalWrapper> wrapperList = (ArrayList<DataTransformationRefConditionalWrapper>)originalList.stream()
                .map(item -> new DataTransformationRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalRefWrapper> getISignalRefs() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getISignalRefs())) {
            ArrayList<ISignalRef> originalList = iSignalGroup.getISignalRefs();
            ArrayList<ISignalRefWrapper> wrapperList = (ArrayList<ISignalRefWrapper>)originalList.stream()
                .map(item -> new ISignalRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SystemSignalGroupRefWrapper getSystemSignalGroupRef() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getSystemSignalGroupRef())) {
            
            return new SystemSignalGroupRefWrapper(iSignalGroup.getSystemSignalGroupRef());
            
        } else {
            return null;
        }
        
    }

    public TransformationISignalPropssWrapper getTransformationISignalPropss() {
        
        if (CollUtil.isNotEmpty(iSignalGroup.getTransformationISignalPropss())) {
            
            return new TransformationISignalPropssWrapper(iSignalGroup.getTransformationISignalPropss());
            
        } else {
            return null;
        }
        
    }




    


    
}