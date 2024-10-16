package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MasterWrapper {

    
    private Master master;

    public MasterWrapper(Master master) {
        this.master = master;
    }

   
    public GlobalTimeCanMasterWrapper getGlobalTimeCanMaster() {
        
        if (CollUtil.isNotEmpty(master.getGlobalTimeCanMaster())) {
            
            return new GlobalTimeCanMasterWrapper(master.getGlobalTimeCanMaster());
            
        } else {
            return null;
        }
        
    }

    public GlobalTimeEthMasterWrapper getGlobalTimeEthMaster() {
        
        if (CollUtil.isNotEmpty(master.getGlobalTimeEthMaster())) {
            
            return new GlobalTimeEthMasterWrapper(master.getGlobalTimeEthMaster());
            
        } else {
            return null;
        }
        
    }

    public GlobalTimeFrMasterWrapper getGlobalTimeFrMaster() {
        
        if (CollUtil.isNotEmpty(master.getGlobalTimeFrMaster())) {
            
            return new GlobalTimeFrMasterWrapper(master.getGlobalTimeFrMaster());
            
        } else {
            return null;
        }
        
    }




    


    
}