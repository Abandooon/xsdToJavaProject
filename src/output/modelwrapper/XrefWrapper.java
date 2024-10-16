package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class XrefWrapper {

    
    private Xref xref;

    public XrefWrapper(Xref xref) {
        this.xref = xref;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(xref.getS())) {
            
            return xref.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(xref.getT())) {
            
            return xref.getT();
            
        } else {
            return null;
        }
        
    }

    public ResolutionPolicyEnumSimple getResolutionPolicy() {
        
        if (CollUtil.isNotEmpty(xref.getResolutionPolicy())) {
            
            return xref.getResolutionPolicy();
            
        } else {
            return null;
        }
        
    }

    public ShowContentEnumSimple getShowContent() {
        
        if (CollUtil.isNotEmpty(xref.getShowContent())) {
            
            return xref.getShowContent();
            
        } else {
            return null;
        }
        
    }

    public ShowResourceAliasNameEnumSimple getShowResourceAliasName() {
        
        if (CollUtil.isNotEmpty(xref.getShowResourceAliasName())) {
            
            return xref.getShowResourceAliasName();
            
        } else {
            return null;
        }
        
    }

    public ShowResourceCategoryEnumSimple getShowResourceCategory() {
        
        if (CollUtil.isNotEmpty(xref.getShowResourceCategory())) {
            
            return xref.getShowResourceCategory();
            
        } else {
            return null;
        }
        
    }

    public ShowResourceLongNameEnumSimple getShowResourceLongName() {
        
        if (CollUtil.isNotEmpty(xref.getShowResourceLongName())) {
            
            return xref.getShowResourceLongName();
            
        } else {
            return null;
        }
        
    }

    public ShowResourceNumberEnumSimple getShowResourceNumber() {
        
        if (CollUtil.isNotEmpty(xref.getShowResourceNumber())) {
            
            return xref.getShowResourceNumber();
            
        } else {
            return null;
        }
        
    }

    public ShowResourcePageEnumSimple getShowResourcePage() {
        
        if (CollUtil.isNotEmpty(xref.getShowResourcePage())) {
            
            return xref.getShowResourcePage();
            
        } else {
            return null;
        }
        
    }

    public ShowResourceShortNameEnumSimple getShowResourceShortName() {
        
        if (CollUtil.isNotEmpty(xref.getShowResourceShortName())) {
            
            return xref.getShowResourceShortName();
            
        } else {
            return null;
        }
        
    }

    public ShowResourceTypeEnumSimple getShowResourceType() {
        
        if (CollUtil.isNotEmpty(xref.getShowResourceType())) {
            
            return xref.getShowResourceType();
            
        } else {
            return null;
        }
        
    }

    public ShowSeeEnumSimple getShowSee() {
        
        if (CollUtil.isNotEmpty(xref.getShowSee())) {
            
            return xref.getShowSee();
            
        } else {
            return null;
        }
        
    }

    public SingleLanguageLongNameWrapper getLabel1() {
        
        if (CollUtil.isNotEmpty(xref.getLabel1())) {
            
            return new SingleLanguageLongNameWrapper(xref.getLabel1());
            
        } else {
            return null;
        }
        
    }

    public ReferrableRefWrapper getReferrableRef() {
        
        if (CollUtil.isNotEmpty(xref.getReferrableRef())) {
            
            return new ReferrableRefWrapper(xref.getReferrableRef());
            
        } else {
            return null;
        }
        
    }




    


    
}