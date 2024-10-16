package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class FmAttributeDefWrapper {

    
    private FmAttributeDef fmAttributeDef;

    public FmAttributeDefWrapper(FmAttributeDef fmAttributeDef) {
        this.fmAttributeDef = fmAttributeDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getS())) {
            
            return fmAttributeDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getT())) {
            
            return fmAttributeDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getUuid())) {
            
            return fmAttributeDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getShortName())) {
            
            return new IdentifierWrapper(fmAttributeDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmAttributeDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmAttributeDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmAttributeDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getCategory())) {
            
            return new CategoryStringWrapper(fmAttributeDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getAdminData())) {
            
            return new AdminDataWrapper(fmAttributeDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmAttributeDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getAnnotations())) {
            ArrayList<Annotation> originalList = fmAttributeDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getDefaultValue() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getDefaultValue())) {
            
            return new NumericalValueWrapper(fmAttributeDef.getDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public LimitValueWrapper getMax() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getMax())) {
            
            return new LimitValueWrapper(fmAttributeDef.getMax());
            
        } else {
            return null;
        }
        
    }

    public LimitValueWrapper getMin() {
        
        if (CollUtil.isNotEmpty(fmAttributeDef.getMin())) {
            
            return new LimitValueWrapper(fmAttributeDef.getMin());
            
        } else {
            return null;
        }
        
    }




    


    
}