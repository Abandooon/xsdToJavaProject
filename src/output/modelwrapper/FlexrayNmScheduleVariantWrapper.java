package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class FlexrayNmScheduleVariantWrapper {

    
    private FlexrayNmScheduleVariant flexrayNmScheduleVariant;

    public FlexrayNmScheduleVariantWrapper(FlexrayNmScheduleVariant flexrayNmScheduleVariant) {
        this.flexrayNmScheduleVariant = flexrayNmScheduleVariant;
    }

   
    public FlexrayNmScheduleVariantSimple getValue() {
        
        if (CollUtil.isNotEmpty(flexrayNmScheduleVariant.getValue())) {
            
            return flexrayNmScheduleVariant.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayNmScheduleVariant.getS())) {
            
            return flexrayNmScheduleVariant.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayNmScheduleVariant.getT())) {
            
            return flexrayNmScheduleVariant.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}