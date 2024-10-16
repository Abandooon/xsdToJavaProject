package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TbodyWrapper {

    
    private Tbody tbody;

    public TbodyWrapper(Tbody tbody) {
        this.tbody = tbody;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tbody.getS())) {
            
            return tbody.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tbody.getT())) {
            
            return tbody.getT();
            
        } else {
            return null;
        }
        
    }

    public ValignEnumSimple getValign() {
        
        if (CollUtil.isNotEmpty(tbody.getValign())) {
            
            return tbody.getValign();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RowWrapper> getRow() {
        
        if (CollUtil.isNotEmpty(tbody.getRow())) {
            ArrayList<Row> originalList = tbody.getRow();
            ArrayList<RowWrapper> wrapperList = (ArrayList<RowWrapper>)originalList.stream()
                .map(item -> new RowWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}