package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class MlFigureWrapper {

    
    private MlFigure mlFigure;

    public MlFigureWrapper(MlFigure mlFigure) {
        this.mlFigure = mlFigure;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mlFigure.getS())) {
            
            return mlFigure.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mlFigure.getT())) {
            
            return mlFigure.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(mlFigure.getSi())) {
            
            return mlFigure.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(mlFigure.getView())) {
            
            return mlFigure.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(mlFigure.getBreak())) {
            
            return mlFigure.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(mlFigure.getKeepWithPrevious())) {
            
            return mlFigure.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public FrameEnumSimple getFrame() {
        
        if (CollUtil.isNotEmpty(mlFigure.getFrame())) {
            
            return mlFigure.getFrame();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHelpEntry() {
        
        if (CollUtil.isNotEmpty(mlFigure.getHelpEntry())) {
            
            return mlFigure.getHelpEntry();
            
        } else {
            return null;
        }
        
    }

    public PgwideEnumSimple getPgwide() {
        
        if (CollUtil.isNotEmpty(mlFigure.getPgwide())) {
            
            return mlFigure.getPgwide();
            
        } else {
            return null;
        }
        
    }

    public CaptionWrapper getFigureCaption() {
        
        if (CollUtil.isNotEmpty(mlFigure.getFigureCaption())) {
            
            return new CaptionWrapper(mlFigure.getFigureCaption());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageVerbatimWrapper getVerbatim() {
        
        if (CollUtil.isNotEmpty(mlFigure.getVerbatim())) {
            
            return new MultiLanguageVerbatimWrapper(mlFigure.getVerbatim());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(mlFigure.getVariationPoint())) {
            
            return new VariationPointWrapper(mlFigure.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}