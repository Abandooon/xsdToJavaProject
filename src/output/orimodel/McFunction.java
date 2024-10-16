package stdgui.data.model.orimodel;
@XmlRootElement(name = "MC-FUNCTION")
public class McFunction {

    
    
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
    
    
    
    protected McFunctionDataRefSet defCalprmSet;
    
    
    
    protected McFunctionDataRefSet refCalprmSet;
    
    
    
    protected McFunctionDataRefSet inMeasurementSet;
    
    
    
    protected McFunctionDataRefSet outMeasurmentSet;
    
    
    
    protected McFunctionDataRefSet locMeasurementSet;
    
    
    
    protected McFunctionDataRefSet outMeasurementSet;
    
    
    
    protected ArrayList<SubFunctionRef> subFunctionRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="DEF-CALPRM-SET")
    public McFunctionDataRefSet getDefCalprmSet() {
    return this.defCalprmSet;
}

    public void setDefCalprmSet(McFunctionDataRefSet value) {
        this.defCalprmSet = value;
    }
    
    
    
    @XmlElement(name="REF-CALPRM-SET")
    public McFunctionDataRefSet getRefCalprmSet() {
    return this.refCalprmSet;
}

    public void setRefCalprmSet(McFunctionDataRefSet value) {
        this.refCalprmSet = value;
    }
    
    
    
    @XmlElement(name="IN-MEASUREMENT-SET")
    public McFunctionDataRefSet getInMeasurementSet() {
    return this.inMeasurementSet;
}

    public void setInMeasurementSet(McFunctionDataRefSet value) {
        this.inMeasurementSet = value;
    }
    
    
    
    @XmlElement(name="OUT-MEASURMENT-SET")
    public McFunctionDataRefSet getOutMeasurmentSet() {
    return this.outMeasurmentSet;
}

    public void setOutMeasurmentSet(McFunctionDataRefSet value) {
        this.outMeasurmentSet = value;
    }
    
    
    
    @XmlElement(name="LOC-MEASUREMENT-SET")
    public McFunctionDataRefSet getLocMeasurementSet() {
    return this.locMeasurementSet;
}

    public void setLocMeasurementSet(McFunctionDataRefSet value) {
        this.locMeasurementSet = value;
    }
    
    
    
    @XmlElement(name="OUT-MEASUREMENT-SET")
    public McFunctionDataRefSet getOutMeasurementSet() {
    return this.outMeasurementSet;
}

    public void setOutMeasurementSet(McFunctionDataRefSet value) {
        this.outMeasurementSet = value;
    }
    
    
    
    @XmlElementWrapper(name="SUB-FUNCTION-REFS")
@XmlElement(name="SUB-FUNCTION-REF")
    public ArrayList<SubFunctionRef> getSubFunctionRefs() {
    return this.subFunctionRefs;
}

    public void setSubFunctionRefs(ArrayList<SubFunctionRef> value) {
        this.subFunctionRefs = value;
    }
    
    
}