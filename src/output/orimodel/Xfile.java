package stdgui.data.model.orimodel;
@XmlRootElement(name = "XFILE")
public class Xfile {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected SingleLanguageLongName longName1;
    
    
    
    protected Url url;
    
    
    
    protected String tool;
    
    
    
    protected String toolVersion;
    
    

    
    
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
    
    
    
    @XmlElement(name="URL")
    public Url getUrl() {
    return this.url;
}

    public void setUrl(Url value) {
        this.url = value;
    }
    
    
    
    @XmlElement(name="TOOL")
    public String getTool() {
    return this.tool;
}

    public void setTool(String value) {
        this.tool = value;
    }
    
    
    
    @XmlElement(name="TOOL-VERSION")
    public String getToolVersion() {
    return this.toolVersion;
}

    public void setToolVersion(String value) {
        this.toolVersion = value;
    }
    
    
}