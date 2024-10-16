package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class ExclusiveAreaWrapper {

    
    private ExclusiveArea exclusiveArea;

    public ExclusiveAreaWrapper(ExclusiveArea exclusiveArea) {
        this.exclusiveArea = exclusiveArea;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getS())) {
            
            return exclusiveArea.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getT())) {
            
            return exclusiveArea.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getUuid())) {
            
            return exclusiveArea.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getShortName())) {
            
            return new IdentifierWrapper(exclusiveArea.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = exclusiveArea.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getLongName())) {
            
            return new MultilanguageLongNameWrapper(exclusiveArea.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(exclusiveArea.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getCategory())) {
            
            return new CategoryStringWrapper(exclusiveArea.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getAdminData())) {
            
            return new AdminDataWrapper(exclusiveArea.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getIntroduction())) {
            
            return new DocumentationBlockWrapper(exclusiveArea.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getAnnotations())) {
            ArrayList<Annotation> originalList = exclusiveArea.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(exclusiveArea.getVariationPoint())) {
            
            return new VariationPointWrapper(exclusiveArea.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}