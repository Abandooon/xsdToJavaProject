package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.List;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ListWrapper {

    
    private List list;

    public ListWrapper(List list) {
        this.list = list;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(list.getS())) {
            
            return list.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(list.getT())) {
            
            return list.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(list.getSi())) {
            
            return list.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(list.getView())) {
            
            return list.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(list.getBreak())) {
            
            return list.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(list.getKeepWithPrevious())) {
            
            return list.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public ListEnumSimple getType() {
        
        if (CollUtil.isNotEmpty(list.getType())) {
            
            return list.getType();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ItemWrapper> getItem() {
        
        if (CollUtil.isNotEmpty(list.getItem())) {
            ArrayList<Item> originalList = list.getItem();
            ArrayList<ItemWrapper> wrapperList = (ArrayList<ItemWrapper>)originalList.stream()
                .map(item -> new ItemWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(list.getVariationPoint())) {
            
            return new VariationPointWrapper(list.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}