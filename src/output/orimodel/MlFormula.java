package stdgui.data.model.orimodel;
@XmlRootElement(name = "ML-FORMULA")
public class MlFormula {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String si;
    
    
    
    protected java.lang.String view;
    
    
    
    protected ChapterEnumBreakSimple break1;
    
    
    
    protected KeepWithPreviousEnumSimple keepWithPrevious;
    
    
    
    protected Caption formulaCaption;
    
    
    
    protected MultiLanguageVerbatim verbatim;
    
    
    
    protected MultiLanguagePlainText texMath;
    
    
    
    protected MultiLanguagePlainText genericMath;
    
    
    
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
    
    
    
    @XmlElement(name="FORMULA-CAPTION")
    public Caption getFormulaCaption() {
    return this.formulaCaption;
}

    public void setFormulaCaption(Caption value) {
        this.formulaCaption = value;
    }
    
    
    
    @XmlElement(name="VERBATIM")
    public MultiLanguageVerbatim getVerbatim() {
    return this.verbatim;
}

    public void setVerbatim(MultiLanguageVerbatim value) {
        this.verbatim = value;
    }
    
    
    
    @XmlElement(name="TEX-MATH")
    public MultiLanguagePlainText getTexMath() {
    return this.texMath;
}

    public void setTexMath(MultiLanguagePlainText value) {
        this.texMath = value;
    }
    
    
    
    @XmlElement(name="GENERIC-MATH")
    public MultiLanguagePlainText getGenericMath() {
    return this.genericMath;
}

    public void setGenericMath(MultiLanguagePlainText value) {
        this.genericMath = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}