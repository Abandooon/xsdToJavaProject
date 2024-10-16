package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MultiLanguageOverviewParagraphWrapper {

    
    private MultiLanguageOverviewParagraph multiLanguageOverviewParagraph;

    public MultiLanguageOverviewParagraphWrapper(MultiLanguageOverviewParagraph multiLanguageOverviewParagraph) {
        this.multiLanguageOverviewParagraph = multiLanguageOverviewParagraph;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(multiLanguageOverviewParagraph.getS())) {
            
            return multiLanguageOverviewParagraph.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(multiLanguageOverviewParagraph.getT())) {
            
            return multiLanguageOverviewParagraph.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LOverviewParagraphWrapper> getL2() {
        
        if (CollUtil.isNotEmpty(multiLanguageOverviewParagraph.getL2())) {
            ArrayList<LOverviewParagraph> originalList = multiLanguageOverviewParagraph.getL2();
            ArrayList<LOverviewParagraphWrapper> wrapperList = (ArrayList<LOverviewParagraphWrapper>)originalList.stream()
                .map(item -> new LOverviewParagraphWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}