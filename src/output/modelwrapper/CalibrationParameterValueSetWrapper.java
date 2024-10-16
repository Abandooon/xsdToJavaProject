package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class CalibrationParameterValueSetWrapper {

    
    private CalibrationParameterValueSet calibrationParameterValueSet;

    public CalibrationParameterValueSetWrapper(CalibrationParameterValueSet calibrationParameterValueSet) {
        this.calibrationParameterValueSet = calibrationParameterValueSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getS())) {
            
            return calibrationParameterValueSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getT())) {
            
            return calibrationParameterValueSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getUuid())) {
            
            return calibrationParameterValueSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getShortName())) {
            
            return new IdentifierWrapper(calibrationParameterValueSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = calibrationParameterValueSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(calibrationParameterValueSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(calibrationParameterValueSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getCategory())) {
            
            return new CategoryStringWrapper(calibrationParameterValueSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getAdminData())) {
            
            return new AdminDataWrapper(calibrationParameterValueSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(calibrationParameterValueSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getAnnotations())) {
            ArrayList<Annotation> originalList = calibrationParameterValueSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getVariationPoint())) {
            
            return new VariationPointWrapper(calibrationParameterValueSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CalibrationParameterValueWrapper> getCalibrationParameterValues() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSet.getCalibrationParameterValues())) {
            ArrayList<CalibrationParameterValue> originalList = calibrationParameterValueSet.getCalibrationParameterValues();
            ArrayList<CalibrationParameterValueWrapper> wrapperList = (ArrayList<CalibrationParameterValueWrapper>)originalList.stream()
                .map(item -> new CalibrationParameterValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}