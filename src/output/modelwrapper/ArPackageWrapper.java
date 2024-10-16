package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    
        import stdgui.data.model.orimodel.Elements;
    

    
    

    
    


public class ArPackageWrapper {

    
    private ArPackage arPackage;

    public ArPackageWrapper(ArPackage arPackage) {
        this.arPackage = arPackage;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(arPackage.getS())) {
            
            return arPackage.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(arPackage.getT())) {
            
            return arPackage.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(arPackage.getUuid())) {
            
            return arPackage.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(arPackage.getShortName())) {
            
            return new IdentifierWrapper(arPackage.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(arPackage.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = arPackage.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(arPackage.getLongName())) {
            
            return new MultilanguageLongNameWrapper(arPackage.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(arPackage.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(arPackage.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(arPackage.getCategory())) {
            
            return new CategoryStringWrapper(arPackage.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(arPackage.getAdminData())) {
            
            return new AdminDataWrapper(arPackage.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(arPackage.getIntroduction())) {
            
            return new DocumentationBlockWrapper(arPackage.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(arPackage.getAnnotations())) {
            ArrayList<Annotation> originalList = arPackage.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(arPackage.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(arPackage.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(arPackage.getShortNamePattern())) {
            
            return new StringWrapper(arPackage.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ReferenceBaseWrapper> getReferenceBases() {
        
        if (CollUtil.isNotEmpty(arPackage.getReferenceBases())) {
            ArrayList<ReferenceBase> originalList = arPackage.getReferenceBases();
            ArrayList<ReferenceBaseWrapper> wrapperList = (ArrayList<ReferenceBaseWrapper>)originalList.stream()
                .map(item -> new ReferenceBaseWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ElementsWrapper getElements() {
        
        if (CollUtil.isNotEmpty(arPackage.getElements())) {
            
            return new ElementsWrapper(arPackage.getElements());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ArPackageWrapper> getArPackages() {
        
        if (CollUtil.isNotEmpty(arPackage.getArPackages())) {
            ArrayList<ArPackage> originalList = arPackage.getArPackages();
            ArrayList<ArPackageWrapper> wrapperList = (ArrayList<ArPackageWrapper>)originalList.stream()
                .map(item -> new ArPackageWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(arPackage.getVariationPoint())) {
            
            return new VariationPointWrapper(arPackage.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}