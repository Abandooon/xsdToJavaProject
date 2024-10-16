package stdgui.data.model.orimodel;
@XmlRootElement(name = "ML-FIGURE")
public class MlFigure {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String si;
    
    
    
    protected java.lang.String view;
    
    
    
    protected ChapterEnumBreakSimple break1;
    
    
    
    protected KeepWithPreviousEnumSimple keepWithPrevious;
    
    
    
    protected FrameEnumSimple frame;
    
    
    
    protected java.lang.String helpEntry;
    
    
    
    protected PgwideEnumSimple pgwide;
    
    
    
    protected Caption figureCaption;
    
    
    
    protected MultiLanguageVerbatim verbatim;
    
    
    
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
    
    
    
    @XmlAttribute(name="SI")
    public java.lang.String getSi() {
    return this.si;
}

    public void setSi(java.lang.String value) {
        this.si = value;
    }
    
    
    
    @XmlAttribute(name="VIEW")
    public java.lang.String getView() {
    return this.view;
}

    public void setView(java.lang.String value) {
        this.view = value;
    }
    
    
    
    @XmlAttribute(name="BREAK")
    public ChapterEnumBreakSimple getBreak() {
    return this.break1;
}

    public void setBreak(ChapterEnumBreakSimple value) {
        this.break1 = value;
    }
    
    
    
    @XmlAttribute(name="KEEP-WITH-PREVIOUS")
    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
    return this.keepWithPrevious;
}

    public void setKeepWithPrevious(KeepWithPreviousEnumSimple value) {
        this.keepWithPrevious = value;
    }
    
    
    
    @XmlAttribute(name="FRAME")
    public FrameEnumSimple getFrame() {
    return this.frame;
}

    public void setFrame(FrameEnumSimple value) {
        this.frame = value;
    }
    
    
    
    @XmlAttribute(name="HELP-ENTRY")
    public java.lang.String getHelpEntry() {
    return this.helpEntry;
}

    public void setHelpEntry(java.lang.String value) {
        this.helpEntry = value;
    }
    
    
    
    @XmlAttribute(name="PGWIDE")
    public PgwideEnumSimple getPgwide() {
    return this.pgwide;
}

    public void setPgwide(PgwideEnumSimple value) {
        this.pgwide = value;
    }
    
    
    
    @XmlElement(name="FIGURE-CAPTION")
    public Caption getFigureCaption() {
    return this.figureCaption;
}

    public void setFigureCaption(Caption value) {
        this.figureCaption = value;
    }
    
    
    
    @XmlElement(name="VERBATIM")
    public MultiLanguageVerbatim getVerbatim() {
    return this.verbatim;
}

    public void setVerbatim(MultiLanguageVerbatim value) {
        this.verbatim = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}