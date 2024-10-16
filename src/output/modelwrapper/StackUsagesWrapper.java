package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class StackUsagesWrapper {

    
    private StackUsages stackUsages;

    public StackUsagesWrapper(StackUsages stackUsages) {
        this.stackUsages = stackUsages;
    }

   
    public ArrayList<MeasuredStackUsageWrapper> getMeasuredStackUsage() {
        
        if (CollUtil.isNotEmpty(stackUsages.getMeasuredStackUsage())) {
            ArrayList<MeasuredStackUsage> originalList = stackUsages.getMeasuredStackUsage();
            ArrayList<MeasuredStackUsageWrapper> wrapperList = (ArrayList<MeasuredStackUsageWrapper>)originalList.stream()
                .map(item -> new MeasuredStackUsageWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RoughEstimateStackUsageWrapper> getRoughEstimateStackUsage() {
        
        if (CollUtil.isNotEmpty(stackUsages.getRoughEstimateStackUsage())) {
            ArrayList<RoughEstimateStackUsage> originalList = stackUsages.getRoughEstimateStackUsage();
            ArrayList<RoughEstimateStackUsageWrapper> wrapperList = (ArrayList<RoughEstimateStackUsageWrapper>)originalList.stream()
                .map(item -> new RoughEstimateStackUsageWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<WorstCaseStackUsageWrapper> getWorstCaseStackUsage() {
        
        if (CollUtil.isNotEmpty(stackUsages.getWorstCaseStackUsage())) {
            ArrayList<WorstCaseStackUsage> originalList = stackUsages.getWorstCaseStackUsage();
            ArrayList<WorstCaseStackUsageWrapper> wrapperList = (ArrayList<WorstCaseStackUsageWrapper>)originalList.stream()
                .map(item -> new WorstCaseStackUsageWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}