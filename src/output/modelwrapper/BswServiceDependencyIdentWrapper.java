package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class BswServiceDependencyIdentWrapper {

    
    private BswServiceDependencyIdent bswServiceDependencyIdent;

    public BswServiceDependencyIdentWrapper(BswServiceDependencyIdent bswServiceDependencyIdent) {
        this.bswServiceDependencyIdent = bswServiceDependencyIdent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getS())) {
            
            return bswServiceDependencyIdent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getT())) {
            
            return bswServiceDependencyIdent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getUuid())) {
            
            return bswServiceDependencyIdent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getShortName())) {
            
            return new IdentifierWrapper(bswServiceDependencyIdent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswServiceDependencyIdent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswServiceDependencyIdent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswServiceDependencyIdent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getCategory())) {
            
            return new CategoryStringWrapper(bswServiceDependencyIdent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getAdminData())) {
            
            return new AdminDataWrapper(bswServiceDependencyIdent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswServiceDependencyIdent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswServiceDependencyIdent.getAnnotations())) {
            ArrayList<Annotation> originalList = bswServiceDependencyIdent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}