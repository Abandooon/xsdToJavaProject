package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DefListWrapper {

    
    private DefList defList;

    public DefListWrapper(DefList defList) {
        this.defList = defList;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(defList.getS())) {
            
            return defList.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(defList.getT())) {
            
            return defList.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(defList.getSi())) {
            
            return defList.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(defList.getView())) {
            
            return defList.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(defList.getBreak())) {
            
            return defList.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(defList.getKeepWithPrevious())) {
            
            return defList.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DefItemWrapper> getDefItem() {
        
        if (CollUtil.isNotEmpty(defList.getDefItem())) {
            ArrayList<DefItem> originalList = defList.getDefItem();
            ArrayList<DefItemWrapper> wrapperList = (ArrayList<DefItemWrapper>)originalList.stream()
                .map(item -> new DefItemWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(defList.getVariationPoint())) {
            
            return new VariationPointWrapper(defList.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}