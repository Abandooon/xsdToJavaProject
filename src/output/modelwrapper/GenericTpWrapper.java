package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class GenericTpWrapper {

    
    private GenericTp genericTp;

    public GenericTpWrapper(GenericTp genericTp) {
        this.genericTp = genericTp;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(genericTp.getS())) {
            
            return genericTp.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(genericTp.getT())) {
            
            return genericTp.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getTpAddress() {
        
        if (CollUtil.isNotEmpty(genericTp.getTpAddress())) {
            
            return new StringWrapper(genericTp.getTpAddress());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getTpTechnology() {
        
        if (CollUtil.isNotEmpty(genericTp.getTpTechnology())) {
            
            return new StringWrapper(genericTp.getTpTechnology());
            
        } else {
            return null;
        }
        
    }




    


    
}