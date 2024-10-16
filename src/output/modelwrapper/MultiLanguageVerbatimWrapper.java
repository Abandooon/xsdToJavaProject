package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class MultiLanguageVerbatimWrapper {

    
    private MultiLanguageVerbatim multiLanguageVerbatim;

    public MultiLanguageVerbatimWrapper(MultiLanguageVerbatim multiLanguageVerbatim) {
        this.multiLanguageVerbatim = multiLanguageVerbatim;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getS())) {
            
            return multiLanguageVerbatim.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getT())) {
            
            return multiLanguageVerbatim.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getSi())) {
            
            return multiLanguageVerbatim.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getView())) {
            
            return multiLanguageVerbatim.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getBreak())) {
            
            return multiLanguageVerbatim.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getKeepWithPrevious())) {
            
            return multiLanguageVerbatim.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getAllowBreak() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getAllowBreak())) {
            
            return multiLanguageVerbatim.getAllowBreak();
            
        } else {
            return null;
        }
        
    }

    public FloatEnumSimple getFloat() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getFloat())) {
            
            return multiLanguageVerbatim.getFloat();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHelpEntry() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getHelpEntry())) {
            
            return multiLanguageVerbatim.getHelpEntry();
            
        } else {
            return null;
        }
        
    }

    public PgwideEnumSimple getPgwide() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getPgwide())) {
            
            return multiLanguageVerbatim.getPgwide();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LVerbatimWrapper> getL5() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getL5())) {
            ArrayList<LVerbatim> originalList = multiLanguageVerbatim.getL5();
            ArrayList<LVerbatimWrapper> wrapperList = (ArrayList<LVerbatimWrapper>)originalList.stream()
                .map(item -> new LVerbatimWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(multiLanguageVerbatim.getVariationPoint())) {
            
            return new VariationPointWrapper(multiLanguageVerbatim.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}