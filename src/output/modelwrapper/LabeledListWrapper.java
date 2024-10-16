package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class LabeledListWrapper {

    
    private LabeledList labeledList;

    public LabeledListWrapper(LabeledList labeledList) {
        this.labeledList = labeledList;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(labeledList.getS())) {
            
            return labeledList.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(labeledList.getT())) {
            
            return labeledList.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(labeledList.getSi())) {
            
            return labeledList.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(labeledList.getView())) {
            
            return labeledList.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(labeledList.getBreak())) {
            
            return labeledList.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(labeledList.getKeepWithPrevious())) {
            
            return labeledList.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public IndentSampleWrapper getIndentSample() {
        
        if (CollUtil.isNotEmpty(labeledList.getIndentSample())) {
            
            return new IndentSampleWrapper(labeledList.getIndentSample());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LabeledItemWrapper> getLabeledItem() {
        
        if (CollUtil.isNotEmpty(labeledList.getLabeledItem())) {
            ArrayList<LabeledItem> originalList = labeledList.getLabeledItem();
            ArrayList<LabeledItemWrapper> wrapperList = (ArrayList<LabeledItemWrapper>)originalList.stream()
                .map(item -> new LabeledItemWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(labeledList.getVariationPoint())) {
            
            return new VariationPointWrapper(labeledList.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}