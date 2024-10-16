package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class NmNodesWrapper {

    
    private NmNodes nmNodes;

    public NmNodesWrapper(NmNodes nmNodes) {
        this.nmNodes = nmNodes;
    }

   
    public ArrayList<CanNmNodeWrapper> getCanNmNode() {
        
        if (CollUtil.isNotEmpty(nmNodes.getCanNmNode())) {
            ArrayList<CanNmNode> originalList = nmNodes.getCanNmNode();
            ArrayList<CanNmNodeWrapper> wrapperList = (ArrayList<CanNmNodeWrapper>)originalList.stream()
                .map(item -> new CanNmNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayNmNodeWrapper> getFlexrayNmNode() {
        
        if (CollUtil.isNotEmpty(nmNodes.getFlexrayNmNode())) {
            ArrayList<FlexrayNmNode> originalList = nmNodes.getFlexrayNmNode();
            ArrayList<FlexrayNmNodeWrapper> wrapperList = (ArrayList<FlexrayNmNodeWrapper>)originalList.stream()
                .map(item -> new FlexrayNmNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939NmNodeWrapper> getJ1939NmNode() {
        
        if (CollUtil.isNotEmpty(nmNodes.getJ1939NmNode())) {
            ArrayList<J1939NmNode> originalList = nmNodes.getJ1939NmNode();
            ArrayList<J1939NmNodeWrapper> wrapperList = (ArrayList<J1939NmNodeWrapper>)originalList.stream()
                .map(item -> new J1939NmNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UdpNmNodeWrapper> getUdpNmNode() {
        
        if (CollUtil.isNotEmpty(nmNodes.getUdpNmNode())) {
            ArrayList<UdpNmNode> originalList = nmNodes.getUdpNmNode();
            ArrayList<UdpNmNodeWrapper> wrapperList = (ArrayList<UdpNmNodeWrapper>)originalList.stream()
                .map(item -> new UdpNmNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}