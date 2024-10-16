package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class HeapUsagesWrapper {

    
    private HeapUsages heapUsages;

    public HeapUsagesWrapper(HeapUsages heapUsages) {
        this.heapUsages = heapUsages;
    }

   
    public ArrayList<MeasuredHeapUsageWrapper> getMeasuredHeapUsage() {
        
        if (CollUtil.isNotEmpty(heapUsages.getMeasuredHeapUsage())) {
            ArrayList<MeasuredHeapUsage> originalList = heapUsages.getMeasuredHeapUsage();
            ArrayList<MeasuredHeapUsageWrapper> wrapperList = (ArrayList<MeasuredHeapUsageWrapper>)originalList.stream()
                .map(item -> new MeasuredHeapUsageWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RoughEstimateHeapUsageWrapper> getRoughEstimateHeapUsage() {
        
        if (CollUtil.isNotEmpty(heapUsages.getRoughEstimateHeapUsage())) {
            ArrayList<RoughEstimateHeapUsage> originalList = heapUsages.getRoughEstimateHeapUsage();
            ArrayList<RoughEstimateHeapUsageWrapper> wrapperList = (ArrayList<RoughEstimateHeapUsageWrapper>)originalList.stream()
                .map(item -> new RoughEstimateHeapUsageWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<WorstCaseHeapUsageWrapper> getWorstCaseHeapUsage() {
        
        if (CollUtil.isNotEmpty(heapUsages.getWorstCaseHeapUsage())) {
            ArrayList<WorstCaseHeapUsage> originalList = heapUsages.getWorstCaseHeapUsage();
            ArrayList<WorstCaseHeapUsageWrapper> wrapperList = (ArrayList<WorstCaseHeapUsageWrapper>)originalList.stream()
                .map(item -> new WorstCaseHeapUsageWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}