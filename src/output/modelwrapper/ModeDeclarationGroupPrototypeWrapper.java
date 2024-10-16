package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class ModeDeclarationGroupPrototypeWrapper {

    
    private ModeDeclarationGroupPrototype modeDeclarationGroupPrototype;

    public ModeDeclarationGroupPrototypeWrapper(ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) {
        this.modeDeclarationGroupPrototype = modeDeclarationGroupPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getS())) {
            
            return modeDeclarationGroupPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getT())) {
            
            return modeDeclarationGroupPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getUuid())) {
            
            return modeDeclarationGroupPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getShortName())) {
            
            return new IdentifierWrapper(modeDeclarationGroupPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeDeclarationGroupPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeDeclarationGroupPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeDeclarationGroupPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getCategory())) {
            
            return new CategoryStringWrapper(modeDeclarationGroupPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getAdminData())) {
            
            return new AdminDataWrapper(modeDeclarationGroupPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeDeclarationGroupPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = modeDeclarationGroupPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwCalibrationAccessEnumWrapper getSwCalibrationAccess() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getSwCalibrationAccess())) {
            
            return new SwCalibrationAccessEnumWrapper(modeDeclarationGroupPrototype.getSwCalibrationAccess());
            
        } else {
            return null;
        }
        
    }

    public TypeTref_ModeDeclarationGroupPrototypeWrapper getTypeTref() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getTypeTref())) {
            
            return new TypeTref_ModeDeclarationGroupPrototypeWrapper(modeDeclarationGroupPrototype.getTypeTref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(modeDeclarationGroupPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}