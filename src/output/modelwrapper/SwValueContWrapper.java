package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class SwValueContWrapper {

    
    private SwValueCont swValueCont;

    public SwValueContWrapper(SwValueCont swValueCont) {
        this.swValueCont = swValueCont;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swValueCont.getS())) {
            
            return swValueCont.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swValueCont.getT())) {
            
            return swValueCont.getT();
            
        } else {
            return null;
        }
        
    }

    public UnitRefWrapper getUnitRef() {
        
        if (CollUtil.isNotEmpty(swValueCont.getUnitRef())) {
            
            return new UnitRefWrapper(swValueCont.getUnitRef());
            
        } else {
            return null;
        }
        
    }

    public SingleLanguageUnitNamesWrapper getUnitDisplayName() {
        
        if (CollUtil.isNotEmpty(swValueCont.getUnitDisplayName())) {
            
            return new SingleLanguageUnitNamesWrapper(swValueCont.getUnitDisplayName());
            
        } else {
            return null;
        }
        
    }

    public ValueListWrapper getSwArraysize() {
        
        if (CollUtil.isNotEmpty(swValueCont.getSwArraysize())) {
            
            return new ValueListWrapper(swValueCont.getSwArraysize());
            
        } else {
            return null;
        }
        
    }

    public SwValuesWrapper getSwValuesPhys() {
        
        if (CollUtil.isNotEmpty(swValueCont.getSwValuesPhys())) {
            
            return new SwValuesWrapper(swValueCont.getSwValuesPhys());
            
        } else {
            return null;
        }
        
    }




    


    
}