package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class RootSwCompositionPrototypeWrapper {

    
    private RootSwCompositionPrototype rootSwCompositionPrototype;

    public RootSwCompositionPrototypeWrapper(RootSwCompositionPrototype rootSwCompositionPrototype) {
        this.rootSwCompositionPrototype = rootSwCompositionPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getS())) {
            
            return rootSwCompositionPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getT())) {
            
            return rootSwCompositionPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getUuid())) {
            
            return rootSwCompositionPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getShortName())) {
            
            return new IdentifierWrapper(rootSwCompositionPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = rootSwCompositionPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(rootSwCompositionPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(rootSwCompositionPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getCategory())) {
            
            return new CategoryStringWrapper(rootSwCompositionPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getAdminData())) {
            
            return new AdminDataWrapper(rootSwCompositionPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(rootSwCompositionPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = rootSwCompositionPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CalibrationParameterValueSetRefWrapper> getCalibrationParameterValueSetRefs() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getCalibrationParameterValueSetRefs())) {
            ArrayList<CalibrationParameterValueSetRef> originalList = rootSwCompositionPrototype.getCalibrationParameterValueSetRefs();
            ArrayList<CalibrationParameterValueSetRefWrapper> wrapperList = (ArrayList<CalibrationParameterValueSetRefWrapper>)originalList.stream()
                .map(item -> new CalibrationParameterValueSetRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FlatMapRefWrapper getFlatMapRef() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getFlatMapRef())) {
            
            return new FlatMapRefWrapper(rootSwCompositionPrototype.getFlatMapRef());
            
        } else {
            return null;
        }
        
    }

    public SoftwareCompositionTrefWrapper getSoftwareCompositionTref() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getSoftwareCompositionTref())) {
            
            return new SoftwareCompositionTrefWrapper(rootSwCompositionPrototype.getSoftwareCompositionTref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(rootSwCompositionPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(rootSwCompositionPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}