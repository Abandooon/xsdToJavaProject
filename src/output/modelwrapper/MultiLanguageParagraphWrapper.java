package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class MultiLanguageParagraphWrapper {

    
    private MultiLanguageParagraph multiLanguageParagraph;

    public MultiLanguageParagraphWrapper(MultiLanguageParagraph multiLanguageParagraph) {
        this.multiLanguageParagraph = multiLanguageParagraph;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(multiLanguageParagraph.getS())) {
            
            return multiLanguageParagraph.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(multiLanguageParagraph.getT())) {
            
            return multiLanguageParagraph.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(multiLanguageParagraph.getSi())) {
            
            return multiLanguageParagraph.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(multiLanguageParagraph.getView())) {
            
            return multiLanguageParagraph.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(multiLanguageParagraph.getBreak())) {
            
            return multiLanguageParagraph.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(multiLanguageParagraph.getKeepWithPrevious())) {
            
            return multiLanguageParagraph.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHelpEntry() {
        
        if (CollUtil.isNotEmpty(multiLanguageParagraph.getHelpEntry())) {
            
            return multiLanguageParagraph.getHelpEntry();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LParagraphWrapper> getL1() {
        
        if (CollUtil.isNotEmpty(multiLanguageParagraph.getL1())) {
            ArrayList<LParagraph> originalList = multiLanguageParagraph.getL1();
            ArrayList<LParagraphWrapper> wrapperList = (ArrayList<LParagraphWrapper>)originalList.stream()
                .map(item -> new LParagraphWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(multiLanguageParagraph.getVariationPoint())) {
            
            return new VariationPointWrapper(multiLanguageParagraph.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}