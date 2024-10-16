package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SequenceCounterMappingWrapper {

    
    private SequenceCounterMapping sequenceCounterMapping;

    public SequenceCounterMappingWrapper(SequenceCounterMapping sequenceCounterMapping) {
        this.sequenceCounterMapping = sequenceCounterMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sequenceCounterMapping.getS())) {
            
            return sequenceCounterMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sequenceCounterMapping.getT())) {
            
            return sequenceCounterMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(sequenceCounterMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(sequenceCounterMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}