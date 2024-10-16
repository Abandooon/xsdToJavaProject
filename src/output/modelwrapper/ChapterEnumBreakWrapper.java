package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ChapterEnumBreakWrapper {

    
    private ChapterEnumBreak chapterEnumBreak;

    public ChapterEnumBreakWrapper(ChapterEnumBreak chapterEnumBreak) {
        this.chapterEnumBreak = chapterEnumBreak;
    }

   
    public ChapterEnumBreakSimple getValue() {
        
        if (CollUtil.isNotEmpty(chapterEnumBreak.getValue())) {
            
            return chapterEnumBreak.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(chapterEnumBreak.getS())) {
            
            return chapterEnumBreak.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(chapterEnumBreak.getT())) {
            
            return chapterEnumBreak.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}