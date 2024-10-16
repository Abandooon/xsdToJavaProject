package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DefItemWrapper {

    
    private DefItem defItem;

    public DefItemWrapper(DefItem defItem) {
        this.defItem = defItem;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(defItem.getS())) {
            
            return defItem.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(defItem.getT())) {
            
            return defItem.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(defItem.getSi())) {
            
            return defItem.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(defItem.getView())) {
            
            return defItem.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(defItem.getBreak())) {
            
            return defItem.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(defItem.getKeepWithPrevious())) {
            
            return defItem.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHelpEntry() {
        
        if (CollUtil.isNotEmpty(defItem.getHelpEntry())) {
            
            return defItem.getHelpEntry();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(defItem.getShortName())) {
            
            return new IdentifierWrapper(defItem.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(defItem.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = defItem.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(defItem.getLongName())) {
            
            return new MultilanguageLongNameWrapper(defItem.getLongName());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getDef() {
        
        if (CollUtil.isNotEmpty(defItem.getDef())) {
            
            return new DocumentationBlockWrapper(defItem.getDef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(defItem.getVariationPoint())) {
            
            return new VariationPointWrapper(defItem.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}