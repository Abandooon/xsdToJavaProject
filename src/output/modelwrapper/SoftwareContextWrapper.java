package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class SoftwareContextWrapper {

    
    private SoftwareContext softwareContext;

    public SoftwareContextWrapper(SoftwareContext softwareContext) {
        this.softwareContext = softwareContext;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(softwareContext.getS())) {
            
            return softwareContext.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(softwareContext.getT())) {
            
            return softwareContext.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getInput() {
        
        if (CollUtil.isNotEmpty(softwareContext.getInput())) {
            
            return new StringWrapper(softwareContext.getInput());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getState() {
        
        if (CollUtil.isNotEmpty(softwareContext.getState())) {
            
            return new StringWrapper(softwareContext.getState());
            
        } else {
            return null;
        }
        
    }




    


    
}