package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ChapterOrMsrQueryWrapper {

    
    private ChapterOrMsrQuery chapterOrMsrQuery;

    public ChapterOrMsrQueryWrapper(ChapterOrMsrQuery chapterOrMsrQuery) {
        this.chapterOrMsrQuery = chapterOrMsrQuery;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(chapterOrMsrQuery.getS())) {
            
            return chapterOrMsrQuery.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(chapterOrMsrQuery.getT())) {
            
            return chapterOrMsrQuery.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ChapterWrapper> getChapter() {
        
        if (CollUtil.isNotEmpty(chapterOrMsrQuery.getChapter())) {
            ArrayList<Chapter> originalList = chapterOrMsrQuery.getChapter();
            ArrayList<ChapterWrapper> wrapperList = (ArrayList<ChapterWrapper>)originalList.stream()
                .map(item -> new ChapterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryChapterWrapper> getMsrQueryChapter() {
        
        if (CollUtil.isNotEmpty(chapterOrMsrQuery.getMsrQueryChapter())) {
            ArrayList<MsrQueryChapter> originalList = chapterOrMsrQuery.getMsrQueryChapter();
            ArrayList<MsrQueryChapterWrapper> wrapperList = (ArrayList<MsrQueryChapterWrapper>)originalList.stream()
                .map(item -> new MsrQueryChapterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}