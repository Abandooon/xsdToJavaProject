package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ColspecWrapper {

    
    private Colspec colspec;

    public ColspecWrapper(Colspec colspec) {
        this.colspec = colspec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(colspec.getS())) {
            
            return colspec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(colspec.getT())) {
            
            return colspec.getT();
            
        } else {
            return null;
        }
        
    }

    public AlignEnumSimple getAlign() {
        
        if (CollUtil.isNotEmpty(colspec.getAlign())) {
            
            return colspec.getAlign();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getColname() {
        
        if (CollUtil.isNotEmpty(colspec.getColname())) {
            
            return colspec.getColname();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getColnum() {
        
        if (CollUtil.isNotEmpty(colspec.getColnum())) {
            
            return colspec.getColnum();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getColsep() {
        
        if (CollUtil.isNotEmpty(colspec.getColsep())) {
            
            return colspec.getColsep();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getColwidth() {
        
        if (CollUtil.isNotEmpty(colspec.getColwidth())) {
            
            return colspec.getColwidth();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getRowsep() {
        
        if (CollUtil.isNotEmpty(colspec.getRowsep())) {
            
            return colspec.getRowsep();
            
        } else {
            return null;
        }
        
    }




    


    
}