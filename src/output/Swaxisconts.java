package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Swaxisconts {

    
    
    protected ArrayList<RuleBasedAxisCont> ruleBasedAxisConts;
    
    

    
    
    @XmlElement(name="RULE-BASED-AXIS-CONT")
    public ArrayList<RuleBasedAxisCont> getRuleBasedAxisConts() {
        return this.ruleBasedAxisConts;
    }

    public void setRuleBasedAxisConts(ArrayList<RuleBasedAxisCont> value) {
        this.ruleBasedAxisConts = value;
    }
    
    
}