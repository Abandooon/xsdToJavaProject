package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AreaEnumShapeWrapper {

    
    private AreaEnumShape areaEnumShape;

    public AreaEnumShapeWrapper(AreaEnumShape areaEnumShape) {
        this.areaEnumShape = areaEnumShape;
    }

   
    public AreaEnumShapeSimple getValue() {
        
        if (CollUtil.isNotEmpty(areaEnumShape.getValue())) {
            
            return areaEnumShape.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(areaEnumShape.getS())) {
            
            return areaEnumShape.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(areaEnumShape.getT())) {
            
            return areaEnumShape.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}