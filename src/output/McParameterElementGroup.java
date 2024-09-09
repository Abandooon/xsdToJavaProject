package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class McParameterElementGroup {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected RamLocationRef ramLocationRef;
    
    
    
    protected RomLocationRef romLocationRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="RAM-LOCATION-REF")
    public RamLocationRef getRamLocationRef() {
        return this.ramLocationRef;
    }

    public void setRamLocationRef(RamLocationRef value) {
        this.ramLocationRef = value;
    }
    
    
    
    @XmlElement(name="ROM-LOCATION-REF")
    public RomLocationRef getRomLocationRef() {
        return this.romLocationRef;
    }

    public void setRomLocationRef(RomLocationRef value) {
        this.romLocationRef = value;
    }
    
    


    
    public static class RamLocationRef extends Ref {
        
        protected VariableDataPrototypeSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public VariableDataPrototypeSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(VariableDataPrototypeSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class RomLocationRef extends Ref {
        
        protected ParameterDataPrototypeSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public ParameterDataPrototypeSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(ParameterDataPrototypeSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}