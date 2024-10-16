package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PhysicalDimensionMappingWrapper {

    
    private PhysicalDimensionMapping physicalDimensionMapping;

    public PhysicalDimensionMappingWrapper(PhysicalDimensionMapping physicalDimensionMapping) {
        this.physicalDimensionMapping = physicalDimensionMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMapping.getS())) {
            
            return physicalDimensionMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMapping.getT())) {
            
            return physicalDimensionMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public FirstPhysicalDimensionRefWrapper getFirstPhysicalDimensionRef() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMapping.getFirstPhysicalDimensionRef())) {
            
            return new FirstPhysicalDimensionRefWrapper(physicalDimensionMapping.getFirstPhysicalDimensionRef());
            
        } else {
            return null;
        }
        
    }

    public SecondPhysicalDimensionRefWrapper getSecondPhysicalDimensionRef() {
        
        if (CollUtil.isNotEmpty(physicalDimensionMapping.getSecondPhysicalDimensionRef())) {
            
            return new SecondPhysicalDimensionRefWrapper(physicalDimensionMapping.getSecondPhysicalDimensionRef());
            
        } else {
            return null;
        }
        
    }




    


    
}