package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwAxisContWrapper {

    
    private SwAxisCont swAxisCont;

    public SwAxisContWrapper(SwAxisCont swAxisCont) {
        this.swAxisCont = swAxisCont;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swAxisCont.getS())) {
            
            return swAxisCont.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swAxisCont.getT())) {
            
            return swAxisCont.getT();
            
        } else {
            return null;
        }
        
    }

    public CalprmAxisCategoryEnumWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swAxisCont.getCategory())) {
            
            return new CalprmAxisCategoryEnumWrapper(swAxisCont.getCategory());
            
        } else {
            return null;
        }
        
    }

    public UnitRefWrapper getUnitRef() {
        
        if (CollUtil.isNotEmpty(swAxisCont.getUnitRef())) {
            
            return new UnitRefWrapper(swAxisCont.getUnitRef());
            
        } else {
            return null;
        }
        
    }

    public SingleLanguageUnitNamesWrapper getUnitDisplayName() {
        
        if (CollUtil.isNotEmpty(swAxisCont.getUnitDisplayName())) {
            
            return new SingleLanguageUnitNamesWrapper(swAxisCont.getUnitDisplayName());
            
        } else {
            return null;
        }
        
    }

    public AxisIndexTypeWrapper getSwAxisIndex() {
        
        if (CollUtil.isNotEmpty(swAxisCont.getSwAxisIndex())) {
            
            return new AxisIndexTypeWrapper(swAxisCont.getSwAxisIndex());
            
        } else {
            return null;
        }
        
    }

    public ValueListWrapper getSwArraysize() {
        
        if (CollUtil.isNotEmpty(swAxisCont.getSwArraysize())) {
            
            return new ValueListWrapper(swAxisCont.getSwArraysize());
            
        } else {
            return null;
        }
        
    }

    public SwValuesWrapper getSwValuesPhys() {
        
        if (CollUtil.isNotEmpty(swAxisCont.getSwValuesPhys())) {
            
            return new SwValuesWrapper(swAxisCont.getSwValuesPhys());
            
        } else {
            return null;
        }
        
    }




    


    
}