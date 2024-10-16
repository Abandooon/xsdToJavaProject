package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class RptContainerWrapper {

    
    private RptContainer rptContainer;

    public RptContainerWrapper(RptContainer rptContainer) {
        this.rptContainer = rptContainer;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rptContainer.getS())) {
            
            return rptContainer.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rptContainer.getT())) {
            
            return rptContainer.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(rptContainer.getUuid())) {
            
            return rptContainer.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(rptContainer.getShortName())) {
            
            return new IdentifierWrapper(rptContainer.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(rptContainer.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = rptContainer.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(rptContainer.getLongName())) {
            
            return new MultilanguageLongNameWrapper(rptContainer.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(rptContainer.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(rptContainer.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(rptContainer.getCategory())) {
            
            return new CategoryStringWrapper(rptContainer.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(rptContainer.getAdminData())) {
            
            return new AdminDataWrapper(rptContainer.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(rptContainer.getIntroduction())) {
            
            return new DocumentationBlockWrapper(rptContainer.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(rptContainer.getAnnotations())) {
            ArrayList<Annotation> originalList = rptContainer.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AnyInstanceRefWrapper> getByPassPointIrefs() {
        
        if (CollUtil.isNotEmpty(rptContainer.getByPassPointIrefs())) {
            ArrayList<AnyInstanceRef> originalList = rptContainer.getByPassPointIrefs();
            ArrayList<AnyInstanceRefWrapper> wrapperList = (ArrayList<AnyInstanceRefWrapper>)originalList.stream()
                .map(item -> new AnyInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RptContainerWrapper> getRptContainers() {
        
        if (CollUtil.isNotEmpty(rptContainer.getRptContainers())) {
            ArrayList<RptContainer> originalList = rptContainer.getRptContainers();
            ArrayList<RptContainerWrapper> wrapperList = (ArrayList<RptContainerWrapper>)originalList.stream()
                .map(item -> new RptContainerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RptHookWrapper> getRptHooks() {
        
        if (CollUtil.isNotEmpty(rptContainer.getRptHooks())) {
            ArrayList<RptHook> originalList = rptContainer.getRptHooks();
            ArrayList<RptHookWrapper> wrapperList = (ArrayList<RptHookWrapper>)originalList.stream()
                .map(item -> new RptHookWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(rptContainer.getVariationPoint())) {
            
            return new VariationPointWrapper(rptContainer.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}