package stdgui.data.model.orimodel;
@XmlRootElement(name = "DOCUMENTATION-BLOCK")
public class DocumentationBlock {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
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