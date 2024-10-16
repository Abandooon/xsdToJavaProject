package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EndToEndTransformationComSpecPropsWrapper {

    
    private EndToEndTransformationComSpecProps endToEndTransformationComSpecProps;

    public EndToEndTransformationComSpecPropsWrapper(EndToEndTransformationComSpecProps endToEndTransformationComSpecProps) {
        this.endToEndTransformationComSpecProps = endToEndTransformationComSpecProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getS())) {
            
            return endToEndTransformationComSpecProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getT())) {
            
            return endToEndTransformationComSpecProps.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(endToEndTransformationComSpecProps.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getCategory())) {
            
            return new CategoryStringWrapper(endToEndTransformationComSpecProps.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getIntroduction())) {
            
            return new DocumentationBlockWrapper(endToEndTransformationComSpecProps.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getAdminData())) {
            
            return new AdminDataWrapper(endToEndTransformationComSpecProps.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getDisableEndToEndCheck() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getDisableEndToEndCheck())) {
            
            return new BooleanWrapper(endToEndTransformationComSpecProps.getDisableEndToEndCheck());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxDeltaCounter() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getMaxDeltaCounter())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getMaxDeltaCounter());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxErrorStateInit() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getMaxErrorStateInit())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getMaxErrorStateInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxErrorStateInvalid() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getMaxErrorStateInvalid())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getMaxErrorStateInvalid());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxErrorStateValid() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getMaxErrorStateValid())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getMaxErrorStateValid());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNoNewOrRepeatedData() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getMaxNoNewOrRepeatedData())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getMaxNoNewOrRepeatedData());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinOkStateInit() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getMinOkStateInit())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getMinOkStateInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinOkStateInvalid() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getMinOkStateInvalid())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getMinOkStateInvalid());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinOkStateValid() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getMinOkStateValid())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getMinOkStateValid());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSyncCounterInit() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getSyncCounterInit())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getSyncCounterInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getWindowSize() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationComSpecProps.getWindowSize())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationComSpecProps.getWindowSize());
            
        } else {
            return null;
        }
        
    }




    


    
}