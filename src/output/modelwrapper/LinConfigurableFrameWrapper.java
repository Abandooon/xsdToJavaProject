package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class LinConfigurableFrameWrapper {

    
    private LinConfigurableFrame linConfigurableFrame;

    public LinConfigurableFrameWrapper(LinConfigurableFrame linConfigurableFrame) {
        this.linConfigurableFrame = linConfigurableFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linConfigurableFrame.getS())) {
            
            return linConfigurableFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linConfigurableFrame.getT())) {
            
            return linConfigurableFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public FrameRef_LinConfigurableFrameWrapper getFrameRef() {
        
        if (CollUtil.isNotEmpty(linConfigurableFrame.getFrameRef())) {
            
            return new FrameRef_LinConfigurableFrameWrapper(linConfigurableFrame.getFrameRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMessageId() {
        
        if (CollUtil.isNotEmpty(linConfigurableFrame.getMessageId())) {
            
            return new PositiveIntegerWrapper(linConfigurableFrame.getMessageId());
            
        } else {
            return null;
        }
        
    }




    


    
}