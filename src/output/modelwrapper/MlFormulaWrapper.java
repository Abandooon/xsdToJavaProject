package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class MlFormulaWrapper {

    
    private MlFormula mlFormula;

    public MlFormulaWrapper(MlFormula mlFormula) {
        this.mlFormula = mlFormula;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mlFormula.getS())) {
            
            return mlFormula.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mlFormula.getT())) {
            
            return mlFormula.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(mlFormula.getSi())) {
            
            return mlFormula.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(mlFormula.getView())) {
            
            return mlFormula.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(mlFormula.getBreak())) {
            
            return mlFormula.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(mlFormula.getKeepWithPrevious())) {
            
            return mlFormula.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public CaptionWrapper getFormulaCaption() {
        
        if (CollUtil.isNotEmpty(mlFormula.getFormulaCaption())) {
            
            return new CaptionWrapper(mlFormula.getFormulaCaption());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageVerbatimWrapper getVerbatim() {
        
        if (CollUtil.isNotEmpty(mlFormula.getVerbatim())) {
            
            return new MultiLanguageVerbatimWrapper(mlFormula.getVerbatim());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguagePlainTextWrapper getTexMath() {
        
        if (CollUtil.isNotEmpty(mlFormula.getTexMath())) {
            
            return new MultiLanguagePlainTextWrapper(mlFormula.getTexMath());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguagePlainTextWrapper getGenericMath() {
        
        if (CollUtil.isNotEmpty(mlFormula.getGenericMath())) {
            
            return new MultiLanguagePlainTextWrapper(mlFormula.getGenericMath());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(mlFormula.getVariationPoint())) {
            
            return new VariationPointWrapper(mlFormula.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}