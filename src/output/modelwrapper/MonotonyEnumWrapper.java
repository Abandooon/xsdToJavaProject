package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MonotonyEnumWrapper {

    
    private MonotonyEnum monotonyEnum;

    public MonotonyEnumWrapper(MonotonyEnum monotonyEnum) {
        this.monotonyEnum = monotonyEnum;
    }

   
    public MonotonyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(monotonyEnum.getValue())) {
            
            return monotonyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(monotonyEnum.getS())) {
            
            return monotonyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(monotonyEnum.getT())) {
            
            return monotonyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}