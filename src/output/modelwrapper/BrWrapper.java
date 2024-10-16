package stdgui.data.model.modelwrapper;


    
    

    
    


public class BrWrapper {

    
    private Br br;

    public BrWrapper(Br br) {
        this.br = br;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(br.getS())) {
            
            return br.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(br.getT())) {
            
            return br.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}