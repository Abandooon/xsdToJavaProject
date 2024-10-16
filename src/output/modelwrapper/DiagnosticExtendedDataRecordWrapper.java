package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticExtendedDataRecordWrapper {

    
    private DiagnosticExtendedDataRecord diagnosticExtendedDataRecord;

    public DiagnosticExtendedDataRecordWrapper(DiagnosticExtendedDataRecord diagnosticExtendedDataRecord) {
        this.diagnosticExtendedDataRecord = diagnosticExtendedDataRecord;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getS())) {
            
            return diagnosticExtendedDataRecord.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getT())) {
            
            return diagnosticExtendedDataRecord.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getUuid())) {
            
            return diagnosticExtendedDataRecord.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getShortName())) {
            
            return new IdentifierWrapper(diagnosticExtendedDataRecord.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticExtendedDataRecord.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticExtendedDataRecord.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticExtendedDataRecord.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticExtendedDataRecord.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticExtendedDataRecord.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticExtendedDataRecord.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticExtendedDataRecord.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticExtendedDataRecord.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticParameterWrapper> getRecordElements() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getRecordElements())) {
            ArrayList<DiagnosticParameter> originalList = diagnosticExtendedDataRecord.getRecordElements();
            ArrayList<DiagnosticParameterWrapper> wrapperList = (ArrayList<DiagnosticParameterWrapper>)originalList.stream()
                .map(item -> new DiagnosticParameterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getRecordNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getRecordNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticExtendedDataRecord.getRecordNumber());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticRecordTriggerEnumWrapper getTrigger() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getTrigger())) {
            
            return new DiagnosticRecordTriggerEnumWrapper(diagnosticExtendedDataRecord.getTrigger());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getUpdate() {
        
        if (CollUtil.isNotEmpty(diagnosticExtendedDataRecord.getUpdate())) {
            
            return new BooleanWrapper(diagnosticExtendedDataRecord.getUpdate());
            
        } else {
            return null;
        }
        
    }




    


    
}