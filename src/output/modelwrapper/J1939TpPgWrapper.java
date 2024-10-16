package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class J1939TpPgWrapper {

    
    private J1939TpPg j1939TpPg;

    public J1939TpPgWrapper(J1939TpPg j1939TpPg) {
        this.j1939TpPg = j1939TpPg;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939TpPg.getS())) {
            
            return j1939TpPg.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939TpPg.getT())) {
            
            return j1939TpPg.getT();
            
        } else {
            return null;
        }
        
    }

    public DirectPduRefWrapper getDirectPduRef() {
        
        if (CollUtil.isNotEmpty(j1939TpPg.getDirectPduRef())) {
            
            return new DirectPduRefWrapper(j1939TpPg.getDirectPduRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPgn() {
        
        if (CollUtil.isNotEmpty(j1939TpPg.getPgn())) {
            
            return new IntegerWrapper(j1939TpPg.getPgn());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRequestable() {
        
        if (CollUtil.isNotEmpty(j1939TpPg.getRequestable())) {
            
            return new BooleanWrapper(j1939TpPg.getRequestable());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SduRefWrapper> getSduRefs() {
        
        if (CollUtil.isNotEmpty(j1939TpPg.getSduRefs())) {
            ArrayList<SduRef> originalList = j1939TpPg.getSduRefs();
            ArrayList<SduRefWrapper> wrapperList = (ArrayList<SduRefWrapper>)originalList.stream()
                .map(item -> new SduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TpSduRef_CanTpConnectionWrapper getTpSduRef() {
        
        if (CollUtil.isNotEmpty(j1939TpPg.getTpSduRef())) {
            
            return new TpSduRef_CanTpConnectionWrapper(j1939TpPg.getTpSduRef());
            
        } else {
            return null;
        }
        
    }




    


    
}