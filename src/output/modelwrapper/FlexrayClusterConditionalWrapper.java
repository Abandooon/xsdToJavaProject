package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class FlexrayClusterConditionalWrapper {

    
    private FlexrayClusterConditional flexrayClusterConditional;

    public FlexrayClusterConditionalWrapper(FlexrayClusterConditional flexrayClusterConditional) {
        this.flexrayClusterConditional = flexrayClusterConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getS())) {
            
            return flexrayClusterConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getT())) {
            
            return flexrayClusterConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getBaudrate() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(flexrayClusterConditional.getBaudrate());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelsWrapper getPhysicalChannels() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getPhysicalChannels())) {
            
            return new PhysicalChannelsWrapper(flexrayClusterConditional.getPhysicalChannels());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolName() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getProtocolName())) {
            
            return new StringWrapper(flexrayClusterConditional.getProtocolName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getProtocolVersion())) {
            
            return new StringWrapper(flexrayClusterConditional.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSpeed() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getSpeed())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getSpeed());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getActionPointOffset() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getActionPointOffset())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getActionPointOffset());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getBit() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getBit())) {
            
            return new TimeValueWrapper(flexrayClusterConditional.getBit());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCasRxLowMax() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getCasRxLowMax())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getCasRxLowMax());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getColdStartAttempts() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getColdStartAttempts())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getColdStartAttempts());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getCycle() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getCycle())) {
            
            return new TimeValueWrapper(flexrayClusterConditional.getCycle());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCycleCountMax() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getCycleCountMax())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getCycleCountMax());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getDetectNitError() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getDetectNitError())) {
            
            return new BooleanWrapper(flexrayClusterConditional.getDetectNitError());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getDynamicSlotIdlePhase() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getDynamicSlotIdlePhase())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getDynamicSlotIdlePhase());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getIgnoreAfterTx() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getIgnoreAfterTx())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getIgnoreAfterTx());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getListenNoise() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getListenNoise())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getListenNoise());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMacroPerCycle() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getMacroPerCycle())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getMacroPerCycle());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMacrotickDuration() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getMacrotickDuration())) {
            
            return new TimeValueWrapper(flexrayClusterConditional.getMacrotickDuration());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxWithoutClockCorrectionFatal() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getMaxWithoutClockCorrectionFatal())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getMaxWithoutClockCorrectionFatal());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxWithoutClockCorrectionPassive() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getMaxWithoutClockCorrectionPassive())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getMaxWithoutClockCorrectionPassive());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMinislotActionPointOffset() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getMinislotActionPointOffset())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getMinislotActionPointOffset());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMinislotDuration() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getMinislotDuration())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getMinislotDuration());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNetworkIdleTime() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getNetworkIdleTime())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getNetworkIdleTime());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNetworkManagementVectorLength() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getNetworkManagementVectorLength())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getNetworkManagementVectorLength());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNumberOfMinislots() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getNumberOfMinislots())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getNumberOfMinislots());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNumberOfStaticSlots() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getNumberOfStaticSlots())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getNumberOfStaticSlots());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getOffsetCorrectionStart() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getOffsetCorrectionStart())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getOffsetCorrectionStart());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPayloadLengthStatic() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getPayloadLengthStatic())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getPayloadLengthStatic());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSafetyMargin() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getSafetyMargin())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getSafetyMargin());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSampleClockPeriod() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getSampleClockPeriod())) {
            
            return new TimeValueWrapper(flexrayClusterConditional.getSampleClockPeriod());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getStaticSlotDuration() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getStaticSlotDuration())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getStaticSlotDuration());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSymbolWindow() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getSymbolWindow())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getSymbolWindow());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSymbolWindowActionPointOffset() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getSymbolWindowActionPointOffset())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getSymbolWindowActionPointOffset());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSyncFrameIdCountMax() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getSyncFrameIdCountMax())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getSyncFrameIdCountMax());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getTranceiverStandbyDelay() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getTranceiverStandbyDelay())) {
            
            return new FloatWrapper(flexrayClusterConditional.getTranceiverStandbyDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTransmissionStartSequenceDuration() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getTransmissionStartSequenceDuration())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getTransmissionStartSequenceDuration());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getWakeupRxIdle() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getWakeupRxIdle())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getWakeupRxIdle());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getWakeupRxLow() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getWakeupRxLow())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getWakeupRxLow());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getWakeupRxWindow() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getWakeupRxWindow())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getWakeupRxWindow());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getWakeupTxActive() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getWakeupTxActive())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getWakeupTxActive());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getWakeupTxIdle() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getWakeupTxIdle())) {
            
            return new IntegerWrapper(flexrayClusterConditional.getWakeupTxIdle());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayClusterConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayClusterConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}