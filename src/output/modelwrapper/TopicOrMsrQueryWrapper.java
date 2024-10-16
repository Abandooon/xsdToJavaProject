package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TopicOrMsrQueryWrapper {

    
    private TopicOrMsrQuery topicOrMsrQuery;

    public TopicOrMsrQueryWrapper(TopicOrMsrQuery topicOrMsrQuery) {
        this.topicOrMsrQuery = topicOrMsrQuery;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(topicOrMsrQuery.getS())) {
            
            return topicOrMsrQuery.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(topicOrMsrQuery.getT())) {
            
            return topicOrMsrQuery.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Topic1Wrapper> getTopic1() {
        
        if (CollUtil.isNotEmpty(topicOrMsrQuery.getTopic1())) {
            ArrayList<Topic1> originalList = topicOrMsrQuery.getTopic1();
            ArrayList<Topic1Wrapper> wrapperList = (ArrayList<Topic1Wrapper>)originalList.stream()
                .map(item -> new Topic1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryTopic1Wrapper> getMsrQueryTopic1() {
        
        if (CollUtil.isNotEmpty(topicOrMsrQuery.getMsrQueryTopic1())) {
            ArrayList<MsrQueryTopic1> originalList = topicOrMsrQuery.getMsrQueryTopic1();
            ArrayList<MsrQueryTopic1Wrapper> wrapperList = (ArrayList<MsrQueryTopic1Wrapper>)originalList.stream()
                .map(item -> new MsrQueryTopic1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}