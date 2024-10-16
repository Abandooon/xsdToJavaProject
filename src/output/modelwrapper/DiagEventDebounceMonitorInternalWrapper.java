package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class DiagEventDebounceMonitorInternalWrapper {

    
    private DiagEventDebounceMonitorInternal diagEventDebounceMonitorInternal;

    public DiagEventDebounceMonitorInternalWrapper(DiagEventDebounceMonitorInternal diagEventDebounceMonitorInternal) {
        this.diagEventDebounceMonitorInternal = diagEventDebounceMonitorInternal;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getS())) {
            
            return diagEventDebounceMonitorInternal.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getT())) {
            
            return diagEventDebounceMonitorInternal.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getUuid())) {
            
            return diagEventDebounceMonitorInternal.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getShortName())) {
            
            return new IdentifierWrapper(diagEventDebounceMonitorInternal.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagEventDebounceMonitorInternal.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagEventDebounceMonitorInternal.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagEventDebounceMonitorInternal.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getCategory())) {
            
            return new CategoryStringWrapper(diagEventDebounceMonitorInternal.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getAdminData())) {
            
            return new AdminDataWrapper(diagEventDebounceMonitorInternal.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagEventDebounceMonitorInternal.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagEventDebounceMonitorInternal.getAnnotations())) {
            ArrayList<Annotation> originalList = diagEventDebounceMonitorInternal.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}