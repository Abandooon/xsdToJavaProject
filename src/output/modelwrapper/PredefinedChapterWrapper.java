package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PredefinedChapterWrapper {

    
    private PredefinedChapter predefinedChapter;

    public PredefinedChapterWrapper(PredefinedChapter predefinedChapter) {
        this.predefinedChapter = predefinedChapter;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(predefinedChapter.getS())) {
            
            return predefinedChapter.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(predefinedChapter.getT())) {
            
            return predefinedChapter.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PrmsWrapper> getPrms() {
        
        if (CollUtil.isNotEmpty(predefinedChapter.getPrms())) {
            ArrayList<Prms> originalList = predefinedChapter.getPrms();
            ArrayList<PrmsWrapper> wrapperList = (ArrayList<PrmsWrapper>)originalList.stream()
                .map(item -> new PrmsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP1Wrapper> getMsrQueryP1() {
        
        if (CollUtil.isNotEmpty(predefinedChapter.getMsrQueryP1())) {
            ArrayList<MsrQueryP1> originalList = predefinedChapter.getMsrQueryP1();
            ArrayList<MsrQueryP1Wrapper> wrapperList = (ArrayList<MsrQueryP1Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}