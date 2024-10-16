package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class SegmentPositionWrapper {

    
    private SegmentPosition segmentPosition;

    public SegmentPositionWrapper(SegmentPosition segmentPosition) {
        this.segmentPosition = segmentPosition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(segmentPosition.getS())) {
            
            return segmentPosition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(segmentPosition.getT())) {
            
            return segmentPosition.getT();
            
        } else {
            return null;
        }
        
    }

    public ByteOrderEnumWrapper getSegmentByteOrder() {
        
        if (CollUtil.isNotEmpty(segmentPosition.getSegmentByteOrder())) {
            
            return new ByteOrderEnumWrapper(segmentPosition.getSegmentByteOrder());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSegmentLength() {
        
        if (CollUtil.isNotEmpty(segmentPosition.getSegmentLength())) {
            
            return new IntegerWrapper(segmentPosition.getSegmentLength());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSegmentPosition() {
        
        if (CollUtil.isNotEmpty(segmentPosition.getSegmentPosition())) {
            
            return new IntegerWrapper(segmentPosition.getSegmentPosition());
            
        } else {
            return null;
        }
        
    }




    


    
}