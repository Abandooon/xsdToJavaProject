package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MsrQueryResultChapterWrapper {

    
    private MsrQueryResultChapter msrQueryResultChapter;

    public MsrQueryResultChapterWrapper(MsrQueryResultChapter msrQueryResultChapter) {
        this.msrQueryResultChapter = msrQueryResultChapter;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(msrQueryResultChapter.getS())) {
            
            return msrQueryResultChapter.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(msrQueryResultChapter.getT())) {
            
            return msrQueryResultChapter.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ChapterWrapper> getChapter() {
        
        if (CollUtil.isNotEmpty(msrQueryResultChapter.getChapter())) {
            ArrayList<Chapter> originalList = msrQueryResultChapter.getChapter();
            ArrayList<ChapterWrapper> wrapperList = (ArrayList<ChapterWrapper>)originalList.stream()
                .map(item -> new ChapterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}