package stdgui.data.model.orimodel;
@XmlRootElement(name = "LIST")
public class List {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String si;
    
    
    
    protected java.lang.String view;
    
    
    
    protected ChapterEnumBreakSimple break1;
    
    
    
    protected KeepWithPreviousEnumSimple keepWithPrevious;
    
    
    
    protected ListEnumSimple type;
    
    
    
    protected ArrayList<Item> item;
    
    
    
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
    
    
    
    @XmlAttribute(name="TYPE")
    public ListEnumSimple getType() {
    return this.type;
}

    public void setType(ListEnumSimple value) {
        this.type = value;
    }
    
    
    
    @XmlElement(name="ITEM")
    public ArrayList<Item> getItem() {
    return this.item;
}

    public void setItem(ArrayList<Item> value) {
        this.item = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}