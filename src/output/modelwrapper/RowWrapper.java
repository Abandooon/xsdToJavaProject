package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Entry;
    

    
    


public class RowWrapper {

    
    private Row row;

    public RowWrapper(Row row) {
        this.row = row;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(row.getS())) {
            
            return row.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(row.getT())) {
            
            return row.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(row.getSi())) {
            
            return row.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(row.getView())) {
            
            return row.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(row.getBreak())) {
            
            return row.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(row.getKeepWithPrevious())) {
            
            return row.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getRowsep() {
        
        if (CollUtil.isNotEmpty(row.getRowsep())) {
            
            return row.getRowsep();
            
        } else {
            return null;
        }
        
    }

    public ValignEnumSimple getValign() {
        
        if (CollUtil.isNotEmpty(row.getValign())) {
            
            return row.getValign();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EntryWrapper> getEntry() {
        
        if (CollUtil.isNotEmpty(row.getEntry())) {
            ArrayList<Entry> originalList = row.getEntry();
            ArrayList<EntryWrapper> wrapperList = (ArrayList<EntryWrapper>)originalList.stream()
                .map(item -> new EntryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(row.getVariationPoint())) {
            
            return new VariationPointWrapper(row.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}