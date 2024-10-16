package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagPduTypeWrapper {

    
    private DiagPduType diagPduType;

    public DiagPduTypeWrapper(DiagPduType diagPduType) {
        this.diagPduType = diagPduType;
    }

   
    public DiagPduTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagPduType.getValue())) {
            
            return diagPduType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagPduType.getS())) {
            
            return diagPduType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagPduType.getT())) {
            
            return diagPduType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}