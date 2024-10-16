package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Collection;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class CollectionWrapper {

    
    private Collection collection;

    public CollectionWrapper(Collection collection) {
        this.collection = collection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(collection.getS())) {
            
            return collection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(collection.getT())) {
            
            return collection.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(collection.getUuid())) {
            
            return collection.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(collection.getShortName())) {
            
            return new IdentifierWrapper(collection.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(collection.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = collection.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(collection.getLongName())) {
            
            return new MultilanguageLongNameWrapper(collection.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(collection.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(collection.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(collection.getCategory())) {
            
            return new CategoryStringWrapper(collection.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(collection.getAdminData())) {
            
            return new AdminDataWrapper(collection.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(collection.getIntroduction())) {
            
            return new DocumentationBlockWrapper(collection.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(collection.getAnnotations())) {
            ArrayList<Annotation> originalList = collection.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(collection.getVariationPoint())) {
            
            return new VariationPointWrapper(collection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AutoCollectEnumWrapper getAutoCollect() {
        
        if (CollUtil.isNotEmpty(collection.getAutoCollect())) {
            
            return new AutoCollectEnumWrapper(collection.getAutoCollect());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getElementRole() {
        
        if (CollUtil.isNotEmpty(collection.getElementRole())) {
            
            return new IdentifierWrapper(collection.getElementRole());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ElementRefWrapper> getElementRefs() {
        
        if (CollUtil.isNotEmpty(collection.getElementRefs())) {
            ArrayList<ElementRef> originalList = collection.getElementRefs();
            ArrayList<ElementRefWrapper> wrapperList = (ArrayList<ElementRefWrapper>)originalList.stream()
                .map(item -> new ElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SourceElementRefWrapper> getSourceElementRefs() {
        
        if (CollUtil.isNotEmpty(collection.getSourceElementRefs())) {
            ArrayList<SourceElementRef> originalList = collection.getSourceElementRefs();
            ArrayList<SourceElementRefWrapper> wrapperList = (ArrayList<SourceElementRefWrapper>)originalList.stream()
                .map(item -> new SourceElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AnyInstanceRefWrapper> getCollectedInstanceIrefs() {
        
        if (CollUtil.isNotEmpty(collection.getCollectedInstanceIrefs())) {
            ArrayList<AnyInstanceRef> originalList = collection.getCollectedInstanceIrefs();
            ArrayList<AnyInstanceRefWrapper> wrapperList = (ArrayList<AnyInstanceRefWrapper>)originalList.stream()
                .map(item -> new AnyInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AnyInstanceRefWrapper> getSourceInstanceIrefs() {
        
        if (CollUtil.isNotEmpty(collection.getSourceInstanceIrefs())) {
            ArrayList<AnyInstanceRef> originalList = collection.getSourceInstanceIrefs();
            ArrayList<AnyInstanceRefWrapper> wrapperList = (ArrayList<AnyInstanceRefWrapper>)originalList.stream()
                .map(item -> new AnyInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}