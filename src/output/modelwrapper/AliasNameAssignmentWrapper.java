package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    


public class AliasNameAssignmentWrapper {

    
    private AliasNameAssignment aliasNameAssignment;

    public AliasNameAssignmentWrapper(AliasNameAssignment aliasNameAssignment) {
        this.aliasNameAssignment = aliasNameAssignment;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(aliasNameAssignment.getS())) {
            
            return aliasNameAssignment.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(aliasNameAssignment.getT())) {
            
            return aliasNameAssignment.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(aliasNameAssignment.getShortLabel())) {
            
            return new StringWrapper(aliasNameAssignment.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(aliasNameAssignment.getLabel())) {
            
            return new MultilanguageLongNameWrapper(aliasNameAssignment.getLabel());
            
        } else {
            return null;
        }
        
    }

    public IdentifiableRefWrapper getIdentifiableRef() {
        
        if (CollUtil.isNotEmpty(aliasNameAssignment.getIdentifiableRef())) {
            
            return new IdentifiableRefWrapper(aliasNameAssignment.getIdentifiableRef());
            
        } else {
            return null;
        }
        
    }

    public FlatInstanceRefWrapper getFlatInstanceRef() {
        
        if (CollUtil.isNotEmpty(aliasNameAssignment.getFlatInstanceRef())) {
            
            return new FlatInstanceRefWrapper(aliasNameAssignment.getFlatInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(aliasNameAssignment.getVariationPoint())) {
            
            return new VariationPointWrapper(aliasNameAssignment.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}