package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class CallPointsWrapper {

    
    private CallPoints callPoints;

    public CallPointsWrapper(CallPoints callPoints) {
        this.callPoints = callPoints;
    }

   
    public ArrayList<BswAsynchronousServerCallPointWrapper> getBswAsynchronousServerCallPoint() {
        
        if (CollUtil.isNotEmpty(callPoints.getBswAsynchronousServerCallPoint())) {
            ArrayList<BswAsynchronousServerCallPoint> originalList = callPoints.getBswAsynchronousServerCallPoint();
            ArrayList<BswAsynchronousServerCallPointWrapper> wrapperList = (ArrayList<BswAsynchronousServerCallPointWrapper>)originalList.stream()
                .map(item -> new BswAsynchronousServerCallPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswAsynchronousServerCallResultPointWrapper> getBswAsynchronousServerCallResultPoint() {
        
        if (CollUtil.isNotEmpty(callPoints.getBswAsynchronousServerCallResultPoint())) {
            ArrayList<BswAsynchronousServerCallResultPoint> originalList = callPoints.getBswAsynchronousServerCallResultPoint();
            ArrayList<BswAsynchronousServerCallResultPointWrapper> wrapperList = (ArrayList<BswAsynchronousServerCallResultPointWrapper>)originalList.stream()
                .map(item -> new BswAsynchronousServerCallResultPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswDirectCallPointWrapper> getBswDirectCallPoint() {
        
        if (CollUtil.isNotEmpty(callPoints.getBswDirectCallPoint())) {
            ArrayList<BswDirectCallPoint> originalList = callPoints.getBswDirectCallPoint();
            ArrayList<BswDirectCallPointWrapper> wrapperList = (ArrayList<BswDirectCallPointWrapper>)originalList.stream()
                .map(item -> new BswDirectCallPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswSynchronousServerCallPointWrapper> getBswSynchronousServerCallPoint() {
        
        if (CollUtil.isNotEmpty(callPoints.getBswSynchronousServerCallPoint())) {
            ArrayList<BswSynchronousServerCallPoint> originalList = callPoints.getBswSynchronousServerCallPoint();
            ArrayList<BswSynchronousServerCallPointWrapper> wrapperList = (ArrayList<BswSynchronousServerCallPointWrapper>)originalList.stream()
                .map(item -> new BswSynchronousServerCallPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}