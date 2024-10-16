package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class EocExecutableEntityRefGroupWrapper {

    
    private EocExecutableEntityRefGroup eocExecutableEntityRefGroup;

    public EocExecutableEntityRefGroupWrapper(EocExecutableEntityRefGroup eocExecutableEntityRefGroup) {
        this.eocExecutableEntityRefGroup = eocExecutableEntityRefGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getS())) {
            
            return eocExecutableEntityRefGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getT())) {
            
            return eocExecutableEntityRefGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getUuid())) {
            
            return eocExecutableEntityRefGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getShortName())) {
            
            return new IdentifierWrapper(eocExecutableEntityRefGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = eocExecutableEntityRefGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(eocExecutableEntityRefGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(eocExecutableEntityRefGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getCategory())) {
            
            return new CategoryStringWrapper(eocExecutableEntityRefGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getAdminData())) {
            
            return new AdminDataWrapper(eocExecutableEntityRefGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(eocExecutableEntityRefGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = eocExecutableEntityRefGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DirectSuccessorRefWrapper> getDirectSuccessorRefs() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getDirectSuccessorRefs())) {
            ArrayList<DirectSuccessorRef> originalList = eocExecutableEntityRefGroup.getDirectSuccessorRefs();
            ArrayList<DirectSuccessorRefWrapper> wrapperList = (ArrayList<DirectSuccessorRefWrapper>)originalList.stream()
                .map(item -> new DirectSuccessorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxCycles() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getMaxCycles())) {
            
            return new IntegerWrapper(eocExecutableEntityRefGroup.getMaxCycles());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxSlots() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getMaxSlots())) {
            
            return new IntegerWrapper(eocExecutableEntityRefGroup.getMaxSlots());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NestedElementRefWrapper> getNestedElementRefs() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getNestedElementRefs())) {
            ArrayList<NestedElementRef> originalList = eocExecutableEntityRefGroup.getNestedElementRefs();
            ArrayList<NestedElementRefWrapper> wrapperList = (ArrayList<NestedElementRefWrapper>)originalList.stream()
                .map(item -> new NestedElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SuccessorRefWrapper> getSuccessorRefs() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getSuccessorRefs())) {
            ArrayList<SuccessorRef> originalList = eocExecutableEntityRefGroup.getSuccessorRefs();
            ArrayList<SuccessorRefWrapper> wrapperList = (ArrayList<SuccessorRefWrapper>)originalList.stream()
                .map(item -> new SuccessorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TriggeringEventRefWrapper getTriggeringEventRef() {
        
        if (CollUtil.isNotEmpty(eocExecutableEntityRefGroup.getTriggeringEventRef())) {
            
            return new TriggeringEventRefWrapper(eocExecutableEntityRefGroup.getTriggeringEventRef());
            
        } else {
            return null;
        }
        
    }




    


    
}