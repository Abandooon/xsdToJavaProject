package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-RECORD-LAYOUT-V")
public class SwRecordLayoutV {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected AsamRecordLayoutSemantics category;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected BaseTypeRef baseTypeRef;
    
    
    
    protected AxisIndexType swRecordLayoutVAxis;
    
    
    
    protected NmtokenString swRecordLayoutVProp;
    
    
    
    protected NmtokensString swRecordLayoutVIndex;
    
    
    
    protected SwGenericAxisParamTypeRef swGenericAxisParamTypeRef;
    
    
    
    protected Integer swRecordLayoutVFixValue;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public AsamRecordLayoutSemantics getCategory() {
    return this.category;
}

    public void setCategory(AsamRecordLayoutSemantics value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="BASE-TYPE-REF")
    public BaseTypeRef getBaseTypeRef() {
    return this.baseTypeRef;
}

    public void setBaseTypeRef(BaseTypeRef value) {
        this.baseTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-V-AXIS")
    public AxisIndexType getSwRecordLayoutVAxis() {
    return this.swRecordLayoutVAxis;
}

    public void setSwRecordLayoutVAxis(AxisIndexType value) {
        this.swRecordLayoutVAxis = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-V-PROP")
    public NmtokenString getSwRecordLayoutVProp() {
    return this.swRecordLayoutVProp;
}

    public void setSwRecordLayoutVProp(NmtokenString value) {
        this.swRecordLayoutVProp = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-V-INDEX")
    public NmtokensString getSwRecordLayoutVIndex() {
    return this.swRecordLayoutVIndex;
}

    public void setSwRecordLayoutVIndex(NmtokensString value) {
        this.swRecordLayoutVIndex = value;
    }
    
    
    
    @XmlElement(name="SW-GENERIC-AXIS-PARAM-TYPE-REF")
    public SwGenericAxisParamTypeRef getSwGenericAxisParamTypeRef() {
    return this.swGenericAxisParamTypeRef;
}

    public void setSwGenericAxisParamTypeRef(SwGenericAxisParamTypeRef value) {
        this.swGenericAxisParamTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-V-FIX-VALUE")
    public Integer getSwRecordLayoutVFixValue() {
    return this.swRecordLayoutVFixValue;
}

    public void setSwRecordLayoutVFixValue(Integer value) {
        this.swRecordLayoutVFixValue = value;
    }
    
    
}