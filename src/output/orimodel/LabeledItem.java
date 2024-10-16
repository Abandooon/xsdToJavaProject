package stdgui.data.model.orimodel;
@XmlRootElement(name = "LABELED-ITEM")
public class LabeledItem {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String si;
    
    
    
    protected java.lang.String view;
    
    
    
    protected ChapterEnumBreakSimple break1;
    
    
    
    protected KeepWithPreviousEnumSimple keepWithPrevious;
    
    
    
    protected java.lang.String helpEntry;
    
    
    
    protected MultiLanguageOverviewParagraph itemLabel;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArrayList<MsrQueryP2> msrQueryP2;
    
    
    
    protected ArrayList<MultiLanguageParagraph> p;
    
    
    
    protected ArrayList<MultiLanguageVerbatim> verbatim;
    
    
    
    protected ArrayList<List> list;
    
    
    
    protected ArrayList<DefList> defList;
    
    
    
    protected ArrayList<LabeledList> labeledList;
    
    
    
    protected ArrayList<MlFormula> formula;
    
    
    
    protected ArrayList<MlFigure> figure;
    
    
    
    protected ArrayList<Note> note;
    
    
    
    protected ArrayList<TraceableText> trace;
    
    
    
    protected ArrayList<StructuredReq> structuredReq;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="HELP-ENTRY")
    public java.lang.String getHelpEntry() {
    return this.helpEntry;
}

    public void setHelpEntry(java.lang.String value) {
        this.helpEntry = value;
    }
    
    
    
    @XmlElement(name="ITEM-LABEL")
    public MultiLanguageOverviewParagraph getItemLabel() {
    return this.itemLabel;
}

    public void setItemLabel(MultiLanguageOverviewParagraph value) {
        this.itemLabel = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-P-2")
    public ArrayList<MsrQueryP2> getMsrQueryP2() {
    return this.msrQueryP2;
}

    public void setMsrQueryP2(ArrayList<MsrQueryP2> value) {
        this.msrQueryP2 = value;
    }
    
    
    
    @XmlElement(name="P")
    public ArrayList<MultiLanguageParagraph> getP() {
    return this.p;
}

    public void setP(ArrayList<MultiLanguageParagraph> value) {
        this.p = value;
    }
    
    
    
    @XmlElement(name="VERBATIM")
    public ArrayList<MultiLanguageVerbatim> getVerbatim() {
    return this.verbatim;
}

    public void setVerbatim(ArrayList<MultiLanguageVerbatim> value) {
        this.verbatim = value;
    }
    
    
    
    @XmlElement(name="LIST")
    public ArrayList<List> getList() {
    return this.list;
}

    public void setList(ArrayList<List> value) {
        this.list = value;
    }
    
    
    
    @XmlElement(name="DEF-LIST")
    public ArrayList<DefList> getDefList() {
    return this.defList;
}

    public void setDefList(ArrayList<DefList> value) {
        this.defList = value;
    }
    
    
    
    @XmlElement(name="LABELED-LIST")
    public ArrayList<LabeledList> getLabeledList() {
    return this.labeledList;
}

    public void setLabeledList(ArrayList<LabeledList> value) {
        this.labeledList = value;
    }
    
    
    
    @XmlElement(name="FORMULA")
    public ArrayList<MlFormula> getFormula() {
    return this.formula;
}

    public void setFormula(ArrayList<MlFormula> value) {
        this.formula = value;
    }
    
    
    
    @XmlElement(name="FIGURE")
    public ArrayList<MlFigure> getFigure() {
    return this.figure;
}

    public void setFigure(ArrayList<MlFigure> value) {
        this.figure = value;
    }
    
    
    
    @XmlElement(name="NOTE")
    public ArrayList<Note> getNote() {
    return this.note;
}

    public void setNote(ArrayList<Note> value) {
        this.note = value;
    }
    
    
    
    @XmlElement(name="TRACE")
    public ArrayList<TraceableText> getTrace() {
    return this.trace;
}

    public void setTrace(ArrayList<TraceableText> value) {
        this.trace = value;
    }
    
    
    
    @XmlElement(name="STRUCTURED-REQ")
    public ArrayList<StructuredReq> getStructuredReq() {
    return this.structuredReq;
}

    public void setStructuredReq(ArrayList<StructuredReq> value) {
        this.structuredReq = value;
    }
    
    
}