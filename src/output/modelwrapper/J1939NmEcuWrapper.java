package stdgui.data.model.modelwrapper;


    
    

    
    


public class J1939NmEcuWrapper {

    
    private J1939NmEcu j1939NmEcu;

    public J1939NmEcuWrapper(J1939NmEcu j1939NmEcu) {
        this.j1939NmEcu = j1939NmEcu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939NmEcu.getS())) {
            
            return j1939NmEcu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939NmEcu.getT())) {
            
            return j1939NmEcu.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}