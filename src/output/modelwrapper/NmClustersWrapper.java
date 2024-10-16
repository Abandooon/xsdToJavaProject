package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class NmClustersWrapper {

    
    private NmClusters nmClusters;

    public NmClustersWrapper(NmClusters nmClusters) {
        this.nmClusters = nmClusters;
    }

   
    public ArrayList<CanNmClusterWrapper> getCanNmCluster() {
        
        if (CollUtil.isNotEmpty(nmClusters.getCanNmCluster())) {
            ArrayList<CanNmCluster> originalList = nmClusters.getCanNmCluster();
            ArrayList<CanNmClusterWrapper> wrapperList = (ArrayList<CanNmClusterWrapper>)originalList.stream()
                .map(item -> new CanNmClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayNmClusterWrapper> getFlexrayNmCluster() {
        
        if (CollUtil.isNotEmpty(nmClusters.getFlexrayNmCluster())) {
            ArrayList<FlexrayNmCluster> originalList = nmClusters.getFlexrayNmCluster();
            ArrayList<FlexrayNmClusterWrapper> wrapperList = (ArrayList<FlexrayNmClusterWrapper>)originalList.stream()
                .map(item -> new FlexrayNmClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939NmClusterWrapper> getJ1939NmCluster() {
        
        if (CollUtil.isNotEmpty(nmClusters.getJ1939NmCluster())) {
            ArrayList<J1939NmCluster> originalList = nmClusters.getJ1939NmCluster();
            ArrayList<J1939NmClusterWrapper> wrapperList = (ArrayList<J1939NmClusterWrapper>)originalList.stream()
                .map(item -> new J1939NmClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UdpNmClusterWrapper> getUdpNmCluster() {
        
        if (CollUtil.isNotEmpty(nmClusters.getUdpNmCluster())) {
            ArrayList<UdpNmCluster> originalList = nmClusters.getUdpNmCluster();
            ArrayList<UdpNmClusterWrapper> wrapperList = (ArrayList<UdpNmClusterWrapper>)originalList.stream()
                .map(item -> new UdpNmClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}