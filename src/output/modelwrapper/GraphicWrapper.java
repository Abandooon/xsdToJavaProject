package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class GraphicWrapper {

    
    private Graphic graphic;

    public GraphicWrapper(Graphic graphic) {
        this.graphic = graphic;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(graphic.getS())) {
            
            return graphic.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(graphic.getT())) {
            
            return graphic.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getEditHeight() {
        
        if (CollUtil.isNotEmpty(graphic.getEditHeight())) {
            
            return graphic.getEditHeight();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getEditWidth() {
        
        if (CollUtil.isNotEmpty(graphic.getEditWidth())) {
            
            return graphic.getEditWidth();
            
        } else {
            return null;
        }
        
    }

    public GraphicFitEnumSimple getEditfit() {
        
        if (CollUtil.isNotEmpty(graphic.getEditfit())) {
            
            return graphic.getEditfit();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getEditscale() {
        
        if (CollUtil.isNotEmpty(graphic.getEditscale())) {
            
            return graphic.getEditscale();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getFilename() {
        
        if (CollUtil.isNotEmpty(graphic.getFilename())) {
            
            return graphic.getFilename();
            
        } else {
            return null;
        }
        
    }

    public GraphicFitEnumSimple getFit() {
        
        if (CollUtil.isNotEmpty(graphic.getFit())) {
            
            return graphic.getFit();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getGenerator() {
        
        if (CollUtil.isNotEmpty(graphic.getGenerator())) {
            
            return graphic.getGenerator();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHeight() {
        
        if (CollUtil.isNotEmpty(graphic.getHeight())) {
            
            return graphic.getHeight();
            
        } else {
            return null;
        }
        
    }

    public GraphicFitEnumSimple getHtmlFit() {
        
        if (CollUtil.isNotEmpty(graphic.getHtmlFit())) {
            
            return graphic.getHtmlFit();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHtmlHeight() {
        
        if (CollUtil.isNotEmpty(graphic.getHtmlHeight())) {
            
            return graphic.getHtmlHeight();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHtmlScale() {
        
        if (CollUtil.isNotEmpty(graphic.getHtmlScale())) {
            
            return graphic.getHtmlScale();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHtmlWidth() {
        
        if (CollUtil.isNotEmpty(graphic.getHtmlWidth())) {
            
            return graphic.getHtmlWidth();
            
        } else {
            return null;
        }
        
    }

    public GraphicNotationEnumSimple getNotation() {
        
        if (CollUtil.isNotEmpty(graphic.getNotation())) {
            
            return graphic.getNotation();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getScale() {
        
        if (CollUtil.isNotEmpty(graphic.getScale())) {
            
            return graphic.getScale();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getWidth() {
        
        if (CollUtil.isNotEmpty(graphic.getWidth())) {
            
            return graphic.getWidth();
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(graphic.getShortLabel())) {
            
            return new NmtokenStringWrapper(graphic.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(graphic.getCategory())) {
            
            return new NmtokenStringWrapper(graphic.getCategory());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RevisionLabelStringWrapper> getRevisionLabels() {
        
        if (CollUtil.isNotEmpty(graphic.getRevisionLabels())) {
            ArrayList<RevisionLabelString> originalList = graphic.getRevisionLabels();
            ArrayList<RevisionLabelStringWrapper> wrapperList = (ArrayList<RevisionLabelStringWrapper>)originalList.stream()
                .map(item -> new RevisionLabelStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getDomain() {
        
        if (CollUtil.isNotEmpty(graphic.getDomain())) {
            
            return new NmtokenStringWrapper(graphic.getDomain());
            
        } else {
            return null;
        }
        
    }




    


    
}