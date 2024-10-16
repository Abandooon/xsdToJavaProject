package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class OrderedMasterWrapper {

    
    private OrderedMaster orderedMaster;

    public OrderedMasterWrapper(OrderedMaster orderedMaster) {
        this.orderedMaster = orderedMaster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(orderedMaster.getS())) {
            
            return orderedMaster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(orderedMaster.getT())) {
            
            return orderedMaster.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(orderedMaster.getIndex())) {
            
            return new PositiveIntegerWrapper(orderedMaster.getIndex());
            
        } else {
            return null;
        }
        
    }

    public TimeSyncServerRefWrapper getTimeSyncServerRef() {
        
        if (CollUtil.isNotEmpty(orderedMaster.getTimeSyncServerRef())) {
            
            return new TimeSyncServerRefWrapper(orderedMaster.getTimeSyncServerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}