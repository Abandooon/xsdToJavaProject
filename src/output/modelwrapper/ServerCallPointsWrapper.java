package stdgui.data.model.modelwrapper;


    
    

    
    


public class ServerCallPointsWrapper {

    
    private ServerCallPoints serverCallPoints;

    public ServerCallPointsWrapper(ServerCallPoints serverCallPoints) {
        this.serverCallPoints = serverCallPoints;
    }

   
    public ArrayList<AsynchronousServerCallPointWrapper> getAsynchronousServerCallPoint() {
        
        if (CollUtil.isNotEmpty(serverCallPoints.getAsynchronousServerCallPoint())) {
            ArrayList<AsynchronousServerCallPoint> originalList = serverCallPoints.getAsynchronousServerCallPoint();
            ArrayList<AsynchronousServerCallPointWrapper> wrapperList = (ArrayList<AsynchronousServerCallPointWrapper>)originalList.stream()
                .map(item -> new AsynchronousServerCallPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SynchronousServerCallPointWrapper> getSynchronousServerCallPoint() {
        
        if (CollUtil.isNotEmpty(serverCallPoints.getSynchronousServerCallPoint())) {
            ArrayList<SynchronousServerCallPoint> originalList = serverCallPoints.getSynchronousServerCallPoint();
            ArrayList<SynchronousServerCallPointWrapper> wrapperList = (ArrayList<SynchronousServerCallPointWrapper>)originalList.stream()
                .map(item -> new SynchronousServerCallPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}