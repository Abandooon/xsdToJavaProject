package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NvBlockNeedsWritingPriorityEnumWrapper {

    
    private NvBlockNeedsWritingPriorityEnum nvBlockNeedsWritingPriorityEnum;

    public NvBlockNeedsWritingPriorityEnumWrapper(NvBlockNeedsWritingPriorityEnum nvBlockNeedsWritingPriorityEnum) {
        this.nvBlockNeedsWritingPriorityEnum = nvBlockNeedsWritingPriorityEnum;
    }

   
    public NvBlockNeedsWritingPriorityEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(nvBlockNeedsWritingPriorityEnum.getValue())) {
            
            return nvBlockNeedsWritingPriorityEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvBlockNeedsWritingPriorityEnum.getS())) {
            
            return nvBlockNeedsWritingPriorityEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvBlockNeedsWritingPriorityEnum.getT())) {
            
            return nvBlockNeedsWritingPriorityEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}