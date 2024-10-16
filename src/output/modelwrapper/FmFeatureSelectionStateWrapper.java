package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class FmFeatureSelectionStateWrapper {

    
    private FmFeatureSelectionState fmFeatureSelectionState;

    public FmFeatureSelectionStateWrapper(FmFeatureSelectionState fmFeatureSelectionState) {
        this.fmFeatureSelectionState = fmFeatureSelectionState;
    }

   
    public FmFeatureSelectionStateSimple getValue() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionState.getValue())) {
            
            return fmFeatureSelectionState.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionState.getS())) {
            
            return fmFeatureSelectionState.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionState.getT())) {
            
            return fmFeatureSelectionState.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}