package stdgui.data.model.orimodel;
@XmlRootElement(name = "SYNCHRONIZATION-TIMING-CONSTRAINT")
public class SynchronizationTimingConstraint {

    
    
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
    
    
    
    protected EventOccurrenceKindEnum eventOccurrenceKind;
    
    
    
    protected ArrayList<ScopeEventRef> scopeEventRefs;
    
    
    
    protected ArrayList<ScopeRef_LatencyTimingConstraint> scopeRefs;
    
    
    
    protected SynchronizationTypeEnum synchronizationConstraintType;
    
    
    
    protected MultidimensionalTime tolerance;
    
    

    
    
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
    
    
    
    @XmlElement(name="EVENT-OCCURRENCE-KIND")
    public EventOccurrenceKindEnum getEventOccurrenceKind() {
    return this.eventOccurrenceKind;
}

    public void setEventOccurrenceKind(EventOccurrenceKindEnum value) {
        this.eventOccurrenceKind = value;
    }
    
    
    
    @XmlElementWrapper(name="SCOPE-EVENT-REFS")
@XmlElement(name="SCOPE-EVENT-REF")
    public ArrayList<ScopeEventRef> getScopeEventRefs() {
    return this.scopeEventRefs;
}

    public void setScopeEventRefs(ArrayList<ScopeEventRef> value) {
        this.scopeEventRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="SCOPE-REFS")
@XmlElement(name="SCOPE-REF")
    public ArrayList<ScopeRef_LatencyTimingConstraint> getScopeRefs() {
    return this.scopeRefs;
}

    public void setScopeRefs(ArrayList<ScopeRef_LatencyTimingConstraint> value) {
        this.scopeRefs = value;
    }
    
    
    
    @XmlElement(name="SYNCHRONIZATION-CONSTRAINT-TYPE")
    public SynchronizationTypeEnum getSynchronizationConstraintType() {
    return this.synchronizationConstraintType;
}

    public void setSynchronizationConstraintType(SynchronizationTypeEnum value) {
        this.synchronizationConstraintType = value;
    }
    
    
    
    @XmlElement(name="TOLERANCE")
    public MultidimensionalTime getTolerance() {
    return this.tolerance;
}

    public void setTolerance(MultidimensionalTime value) {
        this.tolerance = value;
    }
    
    
}