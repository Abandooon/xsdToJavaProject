package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EndToEndTransformationDescriptionWrapper {

    
    private EndToEndTransformationDescription endToEndTransformationDescription;

    public EndToEndTransformationDescriptionWrapper(EndToEndTransformationDescription endToEndTransformationDescription) {
        this.endToEndTransformationDescription = endToEndTransformationDescription;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getS())) {
            
            return endToEndTransformationDescription.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getT())) {
            
            return endToEndTransformationDescription.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(endToEndTransformationDescription.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getCategory())) {
            
            return new CategoryStringWrapper(endToEndTransformationDescription.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getIntroduction())) {
            
            return new DocumentationBlockWrapper(endToEndTransformationDescription.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getAdminData())) {
            
            return new AdminDataWrapper(endToEndTransformationDescription.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getVariationPoint())) {
            
            return new VariationPointWrapper(endToEndTransformationDescription.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getCounterOffset() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getCounterOffset())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getCounterOffset());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getCrcOffset() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getCrcOffset())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getCrcOffset());
            
        } else {
            return null;
        }
        
    }

    public DataIdModeEnumWrapper getDataIdMode() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getDataIdMode())) {
            
            return new DataIdModeEnumWrapper(endToEndTransformationDescription.getDataIdMode());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataIdNibbleOffset() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getDataIdNibbleOffset())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getDataIdNibbleOffset());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxDeltaCounter() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getMaxDeltaCounter())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getMaxDeltaCounter());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxErrorStateInit() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getMaxErrorStateInit())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getMaxErrorStateInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxErrorStateInvalid() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getMaxErrorStateInvalid())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getMaxErrorStateInvalid());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxErrorStateValid() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getMaxErrorStateValid())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getMaxErrorStateValid());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNoNewOrRepeatedData() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getMaxNoNewOrRepeatedData())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getMaxNoNewOrRepeatedData());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinOkStateInit() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getMinOkStateInit())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getMinOkStateInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinOkStateInvalid() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getMinOkStateInvalid())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getMinOkStateInvalid());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinOkStateValid() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getMinOkStateValid())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getMinOkStateValid());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getOffset() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getOffset())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getOffset());
            
        } else {
            return null;
        }
        
    }

    public EndToEndProfileBehaviorEnumWrapper getProfileBehavior() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getProfileBehavior())) {
            
            return new EndToEndProfileBehaviorEnumWrapper(endToEndTransformationDescription.getProfileBehavior());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getProfileName() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getProfileName())) {
            
            return new NmtokenStringWrapper(endToEndTransformationDescription.getProfileName());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSyncCounterInit() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getSyncCounterInit())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getSyncCounterInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getUpperHeaderBitsToShift() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getUpperHeaderBitsToShift())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getUpperHeaderBitsToShift());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getWindowSize() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationDescription.getWindowSize())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationDescription.getWindowSize());
            
        } else {
            return null;
        }
        
    }




    


    
}