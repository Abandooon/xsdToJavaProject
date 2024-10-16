package stdgui.data.model.orimodel;
@XmlRootElement(name = "ARBITRARY-EVENT-TRIGGERING")
public class ArbitraryEventTriggering {

    
    
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
    
    
    
    protected ArrayList<MultidimensionalTime> minimumDistances;
    
    
    
    protected ArrayList<MultidimensionalTime> maximumDistances;
    
    
    
    protected ArrayList<ConfidenceInterval> confidenceIntervals;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="MINIMUM-DISTANCES")
@XmlElement(name="TIME-VALUE")
    public ArrayList<MultidimensionalTime> getMinimumDistances() {
    return this.minimumDistances;
}

    public void setMinimumDistances(ArrayList<MultidimensionalTime> value) {
        this.minimumDistances = value;
    }
    
    
    
    @XmlElementWrapper(name="MAXIMUM-DISTANCES")
@XmlElement(name="TIME-VALUE")
    public ArrayList<MultidimensionalTime> getMaximumDistances() {
    return this.maximumDistances;
}

    public void setMaximumDistances(ArrayList<MultidimensionalTime> value) {
        this.maximumDistances = value;
    }
    
    
    
    @XmlElementWrapper(name="CONFIDENCE-INTERVALS")
@XmlElement(name="CONFIDENCE-INTERVAL")
    public ArrayList<ConfidenceInterval> getConfidenceIntervals() {
    return this.confidenceIntervals;
}

    public void setConfidenceIntervals(ArrayList<ConfidenceInterval> value) {
        this.confidenceIntervals = value;
    }
    
    
}