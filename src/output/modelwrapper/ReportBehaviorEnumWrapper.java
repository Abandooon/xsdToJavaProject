package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ReportBehaviorEnumWrapper {

    
    private ReportBehaviorEnum reportBehaviorEnum;

    public ReportBehaviorEnumWrapper(ReportBehaviorEnum reportBehaviorEnum) {
        this.reportBehaviorEnum = reportBehaviorEnum;
    }

   
    public ReportBehaviorEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(reportBehaviorEnum.getValue())) {
            
            return reportBehaviorEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(reportBehaviorEnum.getS())) {
            
            return reportBehaviorEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(reportBehaviorEnum.getT())) {
            
            return reportBehaviorEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}