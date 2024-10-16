package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TableWrapper {

    
    private Table table;

    public TableWrapper(Table table) {
        this.table = table;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(table.getS())) {
            
            return table.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(table.getT())) {
            
            return table.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(table.getSi())) {
            
            return table.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(table.getView())) {
            
            return table.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(table.getBreak())) {
            
            return table.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(table.getKeepWithPrevious())) {
            
            return table.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getColsep() {
        
        if (CollUtil.isNotEmpty(table.getColsep())) {
            
            return table.getColsep();
            
        } else {
            return null;
        }
        
    }

    public FloatEnumSimple getFloat() {
        
        if (CollUtil.isNotEmpty(table.getFloat())) {
            
            return table.getFloat();
            
        } else {
            return null;
        }
        
    }

    public FrameEnumSimple getFrame() {
        
        if (CollUtil.isNotEmpty(table.getFrame())) {
            
            return table.getFrame();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHelpEntry() {
        
        if (CollUtil.isNotEmpty(table.getHelpEntry())) {
            
            return table.getHelpEntry();
            
        } else {
            return null;
        }
        
    }

    public OrientEnumSimple getOrient() {
        
        if (CollUtil.isNotEmpty(table.getOrient())) {
            
            return table.getOrient();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getPgwide() {
        
        if (CollUtil.isNotEmpty(table.getPgwide())) {
            
            return table.getPgwide();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getRowsep() {
        
        if (CollUtil.isNotEmpty(table.getRowsep())) {
            
            return table.getRowsep();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getTabstyle() {
        
        if (CollUtil.isNotEmpty(table.getTabstyle())) {
            
            return table.getTabstyle();
            
        } else {
            return null;
        }
        
    }

    public CaptionWrapper getTableCaption() {
        
        if (CollUtil.isNotEmpty(table.getTableCaption())) {
            
            return new CaptionWrapper(table.getTableCaption());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TgroupWrapper> getTgroup() {
        
        if (CollUtil.isNotEmpty(table.getTgroup())) {
            ArrayList<Tgroup> originalList = table.getTgroup();
            ArrayList<TgroupWrapper> wrapperList = (ArrayList<TgroupWrapper>)originalList.stream()
                .map(item -> new TgroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(table.getVariationPoint())) {
            
            return new VariationPointWrapper(table.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}