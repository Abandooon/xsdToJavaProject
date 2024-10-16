package stdgui.data.model.orimodel;
@XmlRootElement(name = "CONCRETE-PATTERN-EVENT-TRIGGERING")
public class ConcretePatternEventTriggering {

    
    
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
    
    
    
    protected ArrayList<TraceRef> traceRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected EventRef eventRef;
    
    
    
    protected MultidimensionalTime patternJitter;
    
    
    
    protected MultidimensionalTime patternPeriod;
    
    
    
    protected ArrayList<MultidimensionalTime> offsets;
    
    
    
    protected MultidimensionalTime patternLength;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="TRACE-REFS")
@XmlElement(name="TRACE-REF")
    public ArrayList<TraceRef> getTraceRefs() {
    return this.traceRefs;
}

    public void setTraceRefs(ArrayList<TraceRef> value) {
        this.traceRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="EVENT-REF")
    public EventRef getEventRef() {
    return this.eventRef;
}

    public void setEventRef(EventRef value) {
        this.eventRef = value;
    }
    
    
    
    @XmlElement(name="PATTERN-JITTER")
    public MultidimensionalTime getPatternJitter() {
    return this.patternJitter;
}

    public void setPatternJitter(MultidimensionalTime value) {
        this.patternJitter = value;
    }
    
    
    
    @XmlElement(name="PATTERN-PERIOD")
    public MultidimensionalTime getPatternPeriod() {
    return this.patternPeriod;
}

    public void setPatternPeriod(MultidimensionalTime value) {
        this.patternPeriod = value;
    }
    
    
    
    @XmlElementWrapper(name="OFFSETS")
@XmlElement(name="TIME-VALUE")
    public ArrayList<MultidimensionalTime> getOffsets() {
    return this.offsets;
}

    public void setOffsets(ArrayList<MultidimensionalTime> value) {
        this.offsets = value;
    }
    
    
    
    @XmlElement(name="PATTERN-LENGTH")
    public MultidimensionalTime getPatternLength() {
    return this.patternLength;
}

    public void setPatternLength(MultidimensionalTime value) {
        this.patternLength = value;
    }
    
    
}