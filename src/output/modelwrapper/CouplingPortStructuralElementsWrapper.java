package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CouplingPortStructuralElementsWrapper {

    
    private CouplingPortStructuralElements couplingPortStructuralElements;

    public CouplingPortStructuralElementsWrapper(CouplingPortStructuralElements couplingPortStructuralElements) {
        this.couplingPortStructuralElements = couplingPortStructuralElements;
    }

   
    public ArrayList<CouplingPortFifoWrapper> getCouplingPortFifo() {
        
        if (CollUtil.isNotEmpty(couplingPortStructuralElements.getCouplingPortFifo())) {
            ArrayList<CouplingPortFifo> originalList = couplingPortStructuralElements.getCouplingPortFifo();
            ArrayList<CouplingPortFifoWrapper> wrapperList = (ArrayList<CouplingPortFifoWrapper>)originalList.stream()
                .map(item -> new CouplingPortFifoWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CouplingPortSchedulerWrapper> getCouplingPortScheduler() {
        
        if (CollUtil.isNotEmpty(couplingPortStructuralElements.getCouplingPortScheduler())) {
            ArrayList<CouplingPortScheduler> originalList = couplingPortStructuralElements.getCouplingPortScheduler();
            ArrayList<CouplingPortSchedulerWrapper> wrapperList = (ArrayList<CouplingPortSchedulerWrapper>)originalList.stream()
                .map(item -> new CouplingPortSchedulerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CouplingPortShaperWrapper> getCouplingPortShaper() {
        
        if (CollUtil.isNotEmpty(couplingPortStructuralElements.getCouplingPortShaper())) {
            ArrayList<CouplingPortShaper> originalList = couplingPortStructuralElements.getCouplingPortShaper();
            ArrayList<CouplingPortShaperWrapper> wrapperList = (ArrayList<CouplingPortShaperWrapper>)originalList.stream()
                .map(item -> new CouplingPortShaperWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}