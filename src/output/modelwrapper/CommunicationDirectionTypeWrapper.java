package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CommunicationDirectionTypeWrapper {

    
    private CommunicationDirectionType communicationDirectionType;

    public CommunicationDirectionTypeWrapper(CommunicationDirectionType communicationDirectionType) {
        this.communicationDirectionType = communicationDirectionType;
    }

   
    public CommunicationDirectionTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(communicationDirectionType.getValue())) {
            
            return communicationDirectionType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(communicationDirectionType.getS())) {
            
            return communicationDirectionType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(communicationDirectionType.getT())) {
            
            return communicationDirectionType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}