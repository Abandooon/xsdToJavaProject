package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class Ieee1722TpWrapper {

    
    private Ieee1722Tp ieee1722Tp;

    public Ieee1722TpWrapper(Ieee1722Tp ieee1722Tp) {
        this.ieee1722Tp = ieee1722Tp;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ieee1722Tp.getS())) {
            
            return ieee1722Tp.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ieee1722Tp.getT())) {
            
            return ieee1722Tp.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getRelativeRepresentationTime() {
        
        if (CollUtil.isNotEmpty(ieee1722Tp.getRelativeRepresentationTime())) {
            
            return new TimeValueWrapper(ieee1722Tp.getRelativeRepresentationTime());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getStreamIdentifier() {
        
        if (CollUtil.isNotEmpty(ieee1722Tp.getStreamIdentifier())) {
            
            return new PositiveIntegerWrapper(ieee1722Tp.getStreamIdentifier());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSubType() {
        
        if (CollUtil.isNotEmpty(ieee1722Tp.getSubType())) {
            
            return new PositiveIntegerWrapper(ieee1722Tp.getSubType());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getVersion() {
        
        if (CollUtil.isNotEmpty(ieee1722Tp.getVersion())) {
            
            return new PositiveIntegerWrapper(ieee1722Tp.getVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}