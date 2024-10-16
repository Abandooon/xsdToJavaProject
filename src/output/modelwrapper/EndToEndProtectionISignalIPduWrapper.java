package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class EndToEndProtectionISignalIPduWrapper {

    
    private EndToEndProtectionISignalIPdu endToEndProtectionISignalIPdu;

    public EndToEndProtectionISignalIPduWrapper(EndToEndProtectionISignalIPdu endToEndProtectionISignalIPdu) {
        this.endToEndProtectionISignalIPdu = endToEndProtectionISignalIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionISignalIPdu.getS())) {
            
            return endToEndProtectionISignalIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionISignalIPdu.getT())) {
            
            return endToEndProtectionISignalIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getDataOffset() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionISignalIPdu.getDataOffset())) {
            
            return new IntegerWrapper(endToEndProtectionISignalIPdu.getDataOffset());
            
        } else {
            return null;
        }
        
    }

    public ISignalGroupRefWrapper getISignalGroupRef() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionISignalIPdu.getISignalGroupRef())) {
            
            return new ISignalGroupRefWrapper(endToEndProtectionISignalIPdu.getISignalGroupRef());
            
        } else {
            return null;
        }
        
    }

    public ISignalIPduRefWrapper getISignalIPduRef() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionISignalIPdu.getISignalIPduRef())) {
            
            return new ISignalIPduRefWrapper(endToEndProtectionISignalIPdu.getISignalIPduRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionISignalIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(endToEndProtectionISignalIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}