package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class CompilerWrapper {

    
    private Compiler compiler;

    public CompilerWrapper(Compiler compiler) {
        this.compiler = compiler;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compiler.getS())) {
            
            return compiler.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compiler.getT())) {
            
            return compiler.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(compiler.getUuid())) {
            
            return compiler.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(compiler.getShortName())) {
            
            return new IdentifierWrapper(compiler.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(compiler.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = compiler.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(compiler.getLongName())) {
            
            return new MultilanguageLongNameWrapper(compiler.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(compiler.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(compiler.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(compiler.getCategory())) {
            
            return new CategoryStringWrapper(compiler.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(compiler.getAdminData())) {
            
            return new AdminDataWrapper(compiler.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(compiler.getIntroduction())) {
            
            return new DocumentationBlockWrapper(compiler.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(compiler.getAnnotations())) {
            ArrayList<Annotation> originalList = compiler.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getName() {
        
        if (CollUtil.isNotEmpty(compiler.getName())) {
            
            return new StringWrapper(compiler.getName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getOptions() {
        
        if (CollUtil.isNotEmpty(compiler.getOptions())) {
            
            return new StringWrapper(compiler.getOptions());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getVendor() {
        
        if (CollUtil.isNotEmpty(compiler.getVendor())) {
            
            return new StringWrapper(compiler.getVendor());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getVersion() {
        
        if (CollUtil.isNotEmpty(compiler.getVersion())) {
            
            return new StringWrapper(compiler.getVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}