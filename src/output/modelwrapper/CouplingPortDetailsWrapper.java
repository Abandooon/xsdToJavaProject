package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class CouplingPortDetailsWrapper {

    
    private CouplingPortDetails couplingPortDetails;

    public CouplingPortDetailsWrapper(CouplingPortDetails couplingPortDetails) {
        this.couplingPortDetails = couplingPortDetails;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(couplingPortDetails.getS())) {
            
            return couplingPortDetails.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(couplingPortDetails.getT())) {
            
            return couplingPortDetails.getT();
            
        } else {
            return null;
        }
        
    }

    public CouplingPortStructuralElementsWrapper getCouplingPortStructuralElements() {
        
        if (CollUtil.isNotEmpty(couplingPortDetails.getCouplingPortStructuralElements())) {
            
            return new CouplingPortStructuralElementsWrapper(couplingPortDetails.getCouplingPortStructuralElements());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EthernetPriorityRegenerationWrapper> getEthernetPriorityRegenerations() {
        
        if (CollUtil.isNotEmpty(couplingPortDetails.getEthernetPriorityRegenerations())) {
            ArrayList<EthernetPriorityRegeneration> originalList = couplingPortDetails.getEthernetPriorityRegenerations();
            ArrayList<EthernetPriorityRegenerationWrapper> wrapperList = (ArrayList<EthernetPriorityRegenerationWrapper>)originalList.stream()
                .map(item -> new EthernetPriorityRegenerationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CouplingPortTrafficClassAssignmentWrapper> getEthernetTrafficClassAssignments() {
        
        if (CollUtil.isNotEmpty(couplingPortDetails.getEthernetTrafficClassAssignments())) {
            ArrayList<CouplingPortTrafficClassAssignment> originalList = couplingPortDetails.getEthernetTrafficClassAssignments();
            ArrayList<CouplingPortTrafficClassAssignmentWrapper> wrapperList = (ArrayList<CouplingPortTrafficClassAssignmentWrapper>)originalList.stream()
                .map(item -> new CouplingPortTrafficClassAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public LastEgressSchedulerRefWrapper getLastEgressSchedulerRef() {
        
        if (CollUtil.isNotEmpty(couplingPortDetails.getLastEgressSchedulerRef())) {
            
            return new LastEgressSchedulerRefWrapper(couplingPortDetails.getLastEgressSchedulerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}