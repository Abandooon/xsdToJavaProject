package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class FlexrayTpPduPoolWrapper {

    
    private FlexrayTpPduPool flexrayTpPduPool;

    public FlexrayTpPduPoolWrapper(FlexrayTpPduPool flexrayTpPduPool) {
        this.flexrayTpPduPool = flexrayTpPduPool;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getS())) {
            
            return flexrayTpPduPool.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getT())) {
            
            return flexrayTpPduPool.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getUuid())) {
            
            return flexrayTpPduPool.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getShortName())) {
            
            return new IdentifierWrapper(flexrayTpPduPool.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayTpPduPool.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayTpPduPool.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayTpPduPool.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getCategory())) {
            
            return new CategoryStringWrapper(flexrayTpPduPool.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getAdminData())) {
            
            return new AdminDataWrapper(flexrayTpPduPool.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayTpPduPool.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayTpPduPool.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NPduRefWrapper> getNPduRefs() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getNPduRefs())) {
            ArrayList<NPduRef> originalList = flexrayTpPduPool.getNPduRefs();
            ArrayList<NPduRefWrapper> wrapperList = (ArrayList<NPduRefWrapper>)originalList.stream()
                .map(item -> new NPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayTpPduPool.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayTpPduPool.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}