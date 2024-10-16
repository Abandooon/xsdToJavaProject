package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class RapidPrototypingScenarioWrapper {

    
    private RapidPrototypingScenario rapidPrototypingScenario;

    public RapidPrototypingScenarioWrapper(RapidPrototypingScenario rapidPrototypingScenario) {
        this.rapidPrototypingScenario = rapidPrototypingScenario;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getS())) {
            
            return rapidPrototypingScenario.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getT())) {
            
            return rapidPrototypingScenario.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getUuid())) {
            
            return rapidPrototypingScenario.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getShortName())) {
            
            return new IdentifierWrapper(rapidPrototypingScenario.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = rapidPrototypingScenario.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getLongName())) {
            
            return new MultilanguageLongNameWrapper(rapidPrototypingScenario.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(rapidPrototypingScenario.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getCategory())) {
            
            return new CategoryStringWrapper(rapidPrototypingScenario.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getAdminData())) {
            
            return new AdminDataWrapper(rapidPrototypingScenario.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getIntroduction())) {
            
            return new DocumentationBlockWrapper(rapidPrototypingScenario.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getAnnotations())) {
            ArrayList<Annotation> originalList = rapidPrototypingScenario.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getVariationPoint())) {
            
            return new VariationPointWrapper(rapidPrototypingScenario.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public HostSystemRefWrapper getHostSystemRef() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getHostSystemRef())) {
            
            return new HostSystemRefWrapper(rapidPrototypingScenario.getHostSystemRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RptContainerWrapper> getRptContainers() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getRptContainers())) {
            ArrayList<RptContainer> originalList = rapidPrototypingScenario.getRptContainers();
            ArrayList<RptContainerWrapper> wrapperList = (ArrayList<RptContainerWrapper>)originalList.stream()
                .map(item -> new RptContainerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RptSystemRefWrapper getRptSystemRef() {
        
        if (CollUtil.isNotEmpty(rapidPrototypingScenario.getRptSystemRef())) {
            
            return new RptSystemRefWrapper(rapidPrototypingScenario.getRptSystemRef());
            
        } else {
            return null;
        }
        
    }




    


    
}