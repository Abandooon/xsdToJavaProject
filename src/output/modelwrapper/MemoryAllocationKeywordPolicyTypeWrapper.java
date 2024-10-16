package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MemoryAllocationKeywordPolicyTypeWrapper {

    
    private MemoryAllocationKeywordPolicyType memoryAllocationKeywordPolicyType;

    public MemoryAllocationKeywordPolicyTypeWrapper(MemoryAllocationKeywordPolicyType memoryAllocationKeywordPolicyType) {
        this.memoryAllocationKeywordPolicyType = memoryAllocationKeywordPolicyType;
    }

   
    public MemoryAllocationKeywordPolicyTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(memoryAllocationKeywordPolicyType.getValue())) {
            
            return memoryAllocationKeywordPolicyType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(memoryAllocationKeywordPolicyType.getS())) {
            
            return memoryAllocationKeywordPolicyType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(memoryAllocationKeywordPolicyType.getT())) {
            
            return memoryAllocationKeywordPolicyType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}