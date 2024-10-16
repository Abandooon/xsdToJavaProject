package stdgui.data.model.modelwrapper;


    
    

    
    


public class SenderReceiverAnnotationsWrapper {

    
    private SenderReceiverAnnotations senderReceiverAnnotations;

    public SenderReceiverAnnotationsWrapper(SenderReceiverAnnotations senderReceiverAnnotations) {
        this.senderReceiverAnnotations = senderReceiverAnnotations;
    }

   
    public ArrayList<ReceiverAnnotationWrapper> getReceiverAnnotation() {
        
        if (CollUtil.isNotEmpty(senderReceiverAnnotations.getReceiverAnnotation())) {
            ArrayList<ReceiverAnnotation> originalList = senderReceiverAnnotations.getReceiverAnnotation();
            ArrayList<ReceiverAnnotationWrapper> wrapperList = (ArrayList<ReceiverAnnotationWrapper>)originalList.stream()
                .map(item -> new ReceiverAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SenderAnnotationWrapper> getSenderAnnotation() {
        
        if (CollUtil.isNotEmpty(senderReceiverAnnotations.getSenderAnnotation())) {
            ArrayList<SenderAnnotation> originalList = senderReceiverAnnotations.getSenderAnnotation();
            ArrayList<SenderAnnotationWrapper> wrapperList = (ArrayList<SenderAnnotationWrapper>)originalList.stream()
                .map(item -> new SenderAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}