package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AlignmentTypeWrapper {

    
    private AlignmentType alignmentType;

    public AlignmentTypeWrapper(AlignmentType alignmentType) {
        this.alignmentType = alignmentType;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(alignmentType.getValue())) {
            
            return alignmentType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(alignmentType.getS())) {
            
            return alignmentType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(alignmentType.getT())) {
            
            return alignmentType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}