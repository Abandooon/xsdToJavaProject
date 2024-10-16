package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class EocExecutableEntityRefWrapper {

    
    private EocExecutableEntityRef eocExecutableEntityRef;

    public EocExecutableEntityRefWrapper(EocExecutableEntityRef eocExecutableEntityRef) {
        this.eocExecutableEntityRef = eocExecutableEntityRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getS())) {
            
            return eocExecutableEntityRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getT())) {
            
            return eocExecutableEntityRef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getUuid())) {
            
            return eocExecutableEntityRef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getShortName())) {
            
            return new IdentifierWrapper(eocExecutableEntityRef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = eocExecutableEntityRef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(eocExecutableEntityRef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(eocExecutableEntityRef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getCategory())) {
            
            return new CategoryStringWrapper(eocExecutableEntityRef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getAdminData())) {
            
            return new AdminDataWrapper(eocExecutableEntityRef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(eocExecutableEntityRef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getAnnotations())) {
            ArrayList<Annotation> originalList = eocExecutableEntityRef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DirectSuccessorRefWrapper> getDirectSuccessorRefs() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getDirectSuccessorRefs())) {
            ArrayList<DirectSuccessorRef> originalList = eocExecutableEntityRef.getDirectSuccessorRefs();
            ArrayList<DirectSuccessorRefWrapper> wrapperList = (ArrayList<DirectSuccessorRefWrapper>)originalList.stream()
                .map(item -> new DirectSuccessorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BswModuleInstanceRefWrapper getBswModuleInstanceRef() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getBswModuleInstanceRef())) {
            
            return new BswModuleInstanceRefWrapper(eocExecutableEntityRef.getBswModuleInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(eocExecutableEntityRef.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public ExecutableRefWrapper getExecutableRef() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getExecutableRef())) {
            
            return new ExecutableRefWrapper(eocExecutableEntityRef.getExecutableRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SuccessorRefWrapper> getSuccessorRefs() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRef.getSuccessorRefs())) {
            ArrayList<SuccessorRef> originalList = eocExecutableEntityRef.getSuccessorRefs();
            ArrayList<SuccessorRefWrapper> wrapperList = (ArrayList<SuccessorRefWrapper>)originalList.stream()
                .map(item -> new SuccessorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}