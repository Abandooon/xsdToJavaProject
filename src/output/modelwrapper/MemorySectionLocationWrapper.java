package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class MemorySectionLocationWrapper {

    
    private MemorySectionLocation memorySectionLocation;

    public MemorySectionLocationWrapper(MemorySectionLocation memorySectionLocation) {
        this.memorySectionLocation = memorySectionLocation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(memorySectionLocation.getS())) {
            
            return memorySectionLocation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(memorySectionLocation.getT())) {
            
            return memorySectionLocation.getT();
            
        } else {
            return null;
        }
        
    }

    public ProvidedMemoryRefWrapper getProvidedMemoryRef() {
        
        if (CollUtil.isNotEmpty(memorySectionLocation.getProvidedMemoryRef())) {
            
            return new ProvidedMemoryRefWrapper(memorySectionLocation.getProvidedMemoryRef());
            
        } else {
            return null;
        }
        
    }

    public SoftwareMemorySectionRefWrapper getSoftwareMemorySectionRef() {
        
        if (CollUtil.isNotEmpty(memorySectionLocation.getSoftwareMemorySectionRef())) {
            
            return new SoftwareMemorySectionRefWrapper(memorySectionLocation.getSoftwareMemorySectionRef());
            
        } else {
            return null;
        }
        
    }




    


    
}