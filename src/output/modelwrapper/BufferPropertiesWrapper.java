package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class BufferPropertiesWrapper {

    
    private BufferProperties bufferProperties;

    public BufferPropertiesWrapper(BufferProperties bufferProperties) {
        this.bufferProperties = bufferProperties;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bufferProperties.getS())) {
            
            return bufferProperties.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bufferProperties.getT())) {
            
            return bufferProperties.getT();
            
        } else {
            return null;
        }
        
    }

    public CompuScaleWrapper getBufferComputation() {
        
        if (CollUtil.isNotEmpty(bufferProperties.getBufferComputation())) {
            
            return new CompuScaleWrapper(bufferProperties.getBufferComputation());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getHeaderLength() {
        
        if (CollUtil.isNotEmpty(bufferProperties.getHeaderLength())) {
            
            return new IntegerWrapper(bufferProperties.getHeaderLength());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getInPlace() {
        
        if (CollUtil.isNotEmpty(bufferProperties.getInPlace())) {
            
            return new BooleanWrapper(bufferProperties.getInPlace());
            
        } else {
            return null;
        }
        
    }




    


    
}