package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class StaticPartWrapper {

    
    private StaticPart staticPart;

    public StaticPartWrapper(StaticPart staticPart) {
        this.staticPart = staticPart;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(staticPart.getS())) {
            
            return staticPart.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(staticPart.getT())) {
            
            return staticPart.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SegmentPositionWrapper> getSegmentPositions() {
        
        if (CollUtil.isNotEmpty(staticPart.getSegmentPositions())) {
            ArrayList<SegmentPosition> originalList = staticPart.getSegmentPositions();
            ArrayList<SegmentPositionWrapper> wrapperList = (ArrayList<SegmentPositionWrapper>)originalList.stream()
                .map(item -> new SegmentPositionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IPduRefWrapper getIPduRef() {
        
        if (CollUtil.isNotEmpty(staticPart.getIPduRef())) {
            
            return new IPduRefWrapper(staticPart.getIPduRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(staticPart.getVariationPoint())) {
            
            return new VariationPointWrapper(staticPart.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}