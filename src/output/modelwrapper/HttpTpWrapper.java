package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    


public class HttpTpWrapper {

    
    private HttpTp httpTp;

    public HttpTpWrapper(HttpTp httpTp) {
        this.httpTp = httpTp;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(httpTp.getS())) {
            
            return httpTp.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(httpTp.getT())) {
            
            return httpTp.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getContentType() {
        
        if (CollUtil.isNotEmpty(httpTp.getContentType())) {
            
            return new StringWrapper(httpTp.getContentType());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(httpTp.getProtocolVersion())) {
            
            return new StringWrapper(httpTp.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public RequestMethodEnumWrapper getRequestMethod() {
        
        if (CollUtil.isNotEmpty(httpTp.getRequestMethod())) {
            
            return new RequestMethodEnumWrapper(httpTp.getRequestMethod());
            
        } else {
            return null;
        }
        
    }

    public TcpTpWrapper getTcpTpConfig() {
        
        if (CollUtil.isNotEmpty(httpTp.getTcpTpConfig())) {
            
            return new TcpTpWrapper(httpTp.getTcpTpConfig());
            
        } else {
            return null;
        }
        
    }

    public UriStringWrapper getUri() {
        
        if (CollUtil.isNotEmpty(httpTp.getUri())) {
            
            return new UriStringWrapper(httpTp.getUri());
            
        } else {
            return null;
        }
        
    }




    


    
}