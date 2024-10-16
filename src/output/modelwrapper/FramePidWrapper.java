package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class FramePidWrapper {

    
    private FramePid framePid;

    public FramePidWrapper(FramePid framePid) {
        this.framePid = framePid;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(framePid.getS())) {
            
            return framePid.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(framePid.getT())) {
            
            return framePid.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(framePid.getIndex())) {
            
            return new IntegerWrapper(framePid.getIndex());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPid() {
        
        if (CollUtil.isNotEmpty(framePid.getPid())) {
            
            return new PositiveIntegerWrapper(framePid.getPid());
            
        } else {
            return null;
        }
        
    }




    


    
}