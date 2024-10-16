package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ISignalPropsWrapper {

    
    private ISignalProps iSignalProps;

    public ISignalPropsWrapper(ISignalProps iSignalProps) {
        this.iSignalProps = iSignalProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalProps.getS())) {
            
            return iSignalProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalProps.getT())) {
            
            return iSignalProps.getT();
            
        } else {
            return null;
        }
        
    }

    public HandleOutOfRangeEnumWrapper getHandleOutOfRange() {
        
        if (CollUtil.isNotEmpty(iSignalProps.getHandleOutOfRange())) {
            
            return new HandleOutOfRangeEnumWrapper(iSignalProps.getHandleOutOfRange());
            
        } else {
            return null;
        }
        
    }




    


    
}