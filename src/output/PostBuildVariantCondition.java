package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class PostBuildVariantCondition {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MatchingCriterionRef matchingCriterionRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="MATCHING-CRITERION-REF")
    public MatchingCriterionRef getMatchingCriterionRef() {
        return this.matchingCriterionRef;
    }

    public void setMatchingCriterionRef(MatchingCriterionRef value) {
        this.matchingCriterionRef = value;
    }
    
    


    
    public static class MatchingCriterionRef extends Ref {
        
        protected PostBuildVariantCriterionSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public PostBuildVariantCriterionSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(PostBuildVariantCriterionSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}