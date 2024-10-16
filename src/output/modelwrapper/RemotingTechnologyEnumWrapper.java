package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RemotingTechnologyEnumWrapper {

    
    private RemotingTechnologyEnum remotingTechnologyEnum;

    public RemotingTechnologyEnumWrapper(RemotingTechnologyEnum remotingTechnologyEnum) {
        this.remotingTechnologyEnum = remotingTechnologyEnum;
    }

   
    public RemotingTechnologyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(remotingTechnologyEnum.getValue())) {
            
            return remotingTechnologyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(remotingTechnologyEnum.getS())) {
            
            return remotingTechnologyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(remotingTechnologyEnum.getT())) {
            
            return remotingTechnologyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}