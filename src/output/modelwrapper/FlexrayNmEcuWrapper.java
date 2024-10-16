package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class FlexrayNmEcuWrapper {

    
    private FlexrayNmEcu flexrayNmEcu;

    public FlexrayNmEcuWrapper(FlexrayNmEcu flexrayNmEcu) {
        this.flexrayNmEcu = flexrayNmEcu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayNmEcu.getS())) {
            
            return flexrayNmEcu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayNmEcu.getT())) {
            
            return flexrayNmEcu.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmHwVoteEnabled() {
        
        if (CollUtil.isNotEmpty(flexrayNmEcu.getNmHwVoteEnabled())) {
            
            return new BooleanWrapper(flexrayNmEcu.getNmHwVoteEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmMainFunctionAcrossFrCycle() {
        
        if (CollUtil.isNotEmpty(flexrayNmEcu.getNmMainFunctionAcrossFrCycle())) {
            
            return new BooleanWrapper(flexrayNmEcu.getNmMainFunctionAcrossFrCycle());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmRepeatMessageBitEnable() {
        
        if (CollUtil.isNotEmpty(flexrayNmEcu.getNmRepeatMessageBitEnable())) {
            
            return new BooleanWrapper(flexrayNmEcu.getNmRepeatMessageBitEnable());
            
        } else {
            return null;
        }
        
    }




    


    
}