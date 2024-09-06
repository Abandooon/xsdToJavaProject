package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BuildActionManifestRefConditional {

    
    protected java.lang.String s;
    
    protected java.lang.String t;
    
    protected BuildActionManifestRef buildActionManifestRef;
    
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
    
    @XmlElement(name="BUILD-ACTION-MANIFEST-REF")
    public BuildActionManifestRef getBuildActionManifestRef() {
        return this.buildActionManifestRef;
    }

    public void setBuildActionManifestRef(BuildActionManifestRef value) {
        this.buildActionManifestRef = value;
    }
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    

    
    public static class BuildActionManifestRef extends Ref {
        
        protected BuildActionManifestSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public BuildActionManifestSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(BuildActionManifestSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}