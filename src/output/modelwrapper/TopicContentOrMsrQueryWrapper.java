package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TopicContentOrMsrQueryWrapper {

    
    private TopicContentOrMsrQuery topicContentOrMsrQuery;

    public TopicContentOrMsrQueryWrapper(TopicContentOrMsrQuery topicContentOrMsrQuery) {
        this.topicContentOrMsrQuery = topicContentOrMsrQuery;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(topicContentOrMsrQuery.getS())) {
            
            return topicContentOrMsrQuery.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(topicContentOrMsrQuery.getT())) {
            
            return topicContentOrMsrQuery.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP1Wrapper> getMsrQueryP1() {
        
        if (CollUtil.isNotEmpty(topicContentOrMsrQuery.getMsrQueryP1())) {
            ArrayList<MsrQueryP1> originalList = topicContentOrMsrQuery.getMsrQueryP1();
            ArrayList<MsrQueryP1Wrapper> wrapperList = (ArrayList<MsrQueryP1Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TableWrapper> getTable() {
        
        if (CollUtil.isNotEmpty(topicContentOrMsrQuery.getTable())) {
            ArrayList<Table> originalList = topicContentOrMsrQuery.getTable();
            ArrayList<TableWrapper> wrapperList = (ArrayList<TableWrapper>)originalList.stream()
                .map(item -> new TableWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}