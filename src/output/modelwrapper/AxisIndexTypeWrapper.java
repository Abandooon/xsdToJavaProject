package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AxisIndexTypeWrapper {

    
    private AxisIndexType axisIndexType;

    public AxisIndexTypeWrapper(AxisIndexType axisIndexType) {
        this.axisIndexType = axisIndexType;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(axisIndexType.getValue())) {
            
            return axisIndexType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(axisIndexType.getS())) {
            
            return axisIndexType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(axisIndexType.getT())) {
            
            return axisIndexType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}