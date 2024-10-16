package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AreaEnumNohrefWrapper {

    
    private AreaEnumNohref areaEnumNohref;

    public AreaEnumNohrefWrapper(AreaEnumNohref areaEnumNohref) {
        this.areaEnumNohref = areaEnumNohref;
    }

   
    public AreaEnumNohrefSimple getValue() {
        
        if (CollUtil.isNotEmpty(areaEnumNohref.getValue())) {
            
            return areaEnumNohref.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(areaEnumNohref.getS())) {
            
            return areaEnumNohref.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(areaEnumNohref.getT())) {
            
            return areaEnumNohref.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}