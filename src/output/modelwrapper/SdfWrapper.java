package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class SdfWrapper {

    
    private Sdf sdf;

    public SdfWrapper(Sdf sdf) {
        this.sdf = sdf;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sdf.getS())) {
            
            return sdf.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sdf.getT())) {
            
            return sdf.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getGid() {
        
        if (CollUtil.isNotEmpty(sdf.getGid())) {
            
            return sdf.getGid();
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getValue() {
        
        if (CollUtil.isNotEmpty(sdf.getValue())) {
            
            return new NumericalValueVariationPointWrapper(sdf.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}