package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TimingRequirementsWrapper {

    
    private TimingRequirements timingRequirements;

    public TimingRequirementsWrapper(TimingRequirements timingRequirements) {
        this.timingRequirements = timingRequirements;
    }

   
    public ArrayList<AgeConstraintWrapper> getAgeConstraint() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getAgeConstraint())) {
            ArrayList<AgeConstraint> originalList = timingRequirements.getAgeConstraint();
            ArrayList<AgeConstraintWrapper> wrapperList = (ArrayList<AgeConstraintWrapper>)originalList.stream()
                .map(item -> new AgeConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ArbitraryEventTriggeringWrapper> getArbitraryEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getArbitraryEventTriggering())) {
            ArrayList<ArbitraryEventTriggering> originalList = timingRequirements.getArbitraryEventTriggering();
            ArrayList<ArbitraryEventTriggeringWrapper> wrapperList = (ArrayList<ArbitraryEventTriggeringWrapper>)originalList.stream()
                .map(item -> new ArbitraryEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BurstPatternEventTriggeringWrapper> getBurstPatternEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getBurstPatternEventTriggering())) {
            ArrayList<BurstPatternEventTriggering> originalList = timingRequirements.getBurstPatternEventTriggering();
            ArrayList<BurstPatternEventTriggeringWrapper> wrapperList = (ArrayList<BurstPatternEventTriggeringWrapper>)originalList.stream()
                .map(item -> new BurstPatternEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConcretePatternEventTriggeringWrapper> getConcretePatternEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getConcretePatternEventTriggering())) {
            ArrayList<ConcretePatternEventTriggering> originalList = timingRequirements.getConcretePatternEventTriggering();
            ArrayList<ConcretePatternEventTriggeringWrapper> wrapperList = (ArrayList<ConcretePatternEventTriggeringWrapper>)originalList.stream()
                .map(item -> new ConcretePatternEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExecutionOrderConstraintWrapper> getExecutionOrderConstraint() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getExecutionOrderConstraint())) {
            ArrayList<ExecutionOrderConstraint> originalList = timingRequirements.getExecutionOrderConstraint();
            ArrayList<ExecutionOrderConstraintWrapper> wrapperList = (ArrayList<ExecutionOrderConstraintWrapper>)originalList.stream()
                .map(item -> new ExecutionOrderConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExecutionTimeConstraintWrapper> getExecutionTimeConstraint() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getExecutionTimeConstraint())) {
            ArrayList<ExecutionTimeConstraint> originalList = timingRequirements.getExecutionTimeConstraint();
            ArrayList<ExecutionTimeConstraintWrapper> wrapperList = (ArrayList<ExecutionTimeConstraintWrapper>)originalList.stream()
                .map(item -> new ExecutionTimeConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LatencyTimingConstraintWrapper> getLatencyTimingConstraint() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getLatencyTimingConstraint())) {
            ArrayList<LatencyTimingConstraint> originalList = timingRequirements.getLatencyTimingConstraint();
            ArrayList<LatencyTimingConstraintWrapper> wrapperList = (ArrayList<LatencyTimingConstraintWrapper>)originalList.stream()
                .map(item -> new LatencyTimingConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<OffsetTimingConstraintWrapper> getOffsetTimingConstraint() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getOffsetTimingConstraint())) {
            ArrayList<OffsetTimingConstraint> originalList = timingRequirements.getOffsetTimingConstraint();
            ArrayList<OffsetTimingConstraintWrapper> wrapperList = (ArrayList<OffsetTimingConstraintWrapper>)originalList.stream()
                .map(item -> new OffsetTimingConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PeriodicEventTriggeringWrapper> getPeriodicEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getPeriodicEventTriggering())) {
            ArrayList<PeriodicEventTriggering> originalList = timingRequirements.getPeriodicEventTriggering();
            ArrayList<PeriodicEventTriggeringWrapper> wrapperList = (ArrayList<PeriodicEventTriggeringWrapper>)originalList.stream()
                .map(item -> new PeriodicEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SporadicEventTriggeringWrapper> getSporadicEventTriggering() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getSporadicEventTriggering())) {
            ArrayList<SporadicEventTriggering> originalList = timingRequirements.getSporadicEventTriggering();
            ArrayList<SporadicEventTriggeringWrapper> wrapperList = (ArrayList<SporadicEventTriggeringWrapper>)originalList.stream()
                .map(item -> new SporadicEventTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SynchronizationTimingConstraintWrapper> getSynchronizationTimingConstraint() {
        
        if (CollUtil.isNotEmpty(timingRequirements.getSynchronizationTimingConstraint())) {
            ArrayList<SynchronizationTimingConstraint> originalList = timingRequirements.getSynchronizationTimingConstraint();
            ArrayList<SynchronizationTimingConstraintWrapper> wrapperList = (ArrayList<SynchronizationTimingConstraintWrapper>)originalList.stream()
                .map(item -> new SynchronizationTimingConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}