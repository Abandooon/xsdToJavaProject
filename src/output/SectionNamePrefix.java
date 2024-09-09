package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SectionNamePrefix {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected CIdentifier symbol;
    
    
    
    protected ImplementedInRef implementedInRef;
    
    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
        return this.shortName;
    }

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="SYMBOL")
    public CIdentifier getSymbol() {
        return this.symbol;
    }

    public void setSymbol(CIdentifier value) {
        this.symbol = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTED-IN-REF")
    public ImplementedInRef getImplementedInRef() {
        return this.implementedInRef;
    }

    public void setImplementedInRef(ImplementedInRef value) {
        this.implementedInRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    


    
    public static class ShortNameFragments {
        
        protected ArrayList<ShortNameFragment> shortNameFragment;
        

        
        @XmlElement(name="SHORT-NAME-FRAGMENT")
        public ArrayList<ShortNameFragment> getShortNameFragment() {
            return this.shortNameFragment;
        }

        public void setShortNameFragment(ArrayList<ShortNameFragment> value) {
            this.shortNameFragment = value;
        }
        

        
    }
    
    public static class ImplementedInRef extends Ref {
        
        protected DependencyOnArtifactSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public DependencyOnArtifactSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(DependencyOnArtifactSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}