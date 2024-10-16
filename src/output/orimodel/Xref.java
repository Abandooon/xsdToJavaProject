package stdgui.data.model.orimodel;
@XmlRootElement(name = "XREF")
public class Xref {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ResolutionPolicyEnumSimple resolutionPolicy;
    
    
    
    protected ShowContentEnumSimple showContent;
    
    
    
    protected ShowResourceAliasNameEnumSimple showResourceAliasName;
    
    
    
    protected ShowResourceCategoryEnumSimple showResourceCategory;
    
    
    
    protected ShowResourceLongNameEnumSimple showResourceLongName;
    
    
    
    protected ShowResourceNumberEnumSimple showResourceNumber;
    
    
    
    protected ShowResourcePageEnumSimple showResourcePage;
    
    
    
    protected ShowResourceShortNameEnumSimple showResourceShortName;
    
    
    
    protected ShowResourceTypeEnumSimple showResourceType;
    
    
    
    protected ShowSeeEnumSimple showSee;
    
    
    
    protected SingleLanguageLongName label1;
    
    
    
    protected ReferrableRef referrableRef;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="RESOLUTION-POLICY")
    public ResolutionPolicyEnumSimple getResolutionPolicy() {
    return this.resolutionPolicy;
}

    public void setResolutionPolicy(ResolutionPolicyEnumSimple value) {
        this.resolutionPolicy = value;
    }
    
    
    
    @XmlAttribute(name="SHOW-CONTENT")
    public ShowContentEnumSimple getShowContent() {
    return this.showContent;
}

    public void setShowContent(ShowContentEnumSimple value) {
        this.showContent = value;
    }
    
    
    
    @XmlAttribute(name="SHOW-RESOURCE-ALIAS-NAME")
    public ShowResourceAliasNameEnumSimple getShowResourceAliasName() {
    return this.showResourceAliasName;
}

    public void setShowResourceAliasName(ShowResourceAliasNameEnumSimple value) {
        this.showResourceAliasName = value;
    }
    
    
    
    @XmlAttribute(name="SHOW-RESOURCE-CATEGORY")
    public ShowResourceCategoryEnumSimple getShowResourceCategory() {
    return this.showResourceCategory;
}

    public void setShowResourceCategory(ShowResourceCategoryEnumSimple value) {
        this.showResourceCategory = value;
    }
    
    
    
    @XmlAttribute(name="SHOW-RESOURCE-LONG-NAME")
    public ShowResourceLongNameEnumSimple getShowResourceLongName() {
    return this.showResourceLongName;
}

    public void setShowResourceLongName(ShowResourceLongNameEnumSimple value) {
        this.showResourceLongName = value;
    }
    
    
    
    @XmlAttribute(name="SHOW-RESOURCE-NUMBER")
    public ShowResourceNumberEnumSimple getShowResourceNumber() {
    return this.showResourceNumber;
}

    public void setShowResourceNumber(ShowResourceNumberEnumSimple value) {
        this.showResourceNumber = value;
    }
    
    
    
    @XmlAttribute(name="SHOW-RESOURCE-PAGE")
    public ShowResourcePageEnumSimple getShowResourcePage() {
    return this.showResourcePage;
}

    public void setShowResourcePage(ShowResourcePageEnumSimple value) {
        this.showResourcePage = value;
    }
    
    
    
    @XmlAttribute(name="SHOW-RESOURCE-SHORT-NAME")
    public ShowResourceShortNameEnumSimple getShowResourceShortName() {
    return this.showResourceShortName;
}

    public void setShowResourceShortName(ShowResourceShortNameEnumSimple value) {
        this.showResourceShortName = value;
    }
    
    
    
    @XmlAttribute(name="SHOW-RESOURCE-TYPE")
    public ShowResourceTypeEnumSimple getShowResourceType() {
    return this.showResourceType;
}

    public void setShowResourceType(ShowResourceTypeEnumSimple value) {
        this.showResourceType = value;
    }
    
    
    
    @XmlAttribute(name="SHOW-SEE")
    public ShowSeeEnumSimple getShowSee() {
    return this.showSee;
}

    public void setShowSee(ShowSeeEnumSimple value) {
        this.showSee = value;
    }
    
    
    
    @XmlElement(name="LABEL-1")
    public SingleLanguageLongName getLabel1() {
    return this.label1;
}

    public void setLabel1(SingleLanguageLongName value) {
        this.label1 = value;
    }
    
    
    
    @XmlElement(name="REFERRABLE-REF")
    public ReferrableRef getReferrableRef() {
    return this.referrableRef;
}

    public void setReferrableRef(ReferrableRef value) {
        this.referrableRef = value;
    }
    
    
}