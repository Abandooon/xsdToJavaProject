package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class MsrQueryP2Wrapper {

    
    private MsrQueryP2 msrQueryP2;

    public MsrQueryP2Wrapper(MsrQueryP2 msrQueryP2) {
        this.msrQueryP2 = msrQueryP2;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(msrQueryP2.getS())) {
            
            return msrQueryP2.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(msrQueryP2.getT())) {
            
            return msrQueryP2.getT();
            
        } else {
            return null;
        }
        
    }

    public MsrQueryPropsWrapper getMsrQueryProps() {
        
        if (CollUtil.isNotEmpty(msrQueryP2.getMsrQueryProps())) {
            
            return new MsrQueryPropsWrapper(msrQueryP2.getMsrQueryProps());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getMsrQueryResultP2() {
        
        if (CollUtil.isNotEmpty(msrQueryP2.getMsrQueryResultP2())) {
            
            return new DocumentationBlockWrapper(msrQueryP2.getMsrQueryResultP2());
            
        } else {
            return null;
        }
        
    }




    


    
}