package stdgui.data.model.orimodel;
@XmlRootElement(name = "SDG")
public class Sdg {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String gid;
    
    
    
    protected SdgCaption sdgCaption;
    
    
    
    protected SdgCaptionRef sdgCaptionRef;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArrayList<SdxRef> sdxRef;
    
    
    
    protected ArrayList<ReferrableRefConditional> sdxf;
    
    
    
    protected ArrayList<Sd> sd;
    
    
    
    protected ArrayList<Sdg> sdg;
    
    
    
    protected ArrayList<Sdf> sdf;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="GID")
    public java.lang.String getGid() {
    return this.gid;
}

    public void setGid(java.lang.String value) {
        this.gid = value;
    }
    
    
    
    @XmlElement(name="SDG-CAPTION")
    public SdgCaption getSdgCaption() {
    return this.sdgCaption;
}

    public void setSdgCaption(SdgCaption value) {
        this.sdgCaption = value;
    }
    
    
    
    @XmlElement(name="SDG-CAPTION-REF")
    public SdgCaptionRef getSdgCaptionRef() {
    return this.sdgCaptionRef;
}

    public void setSdgCaptionRef(SdgCaptionRef value) {
        this.sdgCaptionRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="SDX-REF")
    public ArrayList<SdxRef> getSdxRef() {
    return this.sdxRef;
}

    public void setSdxRef(ArrayList<SdxRef> value) {
        this.sdxRef = value;
    }
    
    
    
    @XmlElement(name="SDXF")
    public ArrayList<ReferrableRefConditional> getSdxf() {
    return this.sdxf;
}

    public void setSdxf(ArrayList<ReferrableRefConditional> value) {
        this.sdxf = value;
    }
    
    
    
    @XmlElement(name="SD")
    public ArrayList<Sd> getSd() {
    return this.sd;
}

    public void setSd(ArrayList<Sd> value) {
        this.sd = value;
    }
    
    
    
    @XmlElement(name="SDG")
    public ArrayList<Sdg> getSdg() {
    return this.sdg;
}

    public void setSdg(ArrayList<Sdg> value) {
        this.sdg = value;
    }
    
    
    
    @XmlElement(name="SDF")
    public ArrayList<Sdf> getSdf() {
    return this.sdf;
}

    public void setSdf(ArrayList<Sdf> value) {
        this.sdf = value;
    }
    
    
}