package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Linker;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class LinkerWrapper {

    
    private Linker linker;

    public LinkerWrapper(Linker linker) {
        this.linker = linker;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linker.getS())) {
            
            return linker.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linker.getT())) {
            
            return linker.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linker.getUuid())) {
            
            return linker.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linker.getShortName())) {
            
            return new IdentifierWrapper(linker.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linker.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linker.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linker.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linker.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linker.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linker.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linker.getCategory())) {
            
            return new CategoryStringWrapper(linker.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linker.getAdminData())) {
            
            return new AdminDataWrapper(linker.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linker.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linker.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linker.getAnnotations())) {
            ArrayList<Annotation> originalList = linker.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getName() {
        
        if (CollUtil.isNotEmpty(linker.getName())) {
            
            return new StringWrapper(linker.getName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getOptions() {
        
        if (CollUtil.isNotEmpty(linker.getOptions())) {
            
            return new StringWrapper(linker.getOptions());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getVendor() {
        
        if (CollUtil.isNotEmpty(linker.getVendor())) {
            
            return new StringWrapper(linker.getVendor());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getVersion() {
        
        if (CollUtil.isNotEmpty(linker.getVersion())) {
            
            return new StringWrapper(linker.getVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}