package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class MsrQueryP1Wrapper {

    
    private MsrQueryP1 msrQueryP1;

    public MsrQueryP1Wrapper(MsrQueryP1 msrQueryP1) {
        this.msrQueryP1 = msrQueryP1;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(msrQueryP1.getS())) {
            
            return msrQueryP1.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(msrQueryP1.getT())) {
            
            return msrQueryP1.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(msrQueryP1.getSi())) {
            
            return msrQueryP1.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(msrQueryP1.getView())) {
            
            return msrQueryP1.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(msrQueryP1.getBreak())) {
            
            return msrQueryP1.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(msrQueryP1.getKeepWithPrevious())) {
            
            return msrQueryP1.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public MsrQueryPropsWrapper getMsrQueryProps() {
        
        if (CollUtil.isNotEmpty(msrQueryP1.getMsrQueryProps())) {
            
            return new MsrQueryPropsWrapper(msrQueryP1.getMsrQueryProps());
            
        } else {
            return null;
        }
        
    }

    public TopicContentWrapper getMsrQueryResultP1() {
        
        if (CollUtil.isNotEmpty(msrQueryP1.getMsrQueryResultP1())) {
            
            return new TopicContentWrapper(msrQueryP1.getMsrQueryResultP1());
            
        } else {
            return null;
        }
        
    }




    


    
}