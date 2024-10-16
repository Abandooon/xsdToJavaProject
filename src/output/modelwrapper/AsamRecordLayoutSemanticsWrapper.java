package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AsamRecordLayoutSemanticsWrapper {

    
    private AsamRecordLayoutSemantics asamRecordLayoutSemantics;

    public AsamRecordLayoutSemanticsWrapper(AsamRecordLayoutSemantics asamRecordLayoutSemantics) {
        this.asamRecordLayoutSemantics = asamRecordLayoutSemantics;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(asamRecordLayoutSemantics.getValue())) {
            
            return asamRecordLayoutSemantics.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(asamRecordLayoutSemantics.getS())) {
            
            return asamRecordLayoutSemantics.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(asamRecordLayoutSemantics.getT())) {
            
            return asamRecordLayoutSemantics.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}