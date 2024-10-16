package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class SystemSignalGroupWrapper {

    
    private SystemSignalGroup systemSignalGroup;

    public SystemSignalGroupWrapper(SystemSignalGroup systemSignalGroup) {
        this.systemSignalGroup = systemSignalGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getS())) {
            
            return systemSignalGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getT())) {
            
            return systemSignalGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getUuid())) {
            
            return systemSignalGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getShortName())) {
            
            return new IdentifierWrapper(systemSignalGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = systemSignalGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(systemSignalGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(systemSignalGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getCategory())) {
            
            return new CategoryStringWrapper(systemSignalGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getAdminData())) {
            
            return new AdminDataWrapper(systemSignalGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(systemSignalGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = systemSignalGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(systemSignalGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SystemSignalRefWrapper> getSystemSignalRefs() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getSystemSignalRefs())) {
            ArrayList<SystemSignalRef> originalList = systemSignalGroup.getSystemSignalRefs();
            ArrayList<SystemSignalRefWrapper> wrapperList = (ArrayList<SystemSignalRefWrapper>)originalList.stream()
                .map(item -> new SystemSignalRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TransformingSystemSignalRefWrapper getTransformingSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(systemSignalGroup.getTransformingSystemSignalRef())) {
            
            return new TransformingSystemSignalRefWrapper(systemSignalGroup.getTransformingSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}