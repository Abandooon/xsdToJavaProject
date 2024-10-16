package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ModeDeclarationMappingSetWrapper {

    
    private ModeDeclarationMappingSet modeDeclarationMappingSet;

    public ModeDeclarationMappingSetWrapper(ModeDeclarationMappingSet modeDeclarationMappingSet) {
        this.modeDeclarationMappingSet = modeDeclarationMappingSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getS())) {
            
            return modeDeclarationMappingSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getT())) {
            
            return modeDeclarationMappingSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getUuid())) {
            
            return modeDeclarationMappingSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getShortName())) {
            
            return new IdentifierWrapper(modeDeclarationMappingSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeDeclarationMappingSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeDeclarationMappingSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeDeclarationMappingSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getCategory())) {
            
            return new CategoryStringWrapper(modeDeclarationMappingSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getAdminData())) {
            
            return new AdminDataWrapper(modeDeclarationMappingSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeDeclarationMappingSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getAnnotations())) {
            ArrayList<Annotation> originalList = modeDeclarationMappingSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getVariationPoint())) {
            
            return new VariationPointWrapper(modeDeclarationMappingSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationMappingWrapper> getModeDeclarationMappings() {
        
        if (CollUtil.isNotEmpty(modeDeclarationMappingSet.getModeDeclarationMappings())) {
            ArrayList<ModeDeclarationMapping> originalList = modeDeclarationMappingSet.getModeDeclarationMappings();
            ArrayList<ModeDeclarationMappingWrapper> wrapperList = (ArrayList<ModeDeclarationMappingWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}