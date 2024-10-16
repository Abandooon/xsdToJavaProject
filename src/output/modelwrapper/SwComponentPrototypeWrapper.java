package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class SwComponentPrototypeWrapper {

    
    private SwComponentPrototype swComponentPrototype;

    public SwComponentPrototypeWrapper(SwComponentPrototype swComponentPrototype) {
        this.swComponentPrototype = swComponentPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getS())) {
            
            return swComponentPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getT())) {
            
            return swComponentPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getUuid())) {
            
            return swComponentPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getShortName())) {
            
            return new IdentifierWrapper(swComponentPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swComponentPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swComponentPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swComponentPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getCategory())) {
            
            return new CategoryStringWrapper(swComponentPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getAdminData())) {
            
            return new AdminDataWrapper(swComponentPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swComponentPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = swComponentPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TypeTref_SwComponentPrototypeWrapper getTypeTref() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getTypeTref())) {
            
            return new TypeTref_SwComponentPrototypeWrapper(swComponentPrototype.getTypeTref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swComponentPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(swComponentPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}