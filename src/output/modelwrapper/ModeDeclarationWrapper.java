package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ModeDeclarationWrapper {

    
    private ModeDeclaration modeDeclaration;

    public ModeDeclarationWrapper(ModeDeclaration modeDeclaration) {
        this.modeDeclaration = modeDeclaration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getS())) {
            
            return modeDeclaration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getT())) {
            
            return modeDeclaration.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getUuid())) {
            
            return modeDeclaration.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getShortName())) {
            
            return new IdentifierWrapper(modeDeclaration.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeDeclaration.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeDeclaration.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeDeclaration.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getCategory())) {
            
            return new CategoryStringWrapper(modeDeclaration.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getAdminData())) {
            
            return new AdminDataWrapper(modeDeclaration.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeDeclaration.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getAnnotations())) {
            ArrayList<Annotation> originalList = modeDeclaration.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getValue() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getValue())) {
            
            return new PositiveIntegerWrapper(modeDeclaration.getValue());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeDeclaration.getVariationPoint())) {
            
            return new VariationPointWrapper(modeDeclaration.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}