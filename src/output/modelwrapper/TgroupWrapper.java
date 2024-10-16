package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TgroupWrapper {

    
    private Tgroup tgroup;

    public TgroupWrapper(Tgroup tgroup) {
        this.tgroup = tgroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tgroup.getS())) {
            
            return tgroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tgroup.getT())) {
            
            return tgroup.getT();
            
        } else {
            return null;
        }
        
    }

    public AlignEnumSimple getAlign() {
        
        if (CollUtil.isNotEmpty(tgroup.getAlign())) {
            
            return tgroup.getAlign();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getCols() {
        
        if (CollUtil.isNotEmpty(tgroup.getCols())) {
            
            return tgroup.getCols();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getColsep() {
        
        if (CollUtil.isNotEmpty(tgroup.getColsep())) {
            
            return tgroup.getColsep();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getRowsep() {
        
        if (CollUtil.isNotEmpty(tgroup.getRowsep())) {
            
            return tgroup.getRowsep();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ColspecWrapper> getColspec() {
        
        if (CollUtil.isNotEmpty(tgroup.getColspec())) {
            ArrayList<Colspec> originalList = tgroup.getColspec();
            ArrayList<ColspecWrapper> wrapperList = (ArrayList<ColspecWrapper>)originalList.stream()
                .map(item -> new ColspecWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TbodyWrapper getThead() {
        
        if (CollUtil.isNotEmpty(tgroup.getThead())) {
            
            return new TbodyWrapper(tgroup.getThead());
            
        } else {
            return null;
        }
        
    }

    public TbodyWrapper getTfoot() {
        
        if (CollUtil.isNotEmpty(tgroup.getTfoot())) {
            
            return new TbodyWrapper(tgroup.getTfoot());
            
        } else {
            return null;
        }
        
    }

    public TbodyWrapper getTbody() {
        
        if (CollUtil.isNotEmpty(tgroup.getTbody())) {
            
            return new TbodyWrapper(tgroup.getTbody());
            
        } else {
            return null;
        }
        
    }




    


    
}