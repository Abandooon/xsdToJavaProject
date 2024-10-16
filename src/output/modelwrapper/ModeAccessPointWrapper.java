package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ModeAccessPointWrapper {

    
    private ModeAccessPoint modeAccessPoint;

    public ModeAccessPointWrapper(ModeAccessPoint modeAccessPoint) {
        this.modeAccessPoint = modeAccessPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeAccessPoint.getS())) {
            
            return modeAccessPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeAccessPoint.getT())) {
            
            return modeAccessPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public ModeAccessPointIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(modeAccessPoint.getIdent())) {
            
            return new ModeAccessPointIdentWrapper(modeAccessPoint.getIdent());
            
        } else {
            return null;
        }
        
    }

    public ModeGroupIrefWrapper getModeGroupIref() {
        
        if (CollUtil.isNotEmpty(modeAccessPoint.getModeGroupIref())) {
            
            return new ModeGroupIrefWrapper(modeAccessPoint.getModeGroupIref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeAccessPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(modeAccessPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}