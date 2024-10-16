package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ModeDeclarationGroupPrototypeRefConditionalWrapper {

    
    private ModeDeclarationGroupPrototypeRefConditional modeDeclarationGroupPrototypeRefConditional;

    public ModeDeclarationGroupPrototypeRefConditionalWrapper(ModeDeclarationGroupPrototypeRefConditional modeDeclarationGroupPrototypeRefConditional) {
        this.modeDeclarationGroupPrototypeRefConditional = modeDeclarationGroupPrototypeRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototypeRefConditional.getS())) {
            
            return modeDeclarationGroupPrototypeRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototypeRefConditional.getT())) {
            
            return modeDeclarationGroupPrototypeRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public ModeDeclarationGroupPrototypeRefWrapper getModeDeclarationGroupPrototypeRef() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototypeRefConditional.getModeDeclarationGroupPrototypeRef())) {
            
            return new ModeDeclarationGroupPrototypeRefWrapper(modeDeclarationGroupPrototypeRefConditional.getModeDeclarationGroupPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototypeRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(modeDeclarationGroupPrototypeRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}