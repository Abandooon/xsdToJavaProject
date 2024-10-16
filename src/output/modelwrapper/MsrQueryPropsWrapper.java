package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class MsrQueryPropsWrapper {

    
    private MsrQueryProps msrQueryProps;

    public MsrQueryPropsWrapper(MsrQueryProps msrQueryProps) {
        this.msrQueryProps = msrQueryProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(msrQueryProps.getS())) {
            
            return msrQueryProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(msrQueryProps.getT())) {
            
            return msrQueryProps.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getMsrQueryName() {
        
        if (CollUtil.isNotEmpty(msrQueryProps.getMsrQueryName())) {
            
            return new StringWrapper(msrQueryProps.getMsrQueryName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryArgWrapper> getMsrQueryArg() {
        
        if (CollUtil.isNotEmpty(msrQueryProps.getMsrQueryArg())) {
            ArrayList<MsrQueryArg> originalList = msrQueryProps.getMsrQueryArg();
            ArrayList<MsrQueryArgWrapper> wrapperList = (ArrayList<MsrQueryArgWrapper>)originalList.stream()
                .map(item -> new MsrQueryArgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getComment() {
        
        if (CollUtil.isNotEmpty(msrQueryProps.getComment())) {
            
            return new StringWrapper(msrQueryProps.getComment());
            
        } else {
            return null;
        }
        
    }




    


    
}