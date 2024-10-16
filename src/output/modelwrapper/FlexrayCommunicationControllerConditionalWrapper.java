package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class FlexrayCommunicationControllerConditionalWrapper {

    
    private FlexrayCommunicationControllerConditional flexrayCommunicationControllerConditional;

    public FlexrayCommunicationControllerConditionalWrapper(FlexrayCommunicationControllerConditional flexrayCommunicationControllerConditional) {
        this.flexrayCommunicationControllerConditional = flexrayCommunicationControllerConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getS())) {
            
            return flexrayCommunicationControllerConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getT())) {
            
            return flexrayCommunicationControllerConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWakeUpByControllerSupported() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getWakeUpByControllerSupported())) {
            
            return new BooleanWrapper(flexrayCommunicationControllerConditional.getWakeUpByControllerSupported());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getAcceptedStartupRange() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getAcceptedStartupRange())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getAcceptedStartupRange());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getAllowHaltDueToClock() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getAllowHaltDueToClock())) {
            
            return new BooleanWrapper(flexrayCommunicationControllerConditional.getAllowHaltDueToClock());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getAllowPassiveToActive() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getAllowPassiveToActive())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getAllowPassiveToActive());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getClusterDriftDamping() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getClusterDriftDamping())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getClusterDriftDamping());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getDecodingCorrection() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getDecodingCorrection())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getDecodingCorrection());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getDelayCompensationA() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getDelayCompensationA())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getDelayCompensationA());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getDelayCompensationB() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getDelayCompensationB())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getDelayCompensationB());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getExternOffsetCorrection() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getExternOffsetCorrection())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getExternOffsetCorrection());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getExternRateCorrection() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getExternRateCorrection())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getExternRateCorrection());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getExternalSync() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getExternalSync())) {
            
            return new BooleanWrapper(flexrayCommunicationControllerConditional.getExternalSync());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getFallBackInternal() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getFallBackInternal())) {
            
            return new BooleanWrapper(flexrayCommunicationControllerConditional.getFallBackInternal());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayFifoConfigurationWrapper> getFlexrayFifos() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getFlexrayFifos())) {
            ArrayList<FlexrayFifoConfiguration> originalList = flexrayCommunicationControllerConditional.getFlexrayFifos();
            ArrayList<FlexrayFifoConfigurationWrapper> wrapperList = (ArrayList<FlexrayFifoConfigurationWrapper>)originalList.stream()
                .map(item -> new FlexrayFifoConfigurationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getKeySlotId() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getKeySlotId())) {
            
            return new PositiveIntegerWrapper(flexrayCommunicationControllerConditional.getKeySlotId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getKeySlotOnlyEnabled() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getKeySlotOnlyEnabled())) {
            
            return new BooleanWrapper(flexrayCommunicationControllerConditional.getKeySlotOnlyEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getKeySlotUsedForStartUp() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getKeySlotUsedForStartUp())) {
            
            return new BooleanWrapper(flexrayCommunicationControllerConditional.getKeySlotUsedForStartUp());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getKeySlotUsedForSync() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getKeySlotUsedForSync())) {
            
            return new BooleanWrapper(flexrayCommunicationControllerConditional.getKeySlotUsedForSync());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLatestTx() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getLatestTx())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getLatestTx());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getListenTimeout() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getListenTimeout())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getListenTimeout());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMacroInitialOffsetA() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getMacroInitialOffsetA())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getMacroInitialOffsetA());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMacroInitialOffsetB() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getMacroInitialOffsetB())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getMacroInitialOffsetB());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaximumDynamicPayloadLength() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getMaximumDynamicPayloadLength())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getMaximumDynamicPayloadLength());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMicroInitialOffsetA() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getMicroInitialOffsetA())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getMicroInitialOffsetA());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMicroInitialOffsetB() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getMicroInitialOffsetB())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getMicroInitialOffsetB());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMicroPerCycle() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getMicroPerCycle())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getMicroPerCycle());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMicrotickDuration() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getMicrotickDuration())) {
            
            return new TimeValueWrapper(flexrayCommunicationControllerConditional.getMicrotickDuration());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmVectorEarlyUpdate() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getNmVectorEarlyUpdate())) {
            
            return new BooleanWrapper(flexrayCommunicationControllerConditional.getNmVectorEarlyUpdate());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getOffsetCorrectionOut() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getOffsetCorrectionOut())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getOffsetCorrectionOut());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getRateCorrectionOut() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getRateCorrectionOut())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getRateCorrectionOut());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSamplesPerMicrotick() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getSamplesPerMicrotick())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getSamplesPerMicrotick());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecondKeySlotId() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getSecondKeySlotId())) {
            
            return new PositiveIntegerWrapper(flexrayCommunicationControllerConditional.getSecondKeySlotId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getTwoKeySlotMode() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getTwoKeySlotMode())) {
            
            return new BooleanWrapper(flexrayCommunicationControllerConditional.getTwoKeySlotMode());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getWakeUpPattern() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getWakeUpPattern())) {
            
            return new IntegerWrapper(flexrayCommunicationControllerConditional.getWakeUpPattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationControllerConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayCommunicationControllerConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}