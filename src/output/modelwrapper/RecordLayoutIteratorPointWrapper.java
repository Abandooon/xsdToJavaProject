package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RecordLayoutIteratorPointWrapper {

    
    private RecordLayoutIteratorPoint recordLayoutIteratorPoint;

    public RecordLayoutIteratorPointWrapper(RecordLayoutIteratorPoint recordLayoutIteratorPoint) {
        this.recordLayoutIteratorPoint = recordLayoutIteratorPoint;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(recordLayoutIteratorPoint.getValue())) {
            
            return recordLayoutIteratorPoint.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(recordLayoutIteratorPoint.getS())) {
            
            return recordLayoutIteratorPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(recordLayoutIteratorPoint.getT())) {
            
            return recordLayoutIteratorPoint.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}