package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class MsrQueryTopic1Wrapper {

    
    private MsrQueryTopic1 msrQueryTopic1;

    public MsrQueryTopic1Wrapper(MsrQueryTopic1 msrQueryTopic1) {
        this.msrQueryTopic1 = msrQueryTopic1;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(msrQueryTopic1.getS())) {
            
            return msrQueryTopic1.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(msrQueryTopic1.getT())) {
            
            return msrQueryTopic1.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(msrQueryTopic1.getSi())) {
            
            return msrQueryTopic1.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(msrQueryTopic1.getView())) {
            
            return msrQueryTopic1.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(msrQueryTopic1.getBreak())) {
            
            return msrQueryTopic1.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(msrQueryTopic1.getKeepWithPrevious())) {
            
            return msrQueryTopic1.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public MsrQueryPropsWrapper getMsrQueryProps() {
        
        if (CollUtil.isNotEmpty(msrQueryTopic1.getMsrQueryProps())) {
            
            return new MsrQueryPropsWrapper(msrQueryTopic1.getMsrQueryProps());
            
        } else {
            return null;
        }
        
    }

    public MsrQueryResultTopic1Wrapper getMsrQueryResultTopic1() {
        
        if (CollUtil.isNotEmpty(msrQueryTopic1.getMsrQueryResultTopic1())) {
            
            return new MsrQueryResultTopic1Wrapper(msrQueryTopic1.getMsrQueryResultTopic1());
            
        } else {
            return null;
        }
        
    }




    


    
}