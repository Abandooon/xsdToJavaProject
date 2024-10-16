package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class MsrQueryArgWrapper {

    
    private MsrQueryArg msrQueryArg;

    public MsrQueryArgWrapper(MsrQueryArg msrQueryArg) {
        this.msrQueryArg = msrQueryArg;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(msrQueryArg.getValue())) {
            
            return msrQueryArg.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(msrQueryArg.getS())) {
            
            return msrQueryArg.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(msrQueryArg.getT())) {
            
            return msrQueryArg.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(msrQueryArg.getSi())) {
            
            return msrQueryArg.getSi();
            
        } else {
            return null;
        }
        
    }




    


    
}