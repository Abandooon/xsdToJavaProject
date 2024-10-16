package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class SwSystemconstWrapper {

    
    private SwSystemconst swSystemconst;

    public SwSystemconstWrapper(SwSystemconst swSystemconst) {
        this.swSystemconst = swSystemconst;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getS())) {
            
            return swSystemconst.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getT())) {
            
            return swSystemconst.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getUuid())) {
            
            return swSystemconst.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getShortName())) {
            
            return new IdentifierWrapper(swSystemconst.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swSystemconst.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swSystemconst.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swSystemconst.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getCategory())) {
            
            return new CategoryStringWrapper(swSystemconst.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getAdminData())) {
            
            return new AdminDataWrapper(swSystemconst.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swSystemconst.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getAnnotations())) {
            ArrayList<Annotation> originalList = swSystemconst.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getVariationPoint())) {
            
            return new VariationPointWrapper(swSystemconst.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(swSystemconst.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(swSystemconst.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }




    


    
}