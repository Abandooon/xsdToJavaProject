package stdgui.data.model.orimodel;
@XmlRootElement(name = "STD")
public class Std {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected SingleLanguageLongName longName1;
    
    
    
    protected String subtitle;
    
    
    
    protected String state;
    
    
    
    protected Date date;
    
    
    
    protected Url url;
    
    
    
    protected String position;
    
    

    
    
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
    
    
    
    @XmlElement(name="LONG-NAME-1")
    public SingleLanguageLongName getLongName1() {
    return this.longName1;
}

    public void setLongName1(SingleLanguageLongName value) {
        this.longName1 = value;
    }
    
    
    
    @XmlElement(name="SUBTITLE")
    public String getSubtitle() {
    return this.subtitle;
}

    public void setSubtitle(String value) {
        this.subtitle = value;
    }
    
    
    
    @XmlElement(name="STATE")
    public String getState() {
    return this.state;
}

    public void setState(String value) {
        this.state = value;
    }
    
    
    
    @XmlElement(name="DATE")
    public Date getDate() {
    return this.date;
}

    public void setDate(Date value) {
        this.date = value;
    }
    
    
    
    @XmlElement(name="URL")
    public Url getUrl() {
    return this.url;
}

    public void setUrl(Url value) {
        this.url = value;
    }
    
    
    
    @XmlElement(name="POSITION")
    public String getPosition() {
    return this.position;
}

    public void setPosition(String value) {
        this.position = value;
    }
    
    
}