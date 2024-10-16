package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class CouplingPortConnectionWrapper {

    
    private CouplingPortConnection couplingPortConnection;

    public CouplingPortConnectionWrapper(CouplingPortConnection couplingPortConnection) {
        this.couplingPortConnection = couplingPortConnection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(couplingPortConnection.getS())) {
            
            return couplingPortConnection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(couplingPortConnection.getT())) {
            
            return couplingPortConnection.getT();
            
        } else {
            return null;
        }
        
    }

    public FirstPortRefWrapper getFirstPortRef() {
        
        if (CollUtil.isNotEmpty(couplingPortConnection.getFirstPortRef())) {
            
            return new FirstPortRefWrapper(couplingPortConnection.getFirstPortRef());
            
        } else {
            return null;
        }
        
    }

    public SecondPortRefWrapper getSecondPortRef() {
        
        if (CollUtil.isNotEmpty(couplingPortConnection.getSecondPortRef())) {
            
            return new SecondPortRefWrapper(couplingPortConnection.getSecondPortRef());
            
        } else {
            return null;
        }
        
    }




    


    
}