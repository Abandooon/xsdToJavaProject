package stdgui.data.model.orimodel;
@XmlRootElement(name = "MAP")
public class Map {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String class1;
    
    
    
    protected java.lang.String name;
    
    
    
    protected java.lang.String onclick;
    
    
    
    protected java.lang.String ondblclick;
    
    
    
    protected java.lang.String onkeydown;
    
    
    
    protected java.lang.String onkeypress;
    
    
    
    protected java.lang.String onkeyup;
    
    
    
    protected java.lang.String onmousedown;
    
    
    
    protected java.lang.String onmousemove;
    
    
    
    protected java.lang.String onmouseout;
    
    
    
    protected java.lang.String onmouseover;
    
    
    
    protected java.lang.String onmouseup;
    
    
    
    protected java.lang.String style;
    
    
    
    protected java.lang.String title;
    
    
    
    protected ArrayList<Area> area;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="CLASS")
    public java.lang.String getClass1() {
    return this.class1;
}

    public void setClass(java.lang.String value) {
        this.class1 = value;
    }
    
    
    
    @XmlAttribute(name="NAME")
    public java.lang.String getName() {
    return this.name;
}

    public void setName(java.lang.String value) {
        this.name = value;
    }
    
    
    
    @XmlAttribute(name="ONCLICK")
    public java.lang.String getOnclick() {
    return this.onclick;
}

    public void setOnclick(java.lang.String value) {
        this.onclick = value;
    }
    
    
    
    @XmlAttribute(name="ONDBLCLICK")
    public java.lang.String getOndblclick() {
    return this.ondblclick;
}

    public void setOndblclick(java.lang.String value) {
        this.ondblclick = value;
    }
    
    
    
    @XmlAttribute(name="ONKEYDOWN")
    public java.lang.String getOnkeydown() {
    return this.onkeydown;
}

    public void setOnkeydown(java.lang.String value) {
        this.onkeydown = value;
    }
    
    
    
    @XmlAttribute(name="ONKEYPRESS")
    public java.lang.String getOnkeypress() {
    return this.onkeypress;
}

    public void setOnkeypress(java.lang.String value) {
        this.onkeypress = value;
    }
    
    
    
    @XmlAttribute(name="ONKEYUP")
    public java.lang.String getOnkeyup() {
    return this.onkeyup;
}

    public void setOnkeyup(java.lang.String value) {
        this.onkeyup = value;
    }
    
    
    
    @XmlAttribute(name="ONMOUSEDOWN")
    public java.lang.String getOnmousedown() {
    return this.onmousedown;
}

    public void setOnmousedown(java.lang.String value) {
        this.onmousedown = value;
    }
    
    
    
    @XmlAttribute(name="ONMOUSEMOVE")
    public java.lang.String getOnmousemove() {
    return this.onmousemove;
}

    public void setOnmousemove(java.lang.String value) {
        this.onmousemove = value;
    }
    
    
    
    @XmlAttribute(name="ONMOUSEOUT")
    public java.lang.String getOnmouseout() {
    return this.onmouseout;
}

    public void setOnmouseout(java.lang.String value) {
        this.onmouseout = value;
    }
    
    
    
    @XmlAttribute(name="ONMOUSEOVER")
    public java.lang.String getOnmouseover() {
    return this.onmouseover;
}

    public void setOnmouseover(java.lang.String value) {
        this.onmouseover = value;
    }
    
    
    
    @XmlAttribute(name="ONMOUSEUP")
    public java.lang.String getOnmouseup() {
    return this.onmouseup;
}

    public void setOnmouseup(java.lang.String value) {
        this.onmouseup = value;
    }
    
    
    
    @XmlAttribute(name="STYLE")
    public java.lang.String getStyle() {
    return this.style;
}

    public void setStyle(java.lang.String value) {
        this.style = value;
    }
    
    
    
    @XmlAttribute(name="TITLE")
    public java.lang.String getTitle() {
    return this.title;
}

    public void setTitle(java.lang.String value) {
        this.title = value;
    }
    
    
    
    @XmlElement(name="AREA")
    public ArrayList<Area> getArea() {
    return this.area;
}

    public void setArea(ArrayList<Area> value) {
        this.area = value;
    }
    
    
}