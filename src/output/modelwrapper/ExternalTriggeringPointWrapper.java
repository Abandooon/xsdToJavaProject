package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ExternalTriggeringPointWrapper {

    
    private ExternalTriggeringPoint externalTriggeringPoint;

    public ExternalTriggeringPointWrapper(ExternalTriggeringPoint externalTriggeringPoint) {
        this.externalTriggeringPoint = externalTriggeringPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPoint.getS())) {
            
            return externalTriggeringPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPoint.getT())) {
            
            return externalTriggeringPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public ExternalTriggeringPointIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPoint.getIdent())) {
            
            return new ExternalTriggeringPointIdentWrapper(externalTriggeringPoint.getIdent());
            
        } else {
            return null;
        }
        
    }

    public TriggerIrefWrapper getTriggerIref() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPoint.getTriggerIref())) {
            
            return new TriggerIrefWrapper(externalTriggeringPoint.getTriggerIref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(externalTriggeringPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(externalTriggeringPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}