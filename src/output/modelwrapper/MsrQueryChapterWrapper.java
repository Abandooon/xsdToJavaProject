package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class MsrQueryChapterWrapper {

    
    private MsrQueryChapter msrQueryChapter;

    public MsrQueryChapterWrapper(MsrQueryChapter msrQueryChapter) {
        this.msrQueryChapter = msrQueryChapter;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(msrQueryChapter.getS())) {
            
            return msrQueryChapter.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(msrQueryChapter.getT())) {
            
            return msrQueryChapter.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(msrQueryChapter.getSi())) {
            
            return msrQueryChapter.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(msrQueryChapter.getView())) {
            
            return msrQueryChapter.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(msrQueryChapter.getBreak())) {
            
            return msrQueryChapter.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(msrQueryChapter.getKeepWithPrevious())) {
            
            return msrQueryChapter.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public MsrQueryPropsWrapper getMsrQueryProps() {
        
        if (CollUtil.isNotEmpty(msrQueryChapter.getMsrQueryProps())) {
            
            return new MsrQueryPropsWrapper(msrQueryChapter.getMsrQueryProps());
            
        } else {
            return null;
        }
        
    }

    public MsrQueryResultChapterWrapper getMsrQueryResultChapter() {
        
        if (CollUtil.isNotEmpty(msrQueryChapter.getMsrQueryResultChapter())) {
            
            return new MsrQueryResultChapterWrapper(msrQueryChapter.getMsrQueryResultChapter());
            
        } else {
            return null;
        }
        
    }




    


    
}