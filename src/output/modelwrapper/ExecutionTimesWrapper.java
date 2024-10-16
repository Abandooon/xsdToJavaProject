package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ExecutionTimesWrapper {

    
    private ExecutionTimes executionTimes;

    public ExecutionTimesWrapper(ExecutionTimes executionTimes) {
        this.executionTimes = executionTimes;
    }

   
    public ArrayList<AnalyzedExecutionTimeWrapper> getAnalyzedExecutionTime() {
        
        if (CollUtil.isNotEmpty(executionTimes.getAnalyzedExecutionTime())) {
            ArrayList<AnalyzedExecutionTime> originalList = executionTimes.getAnalyzedExecutionTime();
            ArrayList<AnalyzedExecutionTimeWrapper> wrapperList = (ArrayList<AnalyzedExecutionTimeWrapper>)originalList.stream()
                .map(item -> new AnalyzedExecutionTimeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MeasuredExecutionTimeWrapper> getMeasuredExecutionTime() {
        
        if (CollUtil.isNotEmpty(executionTimes.getMeasuredExecutionTime())) {
            ArrayList<MeasuredExecutionTime> originalList = executionTimes.getMeasuredExecutionTime();
            ArrayList<MeasuredExecutionTimeWrapper> wrapperList = (ArrayList<MeasuredExecutionTimeWrapper>)originalList.stream()
                .map(item -> new MeasuredExecutionTimeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RoughEstimateOfExecutionTimeWrapper> getRoughEstimateOfExecutionTime() {
        
        if (CollUtil.isNotEmpty(executionTimes.getRoughEstimateOfExecutionTime())) {
            ArrayList<RoughEstimateOfExecutionTime> originalList = executionTimes.getRoughEstimateOfExecutionTime();
            ArrayList<RoughEstimateOfExecutionTimeWrapper> wrapperList = (ArrayList<RoughEstimateOfExecutionTimeWrapper>)originalList.stream()
                .map(item -> new RoughEstimateOfExecutionTimeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SimulatedExecutionTimeWrapper> getSimulatedExecutionTime() {
        
        if (CollUtil.isNotEmpty(executionTimes.getSimulatedExecutionTime())) {
            ArrayList<SimulatedExecutionTime> originalList = executionTimes.getSimulatedExecutionTime();
            ArrayList<SimulatedExecutionTimeWrapper> wrapperList = (ArrayList<SimulatedExecutionTimeWrapper>)originalList.stream()
                .map(item -> new SimulatedExecutionTimeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}