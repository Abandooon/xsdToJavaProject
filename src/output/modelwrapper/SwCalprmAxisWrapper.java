package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwCalprmAxisWrapper {

    
    private SwCalprmAxis swCalprmAxis;

    public SwCalprmAxisWrapper(SwCalprmAxis swCalprmAxis) {
        this.swCalprmAxis = swCalprmAxis;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swCalprmAxis.getS())) {
            
            return swCalprmAxis.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swCalprmAxis.getT())) {
            
            return swCalprmAxis.getT();
            
        } else {
            return null;
        }
        
    }

    public AxisIndexTypeWrapper getSwAxisIndex() {
        
        if (CollUtil.isNotEmpty(swCalprmAxis.getSwAxisIndex())) {
            
            return new AxisIndexTypeWrapper(swCalprmAxis.getSwAxisIndex());
            
        } else {
            return null;
        }
        
    }

    public CalprmAxisCategoryEnumWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swCalprmAxis.getCategory())) {
            
            return new CalprmAxisCategoryEnumWrapper(swCalprmAxis.getCategory());
            
        } else {
            return null;
        }
        
    }

    public SwCalibrationAccessEnumWrapper getSwCalibrationAccess() {
        
        if (CollUtil.isNotEmpty(swCalprmAxis.getSwCalibrationAccess())) {
            
            return new SwCalibrationAccessEnumWrapper(swCalprmAxis.getSwCalibrationAccess());
            
        } else {
            return null;
        }
        
    }

    public DisplayFormatStringWrapper getDisplayFormat() {
        
        if (CollUtil.isNotEmpty(swCalprmAxis.getDisplayFormat())) {
            
            return new DisplayFormatStringWrapper(swCalprmAxis.getDisplayFormat());
            
        } else {
            return null;
        }
        
    }

    public BaseTypeRefWrapper getBaseTypeRef() {
        
        if (CollUtil.isNotEmpty(swCalprmAxis.getBaseTypeRef())) {
            
            return new BaseTypeRefWrapper(swCalprmAxis.getBaseTypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}