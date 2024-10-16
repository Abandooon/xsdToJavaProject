package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MsrQueryResultTopic1Wrapper {

    
    private MsrQueryResultTopic1 msrQueryResultTopic1;

    public MsrQueryResultTopic1Wrapper(MsrQueryResultTopic1 msrQueryResultTopic1) {
        this.msrQueryResultTopic1 = msrQueryResultTopic1;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(msrQueryResultTopic1.getS())) {
            
            return msrQueryResultTopic1.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(msrQueryResultTopic1.getT())) {
            
            return msrQueryResultTopic1.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Topic1Wrapper> getTopic1() {
        
        if (CollUtil.isNotEmpty(msrQueryResultTopic1.getTopic1())) {
            ArrayList<Topic1> originalList = msrQueryResultTopic1.getTopic1();
            ArrayList<Topic1Wrapper> wrapperList = (ArrayList<Topic1Wrapper>)originalList.stream()
                .map(item -> new Topic1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}