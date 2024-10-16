package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EcucDestinationUriNestingContractEnumWrapper {

    
    private EcucDestinationUriNestingContractEnum ecucDestinationUriNestingContractEnum;

    public EcucDestinationUriNestingContractEnumWrapper(EcucDestinationUriNestingContractEnum ecucDestinationUriNestingContractEnum) {
        this.ecucDestinationUriNestingContractEnum = ecucDestinationUriNestingContractEnum;
    }

   
    public EcucDestinationUriNestingContractEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriNestingContractEnum.getValue())) {
            
            return ecucDestinationUriNestingContractEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriNestingContractEnum.getS())) {
            
            return ecucDestinationUriNestingContractEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriNestingContractEnum.getT())) {
            
            return ecucDestinationUriNestingContractEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}