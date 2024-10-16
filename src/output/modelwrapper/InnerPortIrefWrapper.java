package stdgui.data.model.modelwrapper;


    
    

    
    


public class InnerPortIrefWrapper {

    
    private InnerPortIref innerPortIref;

    public InnerPortIrefWrapper(InnerPortIref innerPortIref) {
        this.innerPortIref = innerPortIref;
    }

   
    public PPortInCompositionInstanceRefWrapper getPPortInCompositionInstanceRef() {
        
        if (CollUtil.isNotEmpty(innerPortIref.getPPortInCompositionInstanceRef())) {
            
            return new PPortInCompositionInstanceRefWrapper(innerPortIref.getPPortInCompositionInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public RPortInCompositionInstanceRefWrapper getRPortInCompositionInstanceRef() {
        
        if (CollUtil.isNotEmpty(innerPortIref.getRPortInCompositionInstanceRef())) {
            
            return new RPortInCompositionInstanceRefWrapper(innerPortIref.getRPortInCompositionInstanceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}