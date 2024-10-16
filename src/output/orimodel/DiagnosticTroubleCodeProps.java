package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-TROUBLE-CODE-PROPS")
public class DiagnosticTroubleCodeProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected AgingRef agingRef;
    
    
    
    protected EnvironmentCaptureToReportingEnum environmentCaptureToReporting;
    
    
    
    protected ArrayList<DiagnosticExtendedDataRecordRefConditional> extendedDataRecords;
    
    
    
    protected PositiveInteger fdcThresholdStorageValue;
    
    
    
    protected ArrayList<DiagnosticFreezeFrameRefConditional> freezeFrames;
    
    
    
    protected FreezeFrameContentRef freezeFrameContentRef;
    
    
    
    protected Boolean immediateNvDataStorage;
    
    
    
    protected PositiveInteger maxNumberFreezeFrameRecords;
    
    
    
    protected ArrayList<MemoryDestinationRef> memoryDestinationRefs;
    
    
    
    protected PositiveInteger priority;
    
    
    
    protected DiagnosticSignificanceEnum significance;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlAttribute(name="UUID")
    public java.lang.String getUuid() {
    return this.uuid;
}

    public void setUuid(java.lang.String value) {
        this.uuid = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
    return this.shortName;
}

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="LONG-NAME")
    public MultilanguageLongName getLongName() {
    return this.longName;
}

    public void setLongName(MultilanguageLongName value) {
        this.longName = value;
    }
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public CategoryString getCategory() {
    return this.category;
}

    public void setCategory(CategoryString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
    return this.adminData;
}

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="AGING-REF")
    public AgingRef getAgingRef() {
    return this.agingRef;
}

    public void setAgingRef(AgingRef value) {
        this.agingRef = value;
    }
    
    
    
    @XmlElement(name="ENVIRONMENT-CAPTURE-TO-REPORTING")
    public EnvironmentCaptureToReportingEnum getEnvironmentCaptureToReporting() {
    return this.environmentCaptureToReporting;
}

    public void setEnvironmentCaptureToReporting(EnvironmentCaptureToReportingEnum value) {
        this.environmentCaptureToReporting = value;
    }
    
    
    
    @XmlElementWrapper(name="EXTENDED-DATA-RECORDS")
@XmlElement(name="DIAGNOSTIC-EXTENDED-DATA-RECORD-REF-CONDITIONAL")
    public ArrayList<DiagnosticExtendedDataRecordRefConditional> getExtendedDataRecords() {
    return this.extendedDataRecords;
}

    public void setExtendedDataRecords(ArrayList<DiagnosticExtendedDataRecordRefConditional> value) {
        this.extendedDataRecords = value;
    }
    
    
    
    @XmlElement(name="FDC-THRESHOLD-STORAGE-VALUE")
    public PositiveInteger getFdcThresholdStorageValue() {
    return this.fdcThresholdStorageValue;
}

    public void setFdcThresholdStorageValue(PositiveInteger value) {
        this.fdcThresholdStorageValue = value;
    }
    
    
    
    @XmlElementWrapper(name="FREEZE-FRAMES")
@XmlElement(name="DIAGNOSTIC-FREEZE-FRAME-REF-CONDITIONAL")
    public ArrayList<DiagnosticFreezeFrameRefConditional> getFreezeFrames() {
    return this.freezeFrames;
}

    public void setFreezeFrames(ArrayList<DiagnosticFreezeFrameRefConditional> value) {
        this.freezeFrames = value;
    }
    
    
    
    @XmlElement(name="FREEZE-FRAME-CONTENT-REF")
    public FreezeFrameContentRef getFreezeFrameContentRef() {
    return this.freezeFrameContentRef;
}

    public void setFreezeFrameContentRef(FreezeFrameContentRef value) {
        this.freezeFrameContentRef = value;
    }
    
    
    
    @XmlElement(name="IMMEDIATE-NV-DATA-STORAGE")
    public Boolean getImmediateNvDataStorage() {
    return this.immediateNvDataStorage;
}

    public void setImmediateNvDataStorage(Boolean value) {
        this.immediateNvDataStorage = value;
    }
    
    
    
    @XmlElement(name="MAX-NUMBER-FREEZE-FRAME-RECORDS")
    public PositiveInteger getMaxNumberFreezeFrameRecords() {
    return this.maxNumberFreezeFrameRecords;
}

    public void setMaxNumberFreezeFrameRecords(PositiveInteger value) {
        this.maxNumberFreezeFrameRecords = value;
    }
    
    
    
    @XmlElementWrapper(name="MEMORY-DESTINATION-REFS")
@XmlElement(name="MEMORY-DESTINATION-REF")
    public ArrayList<MemoryDestinationRef> getMemoryDestinationRefs() {
    return this.memoryDestinationRefs;
}

    public void setMemoryDestinationRefs(ArrayList<MemoryDestinationRef> value) {
        this.memoryDestinationRefs = value;
    }
    
    
    
    @XmlElement(name="PRIORITY")
    public PositiveInteger getPriority() {
    return this.priority;
}

    public void setPriority(PositiveInteger value) {
        this.priority = value;
    }
    
    
    
    @XmlElement(name="SIGNIFICANCE")
    public DiagnosticSignificanceEnum getSignificance() {
    return this.significance;
}

    public void setSignificance(DiagnosticSignificanceEnum value) {
        this.significance = value;
    }
    
    
}