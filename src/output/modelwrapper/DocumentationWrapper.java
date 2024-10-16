package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Documentation;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DocumentationWrapper {

    
    private Documentation documentation;

    public DocumentationWrapper(Documentation documentation) {
        this.documentation = documentation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(documentation.getS())) {
            
            return documentation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(documentation.getT())) {
            
            return documentation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(documentation.getUuid())) {
            
            return documentation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(documentation.getShortName())) {
            
            return new IdentifierWrapper(documentation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(documentation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = documentation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(documentation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(documentation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(documentation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(documentation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(documentation.getCategory())) {
            
            return new CategoryStringWrapper(documentation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(documentation.getAdminData())) {
            
            return new AdminDataWrapper(documentation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(documentation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(documentation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(documentation.getAnnotations())) {
            ArrayList<Annotation> originalList = documentation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(documentation.getVariationPoint())) {
            
            return new VariationPointWrapper(documentation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DocumentationContextWrapper> getContexts() {
        
        if (CollUtil.isNotEmpty(documentation.getContexts())) {
            ArrayList<DocumentationContext> originalList = documentation.getContexts();
            ArrayList<DocumentationContextWrapper> wrapperList = (ArrayList<DocumentationContextWrapper>)originalList.stream()
                .map(item -> new DocumentationContextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PredefinedChapterWrapper getDocumentationContent() {
        
        if (CollUtil.isNotEmpty(documentation.getDocumentationContent())) {
            
            return new PredefinedChapterWrapper(documentation.getDocumentationContent());
            
        } else {
            return null;
        }
        
    }




    


    
}