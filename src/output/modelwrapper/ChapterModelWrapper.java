package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ChapterModelWrapper {

    
    private ChapterModel chapterModel;

    public ChapterModelWrapper(ChapterModel chapterModel) {
        this.chapterModel = chapterModel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(chapterModel.getS())) {
            
            return chapterModel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(chapterModel.getT())) {
            
            return chapterModel.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PrmsWrapper> getPrms() {
        
        if (CollUtil.isNotEmpty(chapterModel.getPrms())) {
            ArrayList<Prms> originalList = chapterModel.getPrms();
            ArrayList<PrmsWrapper> wrapperList = (ArrayList<PrmsWrapper>)originalList.stream()
                .map(item -> new PrmsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP1Wrapper> getMsrQueryP1() {
        
        if (CollUtil.isNotEmpty(chapterModel.getMsrQueryP1())) {
            ArrayList<MsrQueryP1> originalList = chapterModel.getMsrQueryP1();
            ArrayList<MsrQueryP1Wrapper> wrapperList = (ArrayList<MsrQueryP1Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<Topic1Wrapper> getTopic1() {
        
        if (CollUtil.isNotEmpty(chapterModel.getTopic1())) {
            ArrayList<Topic1> originalList = chapterModel.getTopic1();
            ArrayList<Topic1Wrapper> wrapperList = (ArrayList<Topic1Wrapper>)originalList.stream()
                .map(item -> new Topic1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryTopic1Wrapper> getMsrQueryTopic1() {
        
        if (CollUtil.isNotEmpty(chapterModel.getMsrQueryTopic1())) {
            ArrayList<MsrQueryTopic1> originalList = chapterModel.getMsrQueryTopic1();
            ArrayList<MsrQueryTopic1Wrapper> wrapperList = (ArrayList<MsrQueryTopic1Wrapper>)originalList.stream()
                .map(item -> new MsrQueryTopic1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ChapterWrapper> getChapter() {
        
        if (CollUtil.isNotEmpty(chapterModel.getChapter())) {
            ArrayList<Chapter> originalList = chapterModel.getChapter();
            ArrayList<ChapterWrapper> wrapperList = (ArrayList<ChapterWrapper>)originalList.stream()
                .map(item -> new ChapterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryChapterWrapper> getMsrQueryChapter() {
        
        if (CollUtil.isNotEmpty(chapterModel.getMsrQueryChapter())) {
            ArrayList<MsrQueryChapter> originalList = chapterModel.getMsrQueryChapter();
            ArrayList<MsrQueryChapterWrapper> wrapperList = (ArrayList<MsrQueryChapterWrapper>)originalList.stream()
                .map(item -> new MsrQueryChapterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}