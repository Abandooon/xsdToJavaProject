package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NvBlockNeedsReliabilityEnumWrapper {

    
    private NvBlockNeedsReliabilityEnum nvBlockNeedsReliabilityEnum;

    public NvBlockNeedsReliabilityEnumWrapper(NvBlockNeedsReliabilityEnum nvBlockNeedsReliabilityEnum) {
        this.nvBlockNeedsReliabilityEnum = nvBlockNeedsReliabilityEnum;
    }

   
    public NvBlockNeedsReliabilityEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(nvBlockNeedsReliabilityEnum.getValue())) {
            
            return nvBlockNeedsReliabilityEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvBlockNeedsReliabilityEnum.getS())) {
            
            return nvBlockNeedsReliabilityEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvBlockNeedsReliabilityEnum.getT())) {
            
            return nvBlockNeedsReliabilityEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}