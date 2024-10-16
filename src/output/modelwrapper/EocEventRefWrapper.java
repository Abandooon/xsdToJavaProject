package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class EocEventRefWrapper {

    
    private EocEventRef eocEventRef;

    public EocEventRefWrapper(EocEventRef eocEventRef) {
        this.eocEventRef = eocEventRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getS())) {
            
            return eocEventRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getT())) {
            
            return eocEventRef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getUuid())) {
            
            return eocEventRef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getShortName())) {
            
            return new IdentifierWrapper(eocEventRef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = eocEventRef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(eocEventRef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(eocEventRef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getCategory())) {
            
            return new CategoryStringWrapper(eocEventRef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getAdminData())) {
            
            return new AdminDataWrapper(eocEventRef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(eocEventRef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getAnnotations())) {
            ArrayList<Annotation> originalList = eocEventRef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DirectSuccessorRefWrapper> getDirectSuccessorRefs() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getDirectSuccessorRefs())) {
            ArrayList<DirectSuccessorRef> originalList = eocEventRef.getDirectSuccessorRefs();
            ArrayList<DirectSuccessorRefWrapper> wrapperList = (ArrayList<DirectSuccessorRefWrapper>)originalList.stream()
                .map(item -> new DirectSuccessorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BswModuleInstanceRefWrapper getBswModuleInstanceRef() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getBswModuleInstanceRef())) {
            
            return new BswModuleInstanceRefWrapper(eocEventRef.getBswModuleInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(eocEventRef.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public EventRef_EocEventRefWrapper getEventRef() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getEventRef())) {
            
            return new EventRef_EocEventRefWrapper(eocEventRef.getEventRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SuccessorRefWrapper> getSuccessorRefs() {
        
        if (CollUtil.isNotEmpty(eocEventRef.getSuccessorRefs())) {
            ArrayList<SuccessorRef> originalList = eocEventRef.getSuccessorRefs();
            ArrayList<SuccessorRefWrapper> wrapperList = (ArrayList<SuccessorRefWrapper>)originalList.stream()
                .map(item -> new SuccessorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}