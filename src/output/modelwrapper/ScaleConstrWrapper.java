package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ScaleConstrWrapper {

    
    private ScaleConstr scaleConstr;

    public ScaleConstrWrapper(ScaleConstr scaleConstr) {
        this.scaleConstr = scaleConstr;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(scaleConstr.getS())) {
            
            return scaleConstr.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(scaleConstr.getT())) {
            
            return scaleConstr.getT();
            
        } else {
            return null;
        }
        
    }

    public ScaleConstrValidityEnumSimple getValidity() {
        
        if (CollUtil.isNotEmpty(scaleConstr.getValidity())) {
            
            return scaleConstr.getValidity();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(scaleConstr.getShortLabel())) {
            
            return new IdentifierWrapper(scaleConstr.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(scaleConstr.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(scaleConstr.getDesc());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getLowerLimit() {
        
        if (CollUtil.isNotEmpty(scaleConstr.getLowerLimit())) {
            
            return new LimitWrapper(scaleConstr.getLowerLimit());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getUpperLimit() {
        
        if (CollUtil.isNotEmpty(scaleConstr.getUpperLimit())) {
            
            return new LimitWrapper(scaleConstr.getUpperLimit());
            
        } else {
            return null;
        }
        
    }




    


    
}