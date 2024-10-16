package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class OrderedElementsWrapper {

    
    private OrderedElements orderedElements;

    public OrderedElementsWrapper(OrderedElements orderedElements) {
        this.orderedElements = orderedElements;
    }

   
    public ArrayList<EocEventRefWrapper> getEocEventRef() {
        
        if (CollUtil.isNotEmpty(orderedElements.getEocEventRef())) {
            ArrayList<EocEventRef> originalList = orderedElements.getEocEventRef();
            ArrayList<EocEventRefWrapper> wrapperList = (ArrayList<EocEventRefWrapper>)originalList.stream()
                .map(item -> new EocEventRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EocExecutableEntityRefWrapper> getEocExecutableEntityRef() {
        
        if (CollUtil.isNotEmpty(orderedElements.getEocExecutableEntityRef())) {
            ArrayList<EocExecutableEntityRef> originalList = orderedElements.getEocExecutableEntityRef();
            ArrayList<EocExecutableEntityRefWrapper> wrapperList = (ArrayList<EocExecutableEntityRefWrapper>)originalList.stream()
                .map(item -> new EocExecutableEntityRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EocExecutableEntityRefGroupWrapper> getEocExecutableEntityRefGroup() {
        
        if (CollUtil.isNotEmpty(orderedElements.getEocExecutableEntityRefGroup())) {
            ArrayList<EocExecutableEntityRefGroup> originalList = orderedElements.getEocExecutableEntityRefGroup();
            ArrayList<EocExecutableEntityRefGroupWrapper> wrapperList = (ArrayList<EocExecutableEntityRefGroupWrapper>)originalList.stream()
                .map(item -> new EocExecutableEntityRefGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}