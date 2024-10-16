package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SectionInitializationPolicyTypeWrapper {

    
    private SectionInitializationPolicyType sectionInitializationPolicyType;

    public SectionInitializationPolicyTypeWrapper(SectionInitializationPolicyType sectionInitializationPolicyType) {
        this.sectionInitializationPolicyType = sectionInitializationPolicyType;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(sectionInitializationPolicyType.getValue())) {
            
            return sectionInitializationPolicyType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sectionInitializationPolicyType.getS())) {
            
            return sectionInitializationPolicyType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sectionInitializationPolicyType.getT())) {
            
            return sectionInitializationPolicyType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}