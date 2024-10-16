package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EndToEndProfileBehaviorEnumWrapper {

    
    private EndToEndProfileBehaviorEnum endToEndProfileBehaviorEnum;

    public EndToEndProfileBehaviorEnumWrapper(EndToEndProfileBehaviorEnum endToEndProfileBehaviorEnum) {
        this.endToEndProfileBehaviorEnum = endToEndProfileBehaviorEnum;
    }

   
    public EndToEndProfileBehaviorEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(endToEndProfileBehaviorEnum.getValue())) {
            
            return endToEndProfileBehaviorEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndProfileBehaviorEnum.getS())) {
            
            return endToEndProfileBehaviorEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndProfileBehaviorEnum.getT())) {
            
            return endToEndProfileBehaviorEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}