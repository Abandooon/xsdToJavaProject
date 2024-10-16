package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TimingGuaranteesWrapper {

    
    private TimingGuarantees timingGuarantees;

    public TimingGuaranteesWrapper(TimingGuarantees timingGuarantees) {
        this.timingGuarantees = timingGuarantees;
    }

   
    public ArrayList<AgeConstraintWrapper> getAgeConstraint() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getAgeConstraint())) {
            ArrayList<AgeConstraint> originalList = timingGuarantees.getAgeConstraint();
            ArrayList<AgeConstraintWrapper> wrapperList = (ArrayList<AgeConstraintWrapper>)originalList.stream()
                .map(item -> new AgeConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ArbitraryEventTriggeringWrapper> getArbitraryEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getArbitraryEventTriggering())) {
            ArrayList<ArbitraryEventTriggering> originalList = timingGuarantees.getArbitraryEventTriggering();
            ArrayList<ArbitraryEventTriggeringWrapper> wrapperList = (ArrayList<ArbitraryEventTriggeringWrapper>)originalList.stream()
                .map(item -> new ArbitraryEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BurstPatternEventTriggeringWrapper> getBurstPatternEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getBurstPatternEventTriggering())) {
            ArrayList<BurstPatternEventTriggering> originalList = timingGuarantees.getBurstPatternEventTriggering();
            ArrayList<BurstPatternEventTriggeringWrapper> wrapperList = (ArrayList<BurstPatternEventTriggeringWrapper>)originalList.stream()
                .map(item -> new BurstPatternEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConcretePatternEventTriggeringWrapper> getConcretePatternEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getConcretePatternEventTriggering())) {
            ArrayList<ConcretePatternEventTriggering> originalList = timingGuarantees.getConcretePatternEventTriggering();
            ArrayList<ConcretePatternEventTriggeringWrapper> wrapperList = (ArrayList<ConcretePatternEventTriggeringWrapper>)originalList.stream()
                .map(item -> new ConcretePatternEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExecutionOrderConstraintWrapper> getExecutionOrderConstraint() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getExecutionOrderConstraint())) {
            ArrayList<ExecutionOrderConstraint> originalList = timingGuarantees.getExecutionOrderConstraint();
            ArrayList<ExecutionOrderConstraintWrapper> wrapperList = (ArrayList<ExecutionOrderConstraintWrapper>)originalList.stream()
                .map(item -> new ExecutionOrderConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExecutionTimeConstraintWrapper> getExecutionTimeConstraint() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getExecutionTimeConstraint())) {
            ArrayList<ExecutionTimeConstraint> originalList = timingGuarantees.getExecutionTimeConstraint();
            ArrayList<ExecutionTimeConstraintWrapper> wrapperList = (ArrayList<ExecutionTimeConstraintWrapper>)originalList.stream()
                .map(item -> new ExecutionTimeConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LatencyTimingConstraintWrapper> getLatencyTimingConstraint() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getLatencyTimingConstraint())) {
            ArrayList<LatencyTimingConstraint> originalList = timingGuarantees.getLatencyTimingConstraint();
            ArrayList<LatencyTimingConstraintWrapper> wrapperList = (ArrayList<LatencyTimingConstraintWrapper>)originalList.stream()
                .map(item -> new LatencyTimingConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<OffsetTimingConstraintWrapper> getOffsetTimingConstraint() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getOffsetTimingConstraint())) {
            ArrayList<OffsetTimingConstraint> originalList = timingGuarantees.getOffsetTimingConstraint();
            ArrayList<OffsetTimingConstraintWrapper> wrapperList = (ArrayList<OffsetTimingConstraintWrapper>)originalList.stream()
                .map(item -> new OffsetTimingConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PeriodicEventTriggeringWrapper> getPeriodicEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getPeriodicEventTriggering())) {
            ArrayList<PeriodicEventTriggering> originalList = timingGuarantees.getPeriodicEventTriggering();
            ArrayList<PeriodicEventTriggeringWrapper> wrapperList = (ArrayList<PeriodicEventTriggeringWrapper>)originalList.stream()
                .map(item -> new PeriodicEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SporadicEventTriggeringWrapper> getSporadicEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getSporadicEventTriggering())) {
            ArrayList<SporadicEventTriggering> originalList = timingGuarantees.getSporadicEventTriggering();
            ArrayList<SporadicEventTriggeringWrapper> wrapperList = (ArrayList<SporadicEventTriggeringWrapper>)originalList.stream()
                .map(item -> new SporadicEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SynchronizationTimingConstraintWrapper> getSynchronizationTimingConstraint() {
        
        if (CollUtil.isNotEmpty(timingGuarantees.getSynchronizationTimingConstraint())) {
            ArrayList<SynchronizationTimingConstraint> originalList = timingGuarantees.getSynchronizationTimingConstraint();
            ArrayList<SynchronizationTimingConstraintWrapper> wrapperList = (ArrayList<SynchronizationTimingConstraintWrapper>)originalList.stream()
                .map(item -> new SynchronizationTimingConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}