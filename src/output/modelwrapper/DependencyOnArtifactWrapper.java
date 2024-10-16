package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DependencyOnArtifactWrapper {

    
    private DependencyOnArtifact dependencyOnArtifact;

    public DependencyOnArtifactWrapper(DependencyOnArtifact dependencyOnArtifact) {
        this.dependencyOnArtifact = dependencyOnArtifact;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getS())) {
            
            return dependencyOnArtifact.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getT())) {
            
            return dependencyOnArtifact.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getUuid())) {
            
            return dependencyOnArtifact.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getShortName())) {
            
            return new IdentifierWrapper(dependencyOnArtifact.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dependencyOnArtifact.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dependencyOnArtifact.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dependencyOnArtifact.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getCategory())) {
            
            return new CategoryStringWrapper(dependencyOnArtifact.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getAdminData())) {
            
            return new AdminDataWrapper(dependencyOnArtifact.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dependencyOnArtifact.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getAnnotations())) {
            ArrayList<Annotation> originalList = dependencyOnArtifact.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public AutosarEngineeringObjectWrapper getArtifactDescriptor() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getArtifactDescriptor())) {
            
            return new AutosarEngineeringObjectWrapper(dependencyOnArtifact.getArtifactDescriptor());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DependencyUsageEnumWrapper> getUsages() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getUsages())) {
            ArrayList<DependencyUsageEnum> originalList = dependencyOnArtifact.getUsages();
            ArrayList<DependencyUsageEnumWrapper> wrapperList = (ArrayList<DependencyUsageEnumWrapper>)originalList.stream()
                .map(item -> new DependencyUsageEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dependencyOnArtifact.getVariationPoint())) {
            
            return new VariationPointWrapper(dependencyOnArtifact.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}