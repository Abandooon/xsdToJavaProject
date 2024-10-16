package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class ViewMapWrapper {

    
    private ViewMap viewMap;

    public ViewMapWrapper(ViewMap viewMap) {
        this.viewMap = viewMap;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(viewMap.getS())) {
            
            return viewMap.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(viewMap.getT())) {
            
            return viewMap.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(viewMap.getUuid())) {
            
            return viewMap.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(viewMap.getShortName())) {
            
            return new IdentifierWrapper(viewMap.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(viewMap.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = viewMap.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(viewMap.getLongName())) {
            
            return new MultilanguageLongNameWrapper(viewMap.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(viewMap.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(viewMap.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(viewMap.getCategory())) {
            
            return new CategoryStringWrapper(viewMap.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(viewMap.getAdminData())) {
            
            return new AdminDataWrapper(viewMap.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(viewMap.getIntroduction())) {
            
            return new DocumentationBlockWrapper(viewMap.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(viewMap.getAnnotations())) {
            ArrayList<Annotation> originalList = viewMap.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(viewMap.getRole())) {
            
            return new IdentifierWrapper(viewMap.getRole());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FirstElementRefWrapper> getFirstElementRefs() {
        
        if (CollUtil.isNotEmpty(viewMap.getFirstElementRefs())) {
            ArrayList<FirstElementRef> originalList = viewMap.getFirstElementRefs();
            ArrayList<FirstElementRefWrapper> wrapperList = (ArrayList<FirstElementRefWrapper>)originalList.stream()
                .map(item -> new FirstElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SecondElementRefWrapper> getSecondElementRefs() {
        
        if (CollUtil.isNotEmpty(viewMap.getSecondElementRefs())) {
            ArrayList<SecondElementRef> originalList = viewMap.getSecondElementRefs();
            ArrayList<SecondElementRefWrapper> wrapperList = (ArrayList<SecondElementRefWrapper>)originalList.stream()
                .map(item -> new SecondElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AnyInstanceRefWrapper> getFirstElementInstanceIrefs() {
        
        if (CollUtil.isNotEmpty(viewMap.getFirstElementInstanceIrefs())) {
            ArrayList<AnyInstanceRef> originalList = viewMap.getFirstElementInstanceIrefs();
            ArrayList<AnyInstanceRefWrapper> wrapperList = (ArrayList<AnyInstanceRefWrapper>)originalList.stream()
                .map(item -> new AnyInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AnyInstanceRefWrapper> getSecondElementInstanceIrefs() {
        
        if (CollUtil.isNotEmpty(viewMap.getSecondElementInstanceIrefs())) {
            ArrayList<AnyInstanceRef> originalList = viewMap.getSecondElementInstanceIrefs();
            ArrayList<AnyInstanceRefWrapper> wrapperList = (ArrayList<AnyInstanceRefWrapper>)originalList.stream()
                .map(item -> new AnyInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}