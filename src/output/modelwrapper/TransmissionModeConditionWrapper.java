package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TransmissionModeConditionWrapper {

    
    private TransmissionModeCondition transmissionModeCondition;

    public TransmissionModeConditionWrapper(TransmissionModeCondition transmissionModeCondition) {
        this.transmissionModeCondition = transmissionModeCondition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(transmissionModeCondition.getS())) {
            
            return transmissionModeCondition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(transmissionModeCondition.getT())) {
            
            return transmissionModeCondition.getT();
            
        } else {
            return null;
        }
        
    }

    public DataFilterWrapper getDataFilter() {
        
        if (CollUtil.isNotEmpty(transmissionModeCondition.getDataFilter())) {
            
            return new DataFilterWrapper(transmissionModeCondition.getDataFilter());
            
        } else {
            return null;
        }
        
    }

    public ISignalInIPduRefWrapper getISignalInIPduRef() {
        
        if (CollUtil.isNotEmpty(transmissionModeCondition.getISignalInIPduRef())) {
            
            return new ISignalInIPduRefWrapper(transmissionModeCondition.getISignalInIPduRef());
            
        } else {
            return null;
        }
        
    }




    


    
}