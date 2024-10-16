package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class FmFeatureDecompositionWrapper {

    
    private FmFeatureDecomposition fmFeatureDecomposition;

    public FmFeatureDecompositionWrapper(FmFeatureDecomposition fmFeatureDecomposition) {
        this.fmFeatureDecomposition = fmFeatureDecomposition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureDecomposition.getS())) {
            
            return fmFeatureDecomposition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureDecomposition.getT())) {
            
            return fmFeatureDecomposition.getT();
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureDecomposition.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureDecomposition.getCategory());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FeatureRefWrapper> getFeatureRefs() {
        
        if (CollUtil.isNotEmpty(fmFeatureDecomposition.getFeatureRefs())) {
            ArrayList<FeatureRef> originalList = fmFeatureDecomposition.getFeatureRefs();
            ArrayList<FeatureRefWrapper> wrapperList = (ArrayList<FeatureRefWrapper>)originalList.stream()
                .map(item -> new FeatureRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMax() {
        
        if (CollUtil.isNotEmpty(fmFeatureDecomposition.getMax())) {
            
            return new PositiveIntegerWrapper(fmFeatureDecomposition.getMax());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMin() {
        
        if (CollUtil.isNotEmpty(fmFeatureDecomposition.getMin())) {
            
            return new PositiveIntegerWrapper(fmFeatureDecomposition.getMin());
            
        } else {
            return null;
        }
        
    }




    


    
}