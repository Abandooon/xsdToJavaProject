package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class LinErrorResponseWrapper {

    
    private LinErrorResponse linErrorResponse;

    public LinErrorResponseWrapper(LinErrorResponse linErrorResponse) {
        this.linErrorResponse = linErrorResponse;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linErrorResponse.getS())) {
            
            return linErrorResponse.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linErrorResponse.getT())) {
            
            return linErrorResponse.getT();
            
        } else {
            return null;
        }
        
    }

    public FrameTriggeringRefWrapper getFrameTriggeringRef() {
        
        if (CollUtil.isNotEmpty(linErrorResponse.getFrameTriggeringRef())) {
            
            return new FrameTriggeringRefWrapper(linErrorResponse.getFrameTriggeringRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getResponseErrorPosition() {
        
        if (CollUtil.isNotEmpty(linErrorResponse.getResponseErrorPosition())) {
            
            return new IntegerWrapper(linErrorResponse.getResponseErrorPosition());
            
        } else {
            return null;
        }
        
    }




    


    
}