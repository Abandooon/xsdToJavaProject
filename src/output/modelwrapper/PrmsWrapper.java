package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PrmsWrapper {

    
    private Prms prms;

    public PrmsWrapper(Prms prms) {
        this.prms = prms;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(prms.getS())) {
            
            return prms.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(prms.getT())) {
            
            return prms.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(prms.getSi())) {
            
            return prms.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(prms.getView())) {
            
            return prms.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(prms.getBreak())) {
            
            return prms.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(prms.getKeepWithPrevious())) {
            
            return prms.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(prms.getLabel())) {
            
            return new MultilanguageLongNameWrapper(prms.getLabel());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<GeneralParameterWrapper> getPrm() {
        
        if (CollUtil.isNotEmpty(prms.getPrm())) {
            ArrayList<GeneralParameter> originalList = prms.getPrm();
            ArrayList<GeneralParameterWrapper> wrapperList = (ArrayList<GeneralParameterWrapper>)originalList.stream()
                .map(item -> new GeneralParameterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}