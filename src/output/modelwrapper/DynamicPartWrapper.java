package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class DynamicPartWrapper {

    
    private DynamicPart dynamicPart;

    public DynamicPartWrapper(DynamicPart dynamicPart) {
        this.dynamicPart = dynamicPart;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dynamicPart.getS())) {
            
            return dynamicPart.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dynamicPart.getT())) {
            
            return dynamicPart.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SegmentPositionWrapper> getSegmentPositions() {
        
        if (CollUtil.isNotEmpty(dynamicPart.getSegmentPositions())) {
            ArrayList<SegmentPosition> originalList = dynamicPart.getSegmentPositions();
            ArrayList<SegmentPositionWrapper> wrapperList = (ArrayList<SegmentPositionWrapper>)originalList.stream()
                .map(item -> new SegmentPositionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DynamicPartAlternativeWrapper> getDynamicPartAlternatives() {
        
        if (CollUtil.isNotEmpty(dynamicPart.getDynamicPartAlternatives())) {
            ArrayList<DynamicPartAlternative> originalList = dynamicPart.getDynamicPartAlternatives();
            ArrayList<DynamicPartAlternativeWrapper> wrapperList = (ArrayList<DynamicPartAlternativeWrapper>)originalList.stream()
                .map(item -> new DynamicPartAlternativeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dynamicPart.getVariationPoint())) {
            
            return new VariationPointWrapper(dynamicPart.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}