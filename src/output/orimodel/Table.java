package stdgui.data.model.orimodel;
@XmlRootElement(name = "TABLE")
public class Table {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String si;
    
    
    
    protected java.lang.String view;
    
    
    
    protected ChapterEnumBreakSimple break1;
    
    
    
    protected KeepWithPreviousEnumSimple keepWithPrevious;
    
    
    
    protected java.lang.String colsep;
    
    
    
    protected FloatEnumSimple float1;
    
    
    
    protected FrameEnumSimple frame;
    
    
    
    protected java.lang.String helpEntry;
    
    
    
    protected OrientEnumSimple orient;
    
    
    
    protected java.lang.String pgwide;
    
    
    
    protected java.lang.String rowsep;
    
    
    
    protected java.lang.String tabstyle;
    
    
    
    protected Caption tableCaption;
    
    
    
    protected ArrayList<Tgroup> tgroup;
    
    
    
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
    
    
    
    @XmlAttribute(name="COLSEP")
    public java.lang.String getColsep() {
    return this.colsep;
}

    public void setColsep(java.lang.String value) {
        this.colsep = value;
    }
    
    
    
    @XmlAttribute(name="FLOAT")
    public FloatEnumSimple getFloat() {
    return this.float1;
}

    public void setFloat(FloatEnumSimple value) {
        this.float1 = value;
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
    
    
    
    @XmlAttribute(name="ORIENT")
    public OrientEnumSimple getOrient() {
    return this.orient;
}

    public void setOrient(OrientEnumSimple value) {
        this.orient = value;
    }
    
    
    
    @XmlAttribute(name="PGWIDE")
    public java.lang.String getPgwide() {
    return this.pgwide;
}

    public void setPgwide(java.lang.String value) {
        this.pgwide = value;
    }
    
    
    
    @XmlAttribute(name="ROWSEP")
    public java.lang.String getRowsep() {
    return this.rowsep;
}

    public void setRowsep(java.lang.String value) {
        this.rowsep = value;
    }
    
    
    
    @XmlAttribute(name="TABSTYLE")
    public java.lang.String getTabstyle() {
    return this.tabstyle;
}

    public void setTabstyle(java.lang.String value) {
        this.tabstyle = value;
    }
    
    
    
    @XmlElement(name="TABLE-CAPTION")
    public Caption getTableCaption() {
    return this.tableCaption;
}

    public void setTableCaption(Caption value) {
        this.tableCaption = value;
    }
    
    
    
    @XmlElement(name="TGROUP")
    public ArrayList<Tgroup> getTgroup() {
    return this.tgroup;
}

    public void setTgroup(ArrayList<Tgroup> value) {
        this.tgroup = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}