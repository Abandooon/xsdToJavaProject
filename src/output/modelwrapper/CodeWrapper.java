package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class CodeWrapper {

    
    private Code code;

    public CodeWrapper(Code code) {
        this.code = code;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(code.getS())) {
            
            return code.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(code.getT())) {
            
            return code.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(code.getUuid())) {
            
            return code.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(code.getShortName())) {
            
            return new IdentifierWrapper(code.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(code.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = code.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(code.getLongName())) {
            
            return new MultilanguageLongNameWrapper(code.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(code.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(code.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(code.getCategory())) {
            
            return new CategoryStringWrapper(code.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(code.getAdminData())) {
            
            return new AdminDataWrapper(code.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(code.getIntroduction())) {
            
            return new DocumentationBlockWrapper(code.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(code.getAnnotations())) {
            ArrayList<Annotation> originalList = code.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AutosarEngineeringObjectWrapper> getArtifactDescriptors() {
        
        if (CollUtil.isNotEmpty(code.getArtifactDescriptors())) {
            ArrayList<AutosarEngineeringObject> originalList = code.getArtifactDescriptors();
            ArrayList<AutosarEngineeringObjectWrapper> wrapperList = (ArrayList<AutosarEngineeringObjectWrapper>)originalList.stream()
                .map(item -> new AutosarEngineeringObjectWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CallbackHeaderRefWrapper> getCallbackHeaderRefs() {
        
        if (CollUtil.isNotEmpty(code.getCallbackHeaderRefs())) {
            ArrayList<CallbackHeaderRef> originalList = code.getCallbackHeaderRefs();
            ArrayList<CallbackHeaderRefWrapper> wrapperList = (ArrayList<CallbackHeaderRefWrapper>)originalList.stream()
                .map(item -> new CallbackHeaderRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}