package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class LinOrderedConfigurableFrameWrapper {

    
    private LinOrderedConfigurableFrame linOrderedConfigurableFrame;

    public LinOrderedConfigurableFrameWrapper(LinOrderedConfigurableFrame linOrderedConfigurableFrame) {
        this.linOrderedConfigurableFrame = linOrderedConfigurableFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linOrderedConfigurableFrame.getS())) {
            
            return linOrderedConfigurableFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linOrderedConfigurableFrame.getT())) {
            
            return linOrderedConfigurableFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public FrameRef_LinConfigurableFrameWrapper getFrameRef() {
        
        if (CollUtil.isNotEmpty(linOrderedConfigurableFrame.getFrameRef())) {
            
            return new FrameRef_LinConfigurableFrameWrapper(linOrderedConfigurableFrame.getFrameRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(linOrderedConfigurableFrame.getIndex())) {
            
            return new IntegerWrapper(linOrderedConfigurableFrame.getIndex());
            
        } else {
            return null;
        }
        
    }




    


    
}