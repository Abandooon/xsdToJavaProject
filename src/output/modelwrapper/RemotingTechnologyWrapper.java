package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class RemotingTechnologyWrapper {

    
    private RemotingTechnology remotingTechnology;

    public RemotingTechnologyWrapper(RemotingTechnology remotingTechnology) {
        this.remotingTechnology = remotingTechnology;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(remotingTechnology.getS())) {
            
            return remotingTechnology.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(remotingTechnology.getT())) {
            
            return remotingTechnology.getT();
            
        } else {
            return null;
        }
        
    }

    public RemotingTechnologyEnumWrapper getName() {
        
        if (CollUtil.isNotEmpty(remotingTechnology.getName())) {
            
            return new RemotingTechnologyEnumWrapper(remotingTechnology.getName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getVersion() {
        
        if (CollUtil.isNotEmpty(remotingTechnology.getVersion())) {
            
            return new StringWrapper(remotingTechnology.getVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}