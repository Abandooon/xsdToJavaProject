package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLEXRAY-TP-CONNECTION-CONTROL")
public class FlexrayTpConnectionControl {

    
    
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
    
    
    
    protected TpAckType ackType;
    
    
    
    protected Integer maxAr;
    
    
    
    protected Integer maxAs;
    
    
    
    protected Integer maxBufferSize;
    
    
    
    protected Integer maxFcWait;
    
    
    
    protected Integer maxFrIf;
    
    
    
    protected Integer maxNumberOfNpduPerCycle;
    
    
    
    protected Integer maxRetries;
    
    
    
    protected Integer separationCycleExponent;
    
    
    
    protected TimeValue timeBr;
    
    
    
    protected TimeValue timeBuffer;
    
    
    
    protected TimeValue timeCs;
    
    
    
    protected TimeValue timeFrIf;
    
    
    
    protected TimeValue timeoutAr;
    
    
    
    protected TimeValue timeoutAs;
    
    
    
    protected TimeValue timeoutBr;
    
    
    
    protected TimeValue timeoutBs;
    
    
    
    protected TimeValue timeoutCr;
    
    
    
    protected TimeValue timeoutCs;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="ACK-TYPE")
    public TpAckType getAckType() {
    return this.ackType;
}

    public void setAckType(TpAckType value) {
        this.ackType = value;
    }
    
    
    
    @XmlElement(name="MAX-AR")
    public Integer getMaxAr() {
    return this.maxAr;
}

    public void setMaxAr(Integer value) {
        this.maxAr = value;
    }
    
    
    
    @XmlElement(name="MAX-AS")
    public Integer getMaxAs() {
    return this.maxAs;
}

    public void setMaxAs(Integer value) {
        this.maxAs = value;
    }
    
    
    
    @XmlElement(name="MAX-BUFFER-SIZE")
    public Integer getMaxBufferSize() {
    return this.maxBufferSize;
}

    public void setMaxBufferSize(Integer value) {
        this.maxBufferSize = value;
    }
    
    
    
    @XmlElement(name="MAX-FC-WAIT")
    public Integer getMaxFcWait() {
    return this.maxFcWait;
}

    public void setMaxFcWait(Integer value) {
        this.maxFcWait = value;
    }
    
    
    
    @XmlElement(name="MAX-FR-IF")
    public Integer getMaxFrIf() {
    return this.maxFrIf;
}

    public void setMaxFrIf(Integer value) {
        this.maxFrIf = value;
    }
    
    
    
    @XmlElement(name="MAX-NUMBER-OF-NPDU-PER-CYCLE")
    public Integer getMaxNumberOfNpduPerCycle() {
    return this.maxNumberOfNpduPerCycle;
}

    public void setMaxNumberOfNpduPerCycle(Integer value) {
        this.maxNumberOfNpduPerCycle = value;
    }
    
    
    
    @XmlElement(name="MAX-RETRIES")
    public Integer getMaxRetries() {
    return this.maxRetries;
}

    public void setMaxRetries(Integer value) {
        this.maxRetries = value;
    }
    
    
    
    @XmlElement(name="SEPARATION-CYCLE-EXPONENT")
    public Integer getSeparationCycleExponent() {
    return this.separationCycleExponent;
}

    public void setSeparationCycleExponent(Integer value) {
        this.separationCycleExponent = value;
    }
    
    
    
    @XmlElement(name="TIME-BR")
    public TimeValue getTimeBr() {
    return this.timeBr;
}

    public void setTimeBr(TimeValue value) {
        this.timeBr = value;
    }
    
    
    
    @XmlElement(name="TIME-BUFFER")
    public TimeValue getTimeBuffer() {
    return this.timeBuffer;
}

    public void setTimeBuffer(TimeValue value) {
        this.timeBuffer = value;
    }
    
    
    
    @XmlElement(name="TIME-CS")
    public TimeValue getTimeCs() {
    return this.timeCs;
}

    public void setTimeCs(TimeValue value) {
        this.timeCs = value;
    }
    
    
    
    @XmlElement(name="TIME-FR-IF")
    public TimeValue getTimeFrIf() {
    return this.timeFrIf;
}

    public void setTimeFrIf(TimeValue value) {
        this.timeFrIf = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-AR")
    public TimeValue getTimeoutAr() {
    return this.timeoutAr;
}

    public void setTimeoutAr(TimeValue value) {
        this.timeoutAr = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-AS")
    public TimeValue getTimeoutAs() {
    return this.timeoutAs;
}

    public void setTimeoutAs(TimeValue value) {
        this.timeoutAs = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-BR")
    public TimeValue getTimeoutBr() {
    return this.timeoutBr;
}

    public void setTimeoutBr(TimeValue value) {
        this.timeoutBr = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-BS")
    public TimeValue getTimeoutBs() {
    return this.timeoutBs;
}

    public void setTimeoutBs(TimeValue value) {
        this.timeoutBs = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-CR")
    public TimeValue getTimeoutCr() {
    return this.timeoutCr;
}

    public void setTimeoutCr(TimeValue value) {
        this.timeoutCr = value;
    }
    
    
    
    @XmlElement(name="TIMEOUT-CS")
    public TimeValue getTimeoutCs() {
    return this.timeoutCs;
}

    public void setTimeoutCs(TimeValue value) {
        this.timeoutCs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}