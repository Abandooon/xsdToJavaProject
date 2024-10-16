package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ChapterContentWrapper {

    
    private ChapterContent chapterContent;

    public ChapterContentWrapper(ChapterContent chapterContent) {
        this.chapterContent = chapterContent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(chapterContent.getS())) {
            
            return chapterContent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(chapterContent.getT())) {
            
            return chapterContent.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PrmsWrapper> getPrms() {
        
        if (CollUtil.isNotEmpty(chapterContent.getPrms())) {
            ArrayList<Prms> originalList = chapterContent.getPrms();
            ArrayList<PrmsWrapper> wrapperList = (ArrayList<PrmsWrapper>)originalList.stream()
                .map(item -> new PrmsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP1Wrapper> getMsrQueryP1() {
        
        if (CollUtil.isNotEmpty(chapterContent.getMsrQueryP1())) {
            ArrayList<MsrQueryP1> originalList = chapterContent.getMsrQueryP1();
            ArrayList<MsrQueryP1Wrapper> wrapperList = (ArrayList<MsrQueryP1Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}