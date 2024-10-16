package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class DiagnosticTroubleCodePropsWrapper {

    
    private DiagnosticTroubleCodeProps diagnosticTroubleCodeProps;

    public DiagnosticTroubleCodePropsWrapper(DiagnosticTroubleCodeProps diagnosticTroubleCodeProps) {
        this.diagnosticTroubleCodeProps = diagnosticTroubleCodeProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getS())) {
            
            return diagnosticTroubleCodeProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getT())) {
            
            return diagnosticTroubleCodeProps.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getUuid())) {
            
            return diagnosticTroubleCodeProps.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getShortName())) {
            
            return new IdentifierWrapper(diagnosticTroubleCodeProps.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticTroubleCodeProps.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticTroubleCodeProps.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticTroubleCodeProps.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticTroubleCodeProps.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticTroubleCodeProps.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticTroubleCodeProps.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticTroubleCodeProps.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticTroubleCodeProps.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AgingRefWrapper getAgingRef() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getAgingRef())) {
            
            return new AgingRefWrapper(diagnosticTroubleCodeProps.getAgingRef());
            
        } else {
            return null;
        }
        
    }

    public EnvironmentCaptureToReportingEnumWrapper getEnvironmentCaptureToReporting() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getEnvironmentCaptureToReporting())) {
            
            return new EnvironmentCaptureToReportingEnumWrapper(diagnosticTroubleCodeProps.getEnvironmentCaptureToReporting());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticExtendedDataRecordRefConditionalWrapper> getExtendedDataRecords() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getExtendedDataRecords())) {
            ArrayList<DiagnosticExtendedDataRecordRefConditional> originalList = diagnosticTroubleCodeProps.getExtendedDataRecords();
            ArrayList<DiagnosticExtendedDataRecordRefConditionalWrapper> wrapperList = (ArrayList<DiagnosticExtendedDataRecordRefConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticExtendedDataRecordRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getFdcThresholdStorageValue() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getFdcThresholdStorageValue())) {
            
            return new PositiveIntegerWrapper(diagnosticTroubleCodeProps.getFdcThresholdStorageValue());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticFreezeFrameRefConditionalWrapper> getFreezeFrames() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getFreezeFrames())) {
            ArrayList<DiagnosticFreezeFrameRefConditional> originalList = diagnosticTroubleCodeProps.getFreezeFrames();
            ArrayList<DiagnosticFreezeFrameRefConditionalWrapper> wrapperList = (ArrayList<DiagnosticFreezeFrameRefConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticFreezeFrameRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FreezeFrameContentRefWrapper getFreezeFrameContentRef() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getFreezeFrameContentRef())) {
            
            return new FreezeFrameContentRefWrapper(diagnosticTroubleCodeProps.getFreezeFrameContentRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getImmediateNvDataStorage() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getImmediateNvDataStorage())) {
            
            return new BooleanWrapper(diagnosticTroubleCodeProps.getImmediateNvDataStorage());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNumberFreezeFrameRecords() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getMaxNumberFreezeFrameRecords())) {
            
            return new PositiveIntegerWrapper(diagnosticTroubleCodeProps.getMaxNumberFreezeFrameRecords());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MemoryDestinationRefWrapper> getMemoryDestinationRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getMemoryDestinationRefs())) {
            ArrayList<MemoryDestinationRef> originalList = diagnosticTroubleCodeProps.getMemoryDestinationRefs();
            ArrayList<MemoryDestinationRefWrapper> wrapperList = (ArrayList<MemoryDestinationRefWrapper>)originalList.stream()
                .map(item -> new MemoryDestinationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPriority() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getPriority())) {
            
            return new PositiveIntegerWrapper(diagnosticTroubleCodeProps.getPriority());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticSignificanceEnumWrapper getSignificance() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeProps.getSignificance())) {
            
            return new DiagnosticSignificanceEnumWrapper(diagnosticTroubleCodeProps.getSignificance());
            
        } else {
            return null;
        }
        
    }




    


    
}