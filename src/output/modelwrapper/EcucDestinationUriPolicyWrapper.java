package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Parameters;
    

    
    


public class EcucDestinationUriPolicyWrapper {

    
    private EcucDestinationUriPolicy ecucDestinationUriPolicy;

    public EcucDestinationUriPolicyWrapper(EcucDestinationUriPolicy ecucDestinationUriPolicy) {
        this.ecucDestinationUriPolicy = ecucDestinationUriPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriPolicy.getS())) {
            
            return ecucDestinationUriPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriPolicy.getT())) {
            
            return ecucDestinationUriPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public ContainersWrapper getContainers() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriPolicy.getContainers())) {
            
            return new ContainersWrapper(ecucDestinationUriPolicy.getContainers());
            
        } else {
            return null;
        }
        
    }

    public EcucDestinationUriNestingContractEnumWrapper getDestinationUriNestingContract() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriPolicy.getDestinationUriNestingContract())) {
            
            return new EcucDestinationUriNestingContractEnumWrapper(ecucDestinationUriPolicy.getDestinationUriNestingContract());
            
        } else {
            return null;
        }
        
    }

    public ParametersWrapper getParameters() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriPolicy.getParameters())) {
            
            return new ParametersWrapper(ecucDestinationUriPolicy.getParameters());
            
        } else {
            return null;
        }
        
    }

    public ReferencesWrapper getReferences() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriPolicy.getReferences())) {
            
            return new ReferencesWrapper(ecucDestinationUriPolicy.getReferences());
            
        } else {
            return null;
        }
        
    }




    


    
}