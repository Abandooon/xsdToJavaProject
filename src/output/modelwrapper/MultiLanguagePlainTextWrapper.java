package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MultiLanguagePlainTextWrapper {

    
    private MultiLanguagePlainText multiLanguagePlainText;

    public MultiLanguagePlainTextWrapper(MultiLanguagePlainText multiLanguagePlainText) {
        this.multiLanguagePlainText = multiLanguagePlainText;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(multiLanguagePlainText.getS())) {
            
            return multiLanguagePlainText.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(multiLanguagePlainText.getT())) {
            
            return multiLanguagePlainText.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LPlainTextWrapper> getL10() {
        
        if (CollUtil.isNotEmpty(multiLanguagePlainText.getL10())) {
            ArrayList<LPlainText> originalList = multiLanguagePlainText.getL10();
            ArrayList<LPlainTextWrapper> wrapperList = (ArrayList<LPlainTextWrapper>)originalList.stream()
                .map(item -> new LPlainTextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}